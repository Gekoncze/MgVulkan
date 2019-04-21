package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkMemoryHeapFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX = 0x00000002;

    public VkMemoryHeapFlagBits() {
    }

    public VkMemoryHeapFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryHeapFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkMemoryHeapFlagBits(int value) {
        setValue(value);
    }

    public VkMemoryHeapFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_MEMORY_HEAP_DEVICE_LOCAL_BIT) != 0) s.addLast("VK_MEMORY_HEAP_DEVICE_LOCAL_BIT");
        if((getValue() & VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX) != 0) s.addLast("VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
