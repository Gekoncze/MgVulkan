package cz.mg.vulkan;

public class VkPipelineDepthStencilStateCreateInfo extends VkObject {
    public VkPipelineDepthStencilStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO));
    }

    public VkPipelineDepthStencilStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDepthStencilStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineDepthStencilStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineDepthStencilStateCreateFlags getFlags() {
        return new VkPipelineDepthStencilStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineDepthStencilStateCreateFlags flags) {
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

    public VkBool32 getDepthTestEnable() {
        return new VkBool32(getVkMemory(), getDepthTestEnableNative(getVkAddress()));
    }

    
    public void setDepthTestEnable(VkBool32 depthTestEnable) {
        setDepthTestEnableNative(getVkAddress(), depthTestEnable != null ? depthTestEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthTestEnableQ() {
        return getDepthTestEnable().getValue();
    }

    public void setDepthTestEnable(int depthTestEnable) {
        getDepthTestEnable().setValue(depthTestEnable);
    }

    protected static native long getDepthTestEnableNative(long address);
    protected static native void setDepthTestEnableNative(long address, long depthTestEnable);

    public VkBool32 getDepthWriteEnable() {
        return new VkBool32(getVkMemory(), getDepthWriteEnableNative(getVkAddress()));
    }

    
    public void setDepthWriteEnable(VkBool32 depthWriteEnable) {
        setDepthWriteEnableNative(getVkAddress(), depthWriteEnable != null ? depthWriteEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthWriteEnableQ() {
        return getDepthWriteEnable().getValue();
    }

    public void setDepthWriteEnable(int depthWriteEnable) {
        getDepthWriteEnable().setValue(depthWriteEnable);
    }

    protected static native long getDepthWriteEnableNative(long address);
    protected static native void setDepthWriteEnableNative(long address, long depthWriteEnable);

    public VkCompareOp getDepthCompareOp() {
        return new VkCompareOp(getVkMemory(), getDepthCompareOpNative(getVkAddress()));
    }

    
    public void setDepthCompareOp(VkCompareOp depthCompareOp) {
        setDepthCompareOpNative(getVkAddress(), depthCompareOp != null ? depthCompareOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthCompareOpQ() {
        return getDepthCompareOp().getValue();
    }

    public void setDepthCompareOp(int depthCompareOp) {
        getDepthCompareOp().setValue(depthCompareOp);
    }

    protected static native long getDepthCompareOpNative(long address);
    protected static native void setDepthCompareOpNative(long address, long depthCompareOp);

    public VkBool32 getDepthBoundsTestEnable() {
        return new VkBool32(getVkMemory(), getDepthBoundsTestEnableNative(getVkAddress()));
    }

    
    public void setDepthBoundsTestEnable(VkBool32 depthBoundsTestEnable) {
        setDepthBoundsTestEnableNative(getVkAddress(), depthBoundsTestEnable != null ? depthBoundsTestEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthBoundsTestEnableQ() {
        return getDepthBoundsTestEnable().getValue();
    }

    public void setDepthBoundsTestEnable(int depthBoundsTestEnable) {
        getDepthBoundsTestEnable().setValue(depthBoundsTestEnable);
    }

    protected static native long getDepthBoundsTestEnableNative(long address);
    protected static native void setDepthBoundsTestEnableNative(long address, long depthBoundsTestEnable);

    public VkBool32 getStencilTestEnable() {
        return new VkBool32(getVkMemory(), getStencilTestEnableNative(getVkAddress()));
    }

    
    public void setStencilTestEnable(VkBool32 stencilTestEnable) {
        setStencilTestEnableNative(getVkAddress(), stencilTestEnable != null ? stencilTestEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStencilTestEnableQ() {
        return getStencilTestEnable().getValue();
    }

    public void setStencilTestEnable(int stencilTestEnable) {
        getStencilTestEnable().setValue(stencilTestEnable);
    }

    protected static native long getStencilTestEnableNative(long address);
    protected static native void setStencilTestEnableNative(long address, long stencilTestEnable);

    public VkStencilOpState getFront() {
        return new VkStencilOpState(getVkMemory(), getFrontNative(getVkAddress()));
    }

    
    public void setFront(VkStencilOpState front) {
        setFrontNative(getVkAddress(), front != null ? front.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFrontNative(long address);
    protected static native void setFrontNative(long address, long front);

    public VkStencilOpState getBack() {
        return new VkStencilOpState(getVkMemory(), getBackNative(getVkAddress()));
    }

    
    public void setBack(VkStencilOpState back) {
        setBackNative(getVkAddress(), back != null ? back.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBackNative(long address);
    protected static native void setBackNative(long address, long back);

    public VkFloat getMinDepthBounds() {
        return new VkFloat(getVkMemory(), getMinDepthBoundsNative(getVkAddress()));
    }

    
    public void setMinDepthBounds(VkFloat minDepthBounds) {
        setMinDepthBoundsNative(getVkAddress(), minDepthBounds != null ? minDepthBounds.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinDepthBoundsQ() {
        return getMinDepthBounds().getValue();
    }

    public void setMinDepthBounds(float minDepthBounds) {
        getMinDepthBounds().setValue(minDepthBounds);
    }

    protected static native long getMinDepthBoundsNative(long address);
    protected static native void setMinDepthBoundsNative(long address, long minDepthBounds);

    public VkFloat getMaxDepthBounds() {
        return new VkFloat(getVkMemory(), getMaxDepthBoundsNative(getVkAddress()));
    }

    
    public void setMaxDepthBounds(VkFloat maxDepthBounds) {
        setMaxDepthBoundsNative(getVkAddress(), maxDepthBounds != null ? maxDepthBounds.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxDepthBoundsQ() {
        return getMaxDepthBounds().getValue();
    }

    public void setMaxDepthBounds(float maxDepthBounds) {
        getMaxDepthBounds().setValue(maxDepthBounds);
    }

    protected static native long getMaxDepthBoundsNative(long address);
    protected static native void setMaxDepthBoundsNative(long address, long maxDepthBounds);


    public void set(VkPipelineDepthStencilStateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineDepthStencilStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineDepthStencilStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineDepthStencilStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineDepthStencilStateCreateInfo o){
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
        public VkPipelineDepthStencilStateCreateInfo get(int i){
            return new VkPipelineDepthStencilStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
