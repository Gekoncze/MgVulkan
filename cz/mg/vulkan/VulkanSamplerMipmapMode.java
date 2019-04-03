package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerMipmapMode.html">khronos documentation</a>
 **/
public class VulkanSamplerMipmapMode extends VulkanEnum {
    public static final int NEAREST = VkSamplerMipmapMode.VK_SAMPLER_MIPMAP_MODE_NEAREST;
    public static final int LINEAR = VkSamplerMipmapMode.VK_SAMPLER_MIPMAP_MODE_LINEAR;

    public VulkanSamplerMipmapMode(){
        super(new VkSamplerMipmapMode());
    }

    public VulkanSamplerMipmapMode(VkSamplerMipmapMode vk){
        super(vk);
    }

    @Override
    public VkSamplerMipmapMode getVk(){
        return (VkSamplerMipmapMode) super.getVk();
    }

    public VulkanSamplerMipmapMode(int value){
        super(new VkSamplerMipmapMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == NEAREST) return "NEAREST";
        if(getValue() == LINEAR) return "LINEAR";
        return "UNKNOWN";
    }
}
