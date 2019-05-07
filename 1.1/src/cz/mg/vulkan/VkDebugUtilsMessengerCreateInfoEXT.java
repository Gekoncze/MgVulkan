package cz.mg.vulkan;

public class VkDebugUtilsMessengerCreateInfoEXT extends VkObject {
    public VkDebugUtilsMessengerCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT));
    }

    public VkDebugUtilsMessengerCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessengerCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsMessengerCreateInfoEXT(VkPointer pointer) {
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

    public VkDebugUtilsMessengerCreateFlagsEXT getFlags() {
        return new VkDebugUtilsMessengerCreateFlagsEXT(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDebugUtilsMessengerCreateFlagsEXT flags) {
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

    public VkDebugUtilsMessageSeverityFlagsEXT getMessageSeverity() {
        return new VkDebugUtilsMessageSeverityFlagsEXT(getVkMemory(), getMessageSeverityNative(getVkAddress()));
    }

    
    public void setMessageSeverity(VkDebugUtilsMessageSeverityFlagsEXT messageSeverity) {
        setMessageSeverityNative(getVkAddress(), messageSeverity != null ? messageSeverity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMessageSeverityQ() {
        return getMessageSeverity().getValue();
    }

    public void setMessageSeverity(int messageSeverity) {
        getMessageSeverity().setValue(messageSeverity);
    }

    protected static native long getMessageSeverityNative(long address);
    protected static native void setMessageSeverityNative(long address, long messageSeverity);

    public VkDebugUtilsMessageTypeFlagsEXT getMessageType() {
        return new VkDebugUtilsMessageTypeFlagsEXT(getVkMemory(), getMessageTypeNative(getVkAddress()));
    }

    
    public void setMessageType(VkDebugUtilsMessageTypeFlagsEXT messageType) {
        setMessageTypeNative(getVkAddress(), messageType != null ? messageType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMessageTypeQ() {
        return getMessageType().getValue();
    }

    public void setMessageType(int messageType) {
        getMessageType().setValue(messageType);
    }

    protected static native long getMessageTypeNative(long address);
    protected static native void setMessageTypeNative(long address, long messageType);

    public PFNvkDebugUtilsMessengerCallbackEXT getPfnUserCallback() {
        return new PFNvkDebugUtilsMessengerCallbackEXT(getVkMemory(), getPfnUserCallbackNative(getVkAddress()));
    }

    
    public void setPfnUserCallback(PFNvkDebugUtilsMessengerCallbackEXT pfnUserCallback) {
        setPfnUserCallbackNative(getVkAddress(), pfnUserCallback != null ? pfnUserCallback.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnUserCallbackNative(long address);
    protected static native void setPfnUserCallbackNative(long address, long pfnUserCallback);

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


    public void set(VkDebugUtilsMessengerCreateInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDebugUtilsMessengerCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessengerCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT));;
        }

        public Array(VkDebugUtilsMessengerCreateInfoEXT o, int count){
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
        public VkDebugUtilsMessengerCreateInfoEXT get(int i){
            return new VkDebugUtilsMessengerCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
