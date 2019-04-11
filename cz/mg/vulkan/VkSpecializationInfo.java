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


    public VkSpecializationInfo(VkUInt32 mapEntryCount, VkSpecializationMapEntry pMapEntries, VkSize dataSize, VkObject pData) {
        super(sizeof());
        setMapEntryCount(mapEntryCount);
        setPMapEntries(pMapEntries);
        setDataSize(dataSize);
        setPData(pData);
    }

    public VkUInt32 getMapEntryCount() {
        return new VkUInt32(getVkMemory(), getMapEntryCount(getVkAddress()));
    }

    
    public void setMapEntryCount(VkUInt32 mapEntryCount) {
        setMapEntryCount(getVkAddress(), mapEntryCount != null ? mapEntryCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getMapEntryCount(long address);
    private static native void setMapEntryCount(long address, long mapEntryCount);

    public VkSpecializationMapEntry getPMapEntries() {
        return new VkSpecializationMapEntry(getVkMemory(), getPMapEntries(getVkAddress()));
    }

    private VkObject pMapEntries = null;
    public void setPMapEntries(VkSpecializationMapEntry pMapEntries) {
        setPMapEntries(getVkAddress(), pMapEntries != null ? pMapEntries.getVkAddress() : VkPointer.NULL);
        this.pMapEntries = pMapEntries;
    }

    private static native long getPMapEntries(long address);
    private static native void setPMapEntries(long address, long pMapEntries);

    public VkSize getDataSize() {
        return new VkSize(getVkMemory(), getDataSize(getVkAddress()));
    }

    
    public void setDataSize(VkSize dataSize) {
        setDataSize(getVkAddress(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDataSize(long address);
    private static native void setDataSize(long address, long dataSize);

    public VkObject getPData() {
        return new VkObject(getVkMemory(), getPData(getVkAddress()));
    }

    private VkObject pData = null;
    public void setPData(VkObject pData) {
        setPData(getVkAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
        this.pData = pData;
    }

    private static native long getPData(long address);
    private static native void setPData(long address, long pData);


    public static native long sizeof();

    public static class Array extends VkSpecializationInfo implements cz.mg.collections.array.ReadonlyArray<VkSpecializationInfo> {        private final int count;

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
            return new VkSpecializationInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSpecializationInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSpecializationInfo.Pointer> {
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

            public Array(VkSpecializationInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSpecializationInfo.Pointer get(int i){
                return new VkSpecializationInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
