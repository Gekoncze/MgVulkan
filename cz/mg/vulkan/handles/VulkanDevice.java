package cz.mg.vulkan.handles;

import cz.mg.vulkan.jna.handles.VkDevice;
import cz.mg.vulkan.structures.VulkanPhysicalDeviceFeatures;


public class VulkanDevice {
    private final VulkanPhysicalDevice parent;
    public final VkDevice.ByValue handle;

    public VulkanDevice(VulkanPhysicalDevice parent, VkDevice.ByValue handle) {
        if(parent == null || handle == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = handle;
    }

    public VulkanDevice(VulkanPhysicalDevice parent, VulkanPhysicalDeviceFeatures features, int queueFamilyIndex){
        if(parent == null || features == null || queueFamilyIndex < 0 || queueFamilyIndex >= parent.getQueueFamilyProperties().count()) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = parent.getParent().getParent().vks.vkCreateDevice(parent.handle, features.structure.byReference(true, true), queueFamilyIndex);
    }

    public VulkanPhysicalDevice getParent() {
        return parent;
    }

    @Override
    protected void finalize() {
        parent.getParent().getParent().vks.vkDestroyDevice(handle);
    }
}
