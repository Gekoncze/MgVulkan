package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceMemoryProperties.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceMemoryProperties extends VkObject {
    public VkPhysicalDeviceMemoryProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceMemoryProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPhysicalDeviceMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
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
        setMemoryTypeCount(getVkAddress(), memoryTypeCount.getVkAddress());
    }

    private static native long getMemoryTypeCount(long address);
    private static native void setMemoryTypeCount(long address, long memoryTypeCount);

    public VkMemoryType.Array getMemoryTypes() {
        return new VkMemoryType.Array(getVkMemory(), getMemoryTypes(getVkAddress()), getMemoryTypeCount().getValue());
    }

    public void setMemoryTypes(VkMemoryType memoryTypes) {
        setMemoryTypes(getVkAddress(), memoryTypes.getVkAddress());
    }

    private static native long getMemoryTypes(long address);
    private static native void setMemoryTypes(long address, long memoryTypes);

    public VkUInt32 getMemoryHeapCount() {
        return new VkUInt32(getVkMemory(), getMemoryHeapCount(getVkAddress()));
    }

    public void setMemoryHeapCount(VkUInt32 memoryHeapCount) {
        setMemoryHeapCount(getVkAddress(), memoryHeapCount.getVkAddress());
    }

    private static native long getMemoryHeapCount(long address);
    private static native void setMemoryHeapCount(long address, long memoryHeapCount);

    public VkMemoryHeap.Array getMemoryHeaps() {
        return new VkMemoryHeap.Array(getVkMemory(), getMemoryHeaps(getVkAddress()), getMemoryHeapCount().getValue());
    }

    public void setMemoryHeaps(VkMemoryHeap memoryHeaps) {
        setMemoryHeaps(getVkAddress(), memoryHeaps.getVkAddress());
    }

    private static native long getMemoryHeaps(long address);
    private static native void setMemoryHeaps(long address, long memoryHeaps);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMemoryProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
