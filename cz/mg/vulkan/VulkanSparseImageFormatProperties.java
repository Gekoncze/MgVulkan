package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageFormatProperties.html">khronos documentation</a>
 **/
public class VulkanSparseImageFormatProperties extends VulkanObject {
    public VulkanSparseImageFormatProperties(){
        super(new VkSparseImageFormatProperties());
    }

    public VulkanSparseImageFormatProperties(VkSparseImageFormatProperties vk){
        super(vk);
    }

    @Override
    public VkSparseImageFormatProperties getVk(){
        return (VkSparseImageFormatProperties) super.getVk();
    }

    public VulkanSparseImageFormatProperties(VulkanImageAspectFlags aspectMask, VulkanExtent3D imageGranularity, VulkanSparseImageFormatFlags flags) {
        super(new VkSparseImageFormatProperties(aspectMask.getVk(), imageGranularity.getVk(), flags.getVk()));
    }

    public VulkanImageAspectFlags getAspectMask() {
        return new VulkanImageAspectFlags(getVk().getAspectMask());
    }

    public void setAspectMask(VulkanImageAspectFlags aspectMask) {
        getVk().setAspectMask(aspectMask.getVk());
    }

    public VulkanExtent3D getImageGranularity() {
        return new VulkanExtent3D(getVk().getImageGranularity());
    }

    public void setImageGranularity(VulkanExtent3D imageGranularity) {
        getVk().setImageGranularity(imageGranularity.getVk());
    }

    public VulkanSparseImageFormatFlags getFlags() {
        return new VulkanSparseImageFormatFlags(getVk().getFlags());
    }

    public void setFlags(VulkanSparseImageFormatFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanSparseImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatProperties> {
        public Array(VkSparseImageFormatProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageFormatProperties.Array(count));
        }

        public Array(int count, VulkanSparseImageFormatProperties o){
            this(new VkSparseImageFormatProperties.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageFormatProperties.Array getVk(){
            return (VkSparseImageFormatProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageFormatProperties get(int i){
            return new VulkanSparseImageFormatProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageFormatProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageFormatProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageFormatProperties.Pointer(value));
        }

        @Override
        public VkSparseImageFormatProperties.Pointer getVk(){
            return (VkSparseImageFormatProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatProperties.Pointer> {
            public Array(int count) {
                super(new VkSparseImageFormatProperties.Pointer.Array(count));
            }

            public Array(VulkanSparseImageFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageFormatProperties.Pointer.Array getVk(){
                return (VkSparseImageFormatProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageFormatProperties.Pointer get(int i){
                return new VulkanSparseImageFormatProperties.Pointer(getVk().get(i));
            }
        }
    }
}
