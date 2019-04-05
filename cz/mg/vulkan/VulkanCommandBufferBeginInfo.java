package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandBufferBeginInfo extends VulkanObject {
    public VulkanCommandBufferBeginInfo(){
        super(new VkCommandBufferBeginInfo());
    }

    public VulkanCommandBufferBeginInfo(VkCommandBufferBeginInfo vk){
        super(vk);
    }

    @Override
    public VkCommandBufferBeginInfo getVk(){
        return (VkCommandBufferBeginInfo) super.getVk();
    }
    public VulkanCommandBufferBeginInfo(VulkanObject pNext, VulkanCommandBufferUsageFlags flags, VulkanCommandBufferInheritanceInfo pInheritanceInfo) {
        super(new VkCommandBufferBeginInfo(pNext.getVk(), flags.getVk(), pInheritanceInfo.getVk()));
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

    public VulkanCommandBufferUsageFlags getFlags() {
        return new VulkanCommandBufferUsageFlags(getVk().getFlags());
    }

    public void setFlags(VulkanCommandBufferUsageFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanCommandBufferInheritanceInfo getPInheritanceInfo() {
        return new VulkanCommandBufferInheritanceInfo(getVk().getPInheritanceInfo());
    }

    public void setPInheritanceInfo(VulkanCommandBufferInheritanceInfo pInheritanceInfo) {
        getVk().setPInheritanceInfo(pInheritanceInfo.getVk());
    }


    public static class Array extends VulkanCommandBufferBeginInfo implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferBeginInfo> {
        public Array(VkCommandBufferBeginInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferBeginInfo.Array(count));
        }

        public Array(int count, VulkanCommandBufferBeginInfo o){
            this(new VkCommandBufferBeginInfo.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferBeginInfo.Array getVk(){
            return (VkCommandBufferBeginInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferBeginInfo get(int i){
            return new VulkanCommandBufferBeginInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferBeginInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferBeginInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferBeginInfo.Pointer(value));
        }

        @Override
        public VkCommandBufferBeginInfo.Pointer getVk(){
            return (VkCommandBufferBeginInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferBeginInfo.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferBeginInfo.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferBeginInfo.Pointer.Array getVk(){
                return (VkCommandBufferBeginInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferBeginInfo.Pointer get(int i){
                return new VulkanCommandBufferBeginInfo.Pointer(getVk().get(i));
            }
        }
    }
}
