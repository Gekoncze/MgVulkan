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

    public VkUInt32 getSubpassCount() {
        return new VkUInt32(getVkMemory(), getSubpassCount(getVkAddress()));
    }

    
    public void setSubpassCount(VkUInt32 subpassCount) {
        setSubpassCount(getVkAddress(), subpassCount != null ? subpassCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassCountQ() {
        return getSubpassCount().getValue();
    }

    public void setSubpassCount(int subpassCount) {
        getSubpassCount().setValue(subpassCount);
    }

    protected static native long getSubpassCount(long address);
    protected static native void setSubpassCount(long address, long subpassCount);

    public VkUInt32 getPViewMasks() {
        return new VkUInt32(getVkMemory(), getPViewMasks(getVkAddress()));
    }

    private VkObject pViewMasks = null;
    public void setPViewMasks(VkUInt32 pViewMasks) {
        setPViewMasks(getVkAddress(), pViewMasks != null ? pViewMasks.getVkAddress() : VkPointer.NULL);
        this.pViewMasks = pViewMasks;
    }

    protected static native long getPViewMasks(long address);
    protected static native void setPViewMasks(long address, long pViewMasks);

    public VkUInt32 getDependencyCount() {
        return new VkUInt32(getVkMemory(), getDependencyCount(getVkAddress()));
    }

    
    public void setDependencyCount(VkUInt32 dependencyCount) {
        setDependencyCount(getVkAddress(), dependencyCount != null ? dependencyCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDependencyCountQ() {
        return getDependencyCount().getValue();
    }

    public void setDependencyCount(int dependencyCount) {
        getDependencyCount().setValue(dependencyCount);
    }

    protected static native long getDependencyCount(long address);
    protected static native void setDependencyCount(long address, long dependencyCount);

    public VkInt32 getPViewOffsets() {
        return new VkInt32(getVkMemory(), getPViewOffsets(getVkAddress()));
    }

    private VkObject pViewOffsets = null;
    public void setPViewOffsets(VkInt32 pViewOffsets) {
        setPViewOffsets(getVkAddress(), pViewOffsets != null ? pViewOffsets.getVkAddress() : VkPointer.NULL);
        this.pViewOffsets = pViewOffsets;
    }

    protected static native long getPViewOffsets(long address);
    protected static native void setPViewOffsets(long address, long pViewOffsets);

    public VkUInt32 getCorrelationMaskCount() {
        return new VkUInt32(getVkMemory(), getCorrelationMaskCount(getVkAddress()));
    }

    
    public void setCorrelationMaskCount(VkUInt32 correlationMaskCount) {
        setCorrelationMaskCount(getVkAddress(), correlationMaskCount != null ? correlationMaskCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCorrelationMaskCountQ() {
        return getCorrelationMaskCount().getValue();
    }

    public void setCorrelationMaskCount(int correlationMaskCount) {
        getCorrelationMaskCount().setValue(correlationMaskCount);
    }

    protected static native long getCorrelationMaskCount(long address);
    protected static native void setCorrelationMaskCount(long address, long correlationMaskCount);

    public VkUInt32 getPCorrelationMasks() {
        return new VkUInt32(getVkMemory(), getPCorrelationMasks(getVkAddress()));
    }

    private VkObject pCorrelationMasks = null;
    public void setPCorrelationMasks(VkUInt32 pCorrelationMasks) {
        setPCorrelationMasks(getVkAddress(), pCorrelationMasks != null ? pCorrelationMasks.getVkAddress() : VkPointer.NULL);
        this.pCorrelationMasks = pCorrelationMasks;
    }

    protected static native long getPCorrelationMasks(long address);
    protected static native void setPCorrelationMasks(long address, long pCorrelationMasks);


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


    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkRenderPassMultiviewCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRenderPassMultiviewCreateInfo.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkRenderPassMultiviewCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassMultiviewCreateInfo.Pointer get(int i){
                return new VkRenderPassMultiviewCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
