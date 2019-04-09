package cz.mg.vulkan;

public class VkMemoryPropertyFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x00000002;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x00000004;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x00000008;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x00000010;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 0x00000020;

    public VkMemoryPropertyFlagBits() {
    }

    public VkMemoryPropertyFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryPropertyFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryPropertyFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT) s += "VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) s += "VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_HOST_COHERENT_BIT) s += "VK_MEMORY_PROPERTY_HOST_COHERENT_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_HOST_CACHED_BIT) s += "VK_MEMORY_PROPERTY_HOST_CACHED_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT) s += "VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_PROTECTED_BIT) s += "VK_MEMORY_PROPERTY_PROTECTED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
