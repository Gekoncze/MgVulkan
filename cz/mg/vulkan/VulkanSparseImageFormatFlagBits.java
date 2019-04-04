package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageFormatFlagBits.html">khronos documentation</a>
 **/
public class VulkanSparseImageFormatFlagBits extends VulkanFlagBits {
    public static final int SINGLE_MIPTAIL = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT;
    public static final int ALIGNED_MIP_SIZE = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT;
    public static final int NONSTANDARD_BLOCK_SIZE = VkSparseImageFormatFlagBits.VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT;

    public VulkanSparseImageFormatFlagBits(){
        super(new VkSparseImageFormatFlagBits());
    }

    public VulkanSparseImageFormatFlagBits(VkSparseImageFormatFlagBits vk){
        super(vk);
    }

    @Override
    public VkSparseImageFormatFlagBits getVk(){
        return (VkSparseImageFormatFlagBits) super.getVk();
    }

    public VulkanSparseImageFormatFlagBits(int value){
        super(new VkSparseImageFormatFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SINGLE_MIPTAIL) s += "SINGLE_MIPTAIL";
        if(getValue() == ALIGNED_MIP_SIZE) s += "ALIGNED_MIP_SIZE";
        if(getValue() == NONSTANDARD_BLOCK_SIZE) s += "NONSTANDARD_BLOCK_SIZE";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSparseImageFormatFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatFlagBits> {
        public Array(VkSparseImageFormatFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageFormatFlagBits.Array(count));
        }

        public Array(int count, VulkanSparseImageFormatFlagBits o){
            this(new VkSparseImageFormatFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageFormatFlagBits.Array getVk(){
            return (VkSparseImageFormatFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageFormatFlagBits get(int i){
            return new VulkanSparseImageFormatFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageFormatFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageFormatFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageFormatFlagBits.Pointer(value));
        }

        @Override
        public VkSparseImageFormatFlagBits.Pointer getVk(){
            return (VkSparseImageFormatFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageFormatFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatFlagBits.Pointer> {
            public Array(int count) {
                super(new VkSparseImageFormatFlagBits.Pointer.Array(count));
            }

            public Array(VulkanSparseImageFormatFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageFormatFlagBits.Pointer.Array getVk(){
                return (VkSparseImageFormatFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageFormatFlagBits.Pointer get(int i){
                return new VulkanSparseImageFormatFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
