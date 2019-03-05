package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkBlendOp;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanBlendOp {
    public static final int ADD = VkBlendOp.VK_BLEND_OP_ADD;
    public static final int SUBTRACT = VkBlendOp.VK_BLEND_OP_SUBTRACT;
    public static final int REVERSE_SUBTRACT = VkBlendOp.VK_BLEND_OP_REVERSE_SUBTRACT;
    public static final int MIN = VkBlendOp.VK_BLEND_OP_MIN;
    public static final int MAX = VkBlendOp.VK_BLEND_OP_MAX;
    public static final int ZERO_EXT = VkBlendOp.VK_BLEND_OP_ZERO_EXT;
    public static final int SRC_EXT = VkBlendOp.VK_BLEND_OP_SRC_EXT;
    public static final int DST_EXT = VkBlendOp.VK_BLEND_OP_DST_EXT;
    public static final int SRC_OVER_EXT = VkBlendOp.VK_BLEND_OP_SRC_OVER_EXT;
    public static final int DST_OVER_EXT = VkBlendOp.VK_BLEND_OP_DST_OVER_EXT;
    public static final int SRC_IN_EXT = VkBlendOp.VK_BLEND_OP_SRC_IN_EXT;
    public static final int DST_IN_EXT = VkBlendOp.VK_BLEND_OP_DST_IN_EXT;
    public static final int SRC_OUT_EXT = VkBlendOp.VK_BLEND_OP_SRC_OUT_EXT;
    public static final int DST_OUT_EXT = VkBlendOp.VK_BLEND_OP_DST_OUT_EXT;
    public static final int SRC_ATOP_EXT = VkBlendOp.VK_BLEND_OP_SRC_ATOP_EXT;
    public static final int DST_ATOP_EXT = VkBlendOp.VK_BLEND_OP_DST_ATOP_EXT;
    public static final int XOR_EXT = VkBlendOp.VK_BLEND_OP_XOR_EXT;
    public static final int MULTIPLY_EXT = VkBlendOp.VK_BLEND_OP_MULTIPLY_EXT;
    public static final int SCREEN_EXT = VkBlendOp.VK_BLEND_OP_SCREEN_EXT;
    public static final int OVERLAY_EXT = VkBlendOp.VK_BLEND_OP_OVERLAY_EXT;
    public static final int DARKEN_EXT = VkBlendOp.VK_BLEND_OP_DARKEN_EXT;
    public static final int LIGHTEN_EXT = VkBlendOp.VK_BLEND_OP_LIGHTEN_EXT;
    public static final int COLORDODGE_EXT = VkBlendOp.VK_BLEND_OP_COLORDODGE_EXT;
    public static final int COLORBURN_EXT = VkBlendOp.VK_BLEND_OP_COLORBURN_EXT;
    public static final int HARDLIGHT_EXT = VkBlendOp.VK_BLEND_OP_HARDLIGHT_EXT;
    public static final int SOFTLIGHT_EXT = VkBlendOp.VK_BLEND_OP_SOFTLIGHT_EXT;
    public static final int DIFFERENCE_EXT = VkBlendOp.VK_BLEND_OP_DIFFERENCE_EXT;
    public static final int EXCLUSION_EXT = VkBlendOp.VK_BLEND_OP_EXCLUSION_EXT;
    public static final int INVERT_EXT = VkBlendOp.VK_BLEND_OP_INVERT_EXT;
    public static final int INVERT_RGB_EXT = VkBlendOp.VK_BLEND_OP_INVERT_RGB_EXT;
    public static final int LINEARDODGE_EXT = VkBlendOp.VK_BLEND_OP_LINEARDODGE_EXT;
    public static final int LINEARBURN_EXT = VkBlendOp.VK_BLEND_OP_LINEARBURN_EXT;
    public static final int VIVIDLIGHT_EXT = VkBlendOp.VK_BLEND_OP_VIVIDLIGHT_EXT;
    public static final int LINEARLIGHT_EXT = VkBlendOp.VK_BLEND_OP_LINEARLIGHT_EXT;
    public static final int PINLIGHT_EXT = VkBlendOp.VK_BLEND_OP_PINLIGHT_EXT;
    public static final int HARDMIX_EXT = VkBlendOp.VK_BLEND_OP_HARDMIX_EXT;
    public static final int HSL_HUE_EXT = VkBlendOp.VK_BLEND_OP_HSL_HUE_EXT;
    public static final int HSL_SATURATION_EXT = VkBlendOp.VK_BLEND_OP_HSL_SATURATION_EXT;
    public static final int HSL_COLOR_EXT = VkBlendOp.VK_BLEND_OP_HSL_COLOR_EXT;
    public static final int HSL_LUMINOSITY_EXT = VkBlendOp.VK_BLEND_OP_HSL_LUMINOSITY_EXT;
    public static final int PLUS_EXT = VkBlendOp.VK_BLEND_OP_PLUS_EXT;
    public static final int PLUS_CLAMPED_EXT = VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_EXT;
    public static final int PLUS_CLAMPED_ALPHA_EXT = VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT;
    public static final int PLUS_DARKER_EXT = VkBlendOp.VK_BLEND_OP_PLUS_DARKER_EXT;
    public static final int MINUS_EXT = VkBlendOp.VK_BLEND_OP_MINUS_EXT;
    public static final int MINUS_CLAMPED_EXT = VkBlendOp.VK_BLEND_OP_MINUS_CLAMPED_EXT;
    public static final int CONTRAST_EXT = VkBlendOp.VK_BLEND_OP_CONTRAST_EXT;
    public static final int INVERT_OVG_EXT = VkBlendOp.VK_BLEND_OP_INVERT_OVG_EXT;
    public static final int RED_EXT = VkBlendOp.VK_BLEND_OP_RED_EXT;
    public static final int GREEN_EXT = VkBlendOp.VK_BLEND_OP_GREEN_EXT;
    public static final int BLUE_EXT = VkBlendOp.VK_BLEND_OP_BLUE_EXT;

    public final VkBlendOp enums;

    public VulkanBlendOp() {
        this(0);
    }

    public VulkanBlendOp(int value) {
        this(new VkBlendOp(value));
    }

    public VulkanBlendOp(VkBlendOp enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkBlendOp.class);
    }
}
