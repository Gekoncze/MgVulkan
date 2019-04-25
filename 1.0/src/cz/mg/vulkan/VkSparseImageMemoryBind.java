package cz.mg.vulkan;

public class VkSparseImageMemoryBind extends VkObject {
    public VkSparseImageMemoryBind() {
        super(sizeof());
    }

    protected VkSparseImageMemoryBind(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseImageMemoryBind(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseImageMemoryBind(VkPointer pointer) {
        super(pointer);
    }



    public VkImageSubresource getSubresource() {
        return new VkImageSubresource(getVkMemory(), getSubresource(getVkAddress()));
    }

    
    public void setSubresource(VkImageSubresource subresource) {
        setSubresource(getVkAddress(), subresource != null ? subresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSubresource(long address);
    protected static native void setSubresource(long address, long subresource);

    public VkOffset3D getOffset() {
        return new VkOffset3D(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkOffset3D offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getOffset(long address);
    protected static native void setOffset(long address, long offset);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getExtent(long address);
    protected static native void setExtent(long address, long extent);

    public VkDeviceMemory getMemory() {
        return new VkDeviceMemory(getVkMemory(), getMemory(getVkAddress()));
    }

    
    public void setMemory(VkDeviceMemory memory) {
        setMemory(getVkAddress(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMemory(long address);
    protected static native void setMemory(long address, long memory);

    public VkDeviceSize getMemoryOffset() {
        return new VkDeviceSize(getVkMemory(), getMemoryOffset(getVkAddress()));
    }

    
    public void setMemoryOffset(VkDeviceSize memoryOffset) {
        setMemoryOffset(getVkAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMemoryOffsetQ() {
        return getMemoryOffset().getValue();
    }

    public void setMemoryOffset(long memoryOffset) {
        getMemoryOffset().setValue(memoryOffset);
    }

    protected static native long getMemoryOffset(long address);
    protected static native void setMemoryOffset(long address, long memoryOffset);

    public VkSparseMemoryBindFlags getFlags() {
        return new VkSparseMemoryBindFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSparseMemoryBindFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkSparseImageMemoryBind implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryBind> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageMemoryBind.sizeof()));
            this.count = count;
        }

        public Array(VkSparseImageMemoryBind o, int count){
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
        public VkSparseImageMemoryBind get(int i){
            return new VkSparseImageMemoryBind(getVkMemory(), addressAt(i));
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
