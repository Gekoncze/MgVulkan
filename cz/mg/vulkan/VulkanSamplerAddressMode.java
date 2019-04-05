package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSamplerAddressMode extends VulkanEnum {
    public static final int REPEAT = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_REPEAT;
    public static final int MIRRORED_REPEAT = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT;
    public static final int CLAMP_TO_EDGE = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    public static final int CLAMP_TO_BORDER = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER;
    public static final int MIRROR_CLAMP_TO_EDGE = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE;

    public VulkanSamplerAddressMode(){
        super(new VkSamplerAddressMode());
    }

    public VulkanSamplerAddressMode(VkSamplerAddressMode vk){
        super(vk);
    }

    @Override
    public VkSamplerAddressMode getVk(){
        return (VkSamplerAddressMode) super.getVk();
    }

    public VulkanSamplerAddressMode(int value){
        super(new VkSamplerAddressMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == REPEAT) return "REPEAT";
        if(getValue() == MIRRORED_REPEAT) return "MIRRORED_REPEAT";
        if(getValue() == CLAMP_TO_EDGE) return "CLAMP_TO_EDGE";
        if(getValue() == CLAMP_TO_BORDER) return "CLAMP_TO_BORDER";
        if(getValue() == MIRROR_CLAMP_TO_EDGE) return "MIRROR_CLAMP_TO_EDGE";
        return "UNKNOWN";
    }
}
