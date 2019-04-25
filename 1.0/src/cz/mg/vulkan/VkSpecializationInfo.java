package cz.mg.vulkan;

public class VkSpecializationInfo extends VkObject {
    public VkSpecializationInfo() {
        super(sizeof());
    }

    public VkSpecializationInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSpecializationInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getMapEntryCount() {
        return new VkUInt32(getVkMemory(), getMapEntryCount(getVkAddress()));
    }

    
    public void setMapEntryCount(VkUInt32 mapEntryCount) {
        setMapEntryCount(getVkAddress(), mapEntryCount != null ? mapEntryCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMapEntryCountQ() {
        return getMapEntryCount().getValue();
    }

    public void setMapEntryCount(int mapEntryCount) {
        getMapEntryCount().setValue(mapEntryCount);
    }

    protected static native long getMapEntryCount(long address);
    protected static native void setMapEntryCount(long address, long mapEntryCount);

    public VkSpecializationMapEntry getPMapEntries() {
        return new VkSpecializationMapEntry(getVkMemory(), getPMapEntries(getVkAddress()));
    }

    private VkObject pMapEntries = null;
    public void setPMapEntries(VkSpecializationMapEntry pMapEntries) {
        setPMapEntries(getVkAddress(), pMapEntries != null ? pMapEntries.getVkAddress() : VkPointer.NULL);
        this.pMapEntries = pMapEntries;
    }

    protected static native long getPMapEntries(long address);
    protected static native void setPMapEntries(long address, long pMapEntries);

    public VkSize getDataSize() {
        return new VkSize(getVkMemory(), getDataSize(getVkAddress()));
    }

    
    public void setDataSize(VkSize dataSize) {
        setDataSize(getVkAddress(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDataSizeQ() {
        return getDataSize().getValue();
    }

    public void setDataSize(long dataSize) {
        getDataSize().setValue(dataSize);
    }

    protected static native long getDataSize(long address);
    protected static native void setDataSize(long address, long dataSize);

    public VkObject getPData() {
        return new VkObject(getVkMemory(), getPData(getVkAddress()));
    }

    private VkObject pData = null;
    public void setPData(VkObject pData) {
        setPData(getVkAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
        this.pData = pData;
    }

    protected static native long getPData(long address);
    protected static native void setPData(long address, long pData);


    public static native long sizeof();

    public static class Array extends VkSpecializationInfo implements cz.mg.collections.array.ReadonlyArray<VkSpecializationInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSpecializationInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSpecializationInfo o){
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
        public VkSpecializationInfo get(int i){
            return new VkSpecializationInfo(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
