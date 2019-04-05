package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorSetAllocateInfo extends VulkanObject {
    public VulkanDescriptorSetAllocateInfo(){
        super(new VkDescriptorSetAllocateInfo());
    }

    public VulkanDescriptorSetAllocateInfo(VkDescriptorSetAllocateInfo vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetAllocateInfo getVk(){
        return (VkDescriptorSetAllocateInfo) super.getVk();
    }
    public VulkanDescriptorSetAllocateInfo(VulkanObject pNext, VulkanDescriptorPool descriptorPool, VulkanUInt32 descriptorSetCount, VulkanDescriptorSetLayout pSetLayouts) {
        super(new VkDescriptorSetAllocateInfo(pNext.getVk(), descriptorPool.getVk(), descriptorSetCount.getVk(), pSetLayouts.getVk()));
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

    public VulkanDescriptorPool getDescriptorPool() {
        return new VulkanDescriptorPool(getVk().getDescriptorPool());
    }

    public void setDescriptorPool(VulkanDescriptorPool descriptorPool) {
        getVk().setDescriptorPool(descriptorPool.getVk());
    }

    public VulkanUInt32 getDescriptorSetCount() {
        return new VulkanUInt32(getVk().getDescriptorSetCount());
    }

    public void setDescriptorSetCount(VulkanUInt32 descriptorSetCount) {
        getVk().setDescriptorSetCount(descriptorSetCount.getVk());
    }

    public VulkanDescriptorSetLayout getPSetLayouts() {
        return new VulkanDescriptorSetLayout(getVk().getPSetLayouts());
    }

    public void setPSetLayouts(VulkanDescriptorSetLayout pSetLayouts) {
        getVk().setPSetLayouts(pSetLayouts.getVk());
    }


    public static class Array extends VulkanDescriptorSetAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetAllocateInfo> {
        public Array(VkDescriptorSetAllocateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetAllocateInfo.Array(count));
        }

        public Array(int count, VulkanDescriptorSetAllocateInfo o){
            this(new VkDescriptorSetAllocateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetAllocateInfo.Array getVk(){
            return (VkDescriptorSetAllocateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetAllocateInfo get(int i){
            return new VulkanDescriptorSetAllocateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetAllocateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetAllocateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetAllocateInfo.Pointer(value));
        }

        @Override
        public VkDescriptorSetAllocateInfo.Pointer getVk(){
            return (VkDescriptorSetAllocateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetAllocateInfo.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetAllocateInfo.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetAllocateInfo.Pointer.Array getVk(){
                return (VkDescriptorSetAllocateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetAllocateInfo.Pointer get(int i){
                return new VulkanDescriptorSetAllocateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
