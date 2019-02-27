package cz.mg.vulkan.jna.arrays;

import cz.mg.vulkan.jna.structures.VkLayerProperties;


public class VkLayerPropertiesArray extends NativeArray<VkLayerProperties> {
    public VkLayerPropertiesArray(int count) {
        super(count, VkLayerProperties.class, VkLayerProperties.ByReference.class, VkLayerProperties.ByValue.class);
    }
}
