package cz.mg.vulkan;

public class VkPipelineViewportStateCreateInfo extends VkObject {
    public VkPipelineViewportStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO));
    }

    public VkPipelineViewportStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineViewportStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineViewportStateCreateFlags getFlags() {
        return new VkPipelineViewportStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineViewportStateCreateFlags flags) {
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

    public VkUInt32 getViewportCount() {
        return new VkUInt32(getVkMemory(), getViewportCountNative(getVkAddress()));
    }

    
    public void setViewportCount(VkUInt32 viewportCount) {
        setViewportCountNative(getVkAddress(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewportCountQ() {
        return getViewportCount().getValue();
    }

    public void setViewportCount(int viewportCount) {
        getViewportCount().setValue(viewportCount);
    }

    protected static native long getViewportCountNative(long address);
    protected static native void setViewportCountNative(long address, long viewportCount);

    public VkViewport getPViewports() {
        return new VkViewport(getVkMemory(), getPViewportsNative(getVkAddress()));
    }

    private VkObject pViewports = null;
    public void setPViewports(VkViewport pViewports) {
        setPViewportsNative(getVkAddress(), pViewports != null ? pViewports.getVkAddress() : VkPointer.NULL);
        this.pViewports = pViewports;
    }

    public VkViewport.Array getPViewportsQ() {
        return new VkViewport.Array(getPViewports(), getViewportCountQ());
    }

    protected static native long getPViewportsNative(long address);
    protected static native void setPViewportsNative(long address, long pViewports);

    public VkUInt32 getScissorCount() {
        return new VkUInt32(getVkMemory(), getScissorCountNative(getVkAddress()));
    }

    
    public void setScissorCount(VkUInt32 scissorCount) {
        setScissorCountNative(getVkAddress(), scissorCount != null ? scissorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getScissorCountQ() {
        return getScissorCount().getValue();
    }

    public void setScissorCount(int scissorCount) {
        getScissorCount().setValue(scissorCount);
    }

    protected static native long getScissorCountNative(long address);
    protected static native void setScissorCountNative(long address, long scissorCount);

    public VkRect2D getPScissors() {
        return new VkRect2D(getVkMemory(), getPScissorsNative(getVkAddress()));
    }

    private VkObject pScissors = null;
    public void setPScissors(VkRect2D pScissors) {
        setPScissorsNative(getVkAddress(), pScissors != null ? pScissors.getVkAddress() : VkPointer.NULL);
        this.pScissors = pScissors;
    }

    public VkRect2D.Array getPScissorsQ() {
        return new VkRect2D.Array(getPScissors(), getScissorCountQ());
    }

    protected static native long getPScissorsNative(long address);
    protected static native void setPScissorsNative(long address, long pScissors);


    public void set(VkPipelineViewportStateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineViewportStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO));;
        }

        public Array(VkPipelineViewportStateCreateInfo o, int count){
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
        public VkPipelineViewportStateCreateInfo get(int i){
            return new VkPipelineViewportStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
