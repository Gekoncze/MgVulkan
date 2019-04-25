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

    public VkUInt32 getDisabledValidationCheckCount() {
        return new VkUInt32(getVkMemory(), getDisabledValidationCheckCount(getVkAddress()));
    }

    
    public void setDisabledValidationCheckCount(VkUInt32 disabledValidationCheckCount) {
        setDisabledValidationCheckCount(getVkAddress(), disabledValidationCheckCount != null ? disabledValidationCheckCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDisabledValidationCheckCountQ() {
        return getDisabledValidationCheckCount().getValue();
    }

    public void setDisabledValidationCheckCount(int disabledValidationCheckCount) {
        getDisabledValidationCheckCount().setValue(disabledValidationCheckCount);
    }

    protected static native long getDisabledValidationCheckCount(long address);
    protected static native void setDisabledValidationCheckCount(long address, long disabledValidationCheckCount);

    public VkValidationCheckEXT getPDisabledValidationChecks() {
        return new VkValidationCheckEXT(getVkMemory(), getPDisabledValidationChecks(getVkAddress()));
    }

    private VkObject pDisabledValidationChecks = null;
    public void setPDisabledValidationChecks(VkValidationCheckEXT pDisabledValidationChecks) {
        setPDisabledValidationChecks(getVkAddress(), pDisabledValidationChecks != null ? pDisabledValidationChecks.getVkAddress() : VkPointer.NULL);
        this.pDisabledValidationChecks = pDisabledValidationChecks;
    }

    protected static native long getPDisabledValidationChecks(long address);
    protected static native void setPDisabledValidationChecks(long address, long pDisabledValidationChecks);


    public static native long sizeof();

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
            return new VkValidationFlagsEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
