package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageMemoryBarrier.html">khronos documentation</a>
 **/
public class VulkanImageMemoryBarrier extends VulkanObject {
    public VulkanImageMemoryBarrier(){
        super(new VkImageMemoryBarrier());
    }

    public VulkanImageMemoryBarrier(VkImageMemoryBarrier vk){
        super(vk);
    }

    @Override
    public VkImageMemoryBarrier getVk(){
        return (VkImageMemoryBarrier) super.getVk();
    }

    public VulkanImageMemoryBarrier(VulkanStructureType sType, VulkanObject pNext, VulkanAccessFlags srcAccessMask, VulkanAccessFlags dstAccessMask, VulkanImageLayout oldLayout, VulkanImageLayout newLayout, VulkanUInt32 srcQueueFamilyIndex, VulkanUInt32 dstQueueFamilyIndex, VulkanImage image, VulkanImageSubresourceRange subresourceRange) {
        super(new VkImageMemoryBarrier(sType.getVk(), pNext.getVk(), srcAccessMask.getVk(), dstAccessMask.getVk(), oldLayout.getVk(), newLayout.getVk(), srcQueueFamilyIndex.getVk(), dstQueueFamilyIndex.getVk(), image.getVk(), subresourceRange.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanAccessFlags getSrcAccessMask() {
        return new VulkanAccessFlags(getVk().getSrcAccessMask());
    }

    public void setSrcAccessMask(VulkanAccessFlags srcAccessMask) {
        getVk().setSrcAccessMask(srcAccessMask.getVk());
    }

    public VulkanAccessFlags getDstAccessMask() {
        return new VulkanAccessFlags(getVk().getDstAccessMask());
    }

    public void setDstAccessMask(VulkanAccessFlags dstAccessMask) {
        getVk().setDstAccessMask(dstAccessMask.getVk());
    }

    public VulkanImageLayout getOldLayout() {
        return new VulkanImageLayout(getVk().getOldLayout());
    }

    public void setOldLayout(VulkanImageLayout oldLayout) {
        getVk().setOldLayout(oldLayout.getVk());
    }

    public VulkanImageLayout getNewLayout() {
        return new VulkanImageLayout(getVk().getNewLayout());
    }

    public void setNewLayout(VulkanImageLayout newLayout) {
        getVk().setNewLayout(newLayout.getVk());
    }

    public VulkanUInt32 getSrcQueueFamilyIndex() {
        return new VulkanUInt32(getVk().getSrcQueueFamilyIndex());
    }

    public void setSrcQueueFamilyIndex(VulkanUInt32 srcQueueFamilyIndex) {
        getVk().setSrcQueueFamilyIndex(srcQueueFamilyIndex.getVk());
    }

    public VulkanUInt32 getDstQueueFamilyIndex() {
        return new VulkanUInt32(getVk().getDstQueueFamilyIndex());
    }

    public void setDstQueueFamilyIndex(VulkanUInt32 dstQueueFamilyIndex) {
        getVk().setDstQueueFamilyIndex(dstQueueFamilyIndex.getVk());
    }

    public VulkanImage getImage() {
        return new VulkanImage(getVk().getImage());
    }

    public void setImage(VulkanImage image) {
        getVk().setImage(image.getVk());
    }

    public VulkanImageSubresourceRange getSubresourceRange() {
        return new VulkanImageSubresourceRange(getVk().getSubresourceRange());
    }

    public void setSubresourceRange(VulkanImageSubresourceRange subresourceRange) {
        getVk().setSubresourceRange(subresourceRange.getVk());
    }


    public static class Array extends VulkanImageMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VulkanImageMemoryBarrier> {
        public Array(VkImageMemoryBarrier.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageMemoryBarrier.Array(count));
        }

        public Array(int count, VulkanImageMemoryBarrier o){
            this(new VkImageMemoryBarrier.Array(count, o.getVk()));
        }

        @Override
        public VkImageMemoryBarrier.Array getVk(){
            return (VkImageMemoryBarrier.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageMemoryBarrier get(int i){
            return new VulkanImageMemoryBarrier(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageMemoryBarrier.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageMemoryBarrier.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageMemoryBarrier.Pointer(value));
        }

        @Override
        public VkImageMemoryBarrier.Pointer getVk(){
            return (VkImageMemoryBarrier.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageMemoryBarrier.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageMemoryBarrier.Pointer> {
            public Array(int count) {
                super(new VkImageMemoryBarrier.Pointer.Array(count));
            }

            public Array(VulkanImageMemoryBarrier[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageMemoryBarrier.Pointer.Array getVk(){
                return (VkImageMemoryBarrier.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageMemoryBarrier.Pointer get(int i){
                return new VulkanImageMemoryBarrier.Pointer(getVk().get(i));
            }
        }
    }
}
