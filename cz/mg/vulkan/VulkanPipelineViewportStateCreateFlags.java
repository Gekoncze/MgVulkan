package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineViewportStateCreateFlags extends VulkanFlags {
    public VulkanPipelineViewportStateCreateFlags(){
        super(new VkPipelineViewportStateCreateFlags());
    }

    public VulkanPipelineViewportStateCreateFlags(VkPipelineViewportStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineViewportStateCreateFlags getVk(){
        return (VkPipelineViewportStateCreateFlags) super.getVk();
    }

    public VulkanPipelineViewportStateCreateFlags(int value){
        super(new VkPipelineViewportStateCreateFlags(value));
    }
}
