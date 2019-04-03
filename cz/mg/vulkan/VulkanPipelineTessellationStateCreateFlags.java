package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineTessellationStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineTessellationStateCreateFlags extends VulkanFlags {
    public VulkanPipelineTessellationStateCreateFlags(){
        super(new VkPipelineTessellationStateCreateFlags());
    }

    public VulkanPipelineTessellationStateCreateFlags(VkPipelineTessellationStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineTessellationStateCreateFlags getVk(){
        return (VkPipelineTessellationStateCreateFlags) super.getVk();
    }

    public VulkanPipelineTessellationStateCreateFlags(int value){
        super(new VkPipelineTessellationStateCreateFlags(value));
    }
}
