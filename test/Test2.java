package test;

import cz.mg.vulkan.Version;
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

        VulkanInstance instance = new VulkanInstance(vulkan, "Mg Vulkan Test", new Version(0, 1, 0), "Mg Vulkan Test Engine", new Version(0, 1, 0));
        printVulkanDevices(instance, true);
    }
}
