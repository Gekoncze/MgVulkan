package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSamplerYcbcrRange extends VulkanEnum {
    public static final int ITU_FULL = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL;
    public static final int ITU_NARROW = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW;
    public static final int ITU_FULL_KHR = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR;
    public static final int ITU_NARROW_KHR = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR;

    public VulkanSamplerYcbcrRange(){
        super(new VkSamplerYcbcrRange());
    }

    public VulkanSamplerYcbcrRange(VkSamplerYcbcrRange vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrRange getVk(){
        return (VkSamplerYcbcrRange) super.getVk();
    }

    public VulkanSamplerYcbcrRange(int value){
        super(new VkSamplerYcbcrRange(value));
    }

    @Override
    public String toString() {
        if(getValue() == ITU_FULL) return "ITU_FULL";
        if(getValue() == ITU_NARROW) return "ITU_NARROW";
        if(getValue() == ITU_FULL_KHR) return "ITU_FULL_KHR";
        if(getValue() == ITU_NARROW_KHR) return "ITU_NARROW_KHR";
        return "UNKNOWN";
    }
}
