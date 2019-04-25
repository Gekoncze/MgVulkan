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

    public VkPipelineLayoutCreateFlags getFlags() {
        return new VkPipelineLayoutCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineLayoutCreateFlags flags) {
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

    public VkUInt32 getSetLayoutCount() {
        return new VkUInt32(getVkMemory(), getSetLayoutCount(getVkAddress()));
    }

    
    public void setSetLayoutCount(VkUInt32 setLayoutCount) {
        setSetLayoutCount(getVkAddress(), setLayoutCount != null ? setLayoutCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSetLayoutCountQ() {
        return getSetLayoutCount().getValue();
    }

    public void setSetLayoutCount(int setLayoutCount) {
        getSetLayoutCount().setValue(setLayoutCount);
    }

    protected static native long getSetLayoutCount(long address);
    protected static native void setSetLayoutCount(long address, long setLayoutCount);

    public VkDescriptorSetLayout getPSetLayouts() {
        return new VkDescriptorSetLayout(getVkMemory(), getPSetLayouts(getVkAddress()));
    }

    private VkObject pSetLayouts = null;
    public void setPSetLayouts(VkDescriptorSetLayout pSetLayouts) {
        setPSetLayouts(getVkAddress(), pSetLayouts != null ? pSetLayouts.getVkAddress() : VkPointer.NULL);
        this.pSetLayouts = pSetLayouts;
    }

    protected static native long getPSetLayouts(long address);
    protected static native void setPSetLayouts(long address, long pSetLayouts);

    public VkUInt32 getPushConstantRangeCount() {
        return new VkUInt32(getVkMemory(), getPushConstantRangeCount(getVkAddress()));
    }

    
    public void setPushConstantRangeCount(VkUInt32 pushConstantRangeCount) {
        setPushConstantRangeCount(getVkAddress(), pushConstantRangeCount != null ? pushConstantRangeCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPushConstantRangeCountQ() {
        return getPushConstantRangeCount().getValue();
    }

    public void setPushConstantRangeCount(int pushConstantRangeCount) {
        getPushConstantRangeCount().setValue(pushConstantRangeCount);
    }

    protected static native long getPushConstantRangeCount(long address);
    protected static native void setPushConstantRangeCount(long address, long pushConstantRangeCount);

    public VkPushConstantRange getPPushConstantRanges() {
        return new VkPushConstantRange(getVkMemory(), getPPushConstantRanges(getVkAddress()));
    }

    private VkObject pPushConstantRanges = null;
    public void setPPushConstantRanges(VkPushConstantRange pPushConstantRanges) {
        setPPushConstantRanges(getVkAddress(), pPushConstantRanges != null ? pPushConstantRanges.getVkAddress() : VkPointer.NULL);
        this.pPushConstantRanges = pPushConstantRanges;
    }

    protected static native long getPPushConstantRanges(long address);
    protected static native void setPPushConstantRanges(long address, long pPushConstantRanges);


    public static native long sizeof();

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
