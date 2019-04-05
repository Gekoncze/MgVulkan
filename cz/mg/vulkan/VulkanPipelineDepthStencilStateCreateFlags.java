package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineDepthStencilStateCreateFlags extends VulkanFlags {
    public VulkanPipelineDepthStencilStateCreateFlags(){
        super(new VkPipelineDepthStencilStateCreateFlags());
    }

    public VulkanPipelineDepthStencilStateCreateFlags(VkPipelineDepthStencilStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineDepthStencilStateCreateFlags getVk(){
        return (VkPipelineDepthStencilStateCreateFlags) super.getVk();
    }

    public VulkanPipelineDepthStencilStateCreateFlags(int value){
        super(new VkPipelineDepthStencilStateCreateFlags(value));
    }
}
