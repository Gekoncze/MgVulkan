package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBufferMemoryBarrier extends VulkanObject {
    public VulkanBufferMemoryBarrier(){
        super(new VkBufferMemoryBarrier());
    }

    public VulkanBufferMemoryBarrier(VkBufferMemoryBarrier vk){
        super(vk);
    }

    @Override
    public VkBufferMemoryBarrier getVk(){
        return (VkBufferMemoryBarrier) super.getVk();
    }

    public VulkanBufferMemoryBarrier(VulkanStructureType sType, VulkanObject pNext, VulkanAccessFlags srcAccessMask, VulkanAccessFlags dstAccessMask, VulkanUInt32 srcQueueFamilyIndex, VulkanUInt32 dstQueueFamilyIndex, VulkanBuffer buffer, VulkanDeviceSize offset, VulkanDeviceSize size) {
        super(new VkBufferMemoryBarrier(sType.getVk(), pNext.getVk(), srcAccessMask.getVk(), dstAccessMask.getVk(), srcQueueFamilyIndex.getVk(), dstQueueFamilyIndex.getVk(), buffer.getVk(), offset.getVk(), size.getVk()));
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

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }

    public VulkanDeviceSize getOffset() {
        return new VulkanDeviceSize(getVk().getOffset());
    }

    public void setOffset(VulkanDeviceSize offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanDeviceSize getSize() {
        return new VulkanDeviceSize(getVk().getSize());
    }

    public void setSize(VulkanDeviceSize size) {
        getVk().setSize(size.getVk());
    }


    public static class Array extends VulkanBufferMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VulkanBufferMemoryBarrier> {
        public Array(VkBufferMemoryBarrier.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferMemoryBarrier.Array(count));
        }

        public Array(int count, VulkanBufferMemoryBarrier o){
            this(new VkBufferMemoryBarrier.Array(count, o.getVk()));
        }

        @Override
        public VkBufferMemoryBarrier.Array getVk(){
            return (VkBufferMemoryBarrier.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferMemoryBarrier get(int i){
            return new VulkanBufferMemoryBarrier(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferMemoryBarrier.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferMemoryBarrier.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferMemoryBarrier.Pointer(value));
        }

        @Override
        public VkBufferMemoryBarrier.Pointer getVk(){
            return (VkBufferMemoryBarrier.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferMemoryBarrier.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferMemoryBarrier.Pointer> {
            public Array(int count) {
                super(new VkBufferMemoryBarrier.Pointer.Array(count));
            }

            public Array(VulkanBufferMemoryBarrier[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferMemoryBarrier.Pointer.Array getVk(){
                return (VkBufferMemoryBarrier.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferMemoryBarrier.Pointer get(int i){
                return new VulkanBufferMemoryBarrier.Pointer(getVk().get(i));
            }
        }
    }
}
