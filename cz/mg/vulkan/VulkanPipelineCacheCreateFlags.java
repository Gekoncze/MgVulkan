package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineCacheCreateFlags extends VulkanFlags {
    public VulkanPipelineCacheCreateFlags(){
        super(new VkPipelineCacheCreateFlags());
    }

    public VulkanPipelineCacheCreateFlags(VkPipelineCacheCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineCacheCreateFlags getVk(){
        return (VkPipelineCacheCreateFlags) super.getVk();
    }

    public VulkanPipelineCacheCreateFlags(int value){
        super(new VkPipelineCacheCreateFlags(value));
    }
}
