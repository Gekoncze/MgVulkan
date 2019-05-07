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

    public VkBindImageMemoryDeviceGroupInfo(VkPointer pointer) {
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

    public VkUInt32 getDeviceIndexCount() {
        return new VkUInt32(getVkMemory(), getDeviceIndexCountNative(getVkAddress()));
    }

    
    public void setDeviceIndexCount(VkUInt32 deviceIndexCount) {
        setDeviceIndexCountNative(getVkAddress(), deviceIndexCount != null ? deviceIndexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceIndexCountQ() {
        return getDeviceIndexCount().getValue();
    }

    public void setDeviceIndexCount(int deviceIndexCount) {
        getDeviceIndexCount().setValue(deviceIndexCount);
    }

    protected static native long getDeviceIndexCountNative(long address);
    protected static native void setDeviceIndexCountNative(long address, long deviceIndexCount);

    public VkUInt32 getPDeviceIndices() {
        return new VkUInt32(getVkMemory(), getPDeviceIndicesNative(getVkAddress()));
    }

    private VkObject pDeviceIndices = null;
    public void setPDeviceIndices(VkUInt32 pDeviceIndices) {
        setPDeviceIndicesNative(getVkAddress(), pDeviceIndices != null ? pDeviceIndices.getVkAddress() : VkPointer.NULL);
        this.pDeviceIndices = pDeviceIndices;
    }

    public VkUInt32.Array getPDeviceIndicesQ() {
        return new VkUInt32.Array(getPDeviceIndices(), getDeviceIndexCountQ());
    }

    protected static native long getPDeviceIndicesNative(long address);
    protected static native void setPDeviceIndicesNative(long address, long pDeviceIndices);

    public VkUInt32 getSplitInstanceBindRegionCount() {
        return new VkUInt32(getVkMemory(), getSplitInstanceBindRegionCountNative(getVkAddress()));
    }

    
    public void setSplitInstanceBindRegionCount(VkUInt32 splitInstanceBindRegionCount) {
        setSplitInstanceBindRegionCountNative(getVkAddress(), splitInstanceBindRegionCount != null ? splitInstanceBindRegionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSplitInstanceBindRegionCountQ() {
        return getSplitInstanceBindRegionCount().getValue();
    }

    public void setSplitInstanceBindRegionCount(int splitInstanceBindRegionCount) {
        getSplitInstanceBindRegionCount().setValue(splitInstanceBindRegionCount);
    }

    protected static native long getSplitInstanceBindRegionCountNative(long address);
    protected static native void setSplitInstanceBindRegionCountNative(long address, long splitInstanceBindRegionCount);

    public VkRect2D getPSplitInstanceBindRegions() {
        return new VkRect2D(getVkMemory(), getPSplitInstanceBindRegionsNative(getVkAddress()));
    }

    private VkObject pSplitInstanceBindRegions = null;
    public void setPSplitInstanceBindRegions(VkRect2D pSplitInstanceBindRegions) {
        setPSplitInstanceBindRegionsNative(getVkAddress(), pSplitInstanceBindRegions != null ? pSplitInstanceBindRegions.getVkAddress() : VkPointer.NULL);
        this.pSplitInstanceBindRegions = pSplitInstanceBindRegions;
    }

    public VkRect2D.Array getPSplitInstanceBindRegionsQ() {
        return new VkRect2D.Array(getPSplitInstanceBindRegions(), getSplitInstanceBindRegionCountQ());
    }

    protected static native long getPSplitInstanceBindRegionsNative(long address);
    protected static native void setPSplitInstanceBindRegionsNative(long address, long pSplitInstanceBindRegions);


    public void set(VkBindImageMemoryDeviceGroupInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkBindImageMemoryDeviceGroupInfo implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemoryDeviceGroupInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindImageMemoryDeviceGroupInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO));;
        }

        public Array(VkBindImageMemoryDeviceGroupInfo o, int count){
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

}
