package test;

import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.Vk;
import cz.mg.vulkan.jna.VkSimplified;
import cz.mg.vulkan.jna.arrays.FloatArray;
import cz.mg.vulkan.jna.arrays.StringArray;
import cz.mg.vulkan.jna.arrays.VkDeviceQueueCreateInfoArray;
import cz.mg.vulkan.jna.arrays.VkPhysicalDeviceArray;
import cz.mg.vulkan.jna.callbacks.PFN_vkDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.extensions.VkDebugUtilsEXT;
import cz.mg.vulkan.jna.extensions.VkDebugUtilsEXTSimplified;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.flags.VkDeviceCreateFlags;
import cz.mg.vulkan.jna.flags.VkDeviceQueueCreateFlags;
import cz.mg.vulkan.jna.handles.*;
import cz.mg.vulkan.jna.structures.VkDebugUtilsMessengerCallbackDataEXT;
import cz.mg.vulkan.jna.structures.VkDeviceCreateInfo;
import cz.mg.vulkan.jna.structures.VkDeviceQueueCreateInfo;
import cz.mg.vulkan.jna.structures.VkPhysicalDeviceFeatures;
import cz.mg.vulkan.jna.types.VkBool32;
import cz.mg.vulkan.jna.types.uint32_t;
import cz.mg.vulkan.utilities.VulkanException;
import static cz.mg.vulkan.jna.Vk.*;
import static cz.mg.vulkan.jna.enums.VkStructureType.*;


public class Test {
    public static Vk vk;
    public static VkSimplified vks;
    public static VkDebugUtilsEXT vkdu;
    public static VkDebugUtilsEXTSimplified vkdus;

    public static void main(String[] args) {
        vk = Vk.loadLibrary();
        vks = new VkSimplified(vk);

        TestInfo.printVulkanSupportedExtensions();
        TestInfo.printVulkanSupportedLayers();

        StringArray enabledExtensions = new StringArray(new String[]{
                "VK_KHR_surface",
                "VK_EXT_debug_utils"
        });

        StringArray enabledLayers = new StringArray(new String[]{
                "VK_LAYER_LUNARG_standard_validation"
        });

        VkInstance.ByValue instance = vks.vkCreateInstance(
                VK_API_VERSION_1_0,
                "Mg Vulkan Test", VK_MAKE_VERSION(0, 1, 0),
                "Mg Vulkan Test Engine", VK_MAKE_VERSION(0, 1, 0),
                enabledExtensions,
                enabledLayers
        );

        vkdu = VkDebugUtilsEXT.load(instance, vks);
        vkdus = new VkDebugUtilsEXTSimplified(vkdu);

        VkPhysicalDeviceArray physicalDevices = vks.vkEnumeratePhysicalDevices(instance.byValue(true, true));
        TestInfo.printVulkanDevices(physicalDevices, true);

        VkDebugUtilsMessageSeverityFlagsEXT messageSeverity = new VkDebugUtilsMessageSeverityFlagsEXT(
                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT |
                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT
//                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT |
//                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT
        );

        VkDebugUtilsMessageTypeFlagsEXT messageType = new VkDebugUtilsMessageTypeFlagsEXT(
                VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
        );

        VkDebugUtilsMessengerEXT.ByValue messenger = vkdus.vkCreateDebugUtilsMessengerEXT(instance, messageSeverity, messageType, debugCallback, null);

        VkPhysicalDevice.ByValue selectedPhysicalDevice = physicalDevices.get(0).byValue(true, true);
        VkPhysicalDeviceFeatures.ByReference features = new VkPhysicalDeviceFeatures.ByReference();
        VkDevice.ByValue device_value = vks.vkCreateDevice(selectedPhysicalDevice, features, 0).byValue(true, true);
        System.out.println("Logical device created successfully!");

        VkQueue.ByValue queue = vks.vkGetDeviceQueue(device_value, 0, 0);
        System.out.println("Got 1st queue.");

        // TODO

        vks.vkDestroyDevice(device_value);
        vkdus.vkDestroyDebugUtilsMessengerEXT(instance, messenger);
        vks.vkDestroyInstance(instance);
    }

    private static final PFN_vkDebugUtilsMessengerCallbackEXT debugCallback = new PFN_vkDebugUtilsMessengerCallbackEXT() {
        @Override
        public VkBool32 callback(VkDebugUtilsMessageSeverityFlagsEXT.ByValue messageSeverity, VkDebugUtilsMessageTypeFlagsEXT.ByValue messageType, VkDebugUtilsMessengerCallbackDataEXT.ByReference pCallbackData, Pointer pUserData) {
            System.out.println("DEBUG: " + pCallbackData.pMessageIdName + ": " + pCallbackData.pMessage);
            return new VkBool32(VK_FALSE);
        }
    };
}
