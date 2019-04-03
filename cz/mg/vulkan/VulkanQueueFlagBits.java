package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueFlagBits.html">khronos documentation</a>
 **/
public class VulkanQueueFlagBits extends VulkanFlagBits {
    public static final int GRAPHICS = VkQueueFlagBits.VK_QUEUE_GRAPHICS_BIT;
    public static final int COMPUTE = VkQueueFlagBits.VK_QUEUE_COMPUTE_BIT;
    public static final int TRANSFER = VkQueueFlagBits.VK_QUEUE_TRANSFER_BIT;
    public static final int SPARSE_BINDING = VkQueueFlagBits.VK_QUEUE_SPARSE_BINDING_BIT;
    public static final int PROTECTED = VkQueueFlagBits.VK_QUEUE_PROTECTED_BIT;

    public VulkanQueueFlagBits(){
        super(new VkQueueFlagBits());
    }

    public VulkanQueueFlagBits(VkQueueFlagBits vk){
        super(vk);
    }

    @Override
    public VkQueueFlagBits getVk(){
        return (VkQueueFlagBits) super.getVk();
    }

    public VulkanQueueFlagBits(int value){
        super(new VkQueueFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == GRAPHICS) s += "GRAPHICS";
        if(getValue() == COMPUTE) s += "COMPUTE";
        if(getValue() == TRANSFER) s += "TRANSFER";
        if(getValue() == SPARSE_BINDING) s += "SPARSE_BINDING";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
