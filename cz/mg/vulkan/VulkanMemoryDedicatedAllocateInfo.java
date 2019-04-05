package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryDedicatedAllocateInfo extends VulkanObject {
    public VulkanMemoryDedicatedAllocateInfo(){
        super(new VkMemoryDedicatedAllocateInfo());
    }

    public VulkanMemoryDedicatedAllocateInfo(VkMemoryDedicatedAllocateInfo vk){
        super(vk);
    }

    @Override
    public VkMemoryDedicatedAllocateInfo getVk(){
        return (VkMemoryDedicatedAllocateInfo) super.getVk();
    }
    public VulkanMemoryDedicatedAllocateInfo(VulkanObject pNext, VulkanImage image, VulkanBuffer buffer) {
        super(new VkMemoryDedicatedAllocateInfo(pNext.getVk(), image.getVk(), buffer.getVk()));
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

    public VulkanImage getImage() {
        return new VulkanImage(getVk().getImage());
    }

    public void setImage(VulkanImage image) {
        getVk().setImage(image.getVk());
    }

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }


    public static class Array extends VulkanMemoryDedicatedAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryDedicatedAllocateInfo> {
        public Array(VkMemoryDedicatedAllocateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryDedicatedAllocateInfo.Array(count));
        }

        public Array(int count, VulkanMemoryDedicatedAllocateInfo o){
            this(new VkMemoryDedicatedAllocateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryDedicatedAllocateInfo.Array getVk(){
            return (VkMemoryDedicatedAllocateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryDedicatedAllocateInfo get(int i){
            return new VulkanMemoryDedicatedAllocateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryDedicatedAllocateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryDedicatedAllocateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryDedicatedAllocateInfo.Pointer(value));
        }

        @Override
        public VkMemoryDedicatedAllocateInfo.Pointer getVk(){
            return (VkMemoryDedicatedAllocateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryDedicatedAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryDedicatedAllocateInfo.Pointer> {
            public Array(int count) {
                super(new VkMemoryDedicatedAllocateInfo.Pointer.Array(count));
            }

            public Array(VulkanMemoryDedicatedAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryDedicatedAllocateInfo.Pointer.Array getVk(){
                return (VkMemoryDedicatedAllocateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryDedicatedAllocateInfo.Pointer get(int i){
                return new VulkanMemoryDedicatedAllocateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
