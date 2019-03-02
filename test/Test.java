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

        VkPhysicalDeviceArray physicalDevices = vks.vkEnumeratePhysicalDevices(new VkInstance.ByValue(instance));
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


        VkPhysicalDeviceFeatures.ByReference features = new VkPhysicalDeviceFeatures.ByReference();
        FloatArray priorities = new FloatArray(new float[]{1.0f});
        VkDeviceQueueCreateInfoArray createInfos = new VkDeviceQueueCreateInfoArray(1);
        VkDeviceQueueCreateInfo queueCreateInfo = createInfos.get(0);
        queueCreateInfo.sType = new VkStructureType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
        queueCreateInfo.pNext = null;
        queueCreateInfo.flags = new VkDeviceQueueCreateFlags(0);
        queueCreateInfo.queueFamilyIndex = new uint32_t(0);
        queueCreateInfo.queueCount = new uint32_t(1);
        queueCreateInfo.pQueuePriorities = priorities.getPointer();
        createInfos.write();

        VkDeviceCreateInfo.ByReference deviceCreateInfo = new VkDeviceCreateInfo.ByReference();
        deviceCreateInfo.sType = new VkStructureType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
        deviceCreateInfo.pNext = null;
        deviceCreateInfo.flags = new VkDeviceCreateFlags(0);
        deviceCreateInfo.queueCreateInfoCount = new uint32_t(1);
        deviceCreateInfo.pQueueCreateInfos = createInfos.getPointer();
        deviceCreateInfo.pEnabledFeatures = features;
        deviceCreateInfo.enabledExtensionCount = new uint32_t(0);
        deviceCreateInfo.ppEnabledExtensionNames = null;
        deviceCreateInfo.enabledLayerCount = new uint32_t(0);
        deviceCreateInfo.ppEnabledLayerNames = null;

        VkDevice.ByReference device = new VkDevice.ByReference();
        VkPhysicalDevice.ByValue physicalDevice = new VkPhysicalDevice.ByValue(physicalDevices.get(0));
        VkResult.ByValue result = vk.vkCreateDevice(physicalDevice, deviceCreateInfo, null, device);
        if(result.value != VkResult.VK_SUCCESS) throw new VulkanException(result, "vkCreateDevice");
        VkDevice.ByValue device_value = new VkDevice.ByValue(device);

        System.out.println("Logical device created successfully!");

        VkQueue.ByReference queue = new VkQueue.ByReference();
        vk.vkGetDeviceQueue(device_value, new uint32_t(0), new uint32_t(0), queue);

        System.out.println("Got 1st queue.");

        // TODO

        vk.vkDestroyDevice(device_value, null);
        vkdus.vkDestroyDebugUtilsMessengerEXT(instance, messenger);
        vk.vkDestroyInstance(instance, null);
    }

    private static final PFN_vkDebugUtilsMessengerCallbackEXT debugCallback = new PFN_vkDebugUtilsMessengerCallbackEXT() {
        @Override
        public VkBool32 callback(VkDebugUtilsMessageSeverityFlagsEXT.ByValue messageSeverity, VkDebugUtilsMessageTypeFlagsEXT.ByValue messageType, VkDebugUtilsMessengerCallbackDataEXT.ByReference pCallbackData, Pointer pUserData) {
            System.out.println("DEBUG: " + pCallbackData.pMessageIdName + ": " + pCallbackData.pMessage);
            return new VkBool32(VK_FALSE);
        }
    };
}
