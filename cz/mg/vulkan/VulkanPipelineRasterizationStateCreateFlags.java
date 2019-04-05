package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
