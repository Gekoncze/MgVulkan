package cz.mg.vulkan;

import cz.mg.vulkan.jna.handles.VkPhysicalDevice;


public class VulkanPhysicalDevice {
    final VkPhysicalDevice handle;

    public VulkanPhysicalDevice(VkPhysicalDevice handle) {
        this.handle = handle;
    }
}
