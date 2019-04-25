package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkMemoryAllocateFlagBitsKHX extends VkFlagBits {
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX = 0x00000001;

    public VkMemoryAllocateFlagBitsKHX() {
    }

    protected VkMemoryAllocateFlagBitsKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryAllocateFlagBitsKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryAllocateFlagBitsKHX(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryAllocateFlagBitsKHX(int value) {
        setValue(value);
    }

    public VkMemoryAllocateFlagBitsKHX(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX) != 0) s.addLast("VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
