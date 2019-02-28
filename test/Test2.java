package test;

import cz.mg.vulkan.utilities.Version;
import cz.mg.vulkan.Vulkan;
import cz.mg.vulkan.VulkanInstance;

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
    }
}
