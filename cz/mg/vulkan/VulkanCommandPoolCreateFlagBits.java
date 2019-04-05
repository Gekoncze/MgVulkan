package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandPoolCreateFlagBits extends VulkanFlagBits {
    public static final int TRANSIENT = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_TRANSIENT_BIT;
    public static final int RESET_COMMAND_BUFFER = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT;
    public static final int PROTECTED = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_PROTECTED_BIT;

    public VulkanCommandPoolCreateFlagBits(){
        super(new VkCommandPoolCreateFlagBits());
    }

    public VulkanCommandPoolCreateFlagBits(VkCommandPoolCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandPoolCreateFlagBits getVk(){
        return (VkCommandPoolCreateFlagBits) super.getVk();
    }

    public VulkanCommandPoolCreateFlagBits(int value){
        super(new VkCommandPoolCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TRANSIENT) s += "TRANSIENT";
        if(getValue() == RESET_COMMAND_BUFFER) s += "RESET_COMMAND_BUFFER";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
