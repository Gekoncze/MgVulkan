package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineShaderStageCreateInfo extends VulkanObject {
    public VulkanPipelineShaderStageCreateInfo(){
        super(new VkPipelineShaderStageCreateInfo());
    }

    public VulkanPipelineShaderStageCreateInfo(VkPipelineShaderStageCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineShaderStageCreateInfo getVk(){
        return (VkPipelineShaderStageCreateInfo) super.getVk();
    }
    public VulkanPipelineShaderStageCreateInfo(VulkanObject pNext, VulkanPipelineShaderStageCreateFlags flags, VulkanShaderStageFlagBits stage, VulkanShaderModule module, VulkanChar pName, VulkanSpecializationInfo pSpecializationInfo) {
        super(new VkPipelineShaderStageCreateInfo(pNext.getVk(), flags.getVk(), stage.getVk(), module.getVk(), pName.getVk(), pSpecializationInfo.getVk()));
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

    public VulkanPipelineShaderStageCreateFlags getFlags() {
        return new VulkanPipelineShaderStageCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineShaderStageCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanShaderStageFlagBits getStage() {
        return new VulkanShaderStageFlagBits(getVk().getStage());
    }

    public void setStage(VulkanShaderStageFlagBits stage) {
        getVk().setStage(stage.getVk());
    }

    public VulkanShaderModule getModule() {
        return new VulkanShaderModule(getVk().getModule());
    }

    public void setModule(VulkanShaderModule module) {
        getVk().setModule(module.getVk());
    }

    public VulkanChar getPName() {
        return new VulkanChar(getVk().getPName());
    }

    public void setPName(VulkanChar pName) {
        getVk().setPName(pName.getVk());
    }

    public VulkanSpecializationInfo getPSpecializationInfo() {
        return new VulkanSpecializationInfo(getVk().getPSpecializationInfo());
    }

    public void setPSpecializationInfo(VulkanSpecializationInfo pSpecializationInfo) {
        getVk().setPSpecializationInfo(pSpecializationInfo.getVk());
    }


    public static class Array extends VulkanPipelineShaderStageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineShaderStageCreateInfo> {
        public Array(VkPipelineShaderStageCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineShaderStageCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineShaderStageCreateInfo o){
            this(new VkPipelineShaderStageCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineShaderStageCreateInfo.Array getVk(){
            return (VkPipelineShaderStageCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineShaderStageCreateInfo get(int i){
            return new VulkanPipelineShaderStageCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineShaderStageCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineShaderStageCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineShaderStageCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineShaderStageCreateInfo.Pointer getVk(){
            return (VkPipelineShaderStageCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineShaderStageCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineShaderStageCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineShaderStageCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineShaderStageCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineShaderStageCreateInfo.Pointer.Array getVk(){
                return (VkPipelineShaderStageCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineShaderStageCreateInfo.Pointer get(int i){
                return new VulkanPipelineShaderStageCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
