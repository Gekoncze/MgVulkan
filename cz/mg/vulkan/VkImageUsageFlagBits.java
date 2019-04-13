package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkImageUsageFlagBits extends VkFlagBits {
    public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 0x00000001;
    public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 0x00000002;
    public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 0x00000004;
    public static final int VK_IMAGE_USAGE_STORAGE_BIT = 0x00000008;
    public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 0x00000010;
    public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000020;
    public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 0x00000040;
    public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 0x00000080;

    public VkImageUsageFlagBits() {
    }

    public VkImageUsageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageUsageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageUsageFlagBits(int value) {
        setValue(value);
    }

    public VkImageUsageFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_IMAGE_USAGE_TRANSFER_SRC_BIT) != 0) s.addLast("VK_IMAGE_USAGE_TRANSFER_SRC_BIT");
        if((getValue() & VK_IMAGE_USAGE_TRANSFER_DST_BIT) != 0) s.addLast("VK_IMAGE_USAGE_TRANSFER_DST_BIT");
        if((getValue() & VK_IMAGE_USAGE_SAMPLED_BIT) != 0) s.addLast("VK_IMAGE_USAGE_SAMPLED_BIT");
        if((getValue() & VK_IMAGE_USAGE_STORAGE_BIT) != 0) s.addLast("VK_IMAGE_USAGE_STORAGE_BIT");
        if((getValue() & VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT) != 0) s.addLast("VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT");
        if((getValue() & VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT) != 0) s.addLast("VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT");
        if((getValue() & VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT) != 0) s.addLast("VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT");
        if((getValue() & VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT) != 0) s.addLast("VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
