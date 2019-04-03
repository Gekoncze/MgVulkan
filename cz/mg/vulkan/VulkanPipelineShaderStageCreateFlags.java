package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineShaderStageCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineShaderStageCreateFlags extends VulkanFlags {
    public VulkanPipelineShaderStageCreateFlags(){
        super(new VkPipelineShaderStageCreateFlags());
    }

    public VulkanPipelineShaderStageCreateFlags(VkPipelineShaderStageCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineShaderStageCreateFlags getVk(){
        return (VkPipelineShaderStageCreateFlags) super.getVk();
    }

    public VulkanPipelineShaderStageCreateFlags(int value){
        super(new VkPipelineShaderStageCreateFlags(value));
    }
}
