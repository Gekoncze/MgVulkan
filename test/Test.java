package test;

import cz.mg.vulkan.jna.VulkanNative;
import cz.mg.vulkan.jna.VulkanNativeSimplified;
import cz.mg.vulkan.jna.arrays.StringArray;
import cz.mg.vulkan.jna.arrays.VkPhysicalDeviceArray;
import cz.mg.vulkan.jna.handles.VkInstance;
import static cz.mg.vulkan.jna.VulkanNative.VK_API_VERSION_1_0;
import static cz.mg.vulkan.jna.VulkanNative.VK_MAKE_VERSION;


public class Test {
    public static VulkanNative vk;
    public static VulkanNativeSimplified vks;

    public static void main(String[] args) {
        vk = VulkanNative.loadLibrary();
        vks = new VulkanNativeSimplified(vk);
        TestInfo.printVulkanSupportedExtensions();
        TestInfo.printVulkanSupportedLayers();

        StringArray enabledExtensions = new StringArray(new String[]{
                "VK_KHR_surface"
        });

        StringArray enabledLayers = new StringArray(new String[]{
        });

        VkInstance instance = vks.vkCreateInstance(
                VK_API_VERSION_1_0,
                "Mg Vulkan Test", VK_MAKE_VERSION(0, 1, 0),
                "Mg Vulkan Test Engine", VK_MAKE_VERSION(0, 1, 0),
                enabledExtensions,
                enabledLayers
        );
        VkPhysicalDeviceArray physicalDevices = vks.vkEnumeratePhysicalDevices(new VkInstance.ByValue(instance));
        TestInfo.printVulkanDevices(physicalDevices, true);
    }
}
