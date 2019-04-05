package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineInputAssemblyStateCreateFlags extends VulkanFlags {
    public VulkanPipelineInputAssemblyStateCreateFlags(){
        super(new VkPipelineInputAssemblyStateCreateFlags());
    }

    public VulkanPipelineInputAssemblyStateCreateFlags(VkPipelineInputAssemblyStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineInputAssemblyStateCreateFlags getVk(){
        return (VkPipelineInputAssemblyStateCreateFlags) super.getVk();
    }

    public VulkanPipelineInputAssemblyStateCreateFlags(int value){
        super(new VkPipelineInputAssemblyStateCreateFlags(value));
    }
}
