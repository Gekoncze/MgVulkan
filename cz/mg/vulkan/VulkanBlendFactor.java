package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBlendFactor.html">khronos documentation</a>
 **/
public class VulkanBlendFactor extends VulkanEnum {
    public static final int ZERO = VkBlendFactor.VK_BLEND_FACTOR_ZERO;
    public static final int ONE = VkBlendFactor.VK_BLEND_FACTOR_ONE;
    public static final int SRC_COLOR = VkBlendFactor.VK_BLEND_FACTOR_SRC_COLOR;
    public static final int ONE_MINUS_SRC_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR;
    public static final int DST_COLOR = VkBlendFactor.VK_BLEND_FACTOR_DST_COLOR;
    public static final int ONE_MINUS_DST_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR;
    public static final int SRC_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA;
    public static final int ONE_MINUS_SRC_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA;
    public static final int DST_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_DST_ALPHA;
    public static final int ONE_MINUS_DST_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA;
    public static final int CONSTANT_COLOR = VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_COLOR;
    public static final int ONE_MINUS_CONSTANT_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR;
    public static final int CONSTANT_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_ALPHA;
    public static final int ONE_MINUS_CONSTANT_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA;
    public static final int SRC_ALPHA_SATURATE = VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA_SATURATE;
    public static final int SRC1_COLOR = VkBlendFactor.VK_BLEND_FACTOR_SRC1_COLOR;
    public static final int ONE_MINUS_SRC1_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR;
    public static final int SRC1_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_SRC1_ALPHA;
    public static final int ONE_MINUS_SRC1_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA;

    public VulkanBlendFactor(){
        super(new VkBlendFactor());
    }

    public VulkanBlendFactor(VkBlendFactor vk){
        super(vk);
    }

    @Override
    public VkBlendFactor getVk(){
        return (VkBlendFactor) super.getVk();
    }

    public VulkanBlendFactor(int value){
        super(new VkBlendFactor(value));
    }

    @Override
    public String toString() {
        if(getValue() == ZERO) return "ZERO";
        if(getValue() == ONE) return "ONE";
        if(getValue() == SRC_COLOR) return "SRC_COLOR";
        if(getValue() == ONE_MINUS_SRC_COLOR) return "ONE_MINUS_SRC_COLOR";
        if(getValue() == DST_COLOR) return "DST_COLOR";
        if(getValue() == ONE_MINUS_DST_COLOR) return "ONE_MINUS_DST_COLOR";
        if(getValue() == SRC_ALPHA) return "SRC_ALPHA";
        if(getValue() == ONE_MINUS_SRC_ALPHA) return "ONE_MINUS_SRC_ALPHA";
        if(getValue() == DST_ALPHA) return "DST_ALPHA";
        if(getValue() == ONE_MINUS_DST_ALPHA) return "ONE_MINUS_DST_ALPHA";
        if(getValue() == CONSTANT_COLOR) return "CONSTANT_COLOR";
        if(getValue() == ONE_MINUS_CONSTANT_COLOR) return "ONE_MINUS_CONSTANT_COLOR";
        if(getValue() == CONSTANT_ALPHA) return "CONSTANT_ALPHA";
        if(getValue() == ONE_MINUS_CONSTANT_ALPHA) return "ONE_MINUS_CONSTANT_ALPHA";
        if(getValue() == SRC_ALPHA_SATURATE) return "SRC_ALPHA_SATURATE";
        if(getValue() == SRC1_COLOR) return "SRC1_COLOR";
        if(getValue() == ONE_MINUS_SRC1_COLOR) return "ONE_MINUS_SRC1_COLOR";
        if(getValue() == SRC1_ALPHA) return "SRC1_ALPHA";
        if(getValue() == ONE_MINUS_SRC1_ALPHA) return "ONE_MINUS_SRC1_ALPHA";
        return "UNKNOWN";
    }

    public static class Array extends VulkanBlendFactor implements cz.mg.collections.array.ReadonlyArray<VulkanBlendFactor> {
        public Array(VkBlendFactor.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBlendFactor.Array(count));
        }

        public Array(int count, VulkanBlendFactor o){
            this(new VkBlendFactor.Array(count, o.getVk()));
        }

        @Override
        public VkBlendFactor.Array getVk(){
            return (VkBlendFactor.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBlendFactor get(int i){
            return new VulkanBlendFactor(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBlendFactor.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBlendFactor.Pointer());
        }

        public Pointer(long value) {
            this(new VkBlendFactor.Pointer(value));
        }

        @Override
        public VkBlendFactor.Pointer getVk(){
            return (VkBlendFactor.Pointer) super.getVk();
        }

        public static class Array extends VulkanBlendFactor.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBlendFactor.Pointer> {
            public Array(int count) {
                super(new VkBlendFactor.Pointer.Array(count));
            }

            public Array(VulkanBlendFactor[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBlendFactor.Pointer.Array getVk(){
                return (VkBlendFactor.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBlendFactor.Pointer get(int i){
                return new VulkanBlendFactor.Pointer(getVk().get(i));
            }
        }
    }
}
