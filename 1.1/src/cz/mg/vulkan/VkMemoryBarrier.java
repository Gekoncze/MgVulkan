package cz.mg.vulkan;

public class VkMemoryBarrier extends VkObject {
    public VkMemoryBarrier() {
        super(sizeof());
    }

    public VkMemoryBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMask(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMask(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcAccessMaskQ() {
        return getSrcAccessMask().getValue();
    }

    public void setSrcAccessMask(int srcAccessMask) {
        getSrcAccessMask().setValue(srcAccessMask);
    }

    protected static native long getSrcAccessMask(long address);
    protected static native void setSrcAccessMask(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMask(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMask(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstAccessMaskQ() {
        return getDstAccessMask().getValue();
    }

    public void setDstAccessMask(int dstAccessMask) {
        getDstAccessMask().setValue(dstAccessMask);
    }

    protected static native long getDstAccessMask(long address);
    protected static native void setDstAccessMask(long address, long dstAccessMask);


    public static native long sizeof();

    public static class Array extends VkMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VkMemoryBarrier> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryBarrier.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryBarrier o){
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
        public VkMemoryBarrier get(int i){
            return new VkMemoryBarrier(getVkMemory(), addressAt(i));
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

        public static class Array extends VkMemoryBarrier.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryBarrier.Pointer> {
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

            public Array(VkMemoryBarrier[] a) {
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
            public VkMemoryBarrier.Pointer get(int i){
                return new VkMemoryBarrier.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
