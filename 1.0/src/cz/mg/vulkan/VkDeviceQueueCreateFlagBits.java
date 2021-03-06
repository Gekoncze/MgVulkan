package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDeviceQueueCreateFlagBits extends VkFlagBits {
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 0x00000001;

    public VkDeviceQueueCreateFlagBits() {
    }

    protected VkDeviceQueueCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceQueueCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceQueueCreateFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceQueueCreateFlagBits(int value) {
        setValue(value);
    }

    public VkDeviceQueueCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT) != 0) s.addLast("VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
