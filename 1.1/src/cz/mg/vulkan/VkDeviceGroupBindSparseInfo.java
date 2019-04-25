package cz.mg.vulkan;

public class VkDeviceGroupBindSparseInfo extends VkObject {
    public VkDeviceGroupBindSparseInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO));
    }

    public VkDeviceGroupBindSparseInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupBindSparseInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupBindSparseInfo(VkPointer pointer) {
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

    public VkUInt32 getResourceDeviceIndex() {
        return new VkUInt32(getVkMemory(), getResourceDeviceIndex(getVkAddress()));
    }

    
    public void setResourceDeviceIndex(VkUInt32 resourceDeviceIndex) {
        setResourceDeviceIndex(getVkAddress(), resourceDeviceIndex != null ? resourceDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getResourceDeviceIndexQ() {
        return getResourceDeviceIndex().getValue();
    }

    public void setResourceDeviceIndex(int resourceDeviceIndex) {
        getResourceDeviceIndex().setValue(resourceDeviceIndex);
    }

    protected static native long getResourceDeviceIndex(long address);
    protected static native void setResourceDeviceIndex(long address, long resourceDeviceIndex);

    public VkUInt32 getMemoryDeviceIndex() {
        return new VkUInt32(getVkMemory(), getMemoryDeviceIndex(getVkAddress()));
    }

    
    public void setMemoryDeviceIndex(VkUInt32 memoryDeviceIndex) {
        setMemoryDeviceIndex(getVkAddress(), memoryDeviceIndex != null ? memoryDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryDeviceIndexQ() {
        return getMemoryDeviceIndex().getValue();
    }

    public void setMemoryDeviceIndex(int memoryDeviceIndex) {
        getMemoryDeviceIndex().setValue(memoryDeviceIndex);
    }

    protected static native long getMemoryDeviceIndex(long address);
    protected static native void setMemoryDeviceIndex(long address, long memoryDeviceIndex);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupBindSparseInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupBindSparseInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupBindSparseInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO));;
        }

        public Array(int count, VkDeviceGroupBindSparseInfo o){
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
        public VkDeviceGroupBindSparseInfo get(int i){
            return new VkDeviceGroupBindSparseInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
