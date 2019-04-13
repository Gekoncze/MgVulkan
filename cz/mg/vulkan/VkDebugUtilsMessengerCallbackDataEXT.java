package cz.mg.vulkan;

public class VkDebugUtilsMessengerCallbackDataEXT extends VkObject {
    public VkDebugUtilsMessengerCallbackDataEXT() {
        super(sizeof());
    }

    public VkDebugUtilsMessengerCallbackDataEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessengerCallbackDataEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsMessengerCallbackDataEXT(VkStructureType sType, VkObject pNext, VkDebugUtilsMessengerCallbackDataFlagsEXT flags, VkChar pMessageIdName, VkInt32 messageIdNumber, VkChar pMessage, VkUInt32 queueLabelCount, VkDebugUtilsLabelEXT pQueueLabels, VkUInt32 cmdBufLabelCount, VkDebugUtilsLabelEXT pCmdBufLabels, VkUInt32 objectCount, VkDebugUtilsObjectNameInfoEXT pObjects) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setFlags(flags);
        setPMessageIdName(pMessageIdName);
        setMessageIdNumber(messageIdNumber);
        setPMessage(pMessage);
        setQueueLabelCount(queueLabelCount);
        setPQueueLabels(pQueueLabels);
        setCmdBufLabelCount(cmdBufLabelCount);
        setPCmdBufLabels(pCmdBufLabels);
        setObjectCount(objectCount);
        setPObjects(pObjects);
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

    public VkDebugUtilsMessengerCallbackDataFlagsEXT getFlags() {
        return new VkDebugUtilsMessengerCallbackDataFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDebugUtilsMessengerCallbackDataFlagsEXT flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkChar getPMessageIdName() {
        return new VkChar(getVkMemory(), getPMessageIdName(getVkAddress()));
    }

    private VkObject pMessageIdName = null;
    public void setPMessageIdName(VkChar pMessageIdName) {
        setPMessageIdName(getVkAddress(), pMessageIdName != null ? pMessageIdName.getVkAddress() : VkPointer.NULL);
        this.pMessageIdName = pMessageIdName;
    }

    private static native long getPMessageIdName(long address);
    private static native void setPMessageIdName(long address, long pMessageIdName);

    public VkInt32 getMessageIdNumber() {
        return new VkInt32(getVkMemory(), getMessageIdNumber(getVkAddress()));
    }

    
    public void setMessageIdNumber(VkInt32 messageIdNumber) {
        setMessageIdNumber(getVkAddress(), messageIdNumber != null ? messageIdNumber.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMessageIdNumber(long address);
    private static native void setMessageIdNumber(long address, long messageIdNumber);

    public VkChar getPMessage() {
        return new VkChar(getVkMemory(), getPMessage(getVkAddress()));
    }

    private VkObject pMessage = null;
    public void setPMessage(VkChar pMessage) {
        setPMessage(getVkAddress(), pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL);
        this.pMessage = pMessage;
    }

    private static native long getPMessage(long address);
    private static native void setPMessage(long address, long pMessage);

    public VkUInt32 getQueueLabelCount() {
        return new VkUInt32(getVkMemory(), getQueueLabelCount(getVkAddress()));
    }

    
    public void setQueueLabelCount(VkUInt32 queueLabelCount) {
        setQueueLabelCount(getVkAddress(), queueLabelCount != null ? queueLabelCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getQueueLabelCount(long address);
    private static native void setQueueLabelCount(long address, long queueLabelCount);

    public VkDebugUtilsLabelEXT getPQueueLabels() {
        return new VkDebugUtilsLabelEXT(getVkMemory(), getPQueueLabels(getVkAddress()));
    }

    private VkObject pQueueLabels = null;
    public void setPQueueLabels(VkDebugUtilsLabelEXT pQueueLabels) {
        setPQueueLabels(getVkAddress(), pQueueLabels != null ? pQueueLabels.getVkAddress() : VkPointer.NULL);
        this.pQueueLabels = pQueueLabels;
    }

    private static native long getPQueueLabels(long address);
    private static native void setPQueueLabels(long address, long pQueueLabels);

    public VkUInt32 getCmdBufLabelCount() {
        return new VkUInt32(getVkMemory(), getCmdBufLabelCount(getVkAddress()));
    }

    
    public void setCmdBufLabelCount(VkUInt32 cmdBufLabelCount) {
        setCmdBufLabelCount(getVkAddress(), cmdBufLabelCount != null ? cmdBufLabelCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCmdBufLabelCount(long address);
    private static native void setCmdBufLabelCount(long address, long cmdBufLabelCount);

    public VkDebugUtilsLabelEXT getPCmdBufLabels() {
        return new VkDebugUtilsLabelEXT(getVkMemory(), getPCmdBufLabels(getVkAddress()));
    }

    private VkObject pCmdBufLabels = null;
    public void setPCmdBufLabels(VkDebugUtilsLabelEXT pCmdBufLabels) {
        setPCmdBufLabels(getVkAddress(), pCmdBufLabels != null ? pCmdBufLabels.getVkAddress() : VkPointer.NULL);
        this.pCmdBufLabels = pCmdBufLabels;
    }

    private static native long getPCmdBufLabels(long address);
    private static native void setPCmdBufLabels(long address, long pCmdBufLabels);

    public VkUInt32 getObjectCount() {
        return new VkUInt32(getVkMemory(), getObjectCount(getVkAddress()));
    }

    
    public void setObjectCount(VkUInt32 objectCount) {
        setObjectCount(getVkAddress(), objectCount != null ? objectCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getObjectCount(long address);
    private static native void setObjectCount(long address, long objectCount);

    public VkDebugUtilsObjectNameInfoEXT getPObjects() {
        return new VkDebugUtilsObjectNameInfoEXT(getVkMemory(), getPObjects(getVkAddress()));
    }

    private VkObject pObjects = null;
    public void setPObjects(VkDebugUtilsObjectNameInfoEXT pObjects) {
        setPObjects(getVkAddress(), pObjects != null ? pObjects.getVkAddress() : VkPointer.NULL);
        this.pObjects = pObjects;
    }

    private static native long getPObjects(long address);
    private static native void setPObjects(long address, long pObjects);


    public static native long sizeof();

    public static class Array extends VkDebugUtilsMessengerCallbackDataEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCallbackDataEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessengerCallbackDataEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsMessengerCallbackDataEXT o){
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
        public VkDebugUtilsMessengerCallbackDataEXT get(int i){
            return new VkDebugUtilsMessengerCallbackDataEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugUtilsMessengerCallbackDataEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCallbackDataEXT.Pointer> {
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

            public Array(VkDebugUtilsMessengerCallbackDataEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsMessengerCallbackDataEXT.Pointer get(int i){
                return new VkDebugUtilsMessengerCallbackDataEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
