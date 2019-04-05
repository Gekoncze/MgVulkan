package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandBufferUsageFlags extends VulkanFlags {
    public VulkanCommandBufferUsageFlags(){
        super(new VkCommandBufferUsageFlags());
    }

    public VulkanCommandBufferUsageFlags(VkCommandBufferUsageFlags vk){
        super(vk);
    }

    @Override
    public VkCommandBufferUsageFlags getVk(){
        return (VkCommandBufferUsageFlags) super.getVk();
    }

    public VulkanCommandBufferUsageFlags(int value){
        super(new VkCommandBufferUsageFlags(value));
    }
}
