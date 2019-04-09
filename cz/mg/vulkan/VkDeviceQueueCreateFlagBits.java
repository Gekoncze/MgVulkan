package cz.mg.vulkan;

public class VkDeviceQueueCreateFlagBits extends VkFlagBits {
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 0x00000001;

    public VkDeviceQueueCreateFlagBits() {
    }

    public VkDeviceQueueCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceQueueCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT) s += "VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
