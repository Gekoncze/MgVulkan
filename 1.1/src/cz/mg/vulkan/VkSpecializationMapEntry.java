package cz.mg.vulkan;

public class VkSpecializationMapEntry extends VkObject {
    public VkSpecializationMapEntry() {
        super(sizeof());
    }

    protected VkSpecializationMapEntry(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSpecializationMapEntry(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSpecializationMapEntry(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getConstantID() {
        return new VkUInt32(getVkMemory(), getConstantIDNative(getVkAddress()));
    }

    
    public void setConstantID(VkUInt32 constantID) {
        setConstantIDNative(getVkAddress(), constantID != null ? constantID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConstantIDQ() {
        return getConstantID().getValue();
    }

    public void setConstantID(int constantID) {
        getConstantID().setValue(constantID);
    }

    protected static native long getConstantIDNative(long address);
    protected static native void setConstantIDNative(long address, long constantID);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(int offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);

    public VkSize getSize() {
        return new VkSize(getVkMemory(), getSizeNative(getVkAddress()));
    }

    
    public void setSize(VkSize size) {
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


    public void set(VkSpecializationMapEntry o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSpecializationMapEntry implements cz.mg.collections.array.ReadonlyArray<VkSpecializationMapEntry> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSpecializationMapEntry.sizeof()));
            this.count = count;
        }

        public Array(VkSpecializationMapEntry o, int count){
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
        public VkSpecializationMapEntry get(int i){
            return new VkSpecializationMapEntry(getVkMemory(), address(i));
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
