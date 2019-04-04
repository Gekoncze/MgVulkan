package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceTransformFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanSurfaceTransformFlagBitsKHR extends VulkanFlagBits {
    public static final int SURFACE_TRANSFORM_IDENTITY_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
    public static final int SURFACE_TRANSFORM_ROTATE_90_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR;
    public static final int SURFACE_TRANSFORM_ROTATE_180_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR;
    public static final int SURFACE_TRANSFORM_ROTATE_270_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR;
    public static final int SURFACE_TRANSFORM_INHERIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR;

    public VulkanSurfaceTransformFlagBitsKHR(){
        super(new VkSurfaceTransformFlagBitsKHR());
    }

    public VulkanSurfaceTransformFlagBitsKHR(VkSurfaceTransformFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceTransformFlagBitsKHR getVk(){
        return (VkSurfaceTransformFlagBitsKHR) super.getVk();
    }

    public VulkanSurfaceTransformFlagBitsKHR(int value){
        super(new VkSurfaceTransformFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SURFACE_TRANSFORM_IDENTITY_KHR) s += "SURFACE_TRANSFORM_IDENTITY_KHR";
        if(getValue() == SURFACE_TRANSFORM_ROTATE_90_KHR) s += "SURFACE_TRANSFORM_ROTATE_90_KHR";
        if(getValue() == SURFACE_TRANSFORM_ROTATE_180_KHR) s += "SURFACE_TRANSFORM_ROTATE_180_KHR";
        if(getValue() == SURFACE_TRANSFORM_ROTATE_270_KHR) s += "SURFACE_TRANSFORM_ROTATE_270_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_KHR";
        if(getValue() == SURFACE_TRANSFORM_INHERIT_KHR) s += "SURFACE_TRANSFORM_INHERIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSurfaceTransformFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceTransformFlagBitsKHR> {
        public Array(VkSurfaceTransformFlagBitsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceTransformFlagBitsKHR.Array(count));
        }

        public Array(int count, VulkanSurfaceTransformFlagBitsKHR o){
            this(new VkSurfaceTransformFlagBitsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceTransformFlagBitsKHR.Array getVk(){
            return (VkSurfaceTransformFlagBitsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceTransformFlagBitsKHR get(int i){
            return new VulkanSurfaceTransformFlagBitsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceTransformFlagBitsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceTransformFlagBitsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceTransformFlagBitsKHR.Pointer(value));
        }

        @Override
        public VkSurfaceTransformFlagBitsKHR.Pointer getVk(){
            return (VkSurfaceTransformFlagBitsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceTransformFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceTransformFlagBitsKHR.Pointer> {
            public Array(int count) {
                super(new VkSurfaceTransformFlagBitsKHR.Pointer.Array(count));
            }

            public Array(VulkanSurfaceTransformFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceTransformFlagBitsKHR.Pointer.Array getVk(){
                return (VkSurfaceTransformFlagBitsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceTransformFlagBitsKHR.Pointer get(int i){
                return new VulkanSurfaceTransformFlagBitsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
