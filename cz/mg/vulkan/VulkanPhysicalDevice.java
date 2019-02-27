package cz.mg.vulkan;

import cz.mg.vulkan.jna.handles.VkPhysicalDevice;


public class VulkanPhysicalDevice {
    private final Vulkan vulkan;
    private final VkPhysicalDevice.ByValue handle;
    private VulkanPhysicalDeviceProperties physicalDeviceProperties = null;

    public VulkanPhysicalDevice(Vulkan vulkan, VkPhysicalDevice.ByValue handle) {
        this.vulkan = vulkan;
        this.handle = handle;
    }

    public VulkanPhysicalDeviceProperties getPhysicalDeviceProperties() {
        if(physicalDeviceProperties == null) physicalDeviceProperties = new VulkanPhysicalDeviceProperties(vulkan.vks.vkGetPhysicalDeviceProperties(handle));
        return physicalDeviceProperties;
    }
}
