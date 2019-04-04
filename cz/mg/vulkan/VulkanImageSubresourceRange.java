package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageSubresourceRange.html">khronos documentation</a>
 **/
public class VulkanImageSubresourceRange extends VulkanObject {
    public VulkanImageSubresourceRange(){
        super(new VkImageSubresourceRange());
    }

    public VulkanImageSubresourceRange(VkImageSubresourceRange vk){
        super(vk);
    }

    @Override
    public VkImageSubresourceRange getVk(){
        return (VkImageSubresourceRange) super.getVk();
    }

    public VulkanImageSubresourceRange(VulkanImageAspectFlags aspectMask, VulkanUInt32 baseMipLevel, VulkanUInt32 levelCount, VulkanUInt32 baseArrayLayer, VulkanUInt32 layerCount) {
        super(new VkImageSubresourceRange(aspectMask.getVk(), baseMipLevel.getVk(), levelCount.getVk(), baseArrayLayer.getVk(), layerCount.getVk()));
    }

    public VulkanImageAspectFlags getAspectMask() {
        return new VulkanImageAspectFlags(getVk().getAspectMask());
    }

    public void setAspectMask(VulkanImageAspectFlags aspectMask) {
        getVk().setAspectMask(aspectMask.getVk());
    }

    public VulkanUInt32 getBaseMipLevel() {
        return new VulkanUInt32(getVk().getBaseMipLevel());
    }

    public void setBaseMipLevel(VulkanUInt32 baseMipLevel) {
        getVk().setBaseMipLevel(baseMipLevel.getVk());
    }

    public VulkanUInt32 getLevelCount() {
        return new VulkanUInt32(getVk().getLevelCount());
    }

    public void setLevelCount(VulkanUInt32 levelCount) {
        getVk().setLevelCount(levelCount.getVk());
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


    public static class Array extends VulkanImageSubresourceRange implements cz.mg.collections.array.ReadonlyArray<VulkanImageSubresourceRange> {
        public Array(VkImageSubresourceRange.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageSubresourceRange.Array(count));
        }

        public Array(int count, VulkanImageSubresourceRange o){
            this(new VkImageSubresourceRange.Array(count, o.getVk()));
        }

        @Override
        public VkImageSubresourceRange.Array getVk(){
            return (VkImageSubresourceRange.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageSubresourceRange get(int i){
            return new VulkanImageSubresourceRange(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageSubresourceRange.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageSubresourceRange.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageSubresourceRange.Pointer(value));
        }

        @Override
        public VkImageSubresourceRange.Pointer getVk(){
            return (VkImageSubresourceRange.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageSubresourceRange.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageSubresourceRange.Pointer> {
            public Array(int count) {
                super(new VkImageSubresourceRange.Pointer.Array(count));
            }

            public Array(VulkanImageSubresourceRange[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageSubresourceRange.Pointer.Array getVk(){
                return (VkImageSubresourceRange.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageSubresourceRange.Pointer get(int i){
                return new VulkanImageSubresourceRange.Pointer(getVk().get(i));
            }
        }
    }
}
