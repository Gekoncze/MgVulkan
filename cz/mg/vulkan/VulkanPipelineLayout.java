package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayout.html">khronos documentation</a>
 **/
public class VulkanPipelineLayout extends VulkanHandle {
    public VulkanPipelineLayout(){
        super(new VkPipelineLayout());
    }

    public VulkanPipelineLayout(VkPipelineLayout vk){
        super(vk);
    }

    @Override
    public VkPipelineLayout getVk(){
        return (VkPipelineLayout) super.getVk();
    }

    public VulkanPipelineLayout(int value){
        super(new VkPipelineLayout(value));
    }
}
