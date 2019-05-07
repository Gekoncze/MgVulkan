package cz.mg.vulkan;

public class VkSpecializationInfo extends VkObject {
    public VkSpecializationInfo() {
        super(sizeof());
    }

    protected VkSpecializationInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSpecializationInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSpecializationInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getMapEntryCount() {
        return new VkUInt32(getVkMemory(), getMapEntryCountNative(getVkAddress()));
    }

    
    public void setMapEntryCount(VkUInt32 mapEntryCount) {
        setMapEntryCountNative(getVkAddress(), mapEntryCount != null ? mapEntryCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMapEntryCountQ() {
        return getMapEntryCount().getValue();
    }

    public void setMapEntryCount(int mapEntryCount) {
        getMapEntryCount().setValue(mapEntryCount);
    }

    protected static native long getMapEntryCountNative(long address);
    protected static native void setMapEntryCountNative(long address, long mapEntryCount);

    public VkSpecializationMapEntry getPMapEntries() {
        return new VkSpecializationMapEntry(getVkMemory(), getPMapEntriesNative(getVkAddress()));
    }

    private VkObject pMapEntries = null;
    public void setPMapEntries(VkSpecializationMapEntry pMapEntries) {
        setPMapEntriesNative(getVkAddress(), pMapEntries != null ? pMapEntries.getVkAddress() : VkPointer.NULL);
        this.pMapEntries = pMapEntries;
    }

    public VkSpecializationMapEntry.Array getPMapEntriesQ() {
        return new VkSpecializationMapEntry.Array(getPMapEntries(), getMapEntryCountQ());
    }

    protected static native long getPMapEntriesNative(long address);
    protected static native void setPMapEntriesNative(long address, long pMapEntries);

    public VkSize getDataSize() {
        return new VkSize(getVkMemory(), getDataSizeNative(getVkAddress()));
    }

    
    public void setDataSize(VkSize dataSize) {
        setDataSizeNative(getVkAddress(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDataSizeQ() {
        return getDataSize().getValue();
    }

    public void setDataSize(long dataSize) {
        getDataSize().setValue(dataSize);
    }

    protected static native long getDataSizeNative(long address);
    protected static native void setDataSizeNative(long address, long dataSize);

    public VkObject getPData() {
        return new VkObject(getVkMemory(), getPDataNative(getVkAddress()));
    }

    private VkObject pData = null;
    public void setPData(VkObject pData) {
        setPDataNative(getVkAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
        this.pData = pData;
    }

    protected static native long getPDataNative(long address);
    protected static native void setPDataNative(long address, long pData);


    public void set(VkSpecializationInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSpecializationInfo implements cz.mg.collections.array.ReadonlyArray<VkSpecializationInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSpecializationInfo.sizeof()));
            this.count = count;
        }

        public Array(VkSpecializationInfo o, int count){
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
        public VkSpecializationInfo get(int i){
            return new VkSpecializationInfo(getVkMemory(), address(i));
        }

        protected long address(int i){
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
