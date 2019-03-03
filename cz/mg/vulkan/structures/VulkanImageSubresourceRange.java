package cz.mg.vulkan.structures;

import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;


public class VulkanImageSubresourceRange {
    public final VkImageSubresourceRange structure;

    public VulkanImageSubresourceRange() {
        this.structure = new VkImageSubresourceRange();
    }

    public VulkanImageSubresourceRange(VkImageSubresourceRange structure) {
        this.structure = structure;
    }

    public VulkanImageAspectFlags getAspectMask(){
        return new VulkanImageAspectFlags(structure.aspectMask);
    }

    public int getBaseMipLevel(){
        return structure.baseMipLevel.intValue();
    }

    public int getLevelCount(){
        return structure.levelCount.intValue();
    }

    public int getBaseArrayLayer(){
        return structure.baseArrayLayer.intValue();
    }

    public int getLayerCount(){
        return structure.layerCount.intValue();
    }
}
