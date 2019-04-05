package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageViewCreateFlags extends VulkanFlags {
    public VulkanImageViewCreateFlags(){
        super(new VkImageViewCreateFlags());
    }

    public VulkanImageViewCreateFlags(VkImageViewCreateFlags vk){
        super(vk);
    }

    @Override
    public VkImageViewCreateFlags getVk(){
        return (VkImageViewCreateFlags) super.getVk();
    }

    public VulkanImageViewCreateFlags(int value){
        super(new VkImageViewCreateFlags(value));
    }
}
