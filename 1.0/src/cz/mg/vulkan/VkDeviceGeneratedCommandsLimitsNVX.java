package cz.mg.vulkan;

public class VkDeviceGeneratedCommandsLimitsNVX extends VkObject {
    public VkDeviceGeneratedCommandsLimitsNVX() {
        super(sizeof());
    }

    protected VkDeviceGeneratedCommandsLimitsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceGeneratedCommandsLimitsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGeneratedCommandsLimitsNVX(VkPointer pointer) {
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

    public VkUInt32 getMaxIndirectCommandsLayoutTokenCount() {
        return new VkUInt32(getVkMemory(), getMaxIndirectCommandsLayoutTokenCount(getVkAddress()));
    }

    
    public void setMaxIndirectCommandsLayoutTokenCount(VkUInt32 maxIndirectCommandsLayoutTokenCount) {
        setMaxIndirectCommandsLayoutTokenCount(getVkAddress(), maxIndirectCommandsLayoutTokenCount != null ? maxIndirectCommandsLayoutTokenCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxIndirectCommandsLayoutTokenCountQ() {
        return getMaxIndirectCommandsLayoutTokenCount().getValue();
    }

    public void setMaxIndirectCommandsLayoutTokenCount(int maxIndirectCommandsLayoutTokenCount) {
        getMaxIndirectCommandsLayoutTokenCount().setValue(maxIndirectCommandsLayoutTokenCount);
    }

    protected static native long getMaxIndirectCommandsLayoutTokenCount(long address);
    protected static native void setMaxIndirectCommandsLayoutTokenCount(long address, long maxIndirectCommandsLayoutTokenCount);

    public VkUInt32 getMaxObjectEntryCounts() {
        return new VkUInt32(getVkMemory(), getMaxObjectEntryCounts(getVkAddress()));
    }

    
    public void setMaxObjectEntryCounts(VkUInt32 maxObjectEntryCounts) {
        setMaxObjectEntryCounts(getVkAddress(), maxObjectEntryCounts != null ? maxObjectEntryCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxObjectEntryCountsQ() {
        return getMaxObjectEntryCounts().getValue();
    }

    public void setMaxObjectEntryCounts(int maxObjectEntryCounts) {
        getMaxObjectEntryCounts().setValue(maxObjectEntryCounts);
    }

    protected static native long getMaxObjectEntryCounts(long address);
    protected static native void setMaxObjectEntryCounts(long address, long maxObjectEntryCounts);

    public VkUInt32 getMinSequenceCountBufferOffsetAlignment() {
        return new VkUInt32(getVkMemory(), getMinSequenceCountBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinSequenceCountBufferOffsetAlignment(VkUInt32 minSequenceCountBufferOffsetAlignment) {
        setMinSequenceCountBufferOffsetAlignment(getVkAddress(), minSequenceCountBufferOffsetAlignment != null ? minSequenceCountBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinSequenceCountBufferOffsetAlignmentQ() {
        return getMinSequenceCountBufferOffsetAlignment().getValue();
    }

    public void setMinSequenceCountBufferOffsetAlignment(int minSequenceCountBufferOffsetAlignment) {
        getMinSequenceCountBufferOffsetAlignment().setValue(minSequenceCountBufferOffsetAlignment);
    }

    protected static native long getMinSequenceCountBufferOffsetAlignment(long address);
    protected static native void setMinSequenceCountBufferOffsetAlignment(long address, long minSequenceCountBufferOffsetAlignment);

    public VkUInt32 getMinSequenceIndexBufferOffsetAlignment() {
        return new VkUInt32(getVkMemory(), getMinSequenceIndexBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinSequenceIndexBufferOffsetAlignment(VkUInt32 minSequenceIndexBufferOffsetAlignment) {
        setMinSequenceIndexBufferOffsetAlignment(getVkAddress(), minSequenceIndexBufferOffsetAlignment != null ? minSequenceIndexBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinSequenceIndexBufferOffsetAlignmentQ() {
        return getMinSequenceIndexBufferOffsetAlignment().getValue();
    }

    public void setMinSequenceIndexBufferOffsetAlignment(int minSequenceIndexBufferOffsetAlignment) {
        getMinSequenceIndexBufferOffsetAlignment().setValue(minSequenceIndexBufferOffsetAlignment);
    }

    protected static native long getMinSequenceIndexBufferOffsetAlignment(long address);
    protected static native void setMinSequenceIndexBufferOffsetAlignment(long address, long minSequenceIndexBufferOffsetAlignment);

    public VkUInt32 getMinCommandsTokenBufferOffsetAlignment() {
        return new VkUInt32(getVkMemory(), getMinCommandsTokenBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinCommandsTokenBufferOffsetAlignment(VkUInt32 minCommandsTokenBufferOffsetAlignment) {
        setMinCommandsTokenBufferOffsetAlignment(getVkAddress(), minCommandsTokenBufferOffsetAlignment != null ? minCommandsTokenBufferOffsetAlignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinCommandsTokenBufferOffsetAlignmentQ() {
        return getMinCommandsTokenBufferOffsetAlignment().getValue();
    }

    public void setMinCommandsTokenBufferOffsetAlignment(int minCommandsTokenBufferOffsetAlignment) {
        getMinCommandsTokenBufferOffsetAlignment().setValue(minCommandsTokenBufferOffsetAlignment);
    }

    protected static native long getMinCommandsTokenBufferOffsetAlignment(long address);
    protected static native void setMinCommandsTokenBufferOffsetAlignment(long address, long minCommandsTokenBufferOffsetAlignment);


    public static native long sizeof();

    public static class Array extends VkDeviceGeneratedCommandsLimitsNVX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGeneratedCommandsLimitsNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGeneratedCommandsLimitsNVX.sizeof()));
            this.count = count;
        }

        public Array(VkDeviceGeneratedCommandsLimitsNVX o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDeviceGeneratedCommandsLimitsNVX get(int i){
            return new VkDeviceGeneratedCommandsLimitsNVX(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
