package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandBufferResetFlags extends VulkanFlags {
    public VulkanCommandBufferResetFlags(){
        super(new VkCommandBufferResetFlags());
    }

    public VulkanCommandBufferResetFlags(VkCommandBufferResetFlags vk){
        super(vk);
    }

    @Override
    public VkCommandBufferResetFlags getVk(){
        return (VkCommandBufferResetFlags) super.getVk();
    }

    public VulkanCommandBufferResetFlags(int value){
        super(new VkCommandBufferResetFlags(value));
    }
}
