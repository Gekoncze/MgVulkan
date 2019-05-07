package cz.mg.vulkan;

public class VkDisplayModeCreateInfoKHR extends VkObject {
    public VkDisplayModeCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR));
    }

    public VkDisplayModeCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayModeCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayModeCreateInfoKHR(VkPointer pointer) {
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

    public VkDisplayModeCreateFlagsKHR getFlags() {
        return new VkDisplayModeCreateFlagsKHR(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDisplayModeCreateFlagsKHR flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkDisplayModeParametersKHR getParameters() {
        return new VkDisplayModeParametersKHR(getVkMemory(), getParametersNative(getVkAddress()));
    }

    
    public void setParameters(VkDisplayModeParametersKHR parameters) {
        setParametersNative(getVkAddress(), parameters != null ? parameters.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getParametersNative(long address);
    protected static native void setParametersNative(long address, long parameters);


    public void set(VkDisplayModeCreateInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDisplayModeCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModeCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR));;
        }

        public Array(VkDisplayModeCreateInfoKHR o, int count){
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

}
