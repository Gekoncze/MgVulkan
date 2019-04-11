package cz.mg.vulkan;

public class VkGraphicsPipelineCreateInfo extends VkObject {
    public VkGraphicsPipelineCreateInfo() {
        super(sizeof());
    }

    public VkGraphicsPipelineCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkGraphicsPipelineCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkGraphicsPipelineCreateInfo(VkObject pNext, VkPipelineCreateFlags flags, VkUInt32 stageCount, VkPipelineShaderStageCreateInfo pStages, VkPipelineVertexInputStateCreateInfo pVertexInputState, VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState, VkPipelineTessellationStateCreateInfo pTessellationState, VkPipelineViewportStateCreateInfo pViewportState, VkPipelineRasterizationStateCreateInfo pRasterizationState, VkPipelineMultisampleStateCreateInfo pMultisampleState, VkPipelineDepthStencilStateCreateInfo pDepthStencilState, VkPipelineColorBlendStateCreateInfo pColorBlendState, VkPipelineDynamicStateCreateInfo pDynamicState, VkPipelineLayout layout, VkRenderPass renderPass, VkUInt32 subpass, VkPipeline basePipelineHandle, VkInt32 basePipelineIndex) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setStageCount(stageCount);
        setPStages(pStages);
        setPVertexInputState(pVertexInputState);
        setPInputAssemblyState(pInputAssemblyState);
        setPTessellationState(pTessellationState);
        setPViewportState(pViewportState);
        setPRasterizationState(pRasterizationState);
        setPMultisampleState(pMultisampleState);
        setPDepthStencilState(pDepthStencilState);
        setPColorBlendState(pColorBlendState);
        setPDynamicState(pDynamicState);
        setLayout(layout);
        setRenderPass(renderPass);
        setSubpass(subpass);
        setBasePipelineHandle(basePipelineHandle);
        setBasePipelineIndex(basePipelineIndex);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkPipelineCreateFlags getFlags() {
        return new VkPipelineCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getStageCount() {
        return new VkUInt32(getVkMemory(), getStageCount(getVkAddress()));
    }

    
    public void setStageCount(VkUInt32 stageCount) {
        setStageCount(getVkAddress(), stageCount != null ? stageCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getStageCount(long address);
    private static native void setStageCount(long address, long stageCount);

    public VkPipelineShaderStageCreateInfo getPStages() {
        return new VkPipelineShaderStageCreateInfo(getVkMemory(), getPStages(getVkAddress()));
    }

    private VkObject pStages = null;
    public void setPStages(VkPipelineShaderStageCreateInfo pStages) {
        setPStages(getVkAddress(), pStages != null ? pStages.getVkAddress() : VkPointer.NULL);
        this.pStages = pStages;
    }

    private static native long getPStages(long address);
    private static native void setPStages(long address, long pStages);

    public VkPipelineVertexInputStateCreateInfo getPVertexInputState() {
        return new VkPipelineVertexInputStateCreateInfo(getVkMemory(), getPVertexInputState(getVkAddress()));
    }

    private VkObject pVertexInputState = null;
    public void setPVertexInputState(VkPipelineVertexInputStateCreateInfo pVertexInputState) {
        setPVertexInputState(getVkAddress(), pVertexInputState != null ? pVertexInputState.getVkAddress() : VkPointer.NULL);
        this.pVertexInputState = pVertexInputState;
    }

    private static native long getPVertexInputState(long address);
    private static native void setPVertexInputState(long address, long pVertexInputState);

    public VkPipelineInputAssemblyStateCreateInfo getPInputAssemblyState() {
        return new VkPipelineInputAssemblyStateCreateInfo(getVkMemory(), getPInputAssemblyState(getVkAddress()));
    }

    private VkObject pInputAssemblyState = null;
    public void setPInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState) {
        setPInputAssemblyState(getVkAddress(), pInputAssemblyState != null ? pInputAssemblyState.getVkAddress() : VkPointer.NULL);
        this.pInputAssemblyState = pInputAssemblyState;
    }

    private static native long getPInputAssemblyState(long address);
    private static native void setPInputAssemblyState(long address, long pInputAssemblyState);

    public VkPipelineTessellationStateCreateInfo getPTessellationState() {
        return new VkPipelineTessellationStateCreateInfo(getVkMemory(), getPTessellationState(getVkAddress()));
    }

    private VkObject pTessellationState = null;
    public void setPTessellationState(VkPipelineTessellationStateCreateInfo pTessellationState) {
        setPTessellationState(getVkAddress(), pTessellationState != null ? pTessellationState.getVkAddress() : VkPointer.NULL);
        this.pTessellationState = pTessellationState;
    }

    private static native long getPTessellationState(long address);
    private static native void setPTessellationState(long address, long pTessellationState);

    public VkPipelineViewportStateCreateInfo getPViewportState() {
        return new VkPipelineViewportStateCreateInfo(getVkMemory(), getPViewportState(getVkAddress()));
    }

    private VkObject pViewportState = null;
    public void setPViewportState(VkPipelineViewportStateCreateInfo pViewportState) {
        setPViewportState(getVkAddress(), pViewportState != null ? pViewportState.getVkAddress() : VkPointer.NULL);
        this.pViewportState = pViewportState;
    }

    private static native long getPViewportState(long address);
    private static native void setPViewportState(long address, long pViewportState);

    public VkPipelineRasterizationStateCreateInfo getPRasterizationState() {
        return new VkPipelineRasterizationStateCreateInfo(getVkMemory(), getPRasterizationState(getVkAddress()));
    }

    private VkObject pRasterizationState = null;
    public void setPRasterizationState(VkPipelineRasterizationStateCreateInfo pRasterizationState) {
        setPRasterizationState(getVkAddress(), pRasterizationState != null ? pRasterizationState.getVkAddress() : VkPointer.NULL);
        this.pRasterizationState = pRasterizationState;
    }

    private static native long getPRasterizationState(long address);
    private static native void setPRasterizationState(long address, long pRasterizationState);

    public VkPipelineMultisampleStateCreateInfo getPMultisampleState() {
        return new VkPipelineMultisampleStateCreateInfo(getVkMemory(), getPMultisampleState(getVkAddress()));
    }

    private VkObject pMultisampleState = null;
    public void setPMultisampleState(VkPipelineMultisampleStateCreateInfo pMultisampleState) {
        setPMultisampleState(getVkAddress(), pMultisampleState != null ? pMultisampleState.getVkAddress() : VkPointer.NULL);
        this.pMultisampleState = pMultisampleState;
    }

    private static native long getPMultisampleState(long address);
    private static native void setPMultisampleState(long address, long pMultisampleState);

    public VkPipelineDepthStencilStateCreateInfo getPDepthStencilState() {
        return new VkPipelineDepthStencilStateCreateInfo(getVkMemory(), getPDepthStencilState(getVkAddress()));
    }

    private VkObject pDepthStencilState = null;
    public void setPDepthStencilState(VkPipelineDepthStencilStateCreateInfo pDepthStencilState) {
        setPDepthStencilState(getVkAddress(), pDepthStencilState != null ? pDepthStencilState.getVkAddress() : VkPointer.NULL);
        this.pDepthStencilState = pDepthStencilState;
    }

    private static native long getPDepthStencilState(long address);
    private static native void setPDepthStencilState(long address, long pDepthStencilState);

    public VkPipelineColorBlendStateCreateInfo getPColorBlendState() {
        return new VkPipelineColorBlendStateCreateInfo(getVkMemory(), getPColorBlendState(getVkAddress()));
    }

    private VkObject pColorBlendState = null;
    public void setPColorBlendState(VkPipelineColorBlendStateCreateInfo pColorBlendState) {
        setPColorBlendState(getVkAddress(), pColorBlendState != null ? pColorBlendState.getVkAddress() : VkPointer.NULL);
        this.pColorBlendState = pColorBlendState;
    }

    private static native long getPColorBlendState(long address);
    private static native void setPColorBlendState(long address, long pColorBlendState);

    public VkPipelineDynamicStateCreateInfo getPDynamicState() {
        return new VkPipelineDynamicStateCreateInfo(getVkMemory(), getPDynamicState(getVkAddress()));
    }

    private VkObject pDynamicState = null;
    public void setPDynamicState(VkPipelineDynamicStateCreateInfo pDynamicState) {
        setPDynamicState(getVkAddress(), pDynamicState != null ? pDynamicState.getVkAddress() : VkPointer.NULL);
        this.pDynamicState = pDynamicState;
    }

    private static native long getPDynamicState(long address);
    private static native void setPDynamicState(long address, long pDynamicState);

    public VkPipelineLayout getLayout() {
        return new VkPipelineLayout(getVkMemory(), getLayout(getVkAddress()));
    }

    
    public void setLayout(VkPipelineLayout layout) {
        setLayout(getVkAddress(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getLayout(long address);
    private static native void setLayout(long address, long layout);

    public VkRenderPass getRenderPass() {
        return new VkRenderPass(getVkMemory(), getRenderPass(getVkAddress()));
    }

    
    public void setRenderPass(VkRenderPass renderPass) {
        setRenderPass(getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getRenderPass(long address);
    private static native void setRenderPass(long address, long renderPass);

    public VkUInt32 getSubpass() {
        return new VkUInt32(getVkMemory(), getSubpass(getVkAddress()));
    }

    
    public void setSubpass(VkUInt32 subpass) {
        setSubpass(getVkAddress(), subpass != null ? subpass.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getSubpass(long address);
    private static native void setSubpass(long address, long subpass);

    public VkPipeline getBasePipelineHandle() {
        return new VkPipeline(getVkMemory(), getBasePipelineHandle(getVkAddress()));
    }

    
    public void setBasePipelineHandle(VkPipeline basePipelineHandle) {
        setBasePipelineHandle(getVkAddress(), basePipelineHandle != null ? basePipelineHandle.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getBasePipelineHandle(long address);
    private static native void setBasePipelineHandle(long address, long basePipelineHandle);

    public VkInt32 getBasePipelineIndex() {
        return new VkInt32(getVkMemory(), getBasePipelineIndex(getVkAddress()));
    }

    
    public void setBasePipelineIndex(VkInt32 basePipelineIndex) {
        setBasePipelineIndex(getVkAddress(), basePipelineIndex != null ? basePipelineIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getBasePipelineIndex(long address);
    private static native void setBasePipelineIndex(long address, long basePipelineIndex);


    public static native long sizeof();

    public static class Array extends VkGraphicsPipelineCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkGraphicsPipelineCreateInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkGraphicsPipelineCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkGraphicsPipelineCreateInfo o){
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


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkGraphicsPipelineCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkGraphicsPipelineCreateInfo.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkGraphicsPipelineCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkGraphicsPipelineCreateInfo.Pointer get(int i){
                return new VkGraphicsPipelineCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
