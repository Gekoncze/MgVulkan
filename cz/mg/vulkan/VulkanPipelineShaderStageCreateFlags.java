package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
