package cz.mg.vulkan.handles;

import cz.mg.vulkan.jna.handles.VkQueue;


public class VulkanQueue {
    private final VulkanDevice parent;
    public final VkQueue handle;

    public VulkanQueue(VulkanDevice device, int queueFamilyIndex, int queueIndex) {
        this.handle = device.getParent().getParent().getParent().vks.vkGetDeviceQueue(device.handle, queueFamilyIndex, queueIndex);
        this.parent = device;
    }

    public VulkanDevice getParent() {
        return parent;
    }
}
