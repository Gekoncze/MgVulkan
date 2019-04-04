package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDiscardRectangleModeEXT.html">khronos documentation</a>
 **/
public class VulkanDiscardRectangleModeEXT extends VulkanEnum {
    public static final int DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = VkDiscardRectangleModeEXT.VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT;
    public static final int DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = VkDiscardRectangleModeEXT.VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT;

    public VulkanDiscardRectangleModeEXT(){
        super(new VkDiscardRectangleModeEXT());
    }

    public VulkanDiscardRectangleModeEXT(VkDiscardRectangleModeEXT vk){
        super(vk);
    }

    @Override
    public VkDiscardRectangleModeEXT getVk(){
        return (VkDiscardRectangleModeEXT) super.getVk();
    }

    public VulkanDiscardRectangleModeEXT(int value){
        super(new VkDiscardRectangleModeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT) return "DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT";
        if(getValue() == DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT) return "DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanDiscardRectangleModeEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDiscardRectangleModeEXT> {
        public Array(VkDiscardRectangleModeEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDiscardRectangleModeEXT.Array(count));
        }

        public Array(int count, VulkanDiscardRectangleModeEXT o){
            this(new VkDiscardRectangleModeEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDiscardRectangleModeEXT.Array getVk(){
            return (VkDiscardRectangleModeEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDiscardRectangleModeEXT get(int i){
            return new VulkanDiscardRectangleModeEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDiscardRectangleModeEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDiscardRectangleModeEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDiscardRectangleModeEXT.Pointer(value));
        }

        @Override
        public VkDiscardRectangleModeEXT.Pointer getVk(){
            return (VkDiscardRectangleModeEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDiscardRectangleModeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDiscardRectangleModeEXT.Pointer> {
            public Array(int count) {
                super(new VkDiscardRectangleModeEXT.Pointer.Array(count));
            }

            public Array(VulkanDiscardRectangleModeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDiscardRectangleModeEXT.Pointer.Array getVk(){
                return (VkDiscardRectangleModeEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDiscardRectangleModeEXT.Pointer get(int i){
                return new VulkanDiscardRectangleModeEXT.Pointer(getVk().get(i));
            }
        }
    }
}
