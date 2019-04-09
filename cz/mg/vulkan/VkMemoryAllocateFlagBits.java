package cz.mg.vulkan;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT) s += "VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT";
        if(getValue() == VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR) s += "VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
