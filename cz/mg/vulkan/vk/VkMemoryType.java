package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryType.html">khronos documentation</a>
 **/
public class VkMemoryType extends VkObject {
    public VkMemoryType() {
        super(sizeof());
    }

    public VkMemoryType(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkMemoryType(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkMemoryType(VkMemoryPropertyFlags propertyFlags, VkUInt32 heapIndex) {
        super(sizeof());
        setPropertyFlags(propertyFlags);
        setHeapIndex(heapIndex);
    }

    public VkMemoryPropertyFlags getPropertyFlags() {
        return new VkMemoryPropertyFlags(getVkMemory(), getPropertyFlags(getVkAddress()));
    }

    public void setPropertyFlags(VkMemoryPropertyFlags propertyFlags) {
        setPropertyFlags(getVkAddress(), propertyFlags.getVkAddress());
    }

    private static native long getPropertyFlags(long address);
    private static native void setPropertyFlags(long address, long propertyFlags);

    public VkUInt32 getHeapIndex() {
        return new VkUInt32(getVkMemory(), getHeapIndex(getVkAddress()));
    }

    public void setHeapIndex(VkUInt32 heapIndex) {
        setHeapIndex(getVkAddress(), heapIndex.getVkAddress());
    }

    private static native long getHeapIndex(long address);
    private static native void setHeapIndex(long address, long heapIndex);


    public static native long sizeof();

    public static class Array extends VkMemoryType implements cz.mg.collections.array.ReadonlyArray<VkMemoryType> {
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
        public VkMemoryType get(int i){
            return new VkMemoryType(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkMemoryType[] a) {
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
