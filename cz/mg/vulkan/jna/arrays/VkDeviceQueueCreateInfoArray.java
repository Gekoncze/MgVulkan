package cz.mg.vulkan.jna.arrays;

import cz.mg.vulkan.jna.structures.VkDeviceQueueCreateInfo;


public class VkDeviceQueueCreateInfoArray extends NativeArray<VkDeviceQueueCreateInfo> {
    public VkDeviceQueueCreateInfoArray(int count) {
        super(count, VkDeviceQueueCreateInfo.class, VkDeviceQueueCreateInfo.ByReference.class, VkDeviceQueueCreateInfo.ByValue.class);
    }
}
