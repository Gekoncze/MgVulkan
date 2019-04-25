package cz.mg.vulkan;

public class VkSparseMemoryBind extends VkObject {
    public VkSparseMemoryBind() {
        super(sizeof());
    }

    protected VkSparseMemoryBind(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseMemoryBind(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseMemoryBind(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceSize getResourceOffset() {
        return new VkDeviceSize(getVkMemory(), getResourceOffsetNative(getVkAddress()));
    }

    
    public void setResourceOffset(VkDeviceSize resourceOffset) {
        setResourceOffsetNative(getVkAddress(), resourceOffset != null ? resourceOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getResourceOffsetQ() {
        return getResourceOffset().getValue();
    }

    public void setResourceOffset(long resourceOffset) {
        getResourceOffset().setValue(resourceOffset);
    }

    protected static native long getResourceOffsetNative(long address);
    protected static native void setResourceOffsetNative(long address, long resourceOffset);

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

    public VkDeviceMemory getMemory() {
        return new VkDeviceMemory(getVkMemory(), getMemoryNative(getVkAddress()));
    }

    
    public void setMemory(VkDeviceMemory memory) {
        setMemoryNative(getVkAddress(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMemoryNative(long address);
    protected static native void setMemoryNative(long address, long memory);

    public VkDeviceSize getMemoryOffset() {
        return new VkDeviceSize(getVkMemory(), getMemoryOffsetNative(getVkAddress()));
    }

    
    public void setMemoryOffset(VkDeviceSize memoryOffset) {
        setMemoryOffsetNative(getVkAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMemoryOffsetQ() {
        return getMemoryOffset().getValue();
    }

    public void setMemoryOffset(long memoryOffset) {
        getMemoryOffset().setValue(memoryOffset);
    }

    protected static native long getMemoryOffsetNative(long address);
    protected static native void setMemoryOffsetNative(long address, long memoryOffset);

    public VkSparseMemoryBindFlags getFlags() {
        return new VkSparseMemoryBindFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkSparseMemoryBindFlags flags) {
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


    public static native long sizeof();

    public static class Array extends VkSparseMemoryBind implements cz.mg.collections.array.ReadonlyArray<VkSparseMemoryBind> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseMemoryBind.sizeof()));
            this.count = count;
        }

        public Array(VkSparseMemoryBind o, int count){
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
        public VkSparseMemoryBind get(int i){
            return new VkSparseMemoryBind(getVkMemory(), address(i));
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
