package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryAllocateFlagsInfo extends VulkanObject {
    public VulkanMemoryAllocateFlagsInfo(){
        super(new VkMemoryAllocateFlagsInfo());
    }

    public VulkanMemoryAllocateFlagsInfo(VkMemoryAllocateFlagsInfo vk){
        super(vk);
    }

    @Override
    public VkMemoryAllocateFlagsInfo getVk(){
        return (VkMemoryAllocateFlagsInfo) super.getVk();
    }
    public VulkanMemoryAllocateFlagsInfo(VulkanObject pNext, VulkanMemoryAllocateFlags flags, VulkanUInt32 deviceMask) {
        super(new VkMemoryAllocateFlagsInfo(pNext.getVk(), flags.getVk(), deviceMask.getVk()));
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

    public VulkanMemoryAllocateFlags getFlags() {
        return new VulkanMemoryAllocateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanMemoryAllocateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getDeviceMask() {
        return new VulkanUInt32(getVk().getDeviceMask());
    }

    public void setDeviceMask(VulkanUInt32 deviceMask) {
        getVk().setDeviceMask(deviceMask.getVk());
    }


    public static class Array extends VulkanMemoryAllocateFlagsInfo implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateFlagsInfo> {
        public Array(VkMemoryAllocateFlagsInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryAllocateFlagsInfo.Array(count));
        }

        public Array(int count, VulkanMemoryAllocateFlagsInfo o){
            this(new VkMemoryAllocateFlagsInfo.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryAllocateFlagsInfo.Array getVk(){
            return (VkMemoryAllocateFlagsInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryAllocateFlagsInfo get(int i){
            return new VulkanMemoryAllocateFlagsInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryAllocateFlagsInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryAllocateFlagsInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryAllocateFlagsInfo.Pointer(value));
        }

        @Override
        public VkMemoryAllocateFlagsInfo.Pointer getVk(){
            return (VkMemoryAllocateFlagsInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryAllocateFlagsInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateFlagsInfo.Pointer> {
            public Array(int count) {
                super(new VkMemoryAllocateFlagsInfo.Pointer.Array(count));
            }

            public Array(VulkanMemoryAllocateFlagsInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryAllocateFlagsInfo.Pointer.Array getVk(){
                return (VkMemoryAllocateFlagsInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryAllocateFlagsInfo.Pointer get(int i){
                return new VulkanMemoryAllocateFlagsInfo.Pointer(getVk().get(i));
            }
        }
    }
}
