package cz.mg.vulkan;

public class VkDebugUtilsObjectNameInfoEXT extends VkObject {
    public VkDebugUtilsObjectNameInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT));
    }

    public VkDebugUtilsObjectNameInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsObjectNameInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsObjectNameInfoEXT(VkPointer pointer) {
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

    public VkObjectType getObjectType() {
        return new VkObjectType(getVkMemory(), getObjectTypeNative(getVkAddress()));
    }

    
    public void setObjectType(VkObjectType objectType) {
        setObjectTypeNative(getVkAddress(), objectType != null ? objectType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getObjectTypeQ() {
        return getObjectType().getValue();
    }

    public void setObjectType(int objectType) {
        getObjectType().setValue(objectType);
    }

    protected static native long getObjectTypeNative(long address);
    protected static native void setObjectTypeNative(long address, long objectType);

    public VkUInt64 getObjectHandle() {
        return new VkUInt64(getVkMemory(), getObjectHandleNative(getVkAddress()));
    }

    
    public void setObjectHandle(VkUInt64 objectHandle) {
        setObjectHandleNative(getVkAddress(), objectHandle != null ? objectHandle.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getObjectHandleQ() {
        return getObjectHandle().getValue();
    }

    public void setObjectHandle(long objectHandle) {
        getObjectHandle().setValue(objectHandle);
    }

    protected static native long getObjectHandleNative(long address);
    protected static native void setObjectHandleNative(long address, long objectHandle);

    public VkChar getPObjectName() {
        return new VkChar(getVkMemory(), getPObjectNameNative(getVkAddress()));
    }

    private VkObject pObjectName = null;
    public void setPObjectName(VkChar pObjectName) {
        setPObjectNameNative(getVkAddress(), pObjectName != null ? pObjectName.getVkAddress() : VkPointer.NULL);
        this.pObjectName = pObjectName;
    }

    public String getPObjectNameQ() {
        return new VkString(getPObjectName()).toString();
    }

    public void setPObjectName(String pObjectName) {
        setPObjectName(new VkString(pObjectName));
    }

    protected static native long getPObjectNameNative(long address);
    protected static native void setPObjectNameNative(long address, long pObjectName);


    public void set(VkDebugUtilsObjectNameInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDebugUtilsObjectNameInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsObjectNameInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsObjectNameInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT));;
        }

        public Array(int count, VkDebugUtilsObjectNameInfoEXT o){
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
        public VkDebugUtilsObjectNameInfoEXT get(int i){
            return new VkDebugUtilsObjectNameInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
