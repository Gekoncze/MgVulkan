package cz.mg.vulkan;

public class VkPipelineViewportSwizzleStateCreateInfoNV extends VkObject {
    public VkPipelineViewportSwizzleStateCreateInfoNV() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV));
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineViewportSwizzleStateCreateInfoNV(VkPointer pointer) {
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

    public VkPipelineViewportSwizzleStateCreateFlagsNV getFlags() {
        return new VkPipelineViewportSwizzleStateCreateFlagsNV(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineViewportSwizzleStateCreateFlagsNV flags) {
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

    public VkViewportSwizzleNV getPViewportSwizzles() {
        return new VkViewportSwizzleNV(getVkMemory(), getPViewportSwizzlesNative(getVkAddress()));
    }

    private VkObject pViewportSwizzles = null;
    public void setPViewportSwizzles(VkViewportSwizzleNV pViewportSwizzles) {
        setPViewportSwizzlesNative(getVkAddress(), pViewportSwizzles != null ? pViewportSwizzles.getVkAddress() : VkPointer.NULL);
        this.pViewportSwizzles = pViewportSwizzles;
    }

    public VkViewportSwizzleNV.Array getPViewportSwizzlesQ() {
        return new VkViewportSwizzleNV.Array(getPViewportSwizzles(), getViewportCountQ());
    }

    protected static native long getPViewportSwizzlesNative(long address);
    protected static native void setPViewportSwizzlesNative(long address, long pViewportSwizzles);


    public void set(VkPipelineViewportSwizzleStateCreateInfoNV o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineViewportSwizzleStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportSwizzleStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportSwizzleStateCreateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV));;
        }

        public Array(VkPipelineViewportSwizzleStateCreateInfoNV o, int count){
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
        public VkPipelineViewportSwizzleStateCreateInfoNV get(int i){
            return new VkPipelineViewportSwizzleStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
