package cz.mg.vulkan.structures;

import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;


public class VulkanImageFormatProperties {
    public final VkImageFormatProperties structure;

    public VulkanImageFormatProperties() {
        this.structure = new VkImageFormatProperties();
    }

    public VulkanImageFormatProperties(VkImageFormatProperties structure) {
        this.structure = structure;
    }

    public VulkanExtent3D getMaxExtent(){
        return new VulkanExtent3D(structure.maxExtent);
    }

    public int getMaxMipLevels(){
        return structure.maxMipLevels.intValue();
    }

    public int getMaxArrayLayers(){
        return structure.maxArrayLayers.intValue();
    }

    public VulkanSampleCountFlags getSampleCounts(){
        return new VulkanSampleCountFlags(structure.sampleCounts);
    }

    public long getMaxResourceSize(){
        return structure.maxResourceSize.longValue();
    }
}
