package cz.mg.vulkan;

public class VkStencilOpState extends VkObject {
    public VkStencilOpState() {
        super(sizeof());
    }

    public VkStencilOpState(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkStencilOpState(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStencilOp getFailOp() {
        return new VkStencilOp(getVkMemory(), getFailOp(getVkAddress()));
    }

    
    public void setFailOp(VkStencilOp failOp) {
        setFailOp(getVkAddress(), failOp != null ? failOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFailOpQ() {
        return getFailOp().getValue();
    }

    public void setFailOp(int failOp) {
        getFailOp().setValue(failOp);
    }

    protected static native long getFailOp(long address);
    protected static native void setFailOp(long address, long failOp);

    public VkStencilOp getPassOp() {
        return new VkStencilOp(getVkMemory(), getPassOp(getVkAddress()));
    }

    
    public void setPassOp(VkStencilOp passOp) {
        setPassOp(getVkAddress(), passOp != null ? passOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPassOpQ() {
        return getPassOp().getValue();
    }

    public void setPassOp(int passOp) {
        getPassOp().setValue(passOp);
    }

    protected static native long getPassOp(long address);
    protected static native void setPassOp(long address, long passOp);

    public VkStencilOp getDepthFailOp() {
        return new VkStencilOp(getVkMemory(), getDepthFailOp(getVkAddress()));
    }

    
    public void setDepthFailOp(VkStencilOp depthFailOp) {
        setDepthFailOp(getVkAddress(), depthFailOp != null ? depthFailOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDepthFailOpQ() {
        return getDepthFailOp().getValue();
    }

    public void setDepthFailOp(int depthFailOp) {
        getDepthFailOp().setValue(depthFailOp);
    }

    protected static native long getDepthFailOp(long address);
    protected static native void setDepthFailOp(long address, long depthFailOp);

    public VkCompareOp getCompareOp() {
        return new VkCompareOp(getVkMemory(), getCompareOp(getVkAddress()));
    }

    
    public void setCompareOp(VkCompareOp compareOp) {
        setCompareOp(getVkAddress(), compareOp != null ? compareOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getCompareOpQ() {
        return getCompareOp().getValue();
    }

    public void setCompareOp(int compareOp) {
        getCompareOp().setValue(compareOp);
    }

    protected static native long getCompareOp(long address);
    protected static native void setCompareOp(long address, long compareOp);

    public VkUInt32 getCompareMask() {
        return new VkUInt32(getVkMemory(), getCompareMask(getVkAddress()));
    }

    
    public void setCompareMask(VkUInt32 compareMask) {
        setCompareMask(getVkAddress(), compareMask != null ? compareMask.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getCompareMaskQ() {
        return getCompareMask().getValue();
    }

    public void setCompareMask(int compareMask) {
        getCompareMask().setValue(compareMask);
    }

    protected static native long getCompareMask(long address);
    protected static native void setCompareMask(long address, long compareMask);

    public VkUInt32 getWriteMask() {
        return new VkUInt32(getVkMemory(), getWriteMask(getVkAddress()));
    }

    
    public void setWriteMask(VkUInt32 writeMask) {
        setWriteMask(getVkAddress(), writeMask != null ? writeMask.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getWriteMaskQ() {
        return getWriteMask().getValue();
    }

    public void setWriteMask(int writeMask) {
        getWriteMask().setValue(writeMask);
    }

    protected static native long getWriteMask(long address);
    protected static native void setWriteMask(long address, long writeMask);

    public VkUInt32 getReference() {
        return new VkUInt32(getVkMemory(), getReference(getVkAddress()));
    }

    
    public void setReference(VkUInt32 reference) {
        setReference(getVkAddress(), reference != null ? reference.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getReferenceQ() {
        return getReference().getValue();
    }

    public void setReference(int reference) {
        getReference().setValue(reference);
    }

    protected static native long getReference(long address);
    protected static native void setReference(long address, long reference);


    public static native long sizeof();

    public static class Array extends VkStencilOpState implements cz.mg.collections.array.ReadonlyArray<VkStencilOpState> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkStencilOpState.sizeof()));
            this.count = count;
        }

        public Array(int count, VkStencilOpState o){
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
        public VkStencilOpState get(int i){
            return new VkStencilOpState(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkStencilOpState.Pointer implements cz.mg.collections.array.ReadonlyArray<VkStencilOpState.Pointer> {
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

            public Array(VkStencilOpState[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkStencilOpState.Pointer get(int i){
                return new VkStencilOpState.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
