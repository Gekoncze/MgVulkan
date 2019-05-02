package cz.mg.vulkan;

public class VkCommandBufferInheritanceInfo extends VkObject {
    public VkCommandBufferInheritanceInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO));
    }

    public VkCommandBufferInheritanceInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferInheritanceInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandBufferInheritanceInfo(VkPointer pointer) {
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

    public VkFramebuffer getFramebuffer() {
        return new VkFramebuffer(getVkMemory(), getFramebufferNative(getVkAddress()));
    }

    
    public void setFramebuffer(VkFramebuffer framebuffer) {
        setFramebufferNative(getVkAddress(), framebuffer != null ? framebuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFramebufferNative(long address);
    protected static native void setFramebufferNative(long address, long framebuffer);

    public VkBool32 getOcclusionQueryEnable() {
        return new VkBool32(getVkMemory(), getOcclusionQueryEnableNative(getVkAddress()));
    }

    
    public void setOcclusionQueryEnable(VkBool32 occlusionQueryEnable) {
        setOcclusionQueryEnableNative(getVkAddress(), occlusionQueryEnable != null ? occlusionQueryEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOcclusionQueryEnableQ() {
        return getOcclusionQueryEnable().getValue();
    }

    public void setOcclusionQueryEnable(int occlusionQueryEnable) {
        getOcclusionQueryEnable().setValue(occlusionQueryEnable);
    }

    protected static native long getOcclusionQueryEnableNative(long address);
    protected static native void setOcclusionQueryEnableNative(long address, long occlusionQueryEnable);

    public VkQueryControlFlags getQueryFlags() {
        return new VkQueryControlFlags(getVkMemory(), getQueryFlagsNative(getVkAddress()));
    }

    
    public void setQueryFlags(VkQueryControlFlags queryFlags) {
        setQueryFlagsNative(getVkAddress(), queryFlags != null ? queryFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueryFlagsQ() {
        return getQueryFlags().getValue();
    }

    public void setQueryFlags(int queryFlags) {
        getQueryFlags().setValue(queryFlags);
    }

    protected static native long getQueryFlagsNative(long address);
    protected static native void setQueryFlagsNative(long address, long queryFlags);

    public VkQueryPipelineStatisticFlags getPipelineStatistics() {
        return new VkQueryPipelineStatisticFlags(getVkMemory(), getPipelineStatisticsNative(getVkAddress()));
    }

    
    public void setPipelineStatistics(VkQueryPipelineStatisticFlags pipelineStatistics) {
        setPipelineStatisticsNative(getVkAddress(), pipelineStatistics != null ? pipelineStatistics.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPipelineStatisticsQ() {
        return getPipelineStatistics().getValue();
    }

    public void setPipelineStatistics(int pipelineStatistics) {
        getPipelineStatistics().setValue(pipelineStatistics);
    }

    protected static native long getPipelineStatisticsNative(long address);
    protected static native void setPipelineStatisticsNative(long address, long pipelineStatistics);


    public void set(VkCommandBufferInheritanceInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkCommandBufferInheritanceInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferInheritanceInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferInheritanceInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO));;
        }

        public Array(int count, VkCommandBufferInheritanceInfo o){
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
        public VkCommandBufferInheritanceInfo get(int i){
            return new VkCommandBufferInheritanceInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
