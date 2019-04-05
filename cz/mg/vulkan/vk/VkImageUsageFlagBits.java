package cz.mg.vulkan.vk;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_IMAGE_USAGE_TRANSFER_SRC_BIT) s += "VK_IMAGE_USAGE_TRANSFER_SRC_BIT";
        if(getValue() == VK_IMAGE_USAGE_TRANSFER_DST_BIT) s += "VK_IMAGE_USAGE_TRANSFER_DST_BIT";
        if(getValue() == VK_IMAGE_USAGE_SAMPLED_BIT) s += "VK_IMAGE_USAGE_SAMPLED_BIT";
        if(getValue() == VK_IMAGE_USAGE_STORAGE_BIT) s += "VK_IMAGE_USAGE_STORAGE_BIT";
        if(getValue() == VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT";
        if(getValue() == VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT";
        if(getValue() == VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT";
        if(getValue() == VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
