package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandBufferResetFlagBits extends VulkanFlagBits {
    public static final int RELEASE_RESOURCES = VkCommandBufferResetFlagBits.VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT;

    public VulkanCommandBufferResetFlagBits(){
        super(new VkCommandBufferResetFlagBits());
    }

    public VulkanCommandBufferResetFlagBits(VkCommandBufferResetFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandBufferResetFlagBits getVk(){
        return (VkCommandBufferResetFlagBits) super.getVk();
    }

    public VulkanCommandBufferResetFlagBits(int value){
        super(new VkCommandBufferResetFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == RELEASE_RESOURCES) s += "RELEASE_RESOURCES";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
