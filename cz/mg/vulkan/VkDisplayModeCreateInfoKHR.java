package cz.mg.vulkan;

public class VkDisplayModeCreateInfoKHR extends VkObject {
    public VkDisplayModeCreateInfoKHR() {
        super(sizeof());
    }

    public VkDisplayModeCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayModeCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayModeCreateInfoKHR(VkObject pNext, VkDisplayModeCreateFlagsKHR flags, VkDisplayModeParametersKHR parameters) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR));
        setPNext(pNext);
        setFlags(flags);
        setParameters(parameters);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkDisplayModeCreateFlagsKHR getFlags() {
        return new VkDisplayModeCreateFlagsKHR(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDisplayModeCreateFlagsKHR flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkDisplayModeParametersKHR getParameters() {
        return new VkDisplayModeParametersKHR(getVkMemory(), getParameters(getVkAddress()));
    }

    
    public void setParameters(VkDisplayModeParametersKHR parameters) {
        setParameters(getVkAddress(), parameters != null ? parameters.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getParameters(long address);
    private static native void setParameters(long address, long parameters);


    public static native long sizeof();

    public static class Array extends VkDisplayModeCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModeCreateInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayModeCreateInfoKHR o){
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
        public VkDisplayModeCreateInfoKHR get(int i){
            return new VkDisplayModeCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayModeCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeCreateInfoKHR.Pointer> {
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

            public Array(VkDisplayModeCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayModeCreateInfoKHR.Pointer get(int i){
                return new VkDisplayModeCreateInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
