package test.vulkan;

import cz.mg.vulkan.*;
import cz.mg.vulkan.callbacks.VulkanDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.extensions.VulkanDebugUtilsEXT;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.handles.*;
import cz.mg.vulkan.structures.*;
import cz.mg.vulkan.utilities.Version;
import static test.vulkan.TestInfo2.*;


public class Test2 {
    public static void main(String[] args) {
        System.out.println("***********");
        System.out.println("*   NEW   *");
        System.out.println("***********");

        ///////////////
        /// LIBRARY ///
        ///////////////
        Vulkan vulkan = new Vulkan();
        printVulkanSupportedExtensions(vulkan);
        printVulkanSupportedLayers(vulkan);

        ////////////////
        /// INSTANCE ///
        ////////////////
        String[] extensions = new String[]{
                "VK_KHR_surface",
                "VK_EXT_debug_utils"
        };

        String[] layers = new String[]{
                "VK_LAYER_LUNARG_standard_validation"
        };

        VulkanInstance instance = new VulkanInstance(vulkan, "Mg Vulkan Test", new Version(0, 1, 0), "Mg Vulkan Test Engine", new Version(0, 1, 0), extensions, layers);

        ///////////////////////
        /// PHYSICAL DEVICE ///
        ///////////////////////
        printVulkanDevices(instance, false);

        ///////////////////////
        /// DEBUG EXTENSION ///
        ///////////////////////
        VulkanDebugUtilsEXT debugUtils = new VulkanDebugUtilsEXT(instance);

        ///////////////////////
        /// DEBUG MESSENGER ///
        ///////////////////////
        VulkanDebugUtilsMessageSeverityFlagsEXT severityFlags = new VulkanDebugUtilsMessageSeverityFlagsEXT(
                VulkanDebugUtilsMessageSeverityFlagsEXT.ERROR |
                VulkanDebugUtilsMessageSeverityFlagsEXT.WARNING
        );

        VulkanDebugUtilsMessageTypeFlagsEXT typeFlags = new VulkanDebugUtilsMessageTypeFlagsEXT(
                VulkanDebugUtilsMessageTypeFlagsEXT.GENERAL |
                VulkanDebugUtilsMessageTypeFlagsEXT.VALIDATION |
                VulkanDebugUtilsMessageTypeFlagsEXT.PERFORMANCE
        );

        VulkanDebugUtilsMessengerEXT messenger = new VulkanDebugUtilsMessengerEXT(debugUtils, severityFlags, typeFlags, new VulkanDebugUtilsMessengerCallbackEXT() {
            @Override
            public boolean callback(VulkanDebugUtilsMessageSeverityFlagsEXT messageSeverity, VulkanDebugUtilsMessageTypeFlagsEXT messageType, VulkanDebugUtilsMessengerCallbackDataEXT pCallbackData, Object pUserData) {
                System.out.println("DEBUG: " + pCallbackData.getPMessageIdName() + ": " + pCallbackData.getPMessage());
                return false;
            }
        });

        //////////////////////
        /// LOGICAL DEVICE ///
        //////////////////////
        VulkanPhysicalDevice selectedPhysicalDevice = instance.getPhysicalDevices().get(0);
        VulkanPhysicalDeviceFeatures features = new VulkanPhysicalDeviceFeatures();
        VulkanDevice device = new VulkanDevice(selectedPhysicalDevice, features, 0);
        System.out.println("Logical device created successfully!");

        /////////////
        /// QUEUE ///
        /////////////
        VulkanQueue queue = new VulkanQueue(device, 0, 0);
        System.out.println("Got 1st queue.");

        /////////////
        /// IMAGE ///
        /////////////
        VulkanImage image = new VulkanImage(
                device,
                VulkanImageType.D2,
                640, 480, 1,
                VulkanFormat.R8G8B8A8_UNORM,
                new VulkanSampleCountFlags(VulkanSampleCountFlags.B1),
                VulkanImageTiling.OPTIMAL,
                new VulkanImageUsageFlags(VulkanImageUsageFlags.TRANSFER_SRC | VulkanImageUsageFlags.COLOR_ATTACHMENT),
                VulkanSharingMode.EXCLUSIVE,
                VulkanImageLayout.UNDEFINED
        );
        System.out.println("Image created successfully!");
    }
}
