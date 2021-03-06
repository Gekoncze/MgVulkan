package cz.mg.vulkan;

public class VkValidationFlagsEXT extends VkObject {
    public VkValidationFlagsEXT() {
        super(sizeof());
    }

    protected VkValidationFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkValidationFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkValidationFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkUInt32 getDisabledValidationCheckCount() {
        return new VkUInt32(getVkMemory(), getDisabledValidationCheckCountNative(getVkAddress()));
    }

    
    public void setDisabledValidationCheckCount(VkUInt32 disabledValidationCheckCount) {
        setDisabledValidationCheckCountNative(getVkAddress(), disabledValidationCheckCount != null ? disabledValidationCheckCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDisabledValidationCheckCountQ() {
        return getDisabledValidationCheckCount().getValue();
    }

    public void setDisabledValidationCheckCount(int disabledValidationCheckCount) {
        getDisabledValidationCheckCount().setValue(disabledValidationCheckCount);
    }

    protected static native long getDisabledValidationCheckCountNative(long address);
    protected static native void setDisabledValidationCheckCountNative(long address, long disabledValidationCheckCount);

    public VkValidationCheckEXT getPDisabledValidationChecks() {
        return new VkValidationCheckEXT(getVkMemory(), getPDisabledValidationChecksNative(getVkAddress()));
    }

    private VkObject pDisabledValidationChecks = null;
    public void setPDisabledValidationChecks(VkValidationCheckEXT pDisabledValidationChecks) {
        setPDisabledValidationChecksNative(getVkAddress(), pDisabledValidationChecks != null ? pDisabledValidationChecks.getVkAddress() : VkPointer.NULL);
        this.pDisabledValidationChecks = pDisabledValidationChecks;
    }

    public VkValidationCheckEXT.Array getPDisabledValidationChecksQ() {
        return new VkValidationCheckEXT.Array(getPDisabledValidationChecks(), getDisabledValidationCheckCountQ());
    }

    protected static native long getPDisabledValidationChecksNative(long address);
    protected static native void setPDisabledValidationChecksNative(long address, long pDisabledValidationChecks);


    public void set(VkValidationFlagsEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkValidationFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkValidationFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(VkValidationFlagsEXT o, int count){
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
        public VkValidationFlagsEXT get(int i){
            return new VkValidationFlagsEXT(getVkMemory(), address(i));
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
