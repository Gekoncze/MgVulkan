package cz.mg.vulkan.vk;

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


    public VkPhysicalDeviceMemoryProperties(VkUInt32 memoryTypeCount, VkMemoryType memoryTypes, VkUInt32 memoryHeapCount, VkMemoryHeap memoryHeaps) {
        super(sizeof());
        setMemoryTypeCount(memoryTypeCount);
        setMemoryTypes(memoryTypes);
        setMemoryHeapCount(memoryHeapCount);
        setMemoryHeaps(memoryHeaps);
    }

    public VkUInt32 getMemoryTypeCount() {
        return new VkUInt32(getVkMemory(), getMemoryTypeCount(getVkAddress()));
    }

    
    public void setMemoryTypeCount(VkUInt32 memoryTypeCount) {
        setMemoryTypeCount(getVkAddress(), memoryTypeCount != null ? memoryTypeCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemoryTypeCount(long address);
    private static native void setMemoryTypeCount(long address, long memoryTypeCount);

    public VkMemoryType getMemoryTypes() {
        return new VkMemoryType(getVkMemory(), getMemoryTypes(getVkAddress()));
    }

    
    public void setMemoryTypes(VkMemoryType memoryTypes) {
        setMemoryTypes(getVkAddress(), memoryTypes != null ? memoryTypes.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getMemoryTypes(long address);
    private static native void setMemoryTypes(long address, long memoryTypes);

    public VkUInt32 getMemoryHeapCount() {
        return new VkUInt32(getVkMemory(), getMemoryHeapCount(getVkAddress()));
    }

    
    public void setMemoryHeapCount(VkUInt32 memoryHeapCount) {
        setMemoryHeapCount(getVkAddress(), memoryHeapCount != null ? memoryHeapCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemoryHeapCount(long address);
    private static native void setMemoryHeapCount(long address, long memoryHeapCount);

    public VkMemoryHeap getMemoryHeaps() {
        return new VkMemoryHeap(getVkMemory(), getMemoryHeaps(getVkAddress()));
    }

    
    public void setMemoryHeaps(VkMemoryHeap memoryHeaps) {
        setMemoryHeaps(getVkAddress(), memoryHeaps != null ? memoryHeaps.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getMemoryHeaps(long address);
    private static native void setMemoryHeaps(long address, long memoryHeaps);


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
            return new VkPhysicalDeviceMemoryProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceMemoryProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMemoryProperties.Pointer> {
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

            public Array(VkPhysicalDeviceMemoryProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceMemoryProperties.Pointer get(int i){
                return new VkPhysicalDeviceMemoryProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
