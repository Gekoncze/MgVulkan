package cz.mg.vulkan.handles;

import cz.mg.vulkan.jna.handles.VkQueue;


public class VulkanQueue {
    private final VulkanDevice parent;
    public final VkQueue handle;

    public VulkanQueue(VulkanDevice parent, VkQueue handle) {
        if(parent == null || handle == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = handle;
    }

    public VulkanQueue(VulkanDevice device, int queueFamilyIndex, int queueIndex) {
        if(device == null || queueFamilyIndex < 0 || queueIndex < 0) throw new IllegalArgumentException();
        this.handle = device.getParent().getParent().getParent().vks.vkGetDeviceQueue(device.handle, queueFamilyIndex, queueIndex);
        this.parent = device;
    }

    public VulkanDevice getParent() {
        return parent;
    }
}
