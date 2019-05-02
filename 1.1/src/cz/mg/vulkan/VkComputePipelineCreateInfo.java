package cz.mg.vulkan;

public class VkComputePipelineCreateInfo extends VkObject {
    public VkComputePipelineCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO));
    }

    public VkComputePipelineCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkComputePipelineCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkComputePipelineCreateInfo(VkPointer pointer) {
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

    public VkPipelineShaderStageCreateInfo getStage() {
        return new VkPipelineShaderStageCreateInfo(getVkMemory(), getStageNative(getVkAddress()));
    }

    
    public void setStage(VkPipelineShaderStageCreateInfo stage) {
        setStageNative(getVkAddress(), stage != null ? stage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getStageNative(long address);
    protected static native void setStageNative(long address, long stage);

    public VkPipelineLayout getLayout() {
        return new VkPipelineLayout(getVkMemory(), getLayoutNative(getVkAddress()));
    }

    
    public void setLayout(VkPipelineLayout layout) {
        setLayoutNative(getVkAddress(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getLayoutNative(long address);
    protected static native void setLayoutNative(long address, long layout);

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


    public void set(VkComputePipelineCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkComputePipelineCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkComputePipelineCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkComputePipelineCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO));;
        }

        public Array(int count, VkComputePipelineCreateInfo o){
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
        public VkComputePipelineCreateInfo get(int i){
            return new VkComputePipelineCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
