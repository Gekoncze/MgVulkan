package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineStageFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineStageFlags extends VulkanFlags {
    public VulkanPipelineStageFlags(){
        super(new VkPipelineStageFlags());
    }

    public VulkanPipelineStageFlags(VkPipelineStageFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineStageFlags getVk(){
        return (VkPipelineStageFlags) super.getVk();
    }

    public VulkanPipelineStageFlags(int value){
        super(new VkPipelineStageFlags(value));
    }
}
