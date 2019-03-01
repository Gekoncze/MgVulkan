package test;

import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.VulkanNative;
import cz.mg.vulkan.jna.VulkanNativeSimplified;
import cz.mg.vulkan.jna.arrays.StringArray;
import cz.mg.vulkan.jna.arrays.VkPhysicalDeviceArray;
import cz.mg.vulkan.jna.callbacks.PFN_vkDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.jna.extensions.VulkanNativeDebugUtils;
import cz.mg.vulkan.jna.extensions.VulkanNativeDebugUtilsSimplified;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.handles.VkDebugUtilsMessengerEXT;
import cz.mg.vulkan.jna.handles.VkInstance;
import cz.mg.vulkan.jna.structures.VkDebugUtilsMessengerCallbackDataEXT;
import cz.mg.vulkan.jna.types.VkBool32;
import static cz.mg.vulkan.jna.VulkanNative.*;


public class Test {
    public static VulkanNative vk;
    public static VulkanNativeSimplified vks;
    public static VulkanNativeDebugUtils vkdu;
    public static VulkanNativeDebugUtilsSimplified vkdus;

    public static void main(String[] args) {
        vk = VulkanNative.loadLibrary();
        vks = new VulkanNativeSimplified(vk);

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

        vkdu = VulkanNativeDebugUtils.load(instance, vks);
        vkdus = new VulkanNativeDebugUtilsSimplified(vkdu);

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
