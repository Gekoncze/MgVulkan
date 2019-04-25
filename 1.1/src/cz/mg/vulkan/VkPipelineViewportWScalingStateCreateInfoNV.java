package cz.mg.vulkan;

public class VkPipelineViewportWScalingStateCreateInfoNV extends VkObject {
    public VkPipelineViewportWScalingStateCreateInfoNV() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV));
    }

    public VkPipelineViewportWScalingStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportWScalingStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineViewportWScalingStateCreateInfoNV(VkPointer pointer) {
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

    public VkBool32 getViewportWScalingEnable() {
        return new VkBool32(getVkMemory(), getViewportWScalingEnableNative(getVkAddress()));
    }

    
    public void setViewportWScalingEnable(VkBool32 viewportWScalingEnable) {
        setViewportWScalingEnableNative(getVkAddress(), viewportWScalingEnable != null ? viewportWScalingEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewportWScalingEnableQ() {
        return getViewportWScalingEnable().getValue();
    }

    public void setViewportWScalingEnable(int viewportWScalingEnable) {
        getViewportWScalingEnable().setValue(viewportWScalingEnable);
    }

    protected static native long getViewportWScalingEnableNative(long address);
    protected static native void setViewportWScalingEnableNative(long address, long viewportWScalingEnable);

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

    public VkViewportWScalingNV getPViewportWScalings() {
        return new VkViewportWScalingNV(getVkMemory(), getPViewportWScalingsNative(getVkAddress()));
    }

    private VkObject pViewportWScalings = null;
    public void setPViewportWScalings(VkViewportWScalingNV pViewportWScalings) {
        setPViewportWScalingsNative(getVkAddress(), pViewportWScalings != null ? pViewportWScalings.getVkAddress() : VkPointer.NULL);
        this.pViewportWScalings = pViewportWScalings;
    }

    protected static native long getPViewportWScalingsNative(long address);
    protected static native void setPViewportWScalingsNative(long address, long pViewportWScalings);


    public static native long sizeof();

    public static class Array extends VkPipelineViewportWScalingStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportWScalingStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportWScalingStateCreateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV));;
        }

        public Array(int count, VkPipelineViewportWScalingStateCreateInfoNV o){
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
        public VkPipelineViewportWScalingStateCreateInfoNV get(int i){
            return new VkPipelineViewportWScalingStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
