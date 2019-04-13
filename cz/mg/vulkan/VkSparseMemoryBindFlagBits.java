package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

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

    public VkSparseMemoryBindFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SPARSE_MEMORY_BIND_METADATA_BIT) != 0) s.addLast("VK_SPARSE_MEMORY_BIND_METADATA_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
