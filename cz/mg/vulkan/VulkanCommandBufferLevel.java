package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferLevel.html">khronos documentation</a>
 **/
public class VulkanCommandBufferLevel extends VulkanEnum {
    public static final int PRIMARY = VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY;
    public static final int SECONDARY = VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_SECONDARY;

    public VulkanCommandBufferLevel(){
        super(new VkCommandBufferLevel());
    }

    public VulkanCommandBufferLevel(VkCommandBufferLevel vk){
        super(vk);
    }

    @Override
    public VkCommandBufferLevel getVk(){
        return (VkCommandBufferLevel) super.getVk();
    }

    public VulkanCommandBufferLevel(int value){
        super(new VkCommandBufferLevel(value));
    }

    @Override
    public String toString() {
        if(getValue() == PRIMARY) return "PRIMARY";
        if(getValue() == SECONDARY) return "SECONDARY";
        return "UNKNOWN";
    }
}
