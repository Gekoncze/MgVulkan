package cz.mg.vulkan;

public class VkBufferCopy extends VkObject {
    public VkBufferCopy() {
        super(sizeof());
    }

    public VkBufferCopy(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferCopy(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceSize getSrcOffset() {
        return new VkDeviceSize(getVkMemory(), getSrcOffset(getVkAddress()));
    }

    
    public void setSrcOffset(VkDeviceSize srcOffset) {
        setSrcOffset(getVkAddress(), srcOffset != null ? srcOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSrcOffsetQ() {
        return getSrcOffset().getValue();
    }

    public void setSrcOffset(long srcOffset) {
        getSrcOffset().setValue(srcOffset);
    }

    protected static native long getSrcOffset(long address);
    protected static native void setSrcOffset(long address, long srcOffset);

    public VkDeviceSize getDstOffset() {
        return new VkDeviceSize(getVkMemory(), getDstOffset(getVkAddress()));
    }

    
    public void setDstOffset(VkDeviceSize dstOffset) {
        setDstOffset(getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDstOffsetQ() {
        return getDstOffset().getValue();
    }

    public void setDstOffset(long dstOffset) {
        getDstOffset().setValue(dstOffset);
    }

    protected static native long getDstOffset(long address);
    protected static native void setDstOffset(long address, long dstOffset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(long size) {
        getSize().setValue(size);
    }

    protected static native long getSize(long address);
    protected static native void setSize(long address, long size);


    public static native long sizeof();

    public static class Array extends VkBufferCopy implements cz.mg.collections.array.ReadonlyArray<VkBufferCopy> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferCopy.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferCopy o){
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
        public VkBufferCopy get(int i){
            return new VkBufferCopy(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkBufferCopy.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBufferCopy.Pointer> {
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

            public Array(VkBufferCopy[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBufferCopy.Pointer get(int i){
                return new VkBufferCopy.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
