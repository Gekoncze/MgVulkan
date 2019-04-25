package cz.mg.vulkan;

public class VkBindImageMemoryDeviceGroupInfo extends VkObject {
    public VkBindImageMemoryDeviceGroupInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO));
    }

    public VkBindImageMemoryDeviceGroupInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindImageMemoryDeviceGroupInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getDeviceIndexCount() {
        return new VkUInt32(getVkMemory(), getDeviceIndexCount(getVkAddress()));
    }

    
    public void setDeviceIndexCount(VkUInt32 deviceIndexCount) {
        setDeviceIndexCount(getVkAddress(), deviceIndexCount != null ? deviceIndexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceIndexCountQ() {
        return getDeviceIndexCount().getValue();
    }

    public void setDeviceIndexCount(int deviceIndexCount) {
        getDeviceIndexCount().setValue(deviceIndexCount);
    }

    protected static native long getDeviceIndexCount(long address);
    protected static native void setDeviceIndexCount(long address, long deviceIndexCount);

    public VkUInt32 getPDeviceIndices() {
        return new VkUInt32(getVkMemory(), getPDeviceIndices(getVkAddress()));
    }

    private VkObject pDeviceIndices = null;
    public void setPDeviceIndices(VkUInt32 pDeviceIndices) {
        setPDeviceIndices(getVkAddress(), pDeviceIndices != null ? pDeviceIndices.getVkAddress() : VkPointer.NULL);
        this.pDeviceIndices = pDeviceIndices;
    }

    protected static native long getPDeviceIndices(long address);
    protected static native void setPDeviceIndices(long address, long pDeviceIndices);

    public VkUInt32 getSplitInstanceBindRegionCount() {
        return new VkUInt32(getVkMemory(), getSplitInstanceBindRegionCount(getVkAddress()));
    }

    
    public void setSplitInstanceBindRegionCount(VkUInt32 splitInstanceBindRegionCount) {
        setSplitInstanceBindRegionCount(getVkAddress(), splitInstanceBindRegionCount != null ? splitInstanceBindRegionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSplitInstanceBindRegionCountQ() {
        return getSplitInstanceBindRegionCount().getValue();
    }

    public void setSplitInstanceBindRegionCount(int splitInstanceBindRegionCount) {
        getSplitInstanceBindRegionCount().setValue(splitInstanceBindRegionCount);
    }

    protected static native long getSplitInstanceBindRegionCount(long address);
    protected static native void setSplitInstanceBindRegionCount(long address, long splitInstanceBindRegionCount);

    public VkRect2D getPSplitInstanceBindRegions() {
        return new VkRect2D(getVkMemory(), getPSplitInstanceBindRegions(getVkAddress()));
    }

    private VkObject pSplitInstanceBindRegions = null;
    public void setPSplitInstanceBindRegions(VkRect2D pSplitInstanceBindRegions) {
        setPSplitInstanceBindRegions(getVkAddress(), pSplitInstanceBindRegions != null ? pSplitInstanceBindRegions.getVkAddress() : VkPointer.NULL);
        this.pSplitInstanceBindRegions = pSplitInstanceBindRegions;
    }

    protected static native long getPSplitInstanceBindRegions(long address);
    protected static native void setPSplitInstanceBindRegions(long address, long pSplitInstanceBindRegions);


    public static native long sizeof();

    public static class Array extends VkBindImageMemoryDeviceGroupInfo implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemoryDeviceGroupInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindImageMemoryDeviceGroupInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO));;
        }

        public Array(int count, VkBindImageMemoryDeviceGroupInfo o){
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
        public VkBindImageMemoryDeviceGroupInfo get(int i){
            return new VkBindImageMemoryDeviceGroupInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBindImageMemoryDeviceGroupInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemoryDeviceGroupInfo.Pointer> {
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

            public Array(VkBindImageMemoryDeviceGroupInfo[] a) {
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
            public VkBindImageMemoryDeviceGroupInfo.Pointer get(int i){
                return new VkBindImageMemoryDeviceGroupInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
