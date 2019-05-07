package cz.mg.vulkan;

public class VkGraphicsPipelineCreateInfo extends VkObject {
    public VkGraphicsPipelineCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO));
    }

    public VkGraphicsPipelineCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkGraphicsPipelineCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkGraphicsPipelineCreateInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkPipelineCreateFlags getFlags() {
        return new VkPipelineCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCreateFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkUInt32 getStageCount() {
        return new VkUInt32(getVkMemory(), getStageCountNative(getVkAddress()));
    }

    
    public void setStageCount(VkUInt32 stageCount) {
        setStageCountNative(getVkAddress(), stageCount != null ? stageCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStageCountQ() {
        return getStageCount().getValue();
    }

    public void setStageCount(int stageCount) {
        getStageCount().setValue(stageCount);
    }

    protected static native long getStageCountNative(long address);
    protected static native void setStageCountNative(long address, long stageCount);

    public VkPipelineShaderStageCreateInfo getPStages() {
        return new VkPipelineShaderStageCreateInfo(getVkMemory(), getPStagesNative(getVkAddress()));
    }

    private VkObject pStages = null;
    public void setPStages(VkPipelineShaderStageCreateInfo pStages) {
        setPStagesNative(getVkAddress(), pStages != null ? pStages.getVkAddress() : VkPointer.NULL);
        this.pStages = pStages;
    }

    public VkPipelineShaderStageCreateInfo.Array getPStagesQ() {
        return new VkPipelineShaderStageCreateInfo.Array(getPStages(), getStageCountQ());
    }

    protected static native long getPStagesNative(long address);
    protected static native void setPStagesNative(long address, long pStages);

    public VkPipelineVertexInputStateCreateInfo getPVertexInputState() {
        return new VkPipelineVertexInputStateCreateInfo(getVkMemory(), getPVertexInputStateNative(getVkAddress()));
    }

    private VkObject pVertexInputState = null;
    public void setPVertexInputState(VkPipelineVertexInputStateCreateInfo pVertexInputState) {
        setPVertexInputStateNative(getVkAddress(), pVertexInputState != null ? pVertexInputState.getVkAddress() : VkPointer.NULL);
        this.pVertexInputState = pVertexInputState;
    }

    protected static native long getPVertexInputStateNative(long address);
    protected static native void setPVertexInputStateNative(long address, long pVertexInputState);

    public VkPipelineInputAssemblyStateCreateInfo getPInputAssemblyState() {
        return new VkPipelineInputAssemblyStateCreateInfo(getVkMemory(), getPInputAssemblyStateNative(getVkAddress()));
    }

    private VkObject pInputAssemblyState = null;
    public void setPInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState) {
        setPInputAssemblyStateNative(getVkAddress(), pInputAssemblyState != null ? pInputAssemblyState.getVkAddress() : VkPointer.NULL);
        this.pInputAssemblyState = pInputAssemblyState;
    }

    protected static native long getPInputAssemblyStateNative(long address);
    protected static native void setPInputAssemblyStateNative(long address, long pInputAssemblyState);

    public VkPipelineTessellationStateCreateInfo getPTessellationState() {
        return new VkPipelineTessellationStateCreateInfo(getVkMemory(), getPTessellationStateNative(getVkAddress()));
    }

    private VkObject pTessellationState = null;
    public void setPTessellationState(VkPipelineTessellationStateCreateInfo pTessellationState) {
        setPTessellationStateNative(getVkAddress(), pTessellationState != null ? pTessellationState.getVkAddress() : VkPointer.NULL);
        this.pTessellationState = pTessellationState;
    }

    protected static native long getPTessellationStateNative(long address);
    protected static native void setPTessellationStateNative(long address, long pTessellationState);

    public VkPipelineViewportStateCreateInfo getPViewportState() {
        return new VkPipelineViewportStateCreateInfo(getVkMemory(), getPViewportStateNative(getVkAddress()));
    }

    private VkObject pViewportState = null;
    public void setPViewportState(VkPipelineViewportStateCreateInfo pViewportState) {
        setPViewportStateNative(getVkAddress(), pViewportState != null ? pViewportState.getVkAddress() : VkPointer.NULL);
        this.pViewportState = pViewportState;
    }

    protected static native long getPViewportStateNative(long address);
    protected static native void setPViewportStateNative(long address, long pViewportState);

    public VkPipelineRasterizationStateCreateInfo getPRasterizationState() {
        return new VkPipelineRasterizationStateCreateInfo(getVkMemory(), getPRasterizationStateNative(getVkAddress()));
    }

    private VkObject pRasterizationState = null;
    public void setPRasterizationState(VkPipelineRasterizationStateCreateInfo pRasterizationState) {
        setPRasterizationStateNative(getVkAddress(), pRasterizationState != null ? pRasterizationState.getVkAddress() : VkPointer.NULL);
        this.pRasterizationState = pRasterizationState;
    }

    protected static native long getPRasterizationStateNative(long address);
    protected static native void setPRasterizationStateNative(long address, long pRasterizationState);

    public VkPipelineMultisampleStateCreateInfo getPMultisampleState() {
        return new VkPipelineMultisampleStateCreateInfo(getVkMemory(), getPMultisampleStateNative(getVkAddress()));
    }

    private VkObject pMultisampleState = null;
    public void setPMultisampleState(VkPipelineMultisampleStateCreateInfo pMultisampleState) {
        setPMultisampleStateNative(getVkAddress(), pMultisampleState != null ? pMultisampleState.getVkAddress() : VkPointer.NULL);
        this.pMultisampleState = pMultisampleState;
    }

    protected static native long getPMultisampleStateNative(long address);
    protected static native void setPMultisampleStateNative(long address, long pMultisampleState);

    public VkPipelineDepthStencilStateCreateInfo getPDepthStencilState() {
        return new VkPipelineDepthStencilStateCreateInfo(getVkMemory(), getPDepthStencilStateNative(getVkAddress()));
    }

    private VkObject pDepthStencilState = null;
    public void setPDepthStencilState(VkPipelineDepthStencilStateCreateInfo pDepthStencilState) {
        setPDepthStencilStateNative(getVkAddress(), pDepthStencilState != null ? pDepthStencilState.getVkAddress() : VkPointer.NULL);
        this.pDepthStencilState = pDepthStencilState;
    }

    protected static native long getPDepthStencilStateNative(long address);
    protected static native void setPDepthStencilStateNative(long address, long pDepthStencilState);

    public VkPipelineColorBlendStateCreateInfo getPColorBlendState() {
        return new VkPipelineColorBlendStateCreateInfo(getVkMemory(), getPColorBlendStateNative(getVkAddress()));
    }

    private VkObject pColorBlendState = null;
    public void setPColorBlendState(VkPipelineColorBlendStateCreateInfo pColorBlendState) {
        setPColorBlendStateNative(getVkAddress(), pColorBlendState != null ? pColorBlendState.getVkAddress() : VkPointer.NULL);
        this.pColorBlendState = pColorBlendState;
    }

    protected static native long getPColorBlendStateNative(long address);
    protected static native void setPColorBlendStateNative(long address, long pColorBlendState);

    public VkPipelineDynamicStateCreateInfo getPDynamicState() {
        return new VkPipelineDynamicStateCreateInfo(getVkMemory(), getPDynamicStateNative(getVkAddress()));
    }

    private VkObject pDynamicState = null;
    public void setPDynamicState(VkPipelineDynamicStateCreateInfo pDynamicState) {
        setPDynamicStateNative(getVkAddress(), pDynamicState != null ? pDynamicState.getVkAddress() : VkPointer.NULL);
        this.pDynamicState = pDynamicState;
    }

    protected static native long getPDynamicStateNative(long address);
    protected static native void setPDynamicStateNative(long address, long pDynamicState);

    public VkPipelineLayout getLayout() {
        return new VkPipelineLayout(getVkMemory(), getLayoutNative(getVkAddress()));
    }

    
    public void setLayout(VkPipelineLayout layout) {
        setLayoutNative(getVkAddress(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getLayoutNative(long address);
    protected static native void setLayoutNative(long address, long layout);

    public VkRenderPass getRenderPass() {
        return new VkRenderPass(getVkMemory(), getRenderPassNative(getVkAddress()));
    }

    
    public void setRenderPass(VkRenderPass renderPass) {
        setRenderPassNative(getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getRenderPassNative(long address);
    protected static native void setRenderPassNative(long address, long renderPass);

    public VkUInt32 getSubpass() {
        return new VkUInt32(getVkMemory(), getSubpassNative(getVkAddress()));
    }

    
    public void setSubpass(VkUInt32 subpass) {
        setSubpassNative(getVkAddress(), subpass != null ? subpass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassQ() {
        return getSubpass().getValue();
    }

    public void setSubpass(int subpass) {
        getSubpass().setValue(subpass);
    }

    protected static native long getSubpassNative(long address);
    protected static native void setSubpassNative(long address, long subpass);

    public VkPipeline getBasePipelineHandle() {
        return new VkPipeline(getVkMemory(), getBasePipelineHandleNative(getVkAddress()));
    }

    
    public void setBasePipelineHandle(VkPipeline basePipelineHandle) {
        setBasePipelineHandleNative(getVkAddress(), basePipelineHandle != null ? basePipelineHandle.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBasePipelineHandleNative(long address);
    protected static native void setBasePipelineHandleNative(long address, long basePipelineHandle);

    public VkInt32 getBasePipelineIndex() {
        return new VkInt32(getVkMemory(), getBasePipelineIndexNative(getVkAddress()));
    }

    
    public void setBasePipelineIndex(VkInt32 basePipelineIndex) {
        setBasePipelineIndexNative(getVkAddress(), basePipelineIndex != null ? basePipelineIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBasePipelineIndexQ() {
        return getBasePipelineIndex().getValue();
    }

    public void setBasePipelineIndex(int basePipelineIndex) {
        getBasePipelineIndex().setValue(basePipelineIndex);
    }

    protected static native long getBasePipelineIndexNative(long address);
    protected static native void setBasePipelineIndexNative(long address, long basePipelineIndex);


    public void set(VkGraphicsPipelineCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkGraphicsPipelineCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkGraphicsPipelineCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkGraphicsPipelineCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO));;
        }

        public Array(VkGraphicsPipelineCreateInfo o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkGraphicsPipelineCreateInfo get(int i){
            return new VkGraphicsPipelineCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
