package cz.mg.vulkan;

public class VkSpecializationMapEntry extends VkObject {
    public VkSpecializationMapEntry() {
        super(sizeof());
    }

    public VkSpecializationMapEntry(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSpecializationMapEntry(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getConstantID() {
        return new VkUInt32(getVkMemory(), getConstantID(getVkAddress()));
    }

    
    public void setConstantID(VkUInt32 constantID) {
        setConstantID(getVkAddress(), constantID != null ? constantID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConstantIDQ() {
        return getConstantID().getValue();
    }

    public void setConstantID(int constantID) {
        getConstantID().setValue(constantID);
    }

    protected static native long getConstantID(long address);
    protected static native void setConstantID(long address, long constantID);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(int offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffset(long address);
    protected static native void setOffset(long address, long offset);

    public VkSize getSize() {
        return new VkSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkSize size) {
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

    public static class Array extends VkSpecializationMapEntry implements cz.mg.collections.array.ReadonlyArray<VkSpecializationMapEntry> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSpecializationMapEntry.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSpecializationMapEntry o){
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
        public VkSpecializationMapEntry get(int i){
            return new VkSpecializationMapEntry(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
