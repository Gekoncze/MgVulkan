package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPlaneAlphaFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayPlaneAlphaFlagBitsKHR extends VulkanFlagBits {
    public static final int DISPLAY_PLANE_ALPHA_OPAQUE_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR;
    public static final int DISPLAY_PLANE_ALPHA_GLOBAL_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR;
    public static final int DISPLAY_PLANE_ALPHA_PER_PIXEL_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR;
    public static final int DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR;

    public VulkanDisplayPlaneAlphaFlagBitsKHR(){
        super(new VkDisplayPlaneAlphaFlagBitsKHR());
    }

    public VulkanDisplayPlaneAlphaFlagBitsKHR(VkDisplayPlaneAlphaFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPlaneAlphaFlagBitsKHR getVk(){
        return (VkDisplayPlaneAlphaFlagBitsKHR) super.getVk();
    }

    public VulkanDisplayPlaneAlphaFlagBitsKHR(int value){
        super(new VkDisplayPlaneAlphaFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DISPLAY_PLANE_ALPHA_OPAQUE_KHR) s += "DISPLAY_PLANE_ALPHA_OPAQUE_KHR";
        if(getValue() == DISPLAY_PLANE_ALPHA_GLOBAL_KHR) s += "DISPLAY_PLANE_ALPHA_GLOBAL_KHR";
        if(getValue() == DISPLAY_PLANE_ALPHA_PER_PIXEL_KHR) s += "DISPLAY_PLANE_ALPHA_PER_PIXEL_KHR";
        if(getValue() == DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_KHR) s += "DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDisplayPlaneAlphaFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlaneAlphaFlagBitsKHR> {
        public Array(VkDisplayPlaneAlphaFlagBitsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPlaneAlphaFlagBitsKHR.Array(count));
        }

        public Array(int count, VulkanDisplayPlaneAlphaFlagBitsKHR o){
            this(new VkDisplayPlaneAlphaFlagBitsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPlaneAlphaFlagBitsKHR.Array getVk(){
            return (VkDisplayPlaneAlphaFlagBitsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPlaneAlphaFlagBitsKHR get(int i){
            return new VulkanDisplayPlaneAlphaFlagBitsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPlaneAlphaFlagBitsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPlaneAlphaFlagBitsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPlaneAlphaFlagBitsKHR.Pointer(value));
        }

        @Override
        public VkDisplayPlaneAlphaFlagBitsKHR.Pointer getVk(){
            return (VkDisplayPlaneAlphaFlagBitsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPlaneAlphaFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlaneAlphaFlagBitsKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayPlaneAlphaFlagBitsKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayPlaneAlphaFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPlaneAlphaFlagBitsKHR.Pointer.Array getVk(){
                return (VkDisplayPlaneAlphaFlagBitsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPlaneAlphaFlagBitsKHR.Pointer get(int i){
                return new VulkanDisplayPlaneAlphaFlagBitsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
