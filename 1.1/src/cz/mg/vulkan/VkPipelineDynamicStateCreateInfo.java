package cz.mg.vulkan;

public class VkPipelineDynamicStateCreateInfo extends VkObject {
    public VkPipelineDynamicStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO));
    }

    public VkPipelineDynamicStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDynamicStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineDynamicStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineDynamicStateCreateFlags getFlags() {
        return new VkPipelineDynamicStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineDynamicStateCreateFlags flags) {
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

    public VkUInt32 getDynamicStateCount() {
        return new VkUInt32(getVkMemory(), getDynamicStateCountNative(getVkAddress()));
    }

    
    public void setDynamicStateCount(VkUInt32 dynamicStateCount) {
        setDynamicStateCountNative(getVkAddress(), dynamicStateCount != null ? dynamicStateCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDynamicStateCountQ() {
        return getDynamicStateCount().getValue();
    }

    public void setDynamicStateCount(int dynamicStateCount) {
        getDynamicStateCount().setValue(dynamicStateCount);
    }

    protected static native long getDynamicStateCountNative(long address);
    protected static native void setDynamicStateCountNative(long address, long dynamicStateCount);

    public VkDynamicState getPDynamicStates() {
        return new VkDynamicState(getVkMemory(), getPDynamicStatesNative(getVkAddress()));
    }

    private VkObject pDynamicStates = null;
    public void setPDynamicStates(VkDynamicState pDynamicStates) {
        setPDynamicStatesNative(getVkAddress(), pDynamicStates != null ? pDynamicStates.getVkAddress() : VkPointer.NULL);
        this.pDynamicStates = pDynamicStates;
    }

    public VkDynamicState.Array getPDynamicStatesQ() {
        return new VkDynamicState.Array(getPDynamicStates(), getDynamicStateCountQ());
    }

    protected static native long getPDynamicStatesNative(long address);
    protected static native void setPDynamicStatesNative(long address, long pDynamicStates);


    public void set(VkPipelineDynamicStateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineDynamicStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineDynamicStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineDynamicStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO));;
        }

        public Array(VkPipelineDynamicStateCreateInfo o, int count){
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
        public VkPipelineDynamicStateCreateInfo get(int i){
            return new VkPipelineDynamicStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
