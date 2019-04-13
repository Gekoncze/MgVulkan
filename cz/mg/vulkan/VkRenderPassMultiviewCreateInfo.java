package cz.mg.vulkan;

public class VkRenderPassMultiviewCreateInfo extends VkObject {
    public VkRenderPassMultiviewCreateInfo() {
        super(sizeof());
    }

    public VkRenderPassMultiviewCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassMultiviewCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkRenderPassMultiviewCreateInfo(VkObject pNext, VkUInt32 subpassCount, VkUInt32 pViewMasks, VkUInt32 dependencyCount, VkInt32 pViewOffsets, VkUInt32 correlationMaskCount, VkUInt32 pCorrelationMasks) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO));
        setPNext(pNext);
        setSubpassCount(subpassCount);
        setPViewMasks(pViewMasks);
        setDependencyCount(dependencyCount);
        setPViewOffsets(pViewOffsets);
        setCorrelationMaskCount(correlationMaskCount);
        setPCorrelationMasks(pCorrelationMasks);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getSubpassCount() {
        return new VkUInt32(getVkMemory(), getSubpassCount(getVkAddress()));
    }

    
    public void setSubpassCount(VkUInt32 subpassCount) {
        setSubpassCount(getVkAddress(), subpassCount != null ? subpassCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSubpassCount(long address);
    private static native void setSubpassCount(long address, long subpassCount);

    public VkUInt32 getPViewMasks() {
        return new VkUInt32(getVkMemory(), getPViewMasks(getVkAddress()));
    }

    private VkObject pViewMasks = null;
    public void setPViewMasks(VkUInt32 pViewMasks) {
        setPViewMasks(getVkAddress(), pViewMasks != null ? pViewMasks.getVkAddress() : VkPointer.NULL);
        this.pViewMasks = pViewMasks;
    }

    private static native long getPViewMasks(long address);
    private static native void setPViewMasks(long address, long pViewMasks);

    public VkUInt32 getDependencyCount() {
        return new VkUInt32(getVkMemory(), getDependencyCount(getVkAddress()));
    }

    
    public void setDependencyCount(VkUInt32 dependencyCount) {
        setDependencyCount(getVkAddress(), dependencyCount != null ? dependencyCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDependencyCount(long address);
    private static native void setDependencyCount(long address, long dependencyCount);

    public VkInt32 getPViewOffsets() {
        return new VkInt32(getVkMemory(), getPViewOffsets(getVkAddress()));
    }

    private VkObject pViewOffsets = null;
    public void setPViewOffsets(VkInt32 pViewOffsets) {
        setPViewOffsets(getVkAddress(), pViewOffsets != null ? pViewOffsets.getVkAddress() : VkPointer.NULL);
        this.pViewOffsets = pViewOffsets;
    }

    private static native long getPViewOffsets(long address);
    private static native void setPViewOffsets(long address, long pViewOffsets);

    public VkUInt32 getCorrelationMaskCount() {
        return new VkUInt32(getVkMemory(), getCorrelationMaskCount(getVkAddress()));
    }

    
    public void setCorrelationMaskCount(VkUInt32 correlationMaskCount) {
        setCorrelationMaskCount(getVkAddress(), correlationMaskCount != null ? correlationMaskCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCorrelationMaskCount(long address);
    private static native void setCorrelationMaskCount(long address, long correlationMaskCount);

    public VkUInt32 getPCorrelationMasks() {
        return new VkUInt32(getVkMemory(), getPCorrelationMasks(getVkAddress()));
    }

    private VkObject pCorrelationMasks = null;
    public void setPCorrelationMasks(VkUInt32 pCorrelationMasks) {
        setPCorrelationMasks(getVkAddress(), pCorrelationMasks != null ? pCorrelationMasks.getVkAddress() : VkPointer.NULL);
        this.pCorrelationMasks = pCorrelationMasks;
    }

    private static native long getPCorrelationMasks(long address);
    private static native void setPCorrelationMasks(long address, long pCorrelationMasks);


    public static native long sizeof();

    public static class Array extends VkRenderPassMultiviewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassMultiviewCreateInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassMultiviewCreateInfo.sizeof()));
            this.count = count;
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


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassMultiviewCreateInfo.Pointer get(int i){
                return new VkRenderPassMultiviewCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
