package cz.mg.vulkan;

public class VkDebugReportCallbackCreateInfoEXT extends VkObject {
    public VkDebugReportCallbackCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT));
    }

    public VkDebugReportCallbackCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugReportCallbackCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugReportCallbackCreateInfoEXT(VkPointer pointer) {
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

    public VkDebugReportFlagsEXT getFlags() {
        return new VkDebugReportFlagsEXT(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDebugReportFlagsEXT flags) {
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

    public PFNvkDebugReportCallbackEXT getPfnCallback() {
        return new PFNvkDebugReportCallbackEXT(getVkMemory(), getPfnCallbackNative(getVkAddress()));
    }

    
    public void setPfnCallback(PFNvkDebugReportCallbackEXT pfnCallback) {
        setPfnCallbackNative(getVkAddress(), pfnCallback != null ? pfnCallback.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnCallbackNative(long address);
    protected static native void setPfnCallbackNative(long address, long pfnCallback);

    public VkObject getPUserData() {
        return new VkObject(getVkMemory(), getPUserDataNative(getVkAddress()));
    }

    private VkObject pUserData = null;
    public void setPUserData(VkObject pUserData) {
        setPUserDataNative(getVkAddress(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL);
        this.pUserData = pUserData;
    }

    protected static native long getPUserDataNative(long address);
    protected static native void setPUserDataNative(long address, long pUserData);


    public void set(VkDebugReportCallbackCreateInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDebugReportCallbackCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugReportCallbackCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugReportCallbackCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT));;
        }

        public Array(VkDebugReportCallbackCreateInfoEXT o, int count){
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
        public VkDebugReportCallbackCreateInfoEXT get(int i){
            return new VkDebugReportCallbackCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
