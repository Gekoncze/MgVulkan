package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferUsageFlagBits.html">khronos documentation</a>
 **/
public class VulkanCommandBufferUsageFlagBits extends VulkanFlagBits {
    public static final int ONE_TIME_SUBMIT = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    public static final int RENDER_PASS_CONTINUE = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT;
    public static final int SIMULTANEOUS_USE = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT;

    public VulkanCommandBufferUsageFlagBits(){
        super(new VkCommandBufferUsageFlagBits());
    }

    public VulkanCommandBufferUsageFlagBits(VkCommandBufferUsageFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandBufferUsageFlagBits getVk(){
        return (VkCommandBufferUsageFlagBits) super.getVk();
    }

    public VulkanCommandBufferUsageFlagBits(int value){
        super(new VkCommandBufferUsageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == ONE_TIME_SUBMIT) s += "ONE_TIME_SUBMIT";
        if(getValue() == RENDER_PASS_CONTINUE) s += "RENDER_PASS_CONTINUE";
        if(getValue() == SIMULTANEOUS_USE) s += "SIMULTANEOUS_USE";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
