package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorPoolCreateInfo extends VulkanObject {
    public VulkanDescriptorPoolCreateInfo(){
        super(new VkDescriptorPoolCreateInfo());
    }

    public VulkanDescriptorPoolCreateInfo(VkDescriptorPoolCreateInfo vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolCreateInfo getVk(){
        return (VkDescriptorPoolCreateInfo) super.getVk();
    }
    public VulkanDescriptorPoolCreateInfo(VulkanObject pNext, VulkanDescriptorPoolCreateFlags flags, VulkanUInt32 maxSets, VulkanUInt32 poolSizeCount, VulkanDescriptorPoolSize pPoolSizes) {
        super(new VkDescriptorPoolCreateInfo(pNext.getVk(), flags.getVk(), maxSets.getVk(), poolSizeCount.getVk(), pPoolSizes.getVk()));
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

    public VulkanDescriptorPoolCreateFlags getFlags() {
        return new VulkanDescriptorPoolCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanDescriptorPoolCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getMaxSets() {
        return new VulkanUInt32(getVk().getMaxSets());
    }

    public void setMaxSets(VulkanUInt32 maxSets) {
        getVk().setMaxSets(maxSets.getVk());
    }

    public VulkanUInt32 getPoolSizeCount() {
        return new VulkanUInt32(getVk().getPoolSizeCount());
    }

    public void setPoolSizeCount(VulkanUInt32 poolSizeCount) {
        getVk().setPoolSizeCount(poolSizeCount.getVk());
    }

    public VulkanDescriptorPoolSize getPPoolSizes() {
        return new VulkanDescriptorPoolSize(getVk().getPPoolSizes());
    }

    public void setPPoolSizes(VulkanDescriptorPoolSize pPoolSizes) {
        getVk().setPPoolSizes(pPoolSizes.getVk());
    }


    public static class Array extends VulkanDescriptorPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolCreateInfo> {
        public Array(VkDescriptorPoolCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorPoolCreateInfo.Array(count));
        }

        public Array(int count, VulkanDescriptorPoolCreateInfo o){
            this(new VkDescriptorPoolCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorPoolCreateInfo.Array getVk(){
            return (VkDescriptorPoolCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorPoolCreateInfo get(int i){
            return new VulkanDescriptorPoolCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorPoolCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorPoolCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorPoolCreateInfo.Pointer(value));
        }

        @Override
        public VkDescriptorPoolCreateInfo.Pointer getVk(){
            return (VkDescriptorPoolCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorPoolCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkDescriptorPoolCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanDescriptorPoolCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorPoolCreateInfo.Pointer.Array getVk(){
                return (VkDescriptorPoolCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorPoolCreateInfo.Pointer get(int i){
                return new VulkanDescriptorPoolCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
