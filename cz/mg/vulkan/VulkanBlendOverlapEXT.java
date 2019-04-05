package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBlendOverlapEXT extends VulkanEnum {
    public static final int BLEND_OVERLAP_UNCORRELATED_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_UNCORRELATED_EXT;
    public static final int BLEND_OVERLAP_DISJOINT_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_DISJOINT_EXT;
    public static final int BLEND_OVERLAP_CONJOINT_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_CONJOINT_EXT;

    public VulkanBlendOverlapEXT(){
        super(new VkBlendOverlapEXT());
    }

    public VulkanBlendOverlapEXT(VkBlendOverlapEXT vk){
        super(vk);
    }

    @Override
    public VkBlendOverlapEXT getVk(){
        return (VkBlendOverlapEXT) super.getVk();
    }

    public VulkanBlendOverlapEXT(int value){
        super(new VkBlendOverlapEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == BLEND_OVERLAP_UNCORRELATED_EXT) return "BLEND_OVERLAP_UNCORRELATED_EXT";
        if(getValue() == BLEND_OVERLAP_DISJOINT_EXT) return "BLEND_OVERLAP_DISJOINT_EXT";
        if(getValue() == BLEND_OVERLAP_CONJOINT_EXT) return "BLEND_OVERLAP_CONJOINT_EXT";
        return "UNKNOWN";
    }
}
