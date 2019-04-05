package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineCreateFlags extends VulkanFlags {
    public VulkanPipelineCreateFlags(){
        super(new VkPipelineCreateFlags());
    }

    public VulkanPipelineCreateFlags(VkPipelineCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineCreateFlags getVk(){
        return (VkPipelineCreateFlags) super.getVk();
    }

    public VulkanPipelineCreateFlags(int value){
        super(new VkPipelineCreateFlags(value));
    }
}
