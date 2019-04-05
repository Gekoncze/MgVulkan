package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSamplerReductionModeEXT extends VulkanEnum {
    public static final int SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT;
    public static final int SAMPLER_REDUCTION_MODE_MIN_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_MIN_EXT;
    public static final int SAMPLER_REDUCTION_MODE_MAX_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_MAX_EXT;

    public VulkanSamplerReductionModeEXT(){
        super(new VkSamplerReductionModeEXT());
    }

    public VulkanSamplerReductionModeEXT(VkSamplerReductionModeEXT vk){
        super(vk);
    }

    @Override
    public VkSamplerReductionModeEXT getVk(){
        return (VkSamplerReductionModeEXT) super.getVk();
    }

    public VulkanSamplerReductionModeEXT(int value){
        super(new VkSamplerReductionModeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT) return "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT";
        if(getValue() == SAMPLER_REDUCTION_MODE_MIN_EXT) return "SAMPLER_REDUCTION_MODE_MIN_EXT";
        if(getValue() == SAMPLER_REDUCTION_MODE_MAX_EXT) return "SAMPLER_REDUCTION_MODE_MAX_EXT";
        return "UNKNOWN";
    }
}
