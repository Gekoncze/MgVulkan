package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBorderColor.html">khronos documentation</a>
 **/
public class VulkanBorderColor extends VulkanEnum {
    public static final int FLOAT_TRANSPARENT_BLACK = VkBorderColor.VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK;
    public static final int INT_TRANSPARENT_BLACK = VkBorderColor.VK_BORDER_COLOR_INT_TRANSPARENT_BLACK;
    public static final int FLOAT_OPAQUE_BLACK = VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK;
    public static final int INT_OPAQUE_BLACK = VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_BLACK;
    public static final int FLOAT_OPAQUE_WHITE = VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE;
    public static final int INT_OPAQUE_WHITE = VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_WHITE;

    public VulkanBorderColor(){
        super(new VkBorderColor());
    }

    public VulkanBorderColor(VkBorderColor vk){
        super(vk);
    }

    @Override
    public VkBorderColor getVk(){
        return (VkBorderColor) super.getVk();
    }

    public VulkanBorderColor(int value){
        super(new VkBorderColor(value));
    }

    @Override
    public String toString() {
        if(getValue() == FLOAT_TRANSPARENT_BLACK) return "FLOAT_TRANSPARENT_BLACK";
        if(getValue() == INT_TRANSPARENT_BLACK) return "INT_TRANSPARENT_BLACK";
        if(getValue() == FLOAT_OPAQUE_BLACK) return "FLOAT_OPAQUE_BLACK";
        if(getValue() == INT_OPAQUE_BLACK) return "INT_OPAQUE_BLACK";
        if(getValue() == FLOAT_OPAQUE_WHITE) return "FLOAT_OPAQUE_WHITE";
        if(getValue() == INT_OPAQUE_WHITE) return "INT_OPAQUE_WHITE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanBorderColor implements cz.mg.collections.array.ReadonlyArray<VulkanBorderColor> {
        public Array(VkBorderColor.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBorderColor.Array(count));
        }

        public Array(int count, VulkanBorderColor o){
            this(new VkBorderColor.Array(count, o.getVk()));
        }

        @Override
        public VkBorderColor.Array getVk(){
            return (VkBorderColor.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBorderColor get(int i){
            return new VulkanBorderColor(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBorderColor.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBorderColor.Pointer());
        }

        public Pointer(long value) {
            this(new VkBorderColor.Pointer(value));
        }

        @Override
        public VkBorderColor.Pointer getVk(){
            return (VkBorderColor.Pointer) super.getVk();
        }

        public static class Array extends VulkanBorderColor.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBorderColor.Pointer> {
            public Array(int count) {
                super(new VkBorderColor.Pointer.Array(count));
            }

            public Array(VulkanBorderColor[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBorderColor.Pointer.Array getVk(){
                return (VkBorderColor.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBorderColor.Pointer get(int i){
                return new VulkanBorderColor.Pointer(getVk().get(i));
            }
        }
    }
}
