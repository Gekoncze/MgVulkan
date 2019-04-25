package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkBufferCreateFlagBits extends VkFlagBits {
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x00000001;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x00000004;

    public VkBufferCreateFlagBits() {
    }

    protected VkBufferCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBufferCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferCreateFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkBufferCreateFlagBits(int value) {
        setValue(value);
    }

    public VkBufferCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_BUFFER_CREATE_SPARSE_BINDING_BIT) != 0) s.addLast("VK_BUFFER_CREATE_SPARSE_BINDING_BIT");
        if((getValue() & VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT) != 0) s.addLast("VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT");
        if((getValue() & VK_BUFFER_CREATE_SPARSE_ALIASED_BIT) != 0) s.addLast("VK_BUFFER_CREATE_SPARSE_ALIASED_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
