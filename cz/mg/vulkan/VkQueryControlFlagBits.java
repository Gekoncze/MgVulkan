package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

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

    public VkQueryControlFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_QUERY_CONTROL_PRECISE_BIT) != 0) s.addLast("VK_QUERY_CONTROL_PRECISE_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
