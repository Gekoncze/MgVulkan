package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBlendOp.html">khronos documentation</a>
 **/
public class VulkanBlendOp extends VulkanEnum {
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

    public VulkanBlendOp(){
        super(new VkBlendOp());
    }

    public VulkanBlendOp(VkBlendOp vk){
        super(vk);
    }

    @Override
    public VkBlendOp getVk(){
        return (VkBlendOp) super.getVk();
    }

    public VulkanBlendOp(int value){
        super(new VkBlendOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == ADD) return "ADD";
        if(getValue() == SUBTRACT) return "SUBTRACT";
        if(getValue() == REVERSE_SUBTRACT) return "REVERSE_SUBTRACT";
        if(getValue() == MIN) return "MIN";
        if(getValue() == MAX) return "MAX";
        if(getValue() == ZERO_EXT) return "ZERO_EXT";
        if(getValue() == SRC_EXT) return "SRC_EXT";
        if(getValue() == DST_EXT) return "DST_EXT";
        if(getValue() == SRC_OVER_EXT) return "SRC_OVER_EXT";
        if(getValue() == DST_OVER_EXT) return "DST_OVER_EXT";
        if(getValue() == SRC_IN_EXT) return "SRC_IN_EXT";
        if(getValue() == DST_IN_EXT) return "DST_IN_EXT";
        if(getValue() == SRC_OUT_EXT) return "SRC_OUT_EXT";
        if(getValue() == DST_OUT_EXT) return "DST_OUT_EXT";
        if(getValue() == SRC_ATOP_EXT) return "SRC_ATOP_EXT";
        if(getValue() == DST_ATOP_EXT) return "DST_ATOP_EXT";
        if(getValue() == XOR_EXT) return "XOR_EXT";
        if(getValue() == MULTIPLY_EXT) return "MULTIPLY_EXT";
        if(getValue() == SCREEN_EXT) return "SCREEN_EXT";
        if(getValue() == OVERLAY_EXT) return "OVERLAY_EXT";
        if(getValue() == DARKEN_EXT) return "DARKEN_EXT";
        if(getValue() == LIGHTEN_EXT) return "LIGHTEN_EXT";
        if(getValue() == COLORDODGE_EXT) return "COLORDODGE_EXT";
        if(getValue() == COLORBURN_EXT) return "COLORBURN_EXT";
        if(getValue() == HARDLIGHT_EXT) return "HARDLIGHT_EXT";
        if(getValue() == SOFTLIGHT_EXT) return "SOFTLIGHT_EXT";
        if(getValue() == DIFFERENCE_EXT) return "DIFFERENCE_EXT";
        if(getValue() == EXCLUSION_EXT) return "EXCLUSION_EXT";
        if(getValue() == INVERT_EXT) return "INVERT_EXT";
        if(getValue() == INVERT_RGB_EXT) return "INVERT_RGB_EXT";
        if(getValue() == LINEARDODGE_EXT) return "LINEARDODGE_EXT";
        if(getValue() == LINEARBURN_EXT) return "LINEARBURN_EXT";
        if(getValue() == VIVIDLIGHT_EXT) return "VIVIDLIGHT_EXT";
        if(getValue() == LINEARLIGHT_EXT) return "LINEARLIGHT_EXT";
        if(getValue() == PINLIGHT_EXT) return "PINLIGHT_EXT";
        if(getValue() == HARDMIX_EXT) return "HARDMIX_EXT";
        if(getValue() == HSL_HUE_EXT) return "HSL_HUE_EXT";
        if(getValue() == HSL_SATURATION_EXT) return "HSL_SATURATION_EXT";
        if(getValue() == HSL_COLOR_EXT) return "HSL_COLOR_EXT";
        if(getValue() == HSL_LUMINOSITY_EXT) return "HSL_LUMINOSITY_EXT";
        if(getValue() == PLUS_EXT) return "PLUS_EXT";
        if(getValue() == PLUS_CLAMPED_EXT) return "PLUS_CLAMPED_EXT";
        if(getValue() == PLUS_CLAMPED_ALPHA_EXT) return "PLUS_CLAMPED_ALPHA_EXT";
        if(getValue() == PLUS_DARKER_EXT) return "PLUS_DARKER_EXT";
        if(getValue() == MINUS_EXT) return "MINUS_EXT";
        if(getValue() == MINUS_CLAMPED_EXT) return "MINUS_CLAMPED_EXT";
        if(getValue() == CONTRAST_EXT) return "CONTRAST_EXT";
        if(getValue() == INVERT_OVG_EXT) return "INVERT_OVG_EXT";
        if(getValue() == RED_EXT) return "RED_EXT";
        if(getValue() == GREEN_EXT) return "GREEN_EXT";
        if(getValue() == BLUE_EXT) return "BLUE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanBlendOp implements cz.mg.collections.array.ReadonlyArray<VulkanBlendOp> {
        public Array(VkBlendOp.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBlendOp.Array(count));
        }

        public Array(int count, VulkanBlendOp o){
            this(new VkBlendOp.Array(count, o.getVk()));
        }

        @Override
        public VkBlendOp.Array getVk(){
            return (VkBlendOp.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBlendOp get(int i){
            return new VulkanBlendOp(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBlendOp.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBlendOp.Pointer());
        }

        public Pointer(long value) {
            this(new VkBlendOp.Pointer(value));
        }

        @Override
        public VkBlendOp.Pointer getVk(){
            return (VkBlendOp.Pointer) super.getVk();
        }

        public static class Array extends VulkanBlendOp.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBlendOp.Pointer> {
            public Array(int count) {
                super(new VkBlendOp.Pointer.Array(count));
            }

            public Array(VulkanBlendOp[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBlendOp.Pointer.Array getVk(){
                return (VkBlendOp.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBlendOp.Pointer get(int i){
                return new VulkanBlendOp.Pointer(getVk().get(i));
            }
        }
    }
}
