package cz.mg.vulkan.jna.arrays;

import cz.mg.vulkan.jna.structures.VkQueueFamilyProperties;


public class VkQueueFamilyPropertiesArray extends NativeArray<VkQueueFamilyProperties> {
    public VkQueueFamilyPropertiesArray(int count) {
        super(count, VkQueueFamilyProperties.class, VkQueueFamilyProperties.ByReference.class, VkQueueFamilyProperties.ByValue.class);
    }
}
