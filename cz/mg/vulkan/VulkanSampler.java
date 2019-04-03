package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampler.html">khronos documentation</a>
 **/
public class VulkanSampler extends VulkanHandle {
    public VulkanSampler(){
        super(new VkSampler());
    }

    public VulkanSampler(VkSampler vk){
        super(vk);
    }

    @Override
    public VkSampler getVk(){
        return (VkSampler) super.getVk();
    }

    public VulkanSampler(int value){
        super(new VkSampler(value));
    }
}
