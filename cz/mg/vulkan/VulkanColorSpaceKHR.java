package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanColorSpaceKHR extends VulkanEnum {
    public static final int COLOR_SPACE_SRGB_NONLINEAR_KHR = VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR;
    public static final int COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT;
    public static final int COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT;
    public static final int COLOR_SPACE_DCI_P3_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_LINEAR_EXT;
    public static final int COLOR_SPACE_DCI_P3_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT;
    public static final int COLOR_SPACE_BT709_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_BT709_LINEAR_EXT;
    public static final int COLOR_SPACE_BT709_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_BT709_NONLINEAR_EXT;
    public static final int COLOR_SPACE_BT2020_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_BT2020_LINEAR_EXT;
    public static final int COLOR_SPACE_HDR10_ST2084_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_ST2084_EXT;
    public static final int COLOR_SPACE_DOLBYVISION_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_DOLBYVISION_EXT;
    public static final int COLOR_SPACE_HDR10_HLG_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_HLG_EXT;
    public static final int COLOR_SPACE_ADOBERGB_LINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT;
    public static final int COLOR_SPACE_ADOBERGB_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT;
    public static final int COLOR_SPACE_PASS_THROUGH_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_PASS_THROUGH_EXT;
    public static final int COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT = VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT;

    public VulkanColorSpaceKHR(){
        super(new VkColorSpaceKHR());
    }

    public VulkanColorSpaceKHR(VkColorSpaceKHR vk){
        super(vk);
    }

    @Override
    public VkColorSpaceKHR getVk(){
        return (VkColorSpaceKHR) super.getVk();
    }

    public VulkanColorSpaceKHR(int value){
        super(new VkColorSpaceKHR(value));
    }

    @Override
    public String toString() {
        if(getValue() == COLOR_SPACE_SRGB_NONLINEAR_KHR) return "COLOR_SPACE_SRGB_NONLINEAR_KHR";
        if(getValue() == COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT) return "COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT";
        if(getValue() == COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT) return "COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT";
        if(getValue() == COLOR_SPACE_DCI_P3_LINEAR_EXT) return "COLOR_SPACE_DCI_P3_LINEAR_EXT";
        if(getValue() == COLOR_SPACE_DCI_P3_NONLINEAR_EXT) return "COLOR_SPACE_DCI_P3_NONLINEAR_EXT";
        if(getValue() == COLOR_SPACE_BT709_LINEAR_EXT) return "COLOR_SPACE_BT709_LINEAR_EXT";
        if(getValue() == COLOR_SPACE_BT709_NONLINEAR_EXT) return "COLOR_SPACE_BT709_NONLINEAR_EXT";
        if(getValue() == COLOR_SPACE_BT2020_LINEAR_EXT) return "COLOR_SPACE_BT2020_LINEAR_EXT";
        if(getValue() == COLOR_SPACE_HDR10_ST2084_EXT) return "COLOR_SPACE_HDR10_ST2084_EXT";
        if(getValue() == COLOR_SPACE_DOLBYVISION_EXT) return "COLOR_SPACE_DOLBYVISION_EXT";
        if(getValue() == COLOR_SPACE_HDR10_HLG_EXT) return "COLOR_SPACE_HDR10_HLG_EXT";
        if(getValue() == COLOR_SPACE_ADOBERGB_LINEAR_EXT) return "COLOR_SPACE_ADOBERGB_LINEAR_EXT";
        if(getValue() == COLOR_SPACE_ADOBERGB_NONLINEAR_EXT) return "COLOR_SPACE_ADOBERGB_NONLINEAR_EXT";
        if(getValue() == COLOR_SPACE_PASS_THROUGH_EXT) return "COLOR_SPACE_PASS_THROUGH_EXT";
        if(getValue() == COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT) return "COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT";
        return "UNKNOWN";
    }
}
