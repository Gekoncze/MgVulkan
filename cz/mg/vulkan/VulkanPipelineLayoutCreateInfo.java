package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineLayoutCreateInfo extends VulkanObject {
    public VulkanPipelineLayoutCreateInfo(){
        super(new VkPipelineLayoutCreateInfo());
    }

    public VulkanPipelineLayoutCreateInfo(VkPipelineLayoutCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineLayoutCreateInfo getVk(){
        return (VkPipelineLayoutCreateInfo) super.getVk();
    }
    public VulkanPipelineLayoutCreateInfo(VulkanObject pNext, VulkanPipelineLayoutCreateFlags flags, VulkanUInt32 setLayoutCount, VulkanDescriptorSetLayout pSetLayouts, VulkanUInt32 pushConstantRangeCount, VulkanPushConstantRange pPushConstantRanges) {
        super(new VkPipelineLayoutCreateInfo(pNext.getVk(), flags.getVk(), setLayoutCount.getVk(), pSetLayouts.getVk(), pushConstantRangeCount.getVk(), pPushConstantRanges.getVk()));
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

    public VulkanPipelineLayoutCreateFlags getFlags() {
        return new VulkanPipelineLayoutCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineLayoutCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getSetLayoutCount() {
        return new VulkanUInt32(getVk().getSetLayoutCount());
    }

    public void setSetLayoutCount(VulkanUInt32 setLayoutCount) {
        getVk().setSetLayoutCount(setLayoutCount.getVk());
    }

    public VulkanDescriptorSetLayout getPSetLayouts() {
        return new VulkanDescriptorSetLayout(getVk().getPSetLayouts());
    }

    public void setPSetLayouts(VulkanDescriptorSetLayout pSetLayouts) {
        getVk().setPSetLayouts(pSetLayouts.getVk());
    }

    public VulkanUInt32 getPushConstantRangeCount() {
        return new VulkanUInt32(getVk().getPushConstantRangeCount());
    }

    public void setPushConstantRangeCount(VulkanUInt32 pushConstantRangeCount) {
        getVk().setPushConstantRangeCount(pushConstantRangeCount.getVk());
    }

    public VulkanPushConstantRange getPPushConstantRanges() {
        return new VulkanPushConstantRange(getVk().getPPushConstantRanges());
    }

    public void setPPushConstantRanges(VulkanPushConstantRange pPushConstantRanges) {
        getVk().setPPushConstantRanges(pPushConstantRanges.getVk());
    }


    public static class Array extends VulkanPipelineLayoutCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineLayoutCreateInfo> {
        public Array(VkPipelineLayoutCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineLayoutCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineLayoutCreateInfo o){
            this(new VkPipelineLayoutCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineLayoutCreateInfo.Array getVk(){
            return (VkPipelineLayoutCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineLayoutCreateInfo get(int i){
            return new VulkanPipelineLayoutCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineLayoutCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineLayoutCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineLayoutCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineLayoutCreateInfo.Pointer getVk(){
            return (VkPipelineLayoutCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineLayoutCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineLayoutCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineLayoutCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineLayoutCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineLayoutCreateInfo.Pointer.Array getVk(){
                return (VkPipelineLayoutCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineLayoutCreateInfo.Pointer get(int i){
                return new VulkanPipelineLayoutCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
