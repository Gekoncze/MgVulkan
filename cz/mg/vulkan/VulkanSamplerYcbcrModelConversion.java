package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerYcbcrModelConversion.html">khronos documentation</a>
 **/
public class VulkanSamplerYcbcrModelConversion extends VulkanEnum {
    public static final int RGB_IDENTITY = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY;
    public static final int YCBCR_IDENTITY = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY;
    public static final int YCBCR_709 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709;
    public static final int YCBCR_601 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601;
    public static final int YCBCR_2020 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020;
    public static final int RGB_IDENTITY_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR;
    public static final int YCBCR_IDENTITY_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR;
    public static final int YCBCR_709_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR;
    public static final int YCBCR_601_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR;
    public static final int YCBCR_2020_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR;

    public VulkanSamplerYcbcrModelConversion(){
        super(new VkSamplerYcbcrModelConversion());
    }

    public VulkanSamplerYcbcrModelConversion(VkSamplerYcbcrModelConversion vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrModelConversion getVk(){
        return (VkSamplerYcbcrModelConversion) super.getVk();
    }

    public VulkanSamplerYcbcrModelConversion(int value){
        super(new VkSamplerYcbcrModelConversion(value));
    }

    @Override
    public String toString() {
        if(getValue() == RGB_IDENTITY) return "RGB_IDENTITY";
        if(getValue() == YCBCR_IDENTITY) return "YCBCR_IDENTITY";
        if(getValue() == YCBCR_709) return "YCBCR_709";
        if(getValue() == YCBCR_601) return "YCBCR_601";
        if(getValue() == YCBCR_2020) return "YCBCR_2020";
        if(getValue() == RGB_IDENTITY_KHR) return "RGB_IDENTITY_KHR";
        if(getValue() == YCBCR_IDENTITY_KHR) return "YCBCR_IDENTITY_KHR";
        if(getValue() == YCBCR_709_KHR) return "YCBCR_709_KHR";
        if(getValue() == YCBCR_601_KHR) return "YCBCR_601_KHR";
        if(getValue() == YCBCR_2020_KHR) return "YCBCR_2020_KHR";
        return "UNKNOWN";
    }
}
