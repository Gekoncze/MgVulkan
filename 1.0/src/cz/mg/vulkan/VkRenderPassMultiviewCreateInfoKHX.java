package cz.mg.vulkan;

public class VkRenderPassMultiviewCreateInfoKHX extends VkObject {
    public VkRenderPassMultiviewCreateInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX));
    }

    public VkRenderPassMultiviewCreateInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassMultiviewCreateInfoKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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
        setSubpassCount(getVkAddress(), subpassCount != null ? subpassCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSubpassCountQ() {
        return getSubpassCount().getValue();
    }

    public void setSubpassCount(int subpassCount) {
        getSubpassCount().setValue(subpassCount);
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
        setDependencyCount(getVkAddress(), dependencyCount != null ? dependencyCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDependencyCountQ() {
        return getDependencyCount().getValue();
    }

    public void setDependencyCount(int dependencyCount) {
        getDependencyCount().setValue(dependencyCount);
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
        setCorrelationMaskCount(getVkAddress(), correlationMaskCount != null ? correlationMaskCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getCorrelationMaskCountQ() {
        return getCorrelationMaskCount().getValue();
    }

    public void setCorrelationMaskCount(int correlationMaskCount) {
        getCorrelationMaskCount().setValue(correlationMaskCount);
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

    public static class Array extends VkRenderPassMultiviewCreateInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkRenderPassMultiviewCreateInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassMultiviewCreateInfoKHX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX));;
        }

        public Array(int count, VkRenderPassMultiviewCreateInfoKHX o){
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
        public VkRenderPassMultiviewCreateInfoKHX get(int i){
            return new VkRenderPassMultiviewCreateInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkRenderPassMultiviewCreateInfoKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRenderPassMultiviewCreateInfoKHX.Pointer> {
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

            public Array(VkRenderPassMultiviewCreateInfoKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassMultiviewCreateInfoKHX.Pointer get(int i){
                return new VkRenderPassMultiviewCreateInfoKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
