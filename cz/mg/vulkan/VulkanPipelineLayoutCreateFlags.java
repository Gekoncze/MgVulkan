package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayoutCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineLayoutCreateFlags extends VulkanFlags {
    public VulkanPipelineLayoutCreateFlags(){
        super(new VkPipelineLayoutCreateFlags());
    }

    public VulkanPipelineLayoutCreateFlags(VkPipelineLayoutCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineLayoutCreateFlags getVk(){
        return (VkPipelineLayoutCreateFlags) super.getVk();
    }

    public VulkanPipelineLayoutCreateFlags(int value){
        super(new VkPipelineLayoutCreateFlags(value));
    }
}
