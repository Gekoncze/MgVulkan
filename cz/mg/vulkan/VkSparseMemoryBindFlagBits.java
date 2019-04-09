package cz.mg.vulkan;

public class VkSparseMemoryBindFlagBits extends VkFlagBits {
    public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x00000001;

    public VkSparseMemoryBindFlagBits() {
    }

    public VkSparseMemoryBindFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseMemoryBindFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSparseMemoryBindFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SPARSE_MEMORY_BIND_METADATA_BIT) s += "VK_SPARSE_MEMORY_BIND_METADATA_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
