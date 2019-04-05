package cz.mg.vulkan.vk;

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

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COLOR_COMPONENT_R_BIT) s += "VK_COLOR_COMPONENT_R_BIT";
        if(getValue() == VK_COLOR_COMPONENT_G_BIT) s += "VK_COLOR_COMPONENT_G_BIT";
        if(getValue() == VK_COLOR_COMPONENT_B_BIT) s += "VK_COLOR_COMPONENT_B_BIT";
        if(getValue() == VK_COLOR_COMPONENT_A_BIT) s += "VK_COLOR_COMPONENT_A_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
