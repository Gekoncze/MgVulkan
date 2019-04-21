package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkAttachmentDescriptionFlagBits extends VkFlagBits {
    public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x00000001;

    public VkAttachmentDescriptionFlagBits() {
    }

    public VkAttachmentDescriptionFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentDescriptionFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkAttachmentDescriptionFlagBits(int value) {
        setValue(value);
    }

    public VkAttachmentDescriptionFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT) != 0) s.addLast("VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
