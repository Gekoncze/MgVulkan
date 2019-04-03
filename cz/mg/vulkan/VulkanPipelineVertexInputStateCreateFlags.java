package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineVertexInputStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineVertexInputStateCreateFlags extends VulkanFlags {
    public VulkanPipelineVertexInputStateCreateFlags(){
        super(new VkPipelineVertexInputStateCreateFlags());
    }

    public VulkanPipelineVertexInputStateCreateFlags(VkPipelineVertexInputStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineVertexInputStateCreateFlags getVk(){
        return (VkPipelineVertexInputStateCreateFlags) super.getVk();
    }

    public VulkanPipelineVertexInputStateCreateFlags(int value){
        super(new VkPipelineVertexInputStateCreateFlags(value));
    }
}
