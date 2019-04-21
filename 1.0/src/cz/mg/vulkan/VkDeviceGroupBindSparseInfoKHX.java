package cz.mg.vulkan;

public class VkDeviceGroupBindSparseInfoKHX extends VkObject {
    public VkDeviceGroupBindSparseInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX));
    }

    public VkDeviceGroupBindSparseInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupBindSparseInfoKHX(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getResourceDeviceIndex() {
        return new VkUInt32(getVkMemory(), getResourceDeviceIndex(getVkAddress()));
    }

    
    public void setResourceDeviceIndex(VkUInt32 resourceDeviceIndex) {
        setResourceDeviceIndex(getVkAddress(), resourceDeviceIndex != null ? resourceDeviceIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getResourceDeviceIndexQ() {
        return getResourceDeviceIndex().getValue();
    }

    public void setResourceDeviceIndex(int resourceDeviceIndex) {
        getResourceDeviceIndex().setValue(resourceDeviceIndex);
    }

    private static native long getResourceDeviceIndex(long address);
    private static native void setResourceDeviceIndex(long address, long resourceDeviceIndex);

    public VkUInt32 getMemoryDeviceIndex() {
        return new VkUInt32(getVkMemory(), getMemoryDeviceIndex(getVkAddress()));
    }

    
    public void setMemoryDeviceIndex(VkUInt32 memoryDeviceIndex) {
        setMemoryDeviceIndex(getVkAddress(), memoryDeviceIndex != null ? memoryDeviceIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMemoryDeviceIndexQ() {
        return getMemoryDeviceIndex().getValue();
    }

    public void setMemoryDeviceIndex(int memoryDeviceIndex) {
        getMemoryDeviceIndex().setValue(memoryDeviceIndex);
    }

    private static native long getMemoryDeviceIndex(long address);
    private static native void setMemoryDeviceIndex(long address, long memoryDeviceIndex);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupBindSparseInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupBindSparseInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupBindSparseInfoKHX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGroupBindSparseInfoKHX o){
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
        public VkDeviceGroupBindSparseInfoKHX get(int i){
            return new VkDeviceGroupBindSparseInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupBindSparseInfoKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupBindSparseInfoKHX.Pointer> {
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

            public Array(VkDeviceGroupBindSparseInfoKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupBindSparseInfoKHX.Pointer get(int i){
                return new VkDeviceGroupBindSparseInfoKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
