package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineInputAssemblyStateCreateFlags.html">khronos documentation</a>
 **/
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
