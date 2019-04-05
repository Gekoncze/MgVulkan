package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDedicatedAllocationMemoryAllocateInfoNV extends VulkanObject {
    public VulkanDedicatedAllocationMemoryAllocateInfoNV(){
        super(new VkDedicatedAllocationMemoryAllocateInfoNV());
    }

    public VulkanDedicatedAllocationMemoryAllocateInfoNV(VkDedicatedAllocationMemoryAllocateInfoNV vk){
        super(vk);
    }

    @Override
    public VkDedicatedAllocationMemoryAllocateInfoNV getVk(){
        return (VkDedicatedAllocationMemoryAllocateInfoNV) super.getVk();
    }
    public VulkanDedicatedAllocationMemoryAllocateInfoNV(VulkanObject pNext, VulkanImage image, VulkanBuffer buffer) {
        super(new VkDedicatedAllocationMemoryAllocateInfoNV(pNext.getVk(), image.getVk(), buffer.getVk()));
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


    public static class Array extends VulkanDedicatedAllocationMemoryAllocateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanDedicatedAllocationMemoryAllocateInfoNV> {
        public Array(VkDedicatedAllocationMemoryAllocateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDedicatedAllocationMemoryAllocateInfoNV.Array(count));
        }

        public Array(int count, VulkanDedicatedAllocationMemoryAllocateInfoNV o){
            this(new VkDedicatedAllocationMemoryAllocateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkDedicatedAllocationMemoryAllocateInfoNV.Array getVk(){
            return (VkDedicatedAllocationMemoryAllocateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDedicatedAllocationMemoryAllocateInfoNV get(int i){
            return new VulkanDedicatedAllocationMemoryAllocateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDedicatedAllocationMemoryAllocateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDedicatedAllocationMemoryAllocateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkDedicatedAllocationMemoryAllocateInfoNV.Pointer(value));
        }

        @Override
        public VkDedicatedAllocationMemoryAllocateInfoNV.Pointer getVk(){
            return (VkDedicatedAllocationMemoryAllocateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanDedicatedAllocationMemoryAllocateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDedicatedAllocationMemoryAllocateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkDedicatedAllocationMemoryAllocateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanDedicatedAllocationMemoryAllocateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDedicatedAllocationMemoryAllocateInfoNV.Pointer.Array getVk(){
                return (VkDedicatedAllocationMemoryAllocateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDedicatedAllocationMemoryAllocateInfoNV.Pointer get(int i){
                return new VulkanDedicatedAllocationMemoryAllocateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
