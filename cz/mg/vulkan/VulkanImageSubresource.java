package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageSubresource extends VulkanObject {
    public VulkanImageSubresource(){
        super(new VkImageSubresource());
    }

    public VulkanImageSubresource(VkImageSubresource vk){
        super(vk);
    }

    @Override
    public VkImageSubresource getVk(){
        return (VkImageSubresource) super.getVk();
    }

    public VulkanImageSubresource(VulkanImageAspectFlags aspectMask, VulkanUInt32 mipLevel, VulkanUInt32 arrayLayer) {
        super(new VkImageSubresource(aspectMask.getVk(), mipLevel.getVk(), arrayLayer.getVk()));
    }

    public VulkanImageAspectFlags getAspectMask() {
        return new VulkanImageAspectFlags(getVk().getAspectMask());
    }

    public void setAspectMask(VulkanImageAspectFlags aspectMask) {
        getVk().setAspectMask(aspectMask.getVk());
    }

    public VulkanUInt32 getMipLevel() {
        return new VulkanUInt32(getVk().getMipLevel());
    }

    public void setMipLevel(VulkanUInt32 mipLevel) {
        getVk().setMipLevel(mipLevel.getVk());
    }

    public VulkanUInt32 getArrayLayer() {
        return new VulkanUInt32(getVk().getArrayLayer());
    }

    public void setArrayLayer(VulkanUInt32 arrayLayer) {
        getVk().setArrayLayer(arrayLayer.getVk());
    }


    public static class Array extends VulkanImageSubresource implements cz.mg.collections.array.ReadonlyArray<VulkanImageSubresource> {
        public Array(VkImageSubresource.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageSubresource.Array(count));
        }

        public Array(int count, VulkanImageSubresource o){
            this(new VkImageSubresource.Array(count, o.getVk()));
        }

        @Override
        public VkImageSubresource.Array getVk(){
            return (VkImageSubresource.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageSubresource get(int i){
            return new VulkanImageSubresource(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageSubresource.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageSubresource.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageSubresource.Pointer(value));
        }

        @Override
        public VkImageSubresource.Pointer getVk(){
            return (VkImageSubresource.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageSubresource.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageSubresource.Pointer> {
            public Array(int count) {
                super(new VkImageSubresource.Pointer.Array(count));
            }

            public Array(VulkanImageSubresource[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageSubresource.Pointer.Array getVk(){
                return (VkImageSubresource.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageSubresource.Pointer get(int i){
                return new VulkanImageSubresource.Pointer(getVk().get(i));
            }
        }
    }
}
