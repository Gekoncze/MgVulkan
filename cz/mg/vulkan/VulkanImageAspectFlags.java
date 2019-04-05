package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageAspectFlags extends VulkanFlags {
    public VulkanImageAspectFlags(){
        super(new VkImageAspectFlags());
    }

    public VulkanImageAspectFlags(VkImageAspectFlags vk){
        super(vk);
    }

    @Override
    public VkImageAspectFlags getVk(){
        return (VkImageAspectFlags) super.getVk();
    }

    public VulkanImageAspectFlags(int value){
        super(new VkImageAspectFlags(value));
    }
}
