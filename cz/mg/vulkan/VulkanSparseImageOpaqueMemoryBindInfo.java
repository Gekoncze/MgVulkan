package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSparseImageOpaqueMemoryBindInfo extends VulkanObject {
    public VulkanSparseImageOpaqueMemoryBindInfo(){
        super(new VkSparseImageOpaqueMemoryBindInfo());
    }

    public VulkanSparseImageOpaqueMemoryBindInfo(VkSparseImageOpaqueMemoryBindInfo vk){
        super(vk);
    }

    @Override
    public VkSparseImageOpaqueMemoryBindInfo getVk(){
        return (VkSparseImageOpaqueMemoryBindInfo) super.getVk();
    }

    public VulkanSparseImageOpaqueMemoryBindInfo(VulkanImage image, VulkanUInt32 bindCount, VulkanSparseMemoryBind pBinds) {
        super(new VkSparseImageOpaqueMemoryBindInfo(image.getVk(), bindCount.getVk(), pBinds.getVk()));
    }

    public VulkanImage getImage() {
        return new VulkanImage(getVk().getImage());
    }

    public void setImage(VulkanImage image) {
        getVk().setImage(image.getVk());
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


    public static class Array extends VulkanSparseImageOpaqueMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageOpaqueMemoryBindInfo> {
        public Array(VkSparseImageOpaqueMemoryBindInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageOpaqueMemoryBindInfo.Array(count));
        }

        public Array(int count, VulkanSparseImageOpaqueMemoryBindInfo o){
            this(new VkSparseImageOpaqueMemoryBindInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageOpaqueMemoryBindInfo.Array getVk(){
            return (VkSparseImageOpaqueMemoryBindInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageOpaqueMemoryBindInfo get(int i){
            return new VulkanSparseImageOpaqueMemoryBindInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageOpaqueMemoryBindInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageOpaqueMemoryBindInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageOpaqueMemoryBindInfo.Pointer(value));
        }

        @Override
        public VkSparseImageOpaqueMemoryBindInfo.Pointer getVk(){
            return (VkSparseImageOpaqueMemoryBindInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageOpaqueMemoryBindInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageOpaqueMemoryBindInfo.Pointer> {
            public Array(int count) {
                super(new VkSparseImageOpaqueMemoryBindInfo.Pointer.Array(count));
            }

            public Array(VulkanSparseImageOpaqueMemoryBindInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageOpaqueMemoryBindInfo.Pointer.Array getVk(){
                return (VkSparseImageOpaqueMemoryBindInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageOpaqueMemoryBindInfo.Pointer get(int i){
                return new VulkanSparseImageOpaqueMemoryBindInfo.Pointer(getVk().get(i));
            }
        }
    }
}
