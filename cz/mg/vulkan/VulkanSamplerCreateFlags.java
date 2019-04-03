package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerCreateFlags.html">khronos documentation</a>
 **/
public class VulkanSamplerCreateFlags extends VulkanFlags {
    public VulkanSamplerCreateFlags(){
        super(new VkSamplerCreateFlags());
    }

    public VulkanSamplerCreateFlags(VkSamplerCreateFlags vk){
        super(vk);
    }

    @Override
    public VkSamplerCreateFlags getVk(){
        return (VkSamplerCreateFlags) super.getVk();
    }

    public VulkanSamplerCreateFlags(int value){
        super(new VkSamplerCreateFlags(value));
    }
}
