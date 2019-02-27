package cz.mg.vulkan.jna.arrays;

import cz.mg.vulkan.jna.handles.VkPhysicalDevice;


public class VkPhysicalDeviceArray extends NativeArray<VkPhysicalDevice> {
    public VkPhysicalDeviceArray(int count) {
        super(count, VkPhysicalDevice.class, VkPhysicalDevice.ByReference.class, VkPhysicalDevice.ByValue.class);
    }
}
