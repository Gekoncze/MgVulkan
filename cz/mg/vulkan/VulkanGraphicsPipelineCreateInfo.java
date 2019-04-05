package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanGraphicsPipelineCreateInfo extends VulkanObject {
    public VulkanGraphicsPipelineCreateInfo(){
        super(new VkGraphicsPipelineCreateInfo());
    }

    public VulkanGraphicsPipelineCreateInfo(VkGraphicsPipelineCreateInfo vk){
        super(vk);
    }

    @Override
    public VkGraphicsPipelineCreateInfo getVk(){
        return (VkGraphicsPipelineCreateInfo) super.getVk();
    }
    public VulkanGraphicsPipelineCreateInfo(VulkanObject pNext, VulkanPipelineCreateFlags flags, VulkanUInt32 stageCount, VulkanPipelineShaderStageCreateInfo pStages, VulkanPipelineVertexInputStateCreateInfo pVertexInputState, VulkanPipelineInputAssemblyStateCreateInfo pInputAssemblyState, VulkanPipelineTessellationStateCreateInfo pTessellationState, VulkanPipelineViewportStateCreateInfo pViewportState, VulkanPipelineRasterizationStateCreateInfo pRasterizationState, VulkanPipelineMultisampleStateCreateInfo pMultisampleState, VulkanPipelineDepthStencilStateCreateInfo pDepthStencilState, VulkanPipelineColorBlendStateCreateInfo pColorBlendState, VulkanPipelineDynamicStateCreateInfo pDynamicState, VulkanPipelineLayout layout, VulkanRenderPass renderPass, VulkanUInt32 subpass, VulkanPipeline basePipelineHandle, VulkanInt32 basePipelineIndex) {
        super(new VkGraphicsPipelineCreateInfo(pNext.getVk(), flags.getVk(), stageCount.getVk(), pStages.getVk(), pVertexInputState.getVk(), pInputAssemblyState.getVk(), pTessellationState.getVk(), pViewportState.getVk(), pRasterizationState.getVk(), pMultisampleState.getVk(), pDepthStencilState.getVk(), pColorBlendState.getVk(), pDynamicState.getVk(), layout.getVk(), renderPass.getVk(), subpass.getVk(), basePipelineHandle.getVk(), basePipelineIndex.getVk()));
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

    public VulkanUInt32 getStageCount() {
        return new VulkanUInt32(getVk().getStageCount());
    }

    public void setStageCount(VulkanUInt32 stageCount) {
        getVk().setStageCount(stageCount.getVk());
    }

    public VulkanPipelineShaderStageCreateInfo getPStages() {
        return new VulkanPipelineShaderStageCreateInfo(getVk().getPStages());
    }

    public void setPStages(VulkanPipelineShaderStageCreateInfo pStages) {
        getVk().setPStages(pStages.getVk());
    }

    public VulkanPipelineVertexInputStateCreateInfo getPVertexInputState() {
        return new VulkanPipelineVertexInputStateCreateInfo(getVk().getPVertexInputState());
    }

    public void setPVertexInputState(VulkanPipelineVertexInputStateCreateInfo pVertexInputState) {
        getVk().setPVertexInputState(pVertexInputState.getVk());
    }

    public VulkanPipelineInputAssemblyStateCreateInfo getPInputAssemblyState() {
        return new VulkanPipelineInputAssemblyStateCreateInfo(getVk().getPInputAssemblyState());
    }

    public void setPInputAssemblyState(VulkanPipelineInputAssemblyStateCreateInfo pInputAssemblyState) {
        getVk().setPInputAssemblyState(pInputAssemblyState.getVk());
    }

    public VulkanPipelineTessellationStateCreateInfo getPTessellationState() {
        return new VulkanPipelineTessellationStateCreateInfo(getVk().getPTessellationState());
    }

    public void setPTessellationState(VulkanPipelineTessellationStateCreateInfo pTessellationState) {
        getVk().setPTessellationState(pTessellationState.getVk());
    }

    public VulkanPipelineViewportStateCreateInfo getPViewportState() {
        return new VulkanPipelineViewportStateCreateInfo(getVk().getPViewportState());
    }

    public void setPViewportState(VulkanPipelineViewportStateCreateInfo pViewportState) {
        getVk().setPViewportState(pViewportState.getVk());
    }

    public VulkanPipelineRasterizationStateCreateInfo getPRasterizationState() {
        return new VulkanPipelineRasterizationStateCreateInfo(getVk().getPRasterizationState());
    }

    public void setPRasterizationState(VulkanPipelineRasterizationStateCreateInfo pRasterizationState) {
        getVk().setPRasterizationState(pRasterizationState.getVk());
    }

    public VulkanPipelineMultisampleStateCreateInfo getPMultisampleState() {
        return new VulkanPipelineMultisampleStateCreateInfo(getVk().getPMultisampleState());
    }

    public void setPMultisampleState(VulkanPipelineMultisampleStateCreateInfo pMultisampleState) {
        getVk().setPMultisampleState(pMultisampleState.getVk());
    }

    public VulkanPipelineDepthStencilStateCreateInfo getPDepthStencilState() {
        return new VulkanPipelineDepthStencilStateCreateInfo(getVk().getPDepthStencilState());
    }

    public void setPDepthStencilState(VulkanPipelineDepthStencilStateCreateInfo pDepthStencilState) {
        getVk().setPDepthStencilState(pDepthStencilState.getVk());
    }

    public VulkanPipelineColorBlendStateCreateInfo getPColorBlendState() {
        return new VulkanPipelineColorBlendStateCreateInfo(getVk().getPColorBlendState());
    }

    public void setPColorBlendState(VulkanPipelineColorBlendStateCreateInfo pColorBlendState) {
        getVk().setPColorBlendState(pColorBlendState.getVk());
    }

    public VulkanPipelineDynamicStateCreateInfo getPDynamicState() {
        return new VulkanPipelineDynamicStateCreateInfo(getVk().getPDynamicState());
    }

    public void setPDynamicState(VulkanPipelineDynamicStateCreateInfo pDynamicState) {
        getVk().setPDynamicState(pDynamicState.getVk());
    }

    public VulkanPipelineLayout getLayout() {
        return new VulkanPipelineLayout(getVk().getLayout());
    }

    public void setLayout(VulkanPipelineLayout layout) {
        getVk().setLayout(layout.getVk());
    }

    public VulkanRenderPass getRenderPass() {
        return new VulkanRenderPass(getVk().getRenderPass());
    }

    public void setRenderPass(VulkanRenderPass renderPass) {
        getVk().setRenderPass(renderPass.getVk());
    }

    public VulkanUInt32 getSubpass() {
        return new VulkanUInt32(getVk().getSubpass());
    }

    public void setSubpass(VulkanUInt32 subpass) {
        getVk().setSubpass(subpass.getVk());
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


    public static class Array extends VulkanGraphicsPipelineCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanGraphicsPipelineCreateInfo> {
        public Array(VkGraphicsPipelineCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkGraphicsPipelineCreateInfo.Array(count));
        }

        public Array(int count, VulkanGraphicsPipelineCreateInfo o){
            this(new VkGraphicsPipelineCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkGraphicsPipelineCreateInfo.Array getVk(){
            return (VkGraphicsPipelineCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanGraphicsPipelineCreateInfo get(int i){
            return new VulkanGraphicsPipelineCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkGraphicsPipelineCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkGraphicsPipelineCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkGraphicsPipelineCreateInfo.Pointer(value));
        }

        @Override
        public VkGraphicsPipelineCreateInfo.Pointer getVk(){
            return (VkGraphicsPipelineCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanGraphicsPipelineCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanGraphicsPipelineCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkGraphicsPipelineCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanGraphicsPipelineCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkGraphicsPipelineCreateInfo.Pointer.Array getVk(){
                return (VkGraphicsPipelineCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanGraphicsPipelineCreateInfo.Pointer get(int i){
                return new VulkanGraphicsPipelineCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
