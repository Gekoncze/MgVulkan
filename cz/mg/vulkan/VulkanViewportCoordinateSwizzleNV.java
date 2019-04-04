package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkViewportCoordinateSwizzleNV.html">khronos documentation</a>
 **/
public class VulkanViewportCoordinateSwizzleNV extends VulkanEnum {
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV;

    public VulkanViewportCoordinateSwizzleNV(){
        super(new VkViewportCoordinateSwizzleNV());
    }

    public VulkanViewportCoordinateSwizzleNV(VkViewportCoordinateSwizzleNV vk){
        super(vk);
    }

    @Override
    public VkViewportCoordinateSwizzleNV getVk(){
        return (VkViewportCoordinateSwizzleNV) super.getVk();
    }

    public VulkanViewportCoordinateSwizzleNV(int value){
        super(new VkViewportCoordinateSwizzleNV(value));
    }

    @Override
    public String toString() {
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV";
        return "UNKNOWN";
    }

    public static class Array extends VulkanViewportCoordinateSwizzleNV implements cz.mg.collections.array.ReadonlyArray<VulkanViewportCoordinateSwizzleNV> {
        public Array(VkViewportCoordinateSwizzleNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkViewportCoordinateSwizzleNV.Array(count));
        }

        public Array(int count, VulkanViewportCoordinateSwizzleNV o){
            this(new VkViewportCoordinateSwizzleNV.Array(count, o.getVk()));
        }

        @Override
        public VkViewportCoordinateSwizzleNV.Array getVk(){
            return (VkViewportCoordinateSwizzleNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanViewportCoordinateSwizzleNV get(int i){
            return new VulkanViewportCoordinateSwizzleNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkViewportCoordinateSwizzleNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkViewportCoordinateSwizzleNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkViewportCoordinateSwizzleNV.Pointer(value));
        }

        @Override
        public VkViewportCoordinateSwizzleNV.Pointer getVk(){
            return (VkViewportCoordinateSwizzleNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanViewportCoordinateSwizzleNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanViewportCoordinateSwizzleNV.Pointer> {
            public Array(int count) {
                super(new VkViewportCoordinateSwizzleNV.Pointer.Array(count));
            }

            public Array(VulkanViewportCoordinateSwizzleNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkViewportCoordinateSwizzleNV.Pointer.Array getVk(){
                return (VkViewportCoordinateSwizzleNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanViewportCoordinateSwizzleNV.Pointer get(int i){
                return new VulkanViewportCoordinateSwizzleNV.Pointer(getVk().get(i));
            }
        }
    }
}
