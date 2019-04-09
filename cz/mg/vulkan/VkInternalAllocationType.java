package cz.mg.vulkan;

public class VkInternalAllocationType extends VkEnum {
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

    public VkInternalAllocationType() {
    }

    public VkInternalAllocationType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInternalAllocationType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkInternalAllocationType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE) return "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE";
        return "UNKNOWN";
    }
}
