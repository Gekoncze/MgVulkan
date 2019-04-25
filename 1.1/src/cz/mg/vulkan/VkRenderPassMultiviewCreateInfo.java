package cz.mg.vulkan;

public class VkRenderPassMultiviewCreateInfo extends VkObject {
    public VkRenderPassMultiviewCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO));
    }

    public VkRenderPassMultiviewCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassMultiviewCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRenderPassMultiviewCreateInfo(VkPointer pointer) {
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

    public VkUInt32 getSubpassCount() {
        return new VkUInt32(getVkMemory(), getSubpassCountNative(getVkAddress()));
    }

    
    public void setSubpassCount(VkUInt32 subpassCount) {
        setSubpassCountNative(getVkAddress(), subpassCount != null ? subpassCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassCountQ() {
        return getSubpassCount().getValue();
    }

    public void setSubpassCount(int subpassCount) {
        getSubpassCount().setValue(subpassCount);
    }

    protected static native long getSubpassCountNative(long address);
    protected static native void setSubpassCountNative(long address, long subpassCount);

    public VkUInt32 getPViewMasks() {
        return new VkUInt32(getVkMemory(), getPViewMasksNative(getVkAddress()));
    }

    private VkObject pViewMasks = null;
    public void setPViewMasks(VkUInt32 pViewMasks) {
        setPViewMasksNative(getVkAddress(), pViewMasks != null ? pViewMasks.getVkAddress() : VkPointer.NULL);
        this.pViewMasks = pViewMasks;
    }

    protected static native long getPViewMasksNative(long address);
    protected static native void setPViewMasksNative(long address, long pViewMasks);

    public VkUInt32 getDependencyCount() {
        return new VkUInt32(getVkMemory(), getDependencyCountNative(getVkAddress()));
    }

    
    public void setDependencyCount(VkUInt32 dependencyCount) {
        setDependencyCountNative(getVkAddress(), dependencyCount != null ? dependencyCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDependencyCountQ() {
        return getDependencyCount().getValue();
    }

    public void setDependencyCount(int dependencyCount) {
        getDependencyCount().setValue(dependencyCount);
    }

    protected static native long getDependencyCountNative(long address);
    protected static native void setDependencyCountNative(long address, long dependencyCount);

    public VkInt32 getPViewOffsets() {
        return new VkInt32(getVkMemory(), getPViewOffsetsNative(getVkAddress()));
    }

    private VkObject pViewOffsets = null;
    public void setPViewOffsets(VkInt32 pViewOffsets) {
        setPViewOffsetsNative(getVkAddress(), pViewOffsets != null ? pViewOffsets.getVkAddress() : VkPointer.NULL);
        this.pViewOffsets = pViewOffsets;
    }

    protected static native long getPViewOffsetsNative(long address);
    protected static native void setPViewOffsetsNative(long address, long pViewOffsets);

    public VkUInt32 getCorrelationMaskCount() {
        return new VkUInt32(getVkMemory(), getCorrelationMaskCountNative(getVkAddress()));
    }

    
    public void setCorrelationMaskCount(VkUInt32 correlationMaskCount) {
        setCorrelationMaskCountNative(getVkAddress(), correlationMaskCount != null ? correlationMaskCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCorrelationMaskCountQ() {
        return getCorrelationMaskCount().getValue();
    }

    public void setCorrelationMaskCount(int correlationMaskCount) {
        getCorrelationMaskCount().setValue(correlationMaskCount);
    }

    protected static native long getCorrelationMaskCountNative(long address);
    protected static native void setCorrelationMaskCountNative(long address, long correlationMaskCount);

    public VkUInt32 getPCorrelationMasks() {
        return new VkUInt32(getVkMemory(), getPCorrelationMasksNative(getVkAddress()));
    }

    private VkObject pCorrelationMasks = null;
    public void setPCorrelationMasks(VkUInt32 pCorrelationMasks) {
        setPCorrelationMasksNative(getVkAddress(), pCorrelationMasks != null ? pCorrelationMasks.getVkAddress() : VkPointer.NULL);
        this.pCorrelationMasks = pCorrelationMasks;
    }

    protected static native long getPCorrelationMasksNative(long address);
    protected static native void setPCorrelationMasksNative(long address, long pCorrelationMasks);


    public static native long sizeof();

    public static class Array extends VkRenderPassMultiviewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassMultiviewCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassMultiviewCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO));;
        }

        public Array(int count, VkRenderPassMultiviewCreateInfo o){
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
        public VkRenderPassMultiviewCreateInfo get(int i){
            return new VkRenderPassMultiviewCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
