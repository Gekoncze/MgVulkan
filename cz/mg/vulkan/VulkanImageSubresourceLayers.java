package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageSubresourceLayers.html">khronos documentation</a>
 **/
public class VulkanImageSubresourceLayers extends VulkanObject {
    public VulkanImageSubresourceLayers(){
        super(new VkImageSubresourceLayers());
    }

    public VulkanImageSubresourceLayers(VkImageSubresourceLayers vk){
        super(vk);
    }

    @Override
    public VkImageSubresourceLayers getVk(){
        return (VkImageSubresourceLayers) super.getVk();
    }

    public VulkanImageSubresourceLayers(VulkanImageAspectFlags aspectMask, VulkanUInt32 mipLevel, VulkanUInt32 baseArrayLayer, VulkanUInt32 layerCount) {
        super(new VkImageSubresourceLayers(aspectMask.getVk(), mipLevel.getVk(), baseArrayLayer.getVk(), layerCount.getVk()));
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

    public VulkanUInt32 getBaseArrayLayer() {
        return new VulkanUInt32(getVk().getBaseArrayLayer());
    }

    public void setBaseArrayLayer(VulkanUInt32 baseArrayLayer) {
        getVk().setBaseArrayLayer(baseArrayLayer.getVk());
    }

    public VulkanUInt32 getLayerCount() {
        return new VulkanUInt32(getVk().getLayerCount());
    }

    public void setLayerCount(VulkanUInt32 layerCount) {
        getVk().setLayerCount(layerCount.getVk());
    }


    public static class Array extends VulkanImageSubresourceLayers implements cz.mg.collections.array.ReadonlyArray<VulkanImageSubresourceLayers> {
        public Array(VkImageSubresourceLayers.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageSubresourceLayers.Array(count));
        }

        public Array(int count, VulkanImageSubresourceLayers o){
            this(new VkImageSubresourceLayers.Array(count, o.getVk()));
        }

        @Override
        public VkImageSubresourceLayers.Array getVk(){
            return (VkImageSubresourceLayers.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageSubresourceLayers get(int i){
            return new VulkanImageSubresourceLayers(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageSubresourceLayers.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageSubresourceLayers.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageSubresourceLayers.Pointer(value));
        }

        @Override
        public VkImageSubresourceLayers.Pointer getVk(){
            return (VkImageSubresourceLayers.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageSubresourceLayers.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageSubresourceLayers.Pointer> {
            public Array(int count) {
                super(new VkImageSubresourceLayers.Pointer.Array(count));
            }

            public Array(VulkanImageSubresourceLayers[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageSubresourceLayers.Pointer.Array getVk(){
                return (VkImageSubresourceLayers.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageSubresourceLayers.Pointer get(int i){
                return new VulkanImageSubresourceLayers.Pointer(getVk().get(i));
            }
        }
    }
}
