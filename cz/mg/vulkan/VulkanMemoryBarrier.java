package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryBarrier extends VulkanObject {
    public VulkanMemoryBarrier(){
        super(new VkMemoryBarrier());
    }

    public VulkanMemoryBarrier(VkMemoryBarrier vk){
        super(vk);
    }

    @Override
    public VkMemoryBarrier getVk(){
        return (VkMemoryBarrier) super.getVk();
    }

    public VulkanMemoryBarrier(VulkanStructureType sType, VulkanObject pNext, VulkanAccessFlags srcAccessMask, VulkanAccessFlags dstAccessMask) {
        super(new VkMemoryBarrier(sType.getVk(), pNext.getVk(), srcAccessMask.getVk(), dstAccessMask.getVk()));
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


    public static class Array extends VulkanMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryBarrier> {
        public Array(VkMemoryBarrier.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryBarrier.Array(count));
        }

        public Array(int count, VulkanMemoryBarrier o){
            this(new VkMemoryBarrier.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryBarrier.Array getVk(){
            return (VkMemoryBarrier.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryBarrier get(int i){
            return new VulkanMemoryBarrier(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryBarrier.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryBarrier.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryBarrier.Pointer(value));
        }

        @Override
        public VkMemoryBarrier.Pointer getVk(){
            return (VkMemoryBarrier.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryBarrier.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryBarrier.Pointer> {
            public Array(int count) {
                super(new VkMemoryBarrier.Pointer.Array(count));
            }

            public Array(VulkanMemoryBarrier[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryBarrier.Pointer.Array getVk(){
                return (VkMemoryBarrier.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryBarrier.Pointer get(int i){
                return new VulkanMemoryBarrier.Pointer(getVk().get(i));
            }
        }
    }
}
