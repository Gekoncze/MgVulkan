package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandBufferAllocateInfo extends VulkanObject {
    public VulkanCommandBufferAllocateInfo(){
        super(new VkCommandBufferAllocateInfo());
    }

    public VulkanCommandBufferAllocateInfo(VkCommandBufferAllocateInfo vk){
        super(vk);
    }

    @Override
    public VkCommandBufferAllocateInfo getVk(){
        return (VkCommandBufferAllocateInfo) super.getVk();
    }
    public VulkanCommandBufferAllocateInfo(VulkanObject pNext, VulkanCommandPool commandPool, VulkanCommandBufferLevel level, VulkanUInt32 commandBufferCount) {
        super(new VkCommandBufferAllocateInfo(pNext.getVk(), commandPool.getVk(), level.getVk(), commandBufferCount.getVk()));
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

    public VulkanCommandPool getCommandPool() {
        return new VulkanCommandPool(getVk().getCommandPool());
    }

    public void setCommandPool(VulkanCommandPool commandPool) {
        getVk().setCommandPool(commandPool.getVk());
    }

    public VulkanCommandBufferLevel getLevel() {
        return new VulkanCommandBufferLevel(getVk().getLevel());
    }

    public void setLevel(VulkanCommandBufferLevel level) {
        getVk().setLevel(level.getVk());
    }

    public VulkanUInt32 getCommandBufferCount() {
        return new VulkanUInt32(getVk().getCommandBufferCount());
    }

    public void setCommandBufferCount(VulkanUInt32 commandBufferCount) {
        getVk().setCommandBufferCount(commandBufferCount.getVk());
    }


    public static class Array extends VulkanCommandBufferAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferAllocateInfo> {
        public Array(VkCommandBufferAllocateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferAllocateInfo.Array(count));
        }

        public Array(int count, VulkanCommandBufferAllocateInfo o){
            this(new VkCommandBufferAllocateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferAllocateInfo.Array getVk(){
            return (VkCommandBufferAllocateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferAllocateInfo get(int i){
            return new VulkanCommandBufferAllocateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferAllocateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferAllocateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferAllocateInfo.Pointer(value));
        }

        @Override
        public VkCommandBufferAllocateInfo.Pointer getVk(){
            return (VkCommandBufferAllocateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferAllocateInfo.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferAllocateInfo.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferAllocateInfo.Pointer.Array getVk(){
                return (VkCommandBufferAllocateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferAllocateInfo.Pointer get(int i){
                return new VulkanCommandBufferAllocateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
