package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageUsageFlags extends VulkanFlags {
    public VulkanImageUsageFlags(){
        super(new VkImageUsageFlags());
    }

    public VulkanImageUsageFlags(VkImageUsageFlags vk){
        super(vk);
    }

    @Override
    public VkImageUsageFlags getVk(){
        return (VkImageUsageFlags) super.getVk();
    }

    public VulkanImageUsageFlags(int value){
        super(new VkImageUsageFlags(value));
    }
}
