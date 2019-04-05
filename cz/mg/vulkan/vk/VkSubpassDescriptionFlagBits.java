package cz.mg.vulkan.vk;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX) s += "VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX";
        if(getValue() == VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX) s += "VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
