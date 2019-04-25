package cz.mg.vulkan;

public class VkPhysicalDeviceMemoryProperties extends VkObject {
    public VkPhysicalDeviceMemoryProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getMemoryTypeCount() {
        return new VkUInt32(getVkMemory(), getMemoryTypeCount(getVkAddress()));
    }

    
    public void setMemoryTypeCount(VkUInt32 memoryTypeCount) {
        setMemoryTypeCount(getVkAddress(), memoryTypeCount != null ? memoryTypeCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryTypeCountQ() {
        return getMemoryTypeCount().getValue();
    }

    public void setMemoryTypeCount(int memoryTypeCount) {
        getMemoryTypeCount().setValue(memoryTypeCount);
    }

    protected static native long getMemoryTypeCount(long address);
    protected static native void setMemoryTypeCount(long address, long memoryTypeCount);

    public VkMemoryType getMemoryTypes() {
        return new VkMemoryType(getVkMemory(), getMemoryTypes(getVkAddress()));
    }

    
    public void setMemoryTypes(VkMemoryType memoryTypes) {
        setMemoryTypes(getVkAddress(), memoryTypes != null ? memoryTypes.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMemoryTypes(long address);
    protected static native void setMemoryTypes(long address, long memoryTypes);

    public VkUInt32 getMemoryHeapCount() {
        return new VkUInt32(getVkMemory(), getMemoryHeapCount(getVkAddress()));
    }

    
    public void setMemoryHeapCount(VkUInt32 memoryHeapCount) {
        setMemoryHeapCount(getVkAddress(), memoryHeapCount != null ? memoryHeapCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryHeapCountQ() {
        return getMemoryHeapCount().getValue();
    }

    public void setMemoryHeapCount(int memoryHeapCount) {
        getMemoryHeapCount().setValue(memoryHeapCount);
    }

    protected static native long getMemoryHeapCount(long address);
    protected static native void setMemoryHeapCount(long address, long memoryHeapCount);

    public VkMemoryHeap getMemoryHeaps() {
        return new VkMemoryHeap(getVkMemory(), getMemoryHeaps(getVkAddress()));
    }

    
    public void setMemoryHeaps(VkMemoryHeap memoryHeaps) {
        setMemoryHeaps(getVkAddress(), memoryHeaps != null ? memoryHeaps.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getMemoryHeaps(long address);
    protected static native void setMemoryHeaps(long address, long memoryHeaps);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMemoryProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMemoryProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceMemoryProperties o){
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
        public VkPhysicalDeviceMemoryProperties get(int i){
            return new VkPhysicalDeviceMemoryProperties(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
