package cz.mg.vulkan;

public class VkStencilOpState extends VkObject {
    public VkStencilOpState() {
        super(sizeof());
    }

    protected VkStencilOpState(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkStencilOpState(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkStencilOpState(VkPointer pointer) {
        super(pointer);
    }



    public VkStencilOp getFailOp() {
        return new VkStencilOp(getVkMemory(), getFailOpNative(getVkAddress()));
    }

    
    public void setFailOp(VkStencilOp failOp) {
        setFailOpNative(getVkAddress(), failOp != null ? failOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFailOpQ() {
        return getFailOp().getValue();
    }

    public void setFailOp(int failOp) {
        getFailOp().setValue(failOp);
    }

    protected static native long getFailOpNative(long address);
    protected static native void setFailOpNative(long address, long failOp);

    public VkStencilOp getPassOp() {
        return new VkStencilOp(getVkMemory(), getPassOpNative(getVkAddress()));
    }

    
    public void setPassOp(VkStencilOp passOp) {
        setPassOpNative(getVkAddress(), passOp != null ? passOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPassOpQ() {
        return getPassOp().getValue();
    }

    public void setPassOp(int passOp) {
        getPassOp().setValue(passOp);
    }

    protected static native long getPassOpNative(long address);
    protected static native void setPassOpNative(long address, long passOp);

    public VkStencilOp getDepthFailOp() {
        return new VkStencilOp(getVkMemory(), getDepthFailOpNative(getVkAddress()));
    }

    
    public void setDepthFailOp(VkStencilOp depthFailOp) {
        setDepthFailOpNative(getVkAddress(), depthFailOp != null ? depthFailOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthFailOpQ() {
        return getDepthFailOp().getValue();
    }

    public void setDepthFailOp(int depthFailOp) {
        getDepthFailOp().setValue(depthFailOp);
    }

    protected static native long getDepthFailOpNative(long address);
    protected static native void setDepthFailOpNative(long address, long depthFailOp);

    public VkCompareOp getCompareOp() {
        return new VkCompareOp(getVkMemory(), getCompareOpNative(getVkAddress()));
    }

    
    public void setCompareOp(VkCompareOp compareOp) {
        setCompareOpNative(getVkAddress(), compareOp != null ? compareOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompareOpQ() {
        return getCompareOp().getValue();
    }

    public void setCompareOp(int compareOp) {
        getCompareOp().setValue(compareOp);
    }

    protected static native long getCompareOpNative(long address);
    protected static native void setCompareOpNative(long address, long compareOp);

    public VkUInt32 getCompareMask() {
        return new VkUInt32(getVkMemory(), getCompareMaskNative(getVkAddress()));
    }

    
    public void setCompareMask(VkUInt32 compareMask) {
        setCompareMaskNative(getVkAddress(), compareMask != null ? compareMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompareMaskQ() {
        return getCompareMask().getValue();
    }

    public void setCompareMask(int compareMask) {
        getCompareMask().setValue(compareMask);
    }

    protected static native long getCompareMaskNative(long address);
    protected static native void setCompareMaskNative(long address, long compareMask);

    public VkUInt32 getWriteMask() {
        return new VkUInt32(getVkMemory(), getWriteMaskNative(getVkAddress()));
    }

    
    public void setWriteMask(VkUInt32 writeMask) {
        setWriteMaskNative(getVkAddress(), writeMask != null ? writeMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWriteMaskQ() {
        return getWriteMask().getValue();
    }

    public void setWriteMask(int writeMask) {
        getWriteMask().setValue(writeMask);
    }

    protected static native long getWriteMaskNative(long address);
    protected static native void setWriteMaskNative(long address, long writeMask);

    public VkUInt32 getReference() {
        return new VkUInt32(getVkMemory(), getReferenceNative(getVkAddress()));
    }

    
    public void setReference(VkUInt32 reference) {
        setReferenceNative(getVkAddress(), reference != null ? reference.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getReferenceQ() {
        return getReference().getValue();
    }

    public void setReference(int reference) {
        getReference().setValue(reference);
    }

    protected static native long getReferenceNative(long address);
    protected static native void setReferenceNative(long address, long reference);


    public void set(VkStencilOpState o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkStencilOpState implements cz.mg.collections.array.ReadonlyArray<VkStencilOpState> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkStencilOpState.sizeof()));
            this.count = count;
        }

        public Array(VkStencilOpState o, int count){
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
        public VkStencilOpState get(int i){
            return new VkStencilOpState(getVkMemory(), address(i));
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
