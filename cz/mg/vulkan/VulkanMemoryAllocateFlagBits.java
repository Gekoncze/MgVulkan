package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryAllocateFlagBits extends VulkanFlagBits {
    public static final int DEVICE_MASK = VkMemoryAllocateFlagBits.VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT;
    public static final int DEVICE_MASK_KHR = VkMemoryAllocateFlagBits.VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR;

    public VulkanMemoryAllocateFlagBits(){
        super(new VkMemoryAllocateFlagBits());
    }

    public VulkanMemoryAllocateFlagBits(VkMemoryAllocateFlagBits vk){
        super(vk);
    }

    @Override
    public VkMemoryAllocateFlagBits getVk(){
        return (VkMemoryAllocateFlagBits) super.getVk();
    }

    public VulkanMemoryAllocateFlagBits(int value){
        super(new VkMemoryAllocateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_MASK) s += "DEVICE_MASK";
        if(getValue() == DEVICE_MASK_KHR) s += "DEVICE_MASK_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
