package cz.mg.vulkan;

public class VkSamplerYcbcrRange extends VkEnum {
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR = VK_SAMPLER_YCBCR_RANGE_ITU_FULL;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = VK_SAMPLER_YCBCR_RANGE_ITU_NARROW;

    public VkSamplerYcbcrRange() {
    }

    public VkSamplerYcbcrRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerYcbcrRange(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_FULL) return "VK_SAMPLER_YCBCR_RANGE_ITU_FULL";
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_NARROW) return "VK_SAMPLER_YCBCR_RANGE_ITU_NARROW";
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR) return "VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR) return "VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR";
        return "UNKNOWN";
    }
}
