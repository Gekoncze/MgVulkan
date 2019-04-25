package cz.mg.vulkan;

public class VkMemoryType extends VkObject {
    public VkMemoryType() {
        super(sizeof());
    }

    protected VkMemoryType(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryType(VkPointer pointer) {
        super(pointer);
    }



    public VkMemoryPropertyFlags getPropertyFlags() {
        return new VkMemoryPropertyFlags(getVkMemory(), getPropertyFlags(getVkAddress()));
    }

    
    public void setPropertyFlags(VkMemoryPropertyFlags propertyFlags) {
        setPropertyFlags(getVkAddress(), propertyFlags != null ? propertyFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPropertyFlagsQ() {
        return getPropertyFlags().getValue();
    }

    public void setPropertyFlags(int propertyFlags) {
        getPropertyFlags().setValue(propertyFlags);
    }

    protected static native long getPropertyFlags(long address);
    protected static native void setPropertyFlags(long address, long propertyFlags);

    public VkUInt32 getHeapIndex() {
        return new VkUInt32(getVkMemory(), getHeapIndex(getVkAddress()));
    }

    
    public void setHeapIndex(VkUInt32 heapIndex) {
        setHeapIndex(getVkAddress(), heapIndex != null ? heapIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHeapIndexQ() {
        return getHeapIndex().getValue();
    }

    public void setHeapIndex(int heapIndex) {
        getHeapIndex().setValue(heapIndex);
    }

    protected static native long getHeapIndex(long address);
    protected static native void setHeapIndex(long address, long heapIndex);


    public static native long sizeof();

    public static class Array extends VkMemoryType implements cz.mg.collections.array.ReadonlyArray<VkMemoryType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryType.sizeof()));
            this.count = count;
        }

        public Array(VkMemoryType o, int count){
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
        public VkMemoryType get(int i){
            return new VkMemoryType(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
