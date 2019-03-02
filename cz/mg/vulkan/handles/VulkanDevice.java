package cz.mg.vulkan.handles;

import cz.mg.vulkan.jna.handles.VkDevice;
import cz.mg.vulkan.structures.VulkanPhysicalDeviceFeatures;


public class VulkanDevice {
    private final VulkanPhysicalDevice parent;
    public final VkDevice.ByValue handle;

    public VulkanDevice(VulkanPhysicalDevice physicalDevice, VulkanPhysicalDeviceFeatures features, int queueFamilyIndex){
        this.handle = physicalDevice.getParent().getParent().vks.vkCreateDevice(physicalDevice.handle, features.structure.byReference(true, true), queueFamilyIndex);
        this.parent = physicalDevice;
    }

    public VulkanPhysicalDevice getParent() {
        return parent;
    }

    @Override
    protected void finalize() {
        parent.getParent().getParent().vks.vkDestroyDevice(handle);
    }
}
