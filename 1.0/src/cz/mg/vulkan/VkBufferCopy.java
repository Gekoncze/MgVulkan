package cz.mg.vulkan;

public class VkBufferCopy extends VkObject {
    public VkBufferCopy() {
        super(sizeof());
    }

    protected VkBufferCopy(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBufferCopy(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferCopy(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceSize getSrcOffset() {
        return new VkDeviceSize(getVkMemory(), getSrcOffsetNative(getVkAddress()));
    }

    
    public void setSrcOffset(VkDeviceSize srcOffset) {
        setSrcOffsetNative(getVkAddress(), srcOffset != null ? srcOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSrcOffsetQ() {
        return getSrcOffset().getValue();
    }

    public void setSrcOffset(long srcOffset) {
        getSrcOffset().setValue(srcOffset);
    }

    protected static native long getSrcOffsetNative(long address);
    protected static native void setSrcOffsetNative(long address, long srcOffset);

    public VkDeviceSize getDstOffset() {
        return new VkDeviceSize(getVkMemory(), getDstOffsetNative(getVkAddress()));
    }

    
    public void setDstOffset(VkDeviceSize dstOffset) {
        setDstOffsetNative(getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDstOffsetQ() {
        return getDstOffset().getValue();
    }

    public void setDstOffset(long dstOffset) {
        getDstOffset().setValue(dstOffset);
    }

    protected static native long getDstOffsetNative(long address);
    protected static native void setDstOffsetNative(long address, long dstOffset);

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


    public void set(VkBufferCopy o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkBufferCopy implements cz.mg.collections.array.ReadonlyArray<VkBufferCopy> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferCopy.sizeof()));
            this.count = count;
        }

        public Array(VkBufferCopy o, int count){
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
        public VkBufferCopy get(int i){
            return new VkBufferCopy(getVkMemory(), address(i));
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
