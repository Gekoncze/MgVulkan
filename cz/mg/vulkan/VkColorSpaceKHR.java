package cz.mg.vulkan;

public class VkColorSpaceKHR extends VkEnum {
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT = 1000104001;
    public static final int VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT = 1000104002;
    public static final int VK_COLOR_SPACE_DCI_P3_LINEAR_EXT = 1000104003;
    public static final int VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT = 1000104004;
    public static final int VK_COLOR_SPACE_BT709_LINEAR_EXT = 1000104005;
    public static final int VK_COLOR_SPACE_BT709_NONLINEAR_EXT = 1000104006;
    public static final int VK_COLOR_SPACE_BT2020_LINEAR_EXT = 1000104007;
    public static final int VK_COLOR_SPACE_HDR10_ST2084_EXT = 1000104008;
    public static final int VK_COLOR_SPACE_DOLBYVISION_EXT = 1000104009;
    public static final int VK_COLOR_SPACE_HDR10_HLG_EXT = 1000104010;
    public static final int VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT = 1000104011;
    public static final int VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT = 1000104012;
    public static final int VK_COLOR_SPACE_PASS_THROUGH_EXT = 1000104013;
    public static final int VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT = 1000104014;

    public VkColorSpaceKHR() {
    }

    public VkColorSpaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkColorSpaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkColorSpaceKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COLOR_SPACE_SRGB_NONLINEAR_KHR) return "VK_COLOR_SPACE_SRGB_NONLINEAR_KHR";
        if(getValue() == VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT) return "VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT) return "VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_DCI_P3_LINEAR_EXT) return "VK_COLOR_SPACE_DCI_P3_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT) return "VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_BT709_LINEAR_EXT) return "VK_COLOR_SPACE_BT709_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_BT709_NONLINEAR_EXT) return "VK_COLOR_SPACE_BT709_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_BT2020_LINEAR_EXT) return "VK_COLOR_SPACE_BT2020_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_HDR10_ST2084_EXT) return "VK_COLOR_SPACE_HDR10_ST2084_EXT";
        if(getValue() == VK_COLOR_SPACE_DOLBYVISION_EXT) return "VK_COLOR_SPACE_DOLBYVISION_EXT";
        if(getValue() == VK_COLOR_SPACE_HDR10_HLG_EXT) return "VK_COLOR_SPACE_HDR10_HLG_EXT";
        if(getValue() == VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT) return "VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT) return "VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT";
        if(getValue() == VK_COLOR_SPACE_PASS_THROUGH_EXT) return "VK_COLOR_SPACE_PASS_THROUGH_EXT";
        if(getValue() == VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT) return "VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT";
        return "UNKNOWN";
    }
}
