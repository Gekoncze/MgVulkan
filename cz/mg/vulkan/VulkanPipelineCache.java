package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCache.html">khronos documentation</a>
 **/
public class VulkanPipelineCache extends VulkanHandle {
    public VulkanPipelineCache(){
        super(new VkPipelineCache());
    }

    public VulkanPipelineCache(VkPipelineCache vk){
        super(vk);
    }

    @Override
    public VkPipelineCache getVk(){
        return (VkPipelineCache) super.getVk();
    }

    public VulkanPipelineCache(int value){
        super(new VkPipelineCache(value));
    }
}
