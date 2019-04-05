package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSparseBufferMemoryBindInfo extends VulkanObject {
    public VulkanSparseBufferMemoryBindInfo(){
        super(new VkSparseBufferMemoryBindInfo());
    }

    public VulkanSparseBufferMemoryBindInfo(VkSparseBufferMemoryBindInfo vk){
        super(vk);
    }

    @Override
    public VkSparseBufferMemoryBindInfo getVk(){
        return (VkSparseBufferMemoryBindInfo) super.getVk();
    }

    public VulkanSparseBufferMemoryBindInfo(VulkanBuffer buffer, VulkanUInt32 bindCount, VulkanSparseMemoryBind pBinds) {
        super(new VkSparseBufferMemoryBindInfo(buffer.getVk(), bindCount.getVk(), pBinds.getVk()));
    }

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }

    public VulkanUInt32 getBindCount() {
        return new VulkanUInt32(getVk().getBindCount());
    }

    public void setBindCount(VulkanUInt32 bindCount) {
        getVk().setBindCount(bindCount.getVk());
    }

    public VulkanSparseMemoryBind getPBinds() {
        return new VulkanSparseMemoryBind(getVk().getPBinds());
    }

    public void setPBinds(VulkanSparseMemoryBind pBinds) {
        getVk().setPBinds(pBinds.getVk());
    }


    public static class Array extends VulkanSparseBufferMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSparseBufferMemoryBindInfo> {
        public Array(VkSparseBufferMemoryBindInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseBufferMemoryBindInfo.Array(count));
        }

        public Array(int count, VulkanSparseBufferMemoryBindInfo o){
            this(new VkSparseBufferMemoryBindInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSparseBufferMemoryBindInfo.Array getVk(){
            return (VkSparseBufferMemoryBindInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseBufferMemoryBindInfo get(int i){
            return new VulkanSparseBufferMemoryBindInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseBufferMemoryBindInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseBufferMemoryBindInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseBufferMemoryBindInfo.Pointer(value));
        }

        @Override
        public VkSparseBufferMemoryBindInfo.Pointer getVk(){
            return (VkSparseBufferMemoryBindInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseBufferMemoryBindInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseBufferMemoryBindInfo.Pointer> {
            public Array(int count) {
                super(new VkSparseBufferMemoryBindInfo.Pointer.Array(count));
            }

            public Array(VulkanSparseBufferMemoryBindInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseBufferMemoryBindInfo.Pointer.Array getVk(){
                return (VkSparseBufferMemoryBindInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseBufferMemoryBindInfo.Pointer get(int i){
                return new VulkanSparseBufferMemoryBindInfo.Pointer(getVk().get(i));
            }
        }
    }
}
