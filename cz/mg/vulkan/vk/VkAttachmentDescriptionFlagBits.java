package cz.mg.vulkan.vk;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT) s += "VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
