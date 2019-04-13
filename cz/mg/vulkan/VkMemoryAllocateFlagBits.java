package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkMemoryAllocateFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 0x00000001;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT;

    public VkMemoryAllocateFlagBits() {
    }

    public VkMemoryAllocateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryAllocateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryAllocateFlagBits(int value) {
        setValue(value);
    }

    public VkMemoryAllocateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT) != 0) s.addLast("VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT");
        if((getValue() & VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR) != 0) s.addLast("VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
