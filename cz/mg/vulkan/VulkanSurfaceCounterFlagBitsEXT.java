package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCounterFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanSurfaceCounterFlagBitsEXT extends VulkanFlagBits {
    public static final int SURFACE_COUNTER_VBLANK_EXT = VkSurfaceCounterFlagBitsEXT.VK_SURFACE_COUNTER_VBLANK_EXT;

    public VulkanSurfaceCounterFlagBitsEXT(){
        super(new VkSurfaceCounterFlagBitsEXT());
    }

    public VulkanSurfaceCounterFlagBitsEXT(VkSurfaceCounterFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkSurfaceCounterFlagBitsEXT getVk(){
        return (VkSurfaceCounterFlagBitsEXT) super.getVk();
    }

    public VulkanSurfaceCounterFlagBitsEXT(int value){
        super(new VkSurfaceCounterFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SURFACE_COUNTER_VBLANK_EXT) s += "SURFACE_COUNTER_VBLANK_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSurfaceCounterFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCounterFlagBitsEXT> {
        public Array(VkSurfaceCounterFlagBitsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceCounterFlagBitsEXT.Array(count));
        }

        public Array(int count, VulkanSurfaceCounterFlagBitsEXT o){
            this(new VkSurfaceCounterFlagBitsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceCounterFlagBitsEXT.Array getVk(){
            return (VkSurfaceCounterFlagBitsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceCounterFlagBitsEXT get(int i){
            return new VulkanSurfaceCounterFlagBitsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceCounterFlagBitsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceCounterFlagBitsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceCounterFlagBitsEXT.Pointer(value));
        }

        @Override
        public VkSurfaceCounterFlagBitsEXT.Pointer getVk(){
            return (VkSurfaceCounterFlagBitsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceCounterFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCounterFlagBitsEXT.Pointer> {
            public Array(int count) {
                super(new VkSurfaceCounterFlagBitsEXT.Pointer.Array(count));
            }

            public Array(VulkanSurfaceCounterFlagBitsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceCounterFlagBitsEXT.Pointer.Array getVk(){
                return (VkSurfaceCounterFlagBitsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceCounterFlagBitsEXT.Pointer get(int i){
                return new VulkanSurfaceCounterFlagBitsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
