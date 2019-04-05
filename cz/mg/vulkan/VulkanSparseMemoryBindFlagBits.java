package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSparseMemoryBindFlagBits extends VulkanFlagBits {
    public static final int METADATA = VkSparseMemoryBindFlagBits.VK_SPARSE_MEMORY_BIND_METADATA_BIT;

    public VulkanSparseMemoryBindFlagBits(){
        super(new VkSparseMemoryBindFlagBits());
    }

    public VulkanSparseMemoryBindFlagBits(VkSparseMemoryBindFlagBits vk){
        super(vk);
    }

    @Override
    public VkSparseMemoryBindFlagBits getVk(){
        return (VkSparseMemoryBindFlagBits) super.getVk();
    }

    public VulkanSparseMemoryBindFlagBits(int value){
        super(new VkSparseMemoryBindFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == METADATA) s += "METADATA";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
