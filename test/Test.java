package test;

import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.Vk;
import cz.mg.vulkan.jna.VkSimplified;
import cz.mg.vulkan.jna.arrays.FloatArray;
import cz.mg.vulkan.jna.arrays.StringArray;
import cz.mg.vulkan.jna.arrays.VkDeviceQueueCreateInfoArray;
import cz.mg.vulkan.jna.arrays.VkPhysicalDeviceArray;
import cz.mg.vulkan.jna.callbacks.PFN_vkDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.jna.enums.*;
import cz.mg.vulkan.jna.extensions.VkDebugUtilsEXT;
import cz.mg.vulkan.jna.extensions.VkDebugUtilsEXTSimplified;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.handles.*;
import cz.mg.vulkan.jna.structures.*;
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
        ///////////////
        /// LIBRARY ///
        ///////////////
        vk = Vk.loadLibrary();
        vks = new VkSimplified(vk);

        TestInfo.printVulkanSupportedExtensions();
        TestInfo.printVulkanSupportedLayers();

        ////////////////
        /// INSTANCE ///
        ////////////////
        StringArray enabledExtensions = new StringArray(new String[]{
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

        ///////////////////////
        /// PHYSICAL DEVICE ///
        ///////////////////////
        VkPhysicalDeviceArray physicalDevices = vks.vkEnumeratePhysicalDevices(instance.byValue(true, true));
        TestInfo.printVulkanDevices(physicalDevices, false);

        ///////////////////////
        /// DEBUG EXTENSION ///
        ///////////////////////
        vkdu = VkDebugUtilsEXT.load(instance, vks);
        vkdus = new VkDebugUtilsEXTSimplified(vkdu);

        ///////////////////////
        /// DEBUG MESSENGER ///
        ///////////////////////
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

        //////////////////////
        /// LOGICAL DEVICE ///
        //////////////////////
        VkPhysicalDevice.ByValue selectedPhysicalDevice = physicalDevices.get(0).byValue(true, true);
        VkPhysicalDeviceFeatures.ByReference features = new VkPhysicalDeviceFeatures.ByReference();
        VkDevice.ByValue logicalDevice = vks.vkCreateDevice(selectedPhysicalDevice, features, 0).byValue(true, true);
        System.out.println("Logical device created successfully!");

        /////////////
        /// QUEUE ///
        /////////////
        VkQueue.ByValue queue = vks.vkGetDeviceQueue(logicalDevice, 0, 0);
        System.out.println("Got 1st queue.");

        /////////////
        /// IMAGE ///
        /////////////
        VkImage.ByValue image = vks.vkCreateImage(
                logicalDevice,
                new VkImageType(VkImageType.VK_IMAGE_TYPE_2D),
                640, 480, 1,
                new VkFormat(VkFormat.VK_FORMAT_R8G8B8A8_UNORM),
                new VkSampleCountFlags(VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT),
                new VkImageTiling(VkImageTiling.VK_IMAGE_TILING_OPTIMAL),
                new VkImageUsageFlags(VkImageUsageFlags.VK_IMAGE_USAGE_TRANSFER_SRC_BIT | VkImageUsageFlags.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT),
                new VkSharingMode(VkSharingMode.VK_SHARING_MODE_EXCLUSIVE),
                new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED)
        );
        System.out.println("Image created successfully!");

        ///////////////
        /// CLEANUP ///
        ///////////////
        vks.vkDestroyImage(logicalDevice, image);
        vks.vkDestroyDevice(logicalDevice);
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
