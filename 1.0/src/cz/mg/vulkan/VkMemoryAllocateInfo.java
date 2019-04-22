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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkDeviceSize getAllocationSize() {
        return new VkDeviceSize(getVkMemory(), getAllocationSize(getVkAddress()));
    }

    
    public void setAllocationSize(VkDeviceSize allocationSize) {
        setAllocationSize(getVkAddress(), allocationSize != null ? allocationSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public long getAllocationSizeQ() {
        return getAllocationSize().getValue();
    }

    public void setAllocationSize(long allocationSize) {
        getAllocationSize().setValue(allocationSize);
    }

    private static native long getAllocationSize(long address);
    private static native void setAllocationSize(long address, long allocationSize);

    public VkUInt32 getMemoryTypeIndex() {
        return new VkUInt32(getVkMemory(), getMemoryTypeIndex(getVkAddress()));
    }

    
    public void setMemoryTypeIndex(VkUInt32 memoryTypeIndex) {
        setMemoryTypeIndex(getVkAddress(), memoryTypeIndex != null ? memoryTypeIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMemoryTypeIndexQ() {
        return getMemoryTypeIndex().getValue();
    }

    public void setMemoryTypeIndex(int memoryTypeIndex) {
        getMemoryTypeIndex().setValue(memoryTypeIndex);
    }

    private static native long getMemoryTypeIndex(long address);
    private static native void setMemoryTypeIndex(long address, long memoryTypeIndex);


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

        public static class Array extends VkMemoryAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateInfo.Pointer> {
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

            public Array(VkMemoryAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryAllocateInfo.Pointer get(int i){
                return new VkMemoryAllocateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
