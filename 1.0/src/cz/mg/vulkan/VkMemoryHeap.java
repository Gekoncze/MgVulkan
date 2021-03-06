package cz.mg.vulkan;

public class VkMemoryHeap extends VkObject {
    public VkMemoryHeap() {
        super(sizeof());
    }

    protected VkMemoryHeap(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryHeap(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryHeap(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSizeNative(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSizeNative(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(long size) {
        getSize().setValue(size);
    }

    protected static native long getSizeNative(long address);
    protected static native void setSizeNative(long address, long size);

    public VkMemoryHeapFlags getFlags() {
        return new VkMemoryHeapFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkMemoryHeapFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);


    public void set(VkMemoryHeap o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkMemoryHeap implements cz.mg.collections.array.ReadonlyArray<VkMemoryHeap> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryHeap.sizeof()));
            this.count = count;
        }

        public Array(VkMemoryHeap o, int count){
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
        public VkMemoryHeap get(int i){
            return new VkMemoryHeap(getVkMemory(), address(i));
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
