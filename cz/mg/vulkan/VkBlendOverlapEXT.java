package cz.mg.vulkan;

public class VkBlendOverlapEXT extends VkEnum {
    public static final int VK_BLEND_OVERLAP_UNCORRELATED_EXT = 0;
    public static final int VK_BLEND_OVERLAP_DISJOINT_EXT = 1;
    public static final int VK_BLEND_OVERLAP_CONJOINT_EXT = 2;

    public VkBlendOverlapEXT() {
    }

    public VkBlendOverlapEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBlendOverlapEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBlendOverlapEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_BLEND_OVERLAP_UNCORRELATED_EXT) return "VK_BLEND_OVERLAP_UNCORRELATED_EXT";
        if(getValue() == VK_BLEND_OVERLAP_DISJOINT_EXT) return "VK_BLEND_OVERLAP_DISJOINT_EXT";
        if(getValue() == VK_BLEND_OVERLAP_CONJOINT_EXT) return "VK_BLEND_OVERLAP_CONJOINT_EXT";
        return "UNKNOWN";
    }
}
