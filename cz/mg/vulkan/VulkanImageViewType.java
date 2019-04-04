package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageViewType.html">khronos documentation</a>
 **/
public class VulkanImageViewType extends VulkanEnum {
    public static final int D1 = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D;
    public static final int D2 = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D;
    public static final int D3 = VkImageViewType.VK_IMAGE_VIEW_TYPE_3D;
    public static final int CUBE = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE;
    public static final int D1_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY;
    public static final int D2_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY;
    public static final int CUBE_ARRAY = VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY;

    public VulkanImageViewType(){
        super(new VkImageViewType());
    }

    public VulkanImageViewType(VkImageViewType vk){
        super(vk);
    }

    @Override
    public VkImageViewType getVk(){
        return (VkImageViewType) super.getVk();
    }

    public VulkanImageViewType(int value){
        super(new VkImageViewType(value));
    }

    @Override
    public String toString() {
        if(getValue() == D1) return "D1";
        if(getValue() == D2) return "D2";
        if(getValue() == D3) return "D3";
        if(getValue() == CUBE) return "CUBE";
        if(getValue() == D1_ARRAY) return "D1_ARRAY";
        if(getValue() == D2_ARRAY) return "D2_ARRAY";
        if(getValue() == CUBE_ARRAY) return "CUBE_ARRAY";
        return "UNKNOWN";
    }

    public static class Array extends VulkanImageViewType implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewType> {
        public Array(VkImageViewType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageViewType.Array(count));
        }

        public Array(int count, VulkanImageViewType o){
            this(new VkImageViewType.Array(count, o.getVk()));
        }

        @Override
        public VkImageViewType.Array getVk(){
            return (VkImageViewType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageViewType get(int i){
            return new VulkanImageViewType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageViewType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageViewType.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageViewType.Pointer(value));
        }

        @Override
        public VkImageViewType.Pointer getVk(){
            return (VkImageViewType.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageViewType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewType.Pointer> {
            public Array(int count) {
                super(new VkImageViewType.Pointer.Array(count));
            }

            public Array(VulkanImageViewType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageViewType.Pointer.Array getVk(){
                return (VkImageViewType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageViewType.Pointer get(int i){
                return new VulkanImageViewType.Pointer(getVk().get(i));
            }
        }
    }
}
