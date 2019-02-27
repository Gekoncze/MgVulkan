package cz.mg.vulkan.jna.arrays;

import cz.mg.vulkan.jna.structures.VkExtensionProperties;


public class VkExtensionPropertiesArray extends NativeArray<VkExtensionProperties> {
    public VkExtensionPropertiesArray(int count) {
        super(count, VkExtensionProperties.class, VkExtensionProperties.ByReference.class, VkExtensionProperties.ByValue.class);
    }
}
