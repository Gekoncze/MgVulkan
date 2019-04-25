package cz.mg.vulkan;

public class VkMemoryAllocateInfo extends VkObject {
    public VkMemoryAllocateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO));
    }

    public VkMemoryAllocateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryAllocateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryAllocateInfo(VkPointer pointer) {
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

    public VkDeviceSize getAllocationSize() {
        return new VkDeviceSize(getVkMemory(), getAllocationSize(getVkAddress()));
    }

    
    public void setAllocationSize(VkDeviceSize allocationSize) {
        setAllocationSize(getVkAddress(), allocationSize != null ? allocationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getAllocationSizeQ() {
        return getAllocationSize().getValue();
    }

    public void setAllocationSize(long allocationSize) {
        getAllocationSize().setValue(allocationSize);
    }

    protected static native long getAllocationSize(long address);
    protected static native void setAllocationSize(long address, long allocationSize);

    public VkUInt32 getMemoryTypeIndex() {
        return new VkUInt32(getVkMemory(), getMemoryTypeIndex(getVkAddress()));
    }

    
    public void setMemoryTypeIndex(VkUInt32 memoryTypeIndex) {
        setMemoryTypeIndex(getVkAddress(), memoryTypeIndex != null ? memoryTypeIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryTypeIndexQ() {
        return getMemoryTypeIndex().getValue();
    }

    public void setMemoryTypeIndex(int memoryTypeIndex) {
        getMemoryTypeIndex().setValue(memoryTypeIndex);
    }

    protected static native long getMemoryTypeIndex(long address);
    protected static native void setMemoryTypeIndex(long address, long memoryTypeIndex);


    public static native long sizeof();

    public static class Array extends VkMemoryAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryAllocateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO));;
        }

        public Array(int count, VkMemoryAllocateInfo o){
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
        public VkMemoryAllocateInfo get(int i){
            return new VkMemoryAllocateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
