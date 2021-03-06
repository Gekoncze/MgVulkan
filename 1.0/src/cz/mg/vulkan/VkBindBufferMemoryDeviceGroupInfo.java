package cz.mg.vulkan;

public class VkBindBufferMemoryDeviceGroupInfo extends VkObject {
    public VkBindBufferMemoryDeviceGroupInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO));
    }

    public VkBindBufferMemoryDeviceGroupInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindBufferMemoryDeviceGroupInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBindBufferMemoryDeviceGroupInfo(VkPointer pointer) {
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


    public void set(VkBindBufferMemoryDeviceGroupInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkBindBufferMemoryDeviceGroupInfo implements cz.mg.collections.array.ReadonlyArray<VkBindBufferMemoryDeviceGroupInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindBufferMemoryDeviceGroupInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO));;
        }

        public Array(VkBindBufferMemoryDeviceGroupInfo o, int count){
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
        public VkBindBufferMemoryDeviceGroupInfo get(int i){
            return new VkBindBufferMemoryDeviceGroupInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
