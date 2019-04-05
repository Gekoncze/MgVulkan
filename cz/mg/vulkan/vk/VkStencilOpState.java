package cz.mg.vulkan.vk;

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


    public VkStencilOpState(VkStencilOp failOp, VkStencilOp passOp, VkStencilOp depthFailOp, VkCompareOp compareOp, VkUInt32 compareMask, VkUInt32 writeMask, VkUInt32 reference) {
        super(sizeof());
        setFailOp(failOp);
        setPassOp(passOp);
        setDepthFailOp(depthFailOp);
        setCompareOp(compareOp);
        setCompareMask(compareMask);
        setWriteMask(writeMask);
        setReference(reference);
    }

    public VkStencilOp getFailOp() {
        return new VkStencilOp(getVkMemory(), getFailOp(getVkAddress()));
    }

    
    public void setFailOp(VkStencilOp failOp) {
        setFailOp(getVkAddress(), failOp != null ? failOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFailOp(long address);
    private static native void setFailOp(long address, long failOp);

    public VkStencilOp getPassOp() {
        return new VkStencilOp(getVkMemory(), getPassOp(getVkAddress()));
    }

    
    public void setPassOp(VkStencilOp passOp) {
        setPassOp(getVkAddress(), passOp != null ? passOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPassOp(long address);
    private static native void setPassOp(long address, long passOp);

    public VkStencilOp getDepthFailOp() {
        return new VkStencilOp(getVkMemory(), getDepthFailOp(getVkAddress()));
    }

    
    public void setDepthFailOp(VkStencilOp depthFailOp) {
        setDepthFailOp(getVkAddress(), depthFailOp != null ? depthFailOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDepthFailOp(long address);
    private static native void setDepthFailOp(long address, long depthFailOp);

    public VkCompareOp getCompareOp() {
        return new VkCompareOp(getVkMemory(), getCompareOp(getVkAddress()));
    }

    
    public void setCompareOp(VkCompareOp compareOp) {
        setCompareOp(getVkAddress(), compareOp != null ? compareOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getCompareOp(long address);
    private static native void setCompareOp(long address, long compareOp);

    public VkUInt32 getCompareMask() {
        return new VkUInt32(getVkMemory(), getCompareMask(getVkAddress()));
    }

    
    public void setCompareMask(VkUInt32 compareMask) {
        setCompareMask(getVkAddress(), compareMask != null ? compareMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getCompareMask(long address);
    private static native void setCompareMask(long address, long compareMask);

    public VkUInt32 getWriteMask() {
        return new VkUInt32(getVkMemory(), getWriteMask(getVkAddress()));
    }

    
    public void setWriteMask(VkUInt32 writeMask) {
        setWriteMask(getVkAddress(), writeMask != null ? writeMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getWriteMask(long address);
    private static native void setWriteMask(long address, long writeMask);

    public VkUInt32 getReference() {
        return new VkUInt32(getVkMemory(), getReference(getVkAddress()));
    }

    
    public void setReference(VkUInt32 reference) {
        setReference(getVkAddress(), reference != null ? reference.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getReference(long address);
    private static native void setReference(long address, long reference);


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
