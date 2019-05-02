package cz.mg.vulkan;

public class VkMemoryRequirements extends VkObject {
    public VkMemoryRequirements() {
        super(sizeof());
    }

    protected VkMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryRequirements(VkPointer pointer) {
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

    public VkDeviceSize getAlignment() {
        return new VkDeviceSize(getVkMemory(), getAlignmentNative(getVkAddress()));
    }

    
    public void setAlignment(VkDeviceSize alignment) {
        setAlignmentNative(getVkAddress(), alignment != null ? alignment.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getAlignmentQ() {
        return getAlignment().getValue();
    }

    public void setAlignment(long alignment) {
        getAlignment().setValue(alignment);
    }

    protected static native long getAlignmentNative(long address);
    protected static native void setAlignmentNative(long address, long alignment);

    public VkUInt32 getMemoryTypeBits() {
        return new VkUInt32(getVkMemory(), getMemoryTypeBitsNative(getVkAddress()));
    }

    
    public void setMemoryTypeBits(VkUInt32 memoryTypeBits) {
        setMemoryTypeBitsNative(getVkAddress(), memoryTypeBits != null ? memoryTypeBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMemoryTypeBitsQ() {
        return getMemoryTypeBits().getValue();
    }

    public void setMemoryTypeBits(int memoryTypeBits) {
        getMemoryTypeBits().setValue(memoryTypeBits);
    }

    protected static native long getMemoryTypeBitsNative(long address);
    protected static native void setMemoryTypeBitsNative(long address, long memoryTypeBits);


    public void set(VkMemoryRequirements o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkMemoryRequirements implements cz.mg.collections.array.ReadonlyArray<VkMemoryRequirements> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryRequirements.sizeof()));
            this.count = count;
        }

        public Array(VkMemoryRequirements o, int count){
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
        public VkMemoryRequirements get(int i){
            return new VkMemoryRequirements(getVkMemory(), address(i));
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
