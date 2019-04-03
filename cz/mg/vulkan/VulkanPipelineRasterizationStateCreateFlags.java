package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineRasterizationStateCreateFlags extends VulkanFlags {
    public VulkanPipelineRasterizationStateCreateFlags(){
        super(new VkPipelineRasterizationStateCreateFlags());
    }

    public VulkanPipelineRasterizationStateCreateFlags(VkPipelineRasterizationStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineRasterizationStateCreateFlags getVk(){
        return (VkPipelineRasterizationStateCreateFlags) super.getVk();
    }

    public VulkanPipelineRasterizationStateCreateFlags(int value){
        super(new VkPipelineRasterizationStateCreateFlags(value));
    }
}
