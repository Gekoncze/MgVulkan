package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryHeapFlagBits extends VulkanFlagBits {
    public static final int DEVICE_LOCAL = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_DEVICE_LOCAL_BIT;
    public static final int MULTI_INSTANCE = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT;
    public static final int MULTI_INSTANCE_KHR = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR;

    public VulkanMemoryHeapFlagBits(){
        super(new VkMemoryHeapFlagBits());
    }

    public VulkanMemoryHeapFlagBits(VkMemoryHeapFlagBits vk){
        super(vk);
    }

    @Override
    public VkMemoryHeapFlagBits getVk(){
        return (VkMemoryHeapFlagBits) super.getVk();
    }

    public VulkanMemoryHeapFlagBits(int value){
        super(new VkMemoryHeapFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_LOCAL) s += "DEVICE_LOCAL";
        if(getValue() == MULTI_INSTANCE) s += "MULTI_INSTANCE";
        if(getValue() == MULTI_INSTANCE_KHR) s += "MULTI_INSTANCE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
