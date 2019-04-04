package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageType.html">khronos documentation</a>
 **/
public class VulkanImageType extends VulkanEnum {
    public static final int D1 = VkImageType.VK_IMAGE_TYPE_1D;
    public static final int D2 = VkImageType.VK_IMAGE_TYPE_2D;
    public static final int D3 = VkImageType.VK_IMAGE_TYPE_3D;

    public VulkanImageType(){
        super(new VkImageType());
    }

    public VulkanImageType(VkImageType vk){
        super(vk);
    }

    @Override
    public VkImageType getVk(){
        return (VkImageType) super.getVk();
    }

    public VulkanImageType(int value){
        super(new VkImageType(value));
    }

    @Override
    public String toString() {
        if(getValue() == D1) return "D1";
        if(getValue() == D2) return "D2";
        if(getValue() == D3) return "D3";
        return "UNKNOWN";
    }

    public static class Array extends VulkanImageType implements cz.mg.collections.array.ReadonlyArray<VulkanImageType> {
        public Array(VkImageType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageType.Array(count));
        }

        public Array(int count, VulkanImageType o){
            this(new VkImageType.Array(count, o.getVk()));
        }

        @Override
        public VkImageType.Array getVk(){
            return (VkImageType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageType get(int i){
            return new VulkanImageType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageType.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageType.Pointer(value));
        }

        @Override
        public VkImageType.Pointer getVk(){
            return (VkImageType.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageType.Pointer> {
            public Array(int count) {
                super(new VkImageType.Pointer.Array(count));
            }

            public Array(VulkanImageType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageType.Pointer.Array getVk(){
                return (VkImageType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageType.Pointer get(int i){
                return new VulkanImageType.Pointer(getVk().get(i));
            }
        }
    }
}
