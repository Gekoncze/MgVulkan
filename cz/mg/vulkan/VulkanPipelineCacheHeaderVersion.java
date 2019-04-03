package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCacheHeaderVersion.html">khronos documentation</a>
 **/
public class VulkanPipelineCacheHeaderVersion extends VulkanEnum {
    public static final int ONE = VkPipelineCacheHeaderVersion.VK_PIPELINE_CACHE_HEADER_VERSION_ONE;

    public VulkanPipelineCacheHeaderVersion(){
        super(new VkPipelineCacheHeaderVersion());
    }

    public VulkanPipelineCacheHeaderVersion(VkPipelineCacheHeaderVersion vk){
        super(vk);
    }

    @Override
    public VkPipelineCacheHeaderVersion getVk(){
        return (VkPipelineCacheHeaderVersion) super.getVk();
    }

    public VulkanPipelineCacheHeaderVersion(int value){
        super(new VkPipelineCacheHeaderVersion(value));
    }

    @Override
    public String toString() {
        if(getValue() == ONE) return "ONE";
        return "UNKNOWN";
    }
}
