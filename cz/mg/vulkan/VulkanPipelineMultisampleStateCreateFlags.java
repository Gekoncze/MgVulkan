package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineMultisampleStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineMultisampleStateCreateFlags extends VulkanFlags {
    public VulkanPipelineMultisampleStateCreateFlags(){
        super(new VkPipelineMultisampleStateCreateFlags());
    }

    public VulkanPipelineMultisampleStateCreateFlags(VkPipelineMultisampleStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineMultisampleStateCreateFlags getVk(){
        return (VkPipelineMultisampleStateCreateFlags) super.getVk();
    }

    public VulkanPipelineMultisampleStateCreateFlags(int value){
        super(new VkPipelineMultisampleStateCreateFlags(value));
    }
}
