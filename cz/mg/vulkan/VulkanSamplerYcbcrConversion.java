package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerYcbcrConversion.html">khronos documentation</a>
 **/
public class VulkanSamplerYcbcrConversion extends VulkanHandle {
    public VulkanSamplerYcbcrConversion(){
        super(new VkSamplerYcbcrConversion());
    }

    public VulkanSamplerYcbcrConversion(VkSamplerYcbcrConversion vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrConversion getVk(){
        return (VkSamplerYcbcrConversion) super.getVk();
    }

    public VulkanSamplerYcbcrConversion(int value){
        super(new VkSamplerYcbcrConversion(value));
    }
}
