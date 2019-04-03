package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineColorBlendStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineColorBlendStateCreateFlags extends VulkanFlags {
    public VulkanPipelineColorBlendStateCreateFlags(){
        super(new VkPipelineColorBlendStateCreateFlags());
    }

    public VulkanPipelineColorBlendStateCreateFlags(VkPipelineColorBlendStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineColorBlendStateCreateFlags getVk(){
        return (VkPipelineColorBlendStateCreateFlags) super.getVk();
    }

    public VulkanPipelineColorBlendStateCreateFlags(int value){
        super(new VkPipelineColorBlendStateCreateFlags(value));
    }
}
