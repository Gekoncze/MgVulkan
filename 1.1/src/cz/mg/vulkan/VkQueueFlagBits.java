package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkQueueFlagBits extends VkFlagBits {
    public static final int VK_QUEUE_GRAPHICS_BIT = 0x00000001;
    public static final int VK_QUEUE_COMPUTE_BIT = 0x00000002;
    public static final int VK_QUEUE_TRANSFER_BIT = 0x00000004;
    public static final int VK_QUEUE_SPARSE_BINDING_BIT = 0x00000008;
    public static final int VK_QUEUE_PROTECTED_BIT = 0x00000010;

    public VkQueueFlagBits() {
    }

    protected VkQueueFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueueFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueueFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkQueueFlagBits(int value) {
        setValue(value);
    }

    public VkQueueFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_QUEUE_GRAPHICS_BIT) != 0) s.addLast("VK_QUEUE_GRAPHICS_BIT");
        if((getValue() & VK_QUEUE_COMPUTE_BIT) != 0) s.addLast("VK_QUEUE_COMPUTE_BIT");
        if((getValue() & VK_QUEUE_TRANSFER_BIT) != 0) s.addLast("VK_QUEUE_TRANSFER_BIT");
        if((getValue() & VK_QUEUE_SPARSE_BINDING_BIT) != 0) s.addLast("VK_QUEUE_SPARSE_BINDING_BIT");
        if((getValue() & VK_QUEUE_PROTECTED_BIT) != 0) s.addLast("VK_QUEUE_PROTECTED_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
