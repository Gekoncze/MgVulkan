package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineMultisampleStateCreateInfo extends VulkanObject {
    public VulkanPipelineMultisampleStateCreateInfo(){
        super(new VkPipelineMultisampleStateCreateInfo());
    }

    public VulkanPipelineMultisampleStateCreateInfo(VkPipelineMultisampleStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineMultisampleStateCreateInfo getVk(){
        return (VkPipelineMultisampleStateCreateInfo) super.getVk();
    }
    public VulkanPipelineMultisampleStateCreateInfo(VulkanObject pNext, VulkanPipelineMultisampleStateCreateFlags flags, VulkanSampleCountFlagBits rasterizationSamples, VulkanBool32 sampleShadingEnable, VulkanFloat minSampleShading, VulkanSampleMask pSampleMask, VulkanBool32 alphaToCoverageEnable, VulkanBool32 alphaToOneEnable) {
        super(new VkPipelineMultisampleStateCreateInfo(pNext.getVk(), flags.getVk(), rasterizationSamples.getVk(), sampleShadingEnable.getVk(), minSampleShading.getVk(), pSampleMask.getVk(), alphaToCoverageEnable.getVk(), alphaToOneEnable.getVk()));
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

    public VulkanPipelineMultisampleStateCreateFlags getFlags() {
        return new VulkanPipelineMultisampleStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineMultisampleStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanSampleCountFlagBits getRasterizationSamples() {
        return new VulkanSampleCountFlagBits(getVk().getRasterizationSamples());
    }

    public void setRasterizationSamples(VulkanSampleCountFlagBits rasterizationSamples) {
        getVk().setRasterizationSamples(rasterizationSamples.getVk());
    }

    public VulkanBool32 getSampleShadingEnable() {
        return new VulkanBool32(getVk().getSampleShadingEnable());
    }

    public void setSampleShadingEnable(VulkanBool32 sampleShadingEnable) {
        getVk().setSampleShadingEnable(sampleShadingEnable.getVk());
    }

    public VulkanFloat getMinSampleShading() {
        return new VulkanFloat(getVk().getMinSampleShading());
    }

    public void setMinSampleShading(VulkanFloat minSampleShading) {
        getVk().setMinSampleShading(minSampleShading.getVk());
    }

    public VulkanSampleMask getPSampleMask() {
        return new VulkanSampleMask(getVk().getPSampleMask());
    }

    public void setPSampleMask(VulkanSampleMask pSampleMask) {
        getVk().setPSampleMask(pSampleMask.getVk());
    }

    public VulkanBool32 getAlphaToCoverageEnable() {
        return new VulkanBool32(getVk().getAlphaToCoverageEnable());
    }

    public void setAlphaToCoverageEnable(VulkanBool32 alphaToCoverageEnable) {
        getVk().setAlphaToCoverageEnable(alphaToCoverageEnable.getVk());
    }

    public VulkanBool32 getAlphaToOneEnable() {
        return new VulkanBool32(getVk().getAlphaToOneEnable());
    }

    public void setAlphaToOneEnable(VulkanBool32 alphaToOneEnable) {
        getVk().setAlphaToOneEnable(alphaToOneEnable.getVk());
    }


    public static class Array extends VulkanPipelineMultisampleStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineMultisampleStateCreateInfo> {
        public Array(VkPipelineMultisampleStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineMultisampleStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineMultisampleStateCreateInfo o){
            this(new VkPipelineMultisampleStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineMultisampleStateCreateInfo.Array getVk(){
            return (VkPipelineMultisampleStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineMultisampleStateCreateInfo get(int i){
            return new VulkanPipelineMultisampleStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineMultisampleStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineMultisampleStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineMultisampleStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineMultisampleStateCreateInfo.Pointer getVk(){
            return (VkPipelineMultisampleStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineMultisampleStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineMultisampleStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineMultisampleStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineMultisampleStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineMultisampleStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineMultisampleStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineMultisampleStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineMultisampleStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
