package cz.mg.vulkan;

public class VkDebugUtilsMessengerCreateInfoEXT extends VkObject {
    public VkDebugUtilsMessengerCreateInfoEXT() {
        super(sizeof());
    }

    public VkDebugUtilsMessengerCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessengerCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessengerCreateInfoEXT(VkObject pNext, VkDebugUtilsMessengerCreateFlagsEXT flags, VkDebugUtilsMessageSeverityFlagsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageType, PFNvkDebugUtilsMessengerCallbackEXT pfnUserCallback, VkObject pUserData) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT));
        setPNext(pNext);
        setFlags(flags);
        setMessageSeverity(messageSeverity);
        setMessageType(messageType);
        setPfnUserCallback(pfnUserCallback);
        setPUserData(pUserData);
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

    public VkDebugUtilsMessengerCreateFlagsEXT getFlags() {
        return new VkDebugUtilsMessengerCreateFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDebugUtilsMessengerCreateFlagsEXT flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkDebugUtilsMessageSeverityFlagsEXT getMessageSeverity() {
        return new VkDebugUtilsMessageSeverityFlagsEXT(getVkMemory(), getMessageSeverity(getVkAddress()));
    }

    
    public void setMessageSeverity(VkDebugUtilsMessageSeverityFlagsEXT messageSeverity) {
        setMessageSeverity(getVkAddress(), messageSeverity != null ? messageSeverity.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMessageSeverity(long address);
    private static native void setMessageSeverity(long address, long messageSeverity);

    public VkDebugUtilsMessageTypeFlagsEXT getMessageType() {
        return new VkDebugUtilsMessageTypeFlagsEXT(getVkMemory(), getMessageType(getVkAddress()));
    }

    
    public void setMessageType(VkDebugUtilsMessageTypeFlagsEXT messageType) {
        setMessageType(getVkAddress(), messageType != null ? messageType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMessageType(long address);
    private static native void setMessageType(long address, long messageType);

    public PFNvkDebugUtilsMessengerCallbackEXT getPfnUserCallback() {
        return new PFNvkDebugUtilsMessengerCallbackEXT(getVkMemory(), getPfnUserCallback(getVkAddress()));
    }

    
    public void setPfnUserCallback(PFNvkDebugUtilsMessengerCallbackEXT pfnUserCallback) {
        setPfnUserCallback(getVkAddress(), pfnUserCallback != null ? pfnUserCallback.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPfnUserCallback(long address);
    private static native void setPfnUserCallback(long address, long pfnUserCallback);

    public VkObject getPUserData() {
        return new VkObject(getVkMemory(), getPUserData(getVkAddress()));
    }

    private VkObject pUserData = null;
    public void setPUserData(VkObject pUserData) {
        setPUserData(getVkAddress(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL);
        this.pUserData = pUserData;
    }

    private static native long getPUserData(long address);
    private static native void setPUserData(long address, long pUserData);


    public static native long sizeof();

    public static class Array extends VkDebugUtilsMessengerCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCreateInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessengerCreateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsMessengerCreateInfoEXT o){
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


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkDebugUtilsMessengerCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCreateInfoEXT.Pointer> {
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

            public Array(VkDebugUtilsMessengerCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsMessengerCreateInfoEXT.Pointer get(int i){
                return new VkDebugUtilsMessengerCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
