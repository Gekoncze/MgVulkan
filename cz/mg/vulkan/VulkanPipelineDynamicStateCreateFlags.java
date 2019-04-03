package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDynamicStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineDynamicStateCreateFlags extends VulkanFlags {
    public VulkanPipelineDynamicStateCreateFlags(){
        super(new VkPipelineDynamicStateCreateFlags());
    }

    public VulkanPipelineDynamicStateCreateFlags(VkPipelineDynamicStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineDynamicStateCreateFlags getVk(){
        return (VkPipelineDynamicStateCreateFlags) super.getVk();
    }

    public VulkanPipelineDynamicStateCreateFlags(int value){
        super(new VkPipelineDynamicStateCreateFlags(value));
    }
}
