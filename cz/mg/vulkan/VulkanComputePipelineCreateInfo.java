package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkComputePipelineCreateInfo.html">khronos documentation</a>
 **/
public class VulkanComputePipelineCreateInfo extends VulkanObject {
    public VulkanComputePipelineCreateInfo(){
        super(new VkComputePipelineCreateInfo());
    }

    public VulkanComputePipelineCreateInfo(VkComputePipelineCreateInfo vk){
        super(vk);
    }

    @Override
    public VkComputePipelineCreateInfo getVk(){
        return (VkComputePipelineCreateInfo) super.getVk();
    }
    public VulkanComputePipelineCreateInfo(VulkanObject pNext, VulkanPipelineCreateFlags flags, VulkanPipelineShaderStageCreateInfo stage, VulkanPipelineLayout layout, VulkanPipeline basePipelineHandle, VulkanInt32 basePipelineIndex) {
        super(new VkComputePipelineCreateInfo(pNext.getVk(), flags.getVk(), stage.getVk(), layout.getVk(), basePipelineHandle.getVk(), basePipelineIndex.getVk()));
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

    public VulkanPipelineCreateFlags getFlags() {
        return new VulkanPipelineCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanPipelineShaderStageCreateInfo getStage() {
        return new VulkanPipelineShaderStageCreateInfo(getVk().getStage());
    }

    public void setStage(VulkanPipelineShaderStageCreateInfo stage) {
        getVk().setStage(stage.getVk());
    }

    public VulkanPipelineLayout getLayout() {
        return new VulkanPipelineLayout(getVk().getLayout());
    }

    public void setLayout(VulkanPipelineLayout layout) {
        getVk().setLayout(layout.getVk());
    }

    public VulkanPipeline getBasePipelineHandle() {
        return new VulkanPipeline(getVk().getBasePipelineHandle());
    }

    public void setBasePipelineHandle(VulkanPipeline basePipelineHandle) {
        getVk().setBasePipelineHandle(basePipelineHandle.getVk());
    }

    public VulkanInt32 getBasePipelineIndex() {
        return new VulkanInt32(getVk().getBasePipelineIndex());
    }

    public void setBasePipelineIndex(VulkanInt32 basePipelineIndex) {
        getVk().setBasePipelineIndex(basePipelineIndex.getVk());
    }


    public static class Array extends VulkanComputePipelineCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanComputePipelineCreateInfo> {
        public Array(VkComputePipelineCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkComputePipelineCreateInfo.Array(count));
        }

        public Array(int count, VulkanComputePipelineCreateInfo o){
            this(new VkComputePipelineCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkComputePipelineCreateInfo.Array getVk(){
            return (VkComputePipelineCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanComputePipelineCreateInfo get(int i){
            return new VulkanComputePipelineCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkComputePipelineCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkComputePipelineCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkComputePipelineCreateInfo.Pointer(value));
        }

        @Override
        public VkComputePipelineCreateInfo.Pointer getVk(){
            return (VkComputePipelineCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanComputePipelineCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanComputePipelineCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkComputePipelineCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanComputePipelineCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkComputePipelineCreateInfo.Pointer.Array getVk(){
                return (VkComputePipelineCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanComputePipelineCreateInfo.Pointer get(int i){
                return new VulkanComputePipelineCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
