package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMappedMemoryRange extends VulkanObject {
    public VulkanMappedMemoryRange(){
        super(new VkMappedMemoryRange());
    }

    public VulkanMappedMemoryRange(VkMappedMemoryRange vk){
        super(vk);
    }

    @Override
    public VkMappedMemoryRange getVk(){
        return (VkMappedMemoryRange) super.getVk();
    }

    public VulkanMappedMemoryRange(VulkanStructureType sType, VulkanObject pNext, VulkanDeviceMemory memory, VulkanDeviceSize offset, VulkanDeviceSize size) {
        super(new VkMappedMemoryRange(sType.getVk(), pNext.getVk(), memory.getVk(), offset.getVk(), size.getVk()));
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

    public VulkanDeviceMemory getMemory() {
        return new VulkanDeviceMemory(getVk().getMemory());
    }

    public void setMemory(VulkanDeviceMemory memory) {
        getVk().setMemory(memory.getVk());
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


    public static class Array extends VulkanMappedMemoryRange implements cz.mg.collections.array.ReadonlyArray<VulkanMappedMemoryRange> {
        public Array(VkMappedMemoryRange.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMappedMemoryRange.Array(count));
        }

        public Array(int count, VulkanMappedMemoryRange o){
            this(new VkMappedMemoryRange.Array(count, o.getVk()));
        }

        @Override
        public VkMappedMemoryRange.Array getVk(){
            return (VkMappedMemoryRange.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMappedMemoryRange get(int i){
            return new VulkanMappedMemoryRange(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMappedMemoryRange.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMappedMemoryRange.Pointer());
        }

        public Pointer(long value) {
            this(new VkMappedMemoryRange.Pointer(value));
        }

        @Override
        public VkMappedMemoryRange.Pointer getVk(){
            return (VkMappedMemoryRange.Pointer) super.getVk();
        }

        public static class Array extends VulkanMappedMemoryRange.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMappedMemoryRange.Pointer> {
            public Array(int count) {
                super(new VkMappedMemoryRange.Pointer.Array(count));
            }

            public Array(VulkanMappedMemoryRange[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMappedMemoryRange.Pointer.Array getVk(){
                return (VkMappedMemoryRange.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMappedMemoryRange.Pointer get(int i){
                return new VulkanMappedMemoryRange.Pointer(getVk().get(i));
            }
        }
    }
}
