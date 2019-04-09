package cz.mg.vulkan;

public class VkFenceCreateFlagBits extends VkFlagBits {
    public static final int VK_FENCE_CREATE_SIGNALED_BIT = 0x00000001;

    public VkFenceCreateFlagBits() {
    }

    public VkFenceCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFenceCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_FENCE_CREATE_SIGNALED_BIT) s += "VK_FENCE_CREATE_SIGNALED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
