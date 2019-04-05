package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandPoolCreateInfo extends VulkanObject {
    public VulkanCommandPoolCreateInfo(){
        super(new VkCommandPoolCreateInfo());
    }

    public VulkanCommandPoolCreateInfo(VkCommandPoolCreateInfo vk){
        super(vk);
    }

    @Override
    public VkCommandPoolCreateInfo getVk(){
        return (VkCommandPoolCreateInfo) super.getVk();
    }
    public VulkanCommandPoolCreateInfo(VulkanObject pNext, VulkanCommandPoolCreateFlags flags, VulkanUInt32 queueFamilyIndex) {
        super(new VkCommandPoolCreateInfo(pNext.getVk(), flags.getVk(), queueFamilyIndex.getVk()));
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

    public VulkanCommandPoolCreateFlags getFlags() {
        return new VulkanCommandPoolCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanCommandPoolCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getQueueFamilyIndex() {
        return new VulkanUInt32(getVk().getQueueFamilyIndex());
    }

    public void setQueueFamilyIndex(VulkanUInt32 queueFamilyIndex) {
        getVk().setQueueFamilyIndex(queueFamilyIndex.getVk());
    }


    public static class Array extends VulkanCommandPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolCreateInfo> {
        public Array(VkCommandPoolCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandPoolCreateInfo.Array(count));
        }

        public Array(int count, VulkanCommandPoolCreateInfo o){
            this(new VkCommandPoolCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPoolCreateInfo.Array getVk(){
            return (VkCommandPoolCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPoolCreateInfo get(int i){
            return new VulkanCommandPoolCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandPoolCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandPoolCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandPoolCreateInfo.Pointer(value));
        }

        @Override
        public VkCommandPoolCreateInfo.Pointer getVk(){
            return (VkCommandPoolCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandPoolCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkCommandPoolCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanCommandPoolCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandPoolCreateInfo.Pointer.Array getVk(){
                return (VkCommandPoolCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandPoolCreateInfo.Pointer get(int i){
                return new VulkanCommandPoolCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
