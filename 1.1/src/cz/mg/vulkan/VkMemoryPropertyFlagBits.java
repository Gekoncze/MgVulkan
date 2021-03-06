package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkMemoryPropertyFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x00000002;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x00000004;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x00000008;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x00000010;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 0x00000020;

    public VkMemoryPropertyFlagBits() {
    }

    protected VkMemoryPropertyFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryPropertyFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryPropertyFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryPropertyFlagBits(int value) {
        setValue(value);
    }

    public VkMemoryPropertyFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT) != 0) s.addLast("VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT");
        if((getValue() & VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) != 0) s.addLast("VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT");
        if((getValue() & VK_MEMORY_PROPERTY_HOST_COHERENT_BIT) != 0) s.addLast("VK_MEMORY_PROPERTY_HOST_COHERENT_BIT");
        if((getValue() & VK_MEMORY_PROPERTY_HOST_CACHED_BIT) != 0) s.addLast("VK_MEMORY_PROPERTY_HOST_CACHED_BIT");
        if((getValue() & VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT) != 0) s.addLast("VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT");
        if((getValue() & VK_MEMORY_PROPERTY_PROTECTED_BIT) != 0) s.addLast("VK_MEMORY_PROPERTY_PROTECTED_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
