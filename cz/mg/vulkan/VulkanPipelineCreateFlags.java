package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCreateFlags.html">khronos documentation</a>
 **/
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
