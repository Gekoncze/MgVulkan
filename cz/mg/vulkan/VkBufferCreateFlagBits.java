package cz.mg.vulkan;

public class VkBufferCreateFlagBits extends VkFlagBits {
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x00000001;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x00000004;
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 0x00000008;

    public VkBufferCreateFlagBits() {
    }

    public VkBufferCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_BUFFER_CREATE_SPARSE_BINDING_BIT) s += "VK_BUFFER_CREATE_SPARSE_BINDING_BIT";
        if(getValue() == VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT) s += "VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT";
        if(getValue() == VK_BUFFER_CREATE_SPARSE_ALIASED_BIT) s += "VK_BUFFER_CREATE_SPARSE_ALIASED_BIT";
        if(getValue() == VK_BUFFER_CREATE_PROTECTED_BIT) s += "VK_BUFFER_CREATE_PROTECTED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
