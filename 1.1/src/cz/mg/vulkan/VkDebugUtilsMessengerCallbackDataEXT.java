package cz.mg.vulkan;

public class VkDebugUtilsMessengerCallbackDataEXT extends VkObject {
    public VkDebugUtilsMessengerCallbackDataEXT() {
        super(sizeof());
    }

    protected VkDebugUtilsMessengerCallbackDataEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugUtilsMessengerCallbackDataEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsMessengerCallbackDataEXT(VkPointer pointer) {
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

    public VkDebugUtilsMessengerCallbackDataFlagsEXT getFlags() {
        return new VkDebugUtilsMessengerCallbackDataFlagsEXT(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDebugUtilsMessengerCallbackDataFlagsEXT flags) {
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

    public VkChar getPMessageIdName() {
        return new VkChar(getVkMemory(), getPMessageIdNameNative(getVkAddress()));
    }

    private VkObject pMessageIdName = null;
    public void setPMessageIdName(VkChar pMessageIdName) {
        setPMessageIdNameNative(getVkAddress(), pMessageIdName != null ? pMessageIdName.getVkAddress() : VkPointer.NULL);
        this.pMessageIdName = pMessageIdName;
    }

    public String getPMessageIdNameQ() {
        return new VkString(getPMessageIdName()).toString();
    }

    public void setPMessageIdName(String pMessageIdName) {
        setPMessageIdName(new VkString(pMessageIdName));
    }

    protected static native long getPMessageIdNameNative(long address);
    protected static native void setPMessageIdNameNative(long address, long pMessageIdName);

    public VkInt32 getMessageIdNumber() {
        return new VkInt32(getVkMemory(), getMessageIdNumberNative(getVkAddress()));
    }

    
    public void setMessageIdNumber(VkInt32 messageIdNumber) {
        setMessageIdNumberNative(getVkAddress(), messageIdNumber != null ? messageIdNumber.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMessageIdNumberQ() {
        return getMessageIdNumber().getValue();
    }

    public void setMessageIdNumber(int messageIdNumber) {
        getMessageIdNumber().setValue(messageIdNumber);
    }

    protected static native long getMessageIdNumberNative(long address);
    protected static native void setMessageIdNumberNative(long address, long messageIdNumber);

    public VkChar getPMessage() {
        return new VkChar(getVkMemory(), getPMessageNative(getVkAddress()));
    }

    private VkObject pMessage = null;
    public void setPMessage(VkChar pMessage) {
        setPMessageNative(getVkAddress(), pMessage != null ? pMessage.getVkAddress() : VkPointer.NULL);
        this.pMessage = pMessage;
    }

    public String getPMessageQ() {
        return new VkString(getPMessage()).toString();
    }

    public void setPMessage(String pMessage) {
        setPMessage(new VkString(pMessage));
    }

    protected static native long getPMessageNative(long address);
    protected static native void setPMessageNative(long address, long pMessage);

    public VkUInt32 getQueueLabelCount() {
        return new VkUInt32(getVkMemory(), getQueueLabelCountNative(getVkAddress()));
    }

    
    public void setQueueLabelCount(VkUInt32 queueLabelCount) {
        setQueueLabelCountNative(getVkAddress(), queueLabelCount != null ? queueLabelCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueLabelCountQ() {
        return getQueueLabelCount().getValue();
    }

    public void setQueueLabelCount(int queueLabelCount) {
        getQueueLabelCount().setValue(queueLabelCount);
    }

    protected static native long getQueueLabelCountNative(long address);
    protected static native void setQueueLabelCountNative(long address, long queueLabelCount);

    public VkDebugUtilsLabelEXT getPQueueLabels() {
        return new VkDebugUtilsLabelEXT(getVkMemory(), getPQueueLabelsNative(getVkAddress()));
    }

    private VkObject pQueueLabels = null;
    public void setPQueueLabels(VkDebugUtilsLabelEXT pQueueLabels) {
        setPQueueLabelsNative(getVkAddress(), pQueueLabels != null ? pQueueLabels.getVkAddress() : VkPointer.NULL);
        this.pQueueLabels = pQueueLabels;
    }

    public VkDebugUtilsLabelEXT.Array getPQueueLabelsQ() {
        return new VkDebugUtilsLabelEXT.Array(getPQueueLabels(), getQueueLabelCountQ());
    }

    protected static native long getPQueueLabelsNative(long address);
    protected static native void setPQueueLabelsNative(long address, long pQueueLabels);

    public VkUInt32 getCmdBufLabelCount() {
        return new VkUInt32(getVkMemory(), getCmdBufLabelCountNative(getVkAddress()));
    }

    
    public void setCmdBufLabelCount(VkUInt32 cmdBufLabelCount) {
        setCmdBufLabelCountNative(getVkAddress(), cmdBufLabelCount != null ? cmdBufLabelCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCmdBufLabelCountQ() {
        return getCmdBufLabelCount().getValue();
    }

    public void setCmdBufLabelCount(int cmdBufLabelCount) {
        getCmdBufLabelCount().setValue(cmdBufLabelCount);
    }

    protected static native long getCmdBufLabelCountNative(long address);
    protected static native void setCmdBufLabelCountNative(long address, long cmdBufLabelCount);

    public VkDebugUtilsLabelEXT getPCmdBufLabels() {
        return new VkDebugUtilsLabelEXT(getVkMemory(), getPCmdBufLabelsNative(getVkAddress()));
    }

    private VkObject pCmdBufLabels = null;
    public void setPCmdBufLabels(VkDebugUtilsLabelEXT pCmdBufLabels) {
        setPCmdBufLabelsNative(getVkAddress(), pCmdBufLabels != null ? pCmdBufLabels.getVkAddress() : VkPointer.NULL);
        this.pCmdBufLabels = pCmdBufLabels;
    }

    public VkDebugUtilsLabelEXT.Array getPCmdBufLabelsQ() {
        return new VkDebugUtilsLabelEXT.Array(getPCmdBufLabels(), getCmdBufLabelCountQ());
    }

    protected static native long getPCmdBufLabelsNative(long address);
    protected static native void setPCmdBufLabelsNative(long address, long pCmdBufLabels);

    public VkUInt32 getObjectCount() {
        return new VkUInt32(getVkMemory(), getObjectCountNative(getVkAddress()));
    }

    
    public void setObjectCount(VkUInt32 objectCount) {
        setObjectCountNative(getVkAddress(), objectCount != null ? objectCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getObjectCountQ() {
        return getObjectCount().getValue();
    }

    public void setObjectCount(int objectCount) {
        getObjectCount().setValue(objectCount);
    }

    protected static native long getObjectCountNative(long address);
    protected static native void setObjectCountNative(long address, long objectCount);

    public VkDebugUtilsObjectNameInfoEXT getPObjects() {
        return new VkDebugUtilsObjectNameInfoEXT(getVkMemory(), getPObjectsNative(getVkAddress()));
    }

    private VkObject pObjects = null;
    public void setPObjects(VkDebugUtilsObjectNameInfoEXT pObjects) {
        setPObjectsNative(getVkAddress(), pObjects != null ? pObjects.getVkAddress() : VkPointer.NULL);
        this.pObjects = pObjects;
    }

    public VkDebugUtilsObjectNameInfoEXT.Array getPObjectsQ() {
        return new VkDebugUtilsObjectNameInfoEXT.Array(getPObjects(), getObjectCountQ());
    }

    protected static native long getPObjectsNative(long address);
    protected static native void setPObjectsNative(long address, long pObjects);


    public void set(VkDebugUtilsMessengerCallbackDataEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDebugUtilsMessengerCallbackDataEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerCallbackDataEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessengerCallbackDataEXT.sizeof()));
            this.count = count;
        }

        public Array(VkDebugUtilsMessengerCallbackDataEXT o, int count){
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
        public VkDebugUtilsMessengerCallbackDataEXT get(int i){
            return new VkDebugUtilsMessengerCallbackDataEXT(getVkMemory(), address(i));
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
