package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkColorSpaceKHR.html">khronos documentation</a>
 **/
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

    public static class Array extends VulkanColorSpaceKHR implements cz.mg.collections.array.ReadonlyArray<VulkanColorSpaceKHR> {
        public Array(VkColorSpaceKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkColorSpaceKHR.Array(count));
        }

        public Array(int count, VulkanColorSpaceKHR o){
            this(new VkColorSpaceKHR.Array(count, o.getVk()));
        }

        @Override
        public VkColorSpaceKHR.Array getVk(){
            return (VkColorSpaceKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanColorSpaceKHR get(int i){
            return new VulkanColorSpaceKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkColorSpaceKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkColorSpaceKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkColorSpaceKHR.Pointer(value));
        }

        @Override
        public VkColorSpaceKHR.Pointer getVk(){
            return (VkColorSpaceKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanColorSpaceKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanColorSpaceKHR.Pointer> {
            public Array(int count) {
                super(new VkColorSpaceKHR.Pointer.Array(count));
            }

            public Array(VulkanColorSpaceKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkColorSpaceKHR.Pointer.Array getVk(){
                return (VkColorSpaceKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanColorSpaceKHR.Pointer get(int i){
                return new VulkanColorSpaceKHR.Pointer(getVk().get(i));
            }
        }
    }
}
