package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryPropertyFlagBits.html">khronos documentation</a>
 **/
public class VulkanMemoryPropertyFlagBits extends VulkanFlagBits {
    public static final int DEVICE_LOCAL = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT;
    public static final int HOST_VISIBLE = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT;
    public static final int HOST_COHERENT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT;
    public static final int HOST_CACHED = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_CACHED_BIT;
    public static final int LAZILY_ALLOCATED = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT;
    public static final int PROTECTED = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_PROTECTED_BIT;

    public VulkanMemoryPropertyFlagBits(){
        super(new VkMemoryPropertyFlagBits());
    }

    public VulkanMemoryPropertyFlagBits(VkMemoryPropertyFlagBits vk){
        super(vk);
    }

    @Override
    public VkMemoryPropertyFlagBits getVk(){
        return (VkMemoryPropertyFlagBits) super.getVk();
    }

    public VulkanMemoryPropertyFlagBits(int value){
        super(new VkMemoryPropertyFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_LOCAL) s += "DEVICE_LOCAL";
        if(getValue() == HOST_VISIBLE) s += "HOST_VISIBLE";
        if(getValue() == HOST_COHERENT) s += "HOST_COHERENT";
        if(getValue() == HOST_CACHED) s += "HOST_CACHED";
        if(getValue() == LAZILY_ALLOCATED) s += "LAZILY_ALLOCATED";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
