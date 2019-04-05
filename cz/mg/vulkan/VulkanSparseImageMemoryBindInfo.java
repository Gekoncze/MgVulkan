package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSparseImageMemoryBindInfo extends VulkanObject {
    public VulkanSparseImageMemoryBindInfo(){
        super(new VkSparseImageMemoryBindInfo());
    }

    public VulkanSparseImageMemoryBindInfo(VkSparseImageMemoryBindInfo vk){
        super(vk);
    }

    @Override
    public VkSparseImageMemoryBindInfo getVk(){
        return (VkSparseImageMemoryBindInfo) super.getVk();
    }

    public VulkanSparseImageMemoryBindInfo(VulkanImage image, VulkanUInt32 bindCount, VulkanSparseImageMemoryBind pBinds) {
        super(new VkSparseImageMemoryBindInfo(image.getVk(), bindCount.getVk(), pBinds.getVk()));
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

    public VulkanSparseImageMemoryBind getPBinds() {
        return new VulkanSparseImageMemoryBind(getVk().getPBinds());
    }

    public void setPBinds(VulkanSparseImageMemoryBind pBinds) {
        getVk().setPBinds(pBinds.getVk());
    }


    public static class Array extends VulkanSparseImageMemoryBindInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryBindInfo> {
        public Array(VkSparseImageMemoryBindInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageMemoryBindInfo.Array(count));
        }

        public Array(int count, VulkanSparseImageMemoryBindInfo o){
            this(new VkSparseImageMemoryBindInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageMemoryBindInfo.Array getVk(){
            return (VkSparseImageMemoryBindInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageMemoryBindInfo get(int i){
            return new VulkanSparseImageMemoryBindInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageMemoryBindInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageMemoryBindInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageMemoryBindInfo.Pointer(value));
        }

        @Override
        public VkSparseImageMemoryBindInfo.Pointer getVk(){
            return (VkSparseImageMemoryBindInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageMemoryBindInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryBindInfo.Pointer> {
            public Array(int count) {
                super(new VkSparseImageMemoryBindInfo.Pointer.Array(count));
            }

            public Array(VulkanSparseImageMemoryBindInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageMemoryBindInfo.Pointer.Array getVk(){
                return (VkSparseImageMemoryBindInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageMemoryBindInfo.Pointer get(int i){
                return new VulkanSparseImageMemoryBindInfo.Pointer(getVk().get(i));
            }
        }
    }
}
