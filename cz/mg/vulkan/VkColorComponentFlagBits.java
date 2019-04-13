package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkColorComponentFlagBits extends VkFlagBits {
    public static final int VK_COLOR_COMPONENT_R_BIT = 0x00000001;
    public static final int VK_COLOR_COMPONENT_G_BIT = 0x00000002;
    public static final int VK_COLOR_COMPONENT_B_BIT = 0x00000004;
    public static final int VK_COLOR_COMPONENT_A_BIT = 0x00000008;

    public VkColorComponentFlagBits() {
    }

    public VkColorComponentFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkColorComponentFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkColorComponentFlagBits(int value) {
        setValue(value);
    }

    public VkColorComponentFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_COLOR_COMPONENT_R_BIT) != 0) s.addLast("VK_COLOR_COMPONENT_R_BIT");
        if((getValue() & VK_COLOR_COMPONENT_G_BIT) != 0) s.addLast("VK_COLOR_COMPONENT_G_BIT");
        if((getValue() & VK_COLOR_COMPONENT_B_BIT) != 0) s.addLast("VK_COLOR_COMPONENT_B_BIT");
        if((getValue() & VK_COLOR_COMPONENT_A_BIT) != 0) s.addLast("VK_COLOR_COMPONENT_A_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
