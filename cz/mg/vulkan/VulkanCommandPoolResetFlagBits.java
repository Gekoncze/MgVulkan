package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandPoolResetFlagBits extends VulkanFlagBits {
    public static final int RELEASE_RESOURCES = VkCommandPoolResetFlagBits.VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT;

    public VulkanCommandPoolResetFlagBits(){
        super(new VkCommandPoolResetFlagBits());
    }

    public VulkanCommandPoolResetFlagBits(VkCommandPoolResetFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandPoolResetFlagBits getVk(){
        return (VkCommandPoolResetFlagBits) super.getVk();
    }

    public VulkanCommandPoolResetFlagBits(int value){
        super(new VkCommandPoolResetFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == RELEASE_RESOURCES) s += "RELEASE_RESOURCES";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
