package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkSubpassDescriptionFlagBits extends VkFlagBits {
    public static final int VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX = 0x00000001;
    public static final int VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX = 0x00000002;

    public VkSubpassDescriptionFlagBits() {
    }

    public VkSubpassDescriptionFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassDescriptionFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSubpassDescriptionFlagBits(int value) {
        setValue(value);
    }

    public VkSubpassDescriptionFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX) != 0) s.addLast("VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX");
        if((getValue() & VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX) != 0) s.addLast("VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
