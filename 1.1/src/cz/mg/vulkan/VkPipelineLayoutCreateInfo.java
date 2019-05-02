package cz.mg.vulkan;

public class VkPipelineLayoutCreateInfo extends VkObject {
    public VkPipelineLayoutCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO));
    }

    public VkPipelineLayoutCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineLayoutCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineLayoutCreateInfo(VkPointer pointer) {
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

    public VkPipelineLayoutCreateFlags getFlags() {
        return new VkPipelineLayoutCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineLayoutCreateFlags flags) {
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

    public VkUInt32 getSetLayoutCount() {
        return new VkUInt32(getVkMemory(), getSetLayoutCountNative(getVkAddress()));
    }

    
    public void setSetLayoutCount(VkUInt32 setLayoutCount) {
        setSetLayoutCountNative(getVkAddress(), setLayoutCount != null ? setLayoutCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSetLayoutCountQ() {
        return getSetLayoutCount().getValue();
    }

    public void setSetLayoutCount(int setLayoutCount) {
        getSetLayoutCount().setValue(setLayoutCount);
    }

    protected static native long getSetLayoutCountNative(long address);
    protected static native void setSetLayoutCountNative(long address, long setLayoutCount);

    public VkDescriptorSetLayout getPSetLayouts() {
        return new VkDescriptorSetLayout(getVkMemory(), getPSetLayoutsNative(getVkAddress()));
    }

    private VkObject pSetLayouts = null;
    public void setPSetLayouts(VkDescriptorSetLayout pSetLayouts) {
        setPSetLayoutsNative(getVkAddress(), pSetLayouts != null ? pSetLayouts.getVkAddress() : VkPointer.NULL);
        this.pSetLayouts = pSetLayouts;
    }

    protected static native long getPSetLayoutsNative(long address);
    protected static native void setPSetLayoutsNative(long address, long pSetLayouts);

    public VkUInt32 getPushConstantRangeCount() {
        return new VkUInt32(getVkMemory(), getPushConstantRangeCountNative(getVkAddress()));
    }

    
    public void setPushConstantRangeCount(VkUInt32 pushConstantRangeCount) {
        setPushConstantRangeCountNative(getVkAddress(), pushConstantRangeCount != null ? pushConstantRangeCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPushConstantRangeCountQ() {
        return getPushConstantRangeCount().getValue();
    }

    public void setPushConstantRangeCount(int pushConstantRangeCount) {
        getPushConstantRangeCount().setValue(pushConstantRangeCount);
    }

    protected static native long getPushConstantRangeCountNative(long address);
    protected static native void setPushConstantRangeCountNative(long address, long pushConstantRangeCount);

    public VkPushConstantRange getPPushConstantRanges() {
        return new VkPushConstantRange(getVkMemory(), getPPushConstantRangesNative(getVkAddress()));
    }

    private VkObject pPushConstantRanges = null;
    public void setPPushConstantRanges(VkPushConstantRange pPushConstantRanges) {
        setPPushConstantRangesNative(getVkAddress(), pPushConstantRanges != null ? pPushConstantRanges.getVkAddress() : VkPointer.NULL);
        this.pPushConstantRanges = pPushConstantRanges;
    }

    protected static native long getPPushConstantRangesNative(long address);
    protected static native void setPPushConstantRangesNative(long address, long pPushConstantRanges);


    public void set(VkPipelineLayoutCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineLayoutCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineLayoutCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineLayoutCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO));;
        }

        public Array(int count, VkPipelineLayoutCreateInfo o){
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
        public VkPipelineLayoutCreateInfo get(int i){
            return new VkPipelineLayoutCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
