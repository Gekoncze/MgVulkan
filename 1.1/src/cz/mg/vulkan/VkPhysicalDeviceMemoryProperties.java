package cz.mg.vulkan;

public class VkPhysicalDeviceMemoryProperties extends VkObject {
    public VkPhysicalDeviceMemoryProperties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMemoryProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getMemoryTypeCount() {
        return new VkUInt32(getVkMemory(), getMemoryTypeCountNative(getVkAddress()));
    }

    
    public void setMemoryTypeCount(VkUInt32 memoryTypeCount) {
        setMemoryTypeCountNative(getVkAddress(), memoryTypeCount != null ? memoryTypeCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryTypeCountQ() {
        return getMemoryTypeCount().getValue();
    }

    public void setMemoryTypeCount(int memoryTypeCount) {
        getMemoryTypeCount().setValue(memoryTypeCount);
    }

    protected static native long getMemoryTypeCountNative(long address);
    protected static native void setMemoryTypeCountNative(long address, long memoryTypeCount);

    public VkMemoryType getMemoryTypes() {
        return new VkMemoryType(getVkMemory(), getMemoryTypesNative(getVkAddress()));
    }

    
    public void setMemoryTypes(VkMemoryType memoryTypes) {
        setMemoryTypesNative(getVkAddress(), memoryTypes != null ? memoryTypes.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMemoryTypesNative(long address);
    protected static native void setMemoryTypesNative(long address, long memoryTypes);

    public VkUInt32 getMemoryHeapCount() {
        return new VkUInt32(getVkMemory(), getMemoryHeapCountNative(getVkAddress()));
    }

    
    public void setMemoryHeapCount(VkUInt32 memoryHeapCount) {
        setMemoryHeapCountNative(getVkAddress(), memoryHeapCount != null ? memoryHeapCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryHeapCountQ() {
        return getMemoryHeapCount().getValue();
    }

    public void setMemoryHeapCount(int memoryHeapCount) {
        getMemoryHeapCount().setValue(memoryHeapCount);
    }

    protected static native long getMemoryHeapCountNative(long address);
    protected static native void setMemoryHeapCountNative(long address, long memoryHeapCount);

    public VkMemoryHeap getMemoryHeaps() {
        return new VkMemoryHeap(getVkMemory(), getMemoryHeapsNative(getVkAddress()));
    }

    
    public void setMemoryHeaps(VkMemoryHeap memoryHeaps) {
        setMemoryHeapsNative(getVkAddress(), memoryHeaps != null ? memoryHeaps.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMemoryHeapsNative(long address);
    protected static native void setMemoryHeapsNative(long address, long memoryHeaps);


    public void set(VkPhysicalDeviceMemoryProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMemoryProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMemoryProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceMemoryProperties o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceMemoryProperties get(int i){
            return new VkPhysicalDeviceMemoryProperties(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
