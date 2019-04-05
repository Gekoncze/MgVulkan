package cz.mg.vulkan.vk;

public class VkValidationFlagsEXT extends VkObject {
    public VkValidationFlagsEXT() {
        super(sizeof());
    }

    public VkValidationFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkValidationFlagsEXT(VkStructureType sType, VkObject pNext, VkUInt32 disabledValidationCheckCount, VkValidationCheckEXT pDisabledValidationChecks) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setDisabledValidationCheckCount(disabledValidationCheckCount);
        setPDisabledValidationChecks(pDisabledValidationChecks);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getDisabledValidationCheckCount() {
        return new VkUInt32(getVkMemory(), getDisabledValidationCheckCount(getVkAddress()));
    }

    
    public void setDisabledValidationCheckCount(VkUInt32 disabledValidationCheckCount) {
        setDisabledValidationCheckCount(getVkAddress(), disabledValidationCheckCount != null ? disabledValidationCheckCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDisabledValidationCheckCount(long address);
    private static native void setDisabledValidationCheckCount(long address, long disabledValidationCheckCount);

    public VkValidationCheckEXT getPDisabledValidationChecks() {
        return new VkValidationCheckEXT(getVkMemory(), getPDisabledValidationChecks(getVkAddress()));
    }

    private VkObject pDisabledValidationChecks = null;
    public void setPDisabledValidationChecks(VkValidationCheckEXT pDisabledValidationChecks) {
        setPDisabledValidationChecks(getVkAddress(), pDisabledValidationChecks != null ? pDisabledValidationChecks.getVkAddress() : VkPointer.NULL);
        this.pDisabledValidationChecks = pDisabledValidationChecks;
    }

    private static native long getPDisabledValidationChecks(long address);
    private static native void setPDisabledValidationChecks(long address, long pDisabledValidationChecks);


    public static native long sizeof();

    public static class Array extends VkValidationFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkValidationFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkValidationFlagsEXT o){
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
        public VkValidationFlagsEXT get(int i){
            return new VkValidationFlagsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkValidationFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkValidationFlagsEXT.Pointer> {
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

            public Array(VkValidationFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkValidationFlagsEXT.Pointer get(int i){
                return new VkValidationFlagsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
