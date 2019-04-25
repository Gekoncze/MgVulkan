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

    public VkBool32 getViewportWScalingEnable() {
        return new VkBool32(getVkMemory(), getViewportWScalingEnable(getVkAddress()));
    }

    
    public void setViewportWScalingEnable(VkBool32 viewportWScalingEnable) {
        setViewportWScalingEnable(getVkAddress(), viewportWScalingEnable != null ? viewportWScalingEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewportWScalingEnableQ() {
        return getViewportWScalingEnable().getValue();
    }

    public void setViewportWScalingEnable(int viewportWScalingEnable) {
        getViewportWScalingEnable().setValue(viewportWScalingEnable);
    }

    protected static native long getViewportWScalingEnable(long address);
    protected static native void setViewportWScalingEnable(long address, long viewportWScalingEnable);

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

    public VkViewportWScalingNV getPViewportWScalings() {
        return new VkViewportWScalingNV(getVkMemory(), getPViewportWScalings(getVkAddress()));
    }

    private VkObject pViewportWScalings = null;
    public void setPViewportWScalings(VkViewportWScalingNV pViewportWScalings) {
        setPViewportWScalings(getVkAddress(), pViewportWScalings != null ? pViewportWScalings.getVkAddress() : VkPointer.NULL);
        this.pViewportWScalings = pViewportWScalings;
    }

    protected static native long getPViewportWScalings(long address);
    protected static native void setPViewportWScalings(long address, long pViewportWScalings);


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
