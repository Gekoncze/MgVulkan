package cz.mg.vulkan.vk;

public class VkMemoryHeapFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 0x00000002;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = VK_MEMORY_HEAP_MULTI_INSTANCE_BIT;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_MEMORY_HEAP_DEVICE_LOCAL_BIT) s += "VK_MEMORY_HEAP_DEVICE_LOCAL_BIT";
        if(getValue() == VK_MEMORY_HEAP_MULTI_INSTANCE_BIT) s += "VK_MEMORY_HEAP_MULTI_INSTANCE_BIT";
        if(getValue() == VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR) s += "VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
