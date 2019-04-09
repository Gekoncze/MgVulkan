package cz.mg.vulkan;

public class VkDebugReportCallbackCreateInfoEXT extends VkObject {
    public VkDebugReportCallbackCreateInfoEXT() {
        super(sizeof());
    }

    public VkDebugReportCallbackCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugReportCallbackCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugReportCallbackCreateInfoEXT(VkObject pNext, VkDebugReportFlagsEXT flags, PFNvkDebugReportCallbackEXT pfnCallback, VkObject pUserData) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT));
        setPNext(pNext);
        setFlags(flags);
        setPfnCallback(pfnCallback);
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

    public VkDebugReportFlagsEXT getFlags() {
        return new VkDebugReportFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDebugReportFlagsEXT flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public PFNvkDebugReportCallbackEXT getPfnCallback() {
        return new PFNvkDebugReportCallbackEXT(getVkMemory(), getPfnCallback(getVkAddress()));
    }

    
    public void setPfnCallback(PFNvkDebugReportCallbackEXT pfnCallback) {
        setPfnCallback(getVkAddress(), pfnCallback != null ? pfnCallback.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPfnCallback(long address);
    private static native void setPfnCallback(long address, long pfnCallback);

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

    public static class Array extends VkDebugReportCallbackCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugReportCallbackCreateInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugReportCallbackCreateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugReportCallbackCreateInfoEXT o){
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

        public static class Array extends VkDebugReportCallbackCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugReportCallbackCreateInfoEXT.Pointer> {
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

            public Array(VkDebugReportCallbackCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugReportCallbackCreateInfoEXT.Pointer get(int i){
                return new VkDebugReportCallbackCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
