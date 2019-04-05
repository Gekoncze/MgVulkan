package cz.mg.vulkan.vk;

public class VkQueueFlagBits extends VkFlagBits {
    public static final int VK_QUEUE_GRAPHICS_BIT = 0x00000001;
    public static final int VK_QUEUE_COMPUTE_BIT = 0x00000002;
    public static final int VK_QUEUE_TRANSFER_BIT = 0x00000004;
    public static final int VK_QUEUE_SPARSE_BINDING_BIT = 0x00000008;
    public static final int VK_QUEUE_PROTECTED_BIT = 0x00000010;

    public VkQueueFlagBits() {
    }

    public VkQueueFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueueFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueueFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_QUEUE_GRAPHICS_BIT) s += "VK_QUEUE_GRAPHICS_BIT";
        if(getValue() == VK_QUEUE_COMPUTE_BIT) s += "VK_QUEUE_COMPUTE_BIT";
        if(getValue() == VK_QUEUE_TRANSFER_BIT) s += "VK_QUEUE_TRANSFER_BIT";
        if(getValue() == VK_QUEUE_SPARSE_BINDING_BIT) s += "VK_QUEUE_SPARSE_BINDING_BIT";
        if(getValue() == VK_QUEUE_PROTECTED_BIT) s += "VK_QUEUE_PROTECTED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
