package cz.mg.vulkan;

public class VkQueryControlFlagBits extends VkFlagBits {
    public static final int VK_QUERY_CONTROL_PRECISE_BIT = 0x00000001;

    public VkQueryControlFlagBits() {
    }

    public VkQueryControlFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryControlFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryControlFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_QUERY_CONTROL_PRECISE_BIT) s += "VK_QUERY_CONTROL_PRECISE_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
