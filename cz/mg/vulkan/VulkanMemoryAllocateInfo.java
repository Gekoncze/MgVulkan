package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryAllocateInfo.html">khronos documentation</a>
 **/
public class VulkanMemoryAllocateInfo extends VulkanObject {
    public VulkanMemoryAllocateInfo(){
        super(new VkMemoryAllocateInfo());
    }

    public VulkanMemoryAllocateInfo(VkMemoryAllocateInfo vk){
        super(vk);
    }

    @Override
    public VkMemoryAllocateInfo getVk(){
        return (VkMemoryAllocateInfo) super.getVk();
    }
    public VulkanMemoryAllocateInfo(VulkanObject pNext, VulkanDeviceSize allocationSize, VulkanUInt32 memoryTypeIndex) {
        super(new VkMemoryAllocateInfo(pNext.getVk(), allocationSize.getVk(), memoryTypeIndex.getVk()));
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

    public VulkanDeviceSize getAllocationSize() {
        return new VulkanDeviceSize(getVk().getAllocationSize());
    }

    public void setAllocationSize(VulkanDeviceSize allocationSize) {
        getVk().setAllocationSize(allocationSize.getVk());
    }

    public VulkanUInt32 getMemoryTypeIndex() {
        return new VulkanUInt32(getVk().getMemoryTypeIndex());
    }

    public void setMemoryTypeIndex(VulkanUInt32 memoryTypeIndex) {
        getVk().setMemoryTypeIndex(memoryTypeIndex.getVk());
    }


    public static class Array extends VulkanMemoryAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateInfo> {
        public Array(VkMemoryAllocateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryAllocateInfo.Array(count));
        }

        public Array(int count, VulkanMemoryAllocateInfo o){
            this(new VkMemoryAllocateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryAllocateInfo.Array getVk(){
            return (VkMemoryAllocateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryAllocateInfo get(int i){
            return new VulkanMemoryAllocateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryAllocateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryAllocateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryAllocateInfo.Pointer(value));
        }

        @Override
        public VkMemoryAllocateInfo.Pointer getVk(){
            return (VkMemoryAllocateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateInfo.Pointer> {
            public Array(int count) {
                super(new VkMemoryAllocateInfo.Pointer.Array(count));
            }

            public Array(VulkanMemoryAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryAllocateInfo.Pointer.Array getVk(){
                return (VkMemoryAllocateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryAllocateInfo.Pointer get(int i){
                return new VulkanMemoryAllocateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
