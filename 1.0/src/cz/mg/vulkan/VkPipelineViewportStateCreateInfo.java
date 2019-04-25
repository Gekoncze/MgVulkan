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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkPipelineViewportStateCreateFlags getFlags() {
        return new VkPipelineViewportStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineViewportStateCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkUInt32 getViewportCount() {
        return new VkUInt32(getVkMemory(), getViewportCount(getVkAddress()));
    }

    
    public void setViewportCount(VkUInt32 viewportCount) {
        setViewportCount(getVkAddress(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewportCountQ() {
        return getViewportCount().getValue();
    }

    public void setViewportCount(int viewportCount) {
        getViewportCount().setValue(viewportCount);
    }

    protected static native long getViewportCount(long address);
    protected static native void setViewportCount(long address, long viewportCount);

    public VkViewport getPViewports() {
        return new VkViewport(getVkMemory(), getPViewports(getVkAddress()));
    }

    private VkObject pViewports = null;
    public void setPViewports(VkViewport pViewports) {
        setPViewports(getVkAddress(), pViewports != null ? pViewports.getVkAddress() : VkPointer.NULL);
        this.pViewports = pViewports;
    }

    protected static native long getPViewports(long address);
    protected static native void setPViewports(long address, long pViewports);

    public VkUInt32 getScissorCount() {
        return new VkUInt32(getVkMemory(), getScissorCount(getVkAddress()));
    }

    
    public void setScissorCount(VkUInt32 scissorCount) {
        setScissorCount(getVkAddress(), scissorCount != null ? scissorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getScissorCountQ() {
        return getScissorCount().getValue();
    }

    public void setScissorCount(int scissorCount) {
        getScissorCount().setValue(scissorCount);
    }

    protected static native long getScissorCount(long address);
    protected static native void setScissorCount(long address, long scissorCount);

    public VkRect2D getPScissors() {
        return new VkRect2D(getVkMemory(), getPScissors(getVkAddress()));
    }

    private VkObject pScissors = null;
    public void setPScissors(VkRect2D pScissors) {
        setPScissors(getVkAddress(), pScissors != null ? pScissors.getVkAddress() : VkPointer.NULL);
        this.pScissors = pScissors;
    }

    protected static native long getPScissors(long address);
    protected static native void setPScissors(long address, long pScissors);


    public static native long sizeof();

    public static class Array extends VkPipelineViewportStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineViewportStateCreateInfo o){
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
