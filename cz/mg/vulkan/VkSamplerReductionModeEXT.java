package cz.mg.vulkan;

public class VkSamplerReductionModeEXT extends VkEnum {
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT = 0;
    public static final int VK_SAMPLER_REDUCTION_MODE_MIN_EXT = 1;
    public static final int VK_SAMPLER_REDUCTION_MODE_MAX_EXT = 2;

    public VkSamplerReductionModeEXT() {
    }

    public VkSamplerReductionModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerReductionModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerReductionModeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT) return "VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT";
        if(getValue() == VK_SAMPLER_REDUCTION_MODE_MIN_EXT) return "VK_SAMPLER_REDUCTION_MODE_MIN_EXT";
        if(getValue() == VK_SAMPLER_REDUCTION_MODE_MAX_EXT) return "VK_SAMPLER_REDUCTION_MODE_MAX_EXT";
        return "UNKNOWN";
    }
}
