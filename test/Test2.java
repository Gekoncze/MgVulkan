package test;

import cz.mg.vulkan.*;
import cz.mg.vulkan.callbacks.VulkanDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.handles.VulkanDebugUtilsMessengerEXT;
import cz.mg.vulkan.handles.VulkanInstance;
import cz.mg.vulkan.structures.VulkanDebugUtilsMessengerCallbackDataEXT;
import cz.mg.vulkan.utilities.Version;
import static test.TestInfo2.*;


public class Test2 {
    public static void main(String[] args) {
        System.out.println("***********");
        System.out.println("*   NEW   *");
        System.out.println("***********");

        Vulkan vulkan = new Vulkan();
        printVulkanSupportedExtensions(vulkan);
        printVulkanSupportedLayers(vulkan);

        String[] extensions = new String[]{
                "VK_KHR_surface",
                "VK_EXT_debug_utils"
        };

        String[] layers = new String[]{
                "VK_LAYER_LUNARG_standard_validation"
        };

        VulkanInstance instance = new VulkanInstance(vulkan, "Mg Vulkan Test", new Version(0, 1, 0), "Mg Vulkan Test Engine", new Version(0, 1, 0), extensions, layers);
        printVulkanDevices(instance, false);

        VulkanDebugUtilsMessageSeverityFlagsEXT severityFlags = new VulkanDebugUtilsMessageSeverityFlagsEXT(
                VulkanDebugUtilsMessageSeverityFlagsEXT.ERROR |
                VulkanDebugUtilsMessageSeverityFlagsEXT.WARNING
        );

        VulkanDebugUtilsMessageTypeFlagsEXT typeFlags = new VulkanDebugUtilsMessageTypeFlagsEXT(
                VulkanDebugUtilsMessageTypeFlagsEXT.GENERAL |
                VulkanDebugUtilsMessageTypeFlagsEXT.VALIDATION |
                VulkanDebugUtilsMessageTypeFlagsEXT.PERFORMANCE
        );

        VulkanDebugUtilsEXT debugUtils = new VulkanDebugUtilsEXT(instance);
        VulkanDebugUtilsMessengerEXT messenger = new VulkanDebugUtilsMessengerEXT(debugUtils, severityFlags, typeFlags, new VulkanDebugUtilsMessengerCallbackEXT() {
            @Override
            public boolean callback(VulkanDebugUtilsMessageSeverityFlagsEXT messageSeverity, VulkanDebugUtilsMessageTypeFlagsEXT messageType, VulkanDebugUtilsMessengerCallbackDataEXT pCallbackData, Object pUserData) {
                System.out.println("DEBUG: " + pCallbackData.getPMessageIdName() + ": " + pCallbackData.getPMessage());
                return false;
            }
        });
    }
}
