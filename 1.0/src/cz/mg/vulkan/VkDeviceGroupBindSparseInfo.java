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

    public VkUInt32 getResourceDeviceIndex() {
        return new VkUInt32(getVkMemory(), getResourceDeviceIndexNative(getVkAddress()));
    }

    
    public void setResourceDeviceIndex(VkUInt32 resourceDeviceIndex) {
        setResourceDeviceIndexNative(getVkAddress(), resourceDeviceIndex != null ? resourceDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getResourceDeviceIndexQ() {
        return getResourceDeviceIndex().getValue();
    }

    public void setResourceDeviceIndex(int resourceDeviceIndex) {
        getResourceDeviceIndex().setValue(resourceDeviceIndex);
    }

    protected static native long getResourceDeviceIndexNative(long address);
    protected static native void setResourceDeviceIndexNative(long address, long resourceDeviceIndex);

    public VkUInt32 getMemoryDeviceIndex() {
        return new VkUInt32(getVkMemory(), getMemoryDeviceIndexNative(getVkAddress()));
    }

    
    public void setMemoryDeviceIndex(VkUInt32 memoryDeviceIndex) {
        setMemoryDeviceIndexNative(getVkAddress(), memoryDeviceIndex != null ? memoryDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryDeviceIndexQ() {
        return getMemoryDeviceIndex().getValue();
    }

    public void setMemoryDeviceIndex(int memoryDeviceIndex) {
        getMemoryDeviceIndex().setValue(memoryDeviceIndex);
    }

    protected static native long getMemoryDeviceIndexNative(long address);
    protected static native void setMemoryDeviceIndexNative(long address, long memoryDeviceIndex);


    public void set(VkDeviceGroupBindSparseInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDeviceGroupBindSparseInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupBindSparseInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupBindSparseInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO));;
        }

        public Array(VkDeviceGroupBindSparseInfo o, int count){
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
