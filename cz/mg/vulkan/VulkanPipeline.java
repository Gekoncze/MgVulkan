package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipeline.html">khronos documentation</a>
 **/
public class VulkanPipeline extends VulkanHandle {
    public VulkanPipeline(){
        super(new VkPipeline());
    }

    public VulkanPipeline(VkPipeline vk){
        super(vk);
    }

    @Override
    public VkPipeline getVk(){
        return (VkPipeline) super.getVk();
    }

    public VulkanPipeline(int value){
        super(new VkPipeline(value));
    }
}
