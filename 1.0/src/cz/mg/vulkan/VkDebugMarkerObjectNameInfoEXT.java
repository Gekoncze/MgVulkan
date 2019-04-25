package cz.mg.vulkan;

public class VkDebugMarkerObjectNameInfoEXT extends VkObject {
    public VkDebugMarkerObjectNameInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT));
    }

    public VkDebugMarkerObjectNameInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugMarkerObjectNameInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugMarkerObjectNameInfoEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkDebugReportObjectTypeEXT getObjectType() {
        return new VkDebugReportObjectTypeEXT(getVkMemory(), getObjectType(getVkAddress()));
    }

    
    public void setObjectType(VkDebugReportObjectTypeEXT objectType) {
        setObjectType(getVkAddress(), objectType != null ? objectType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getObjectTypeQ() {
        return getObjectType().getValue();
    }

    public void setObjectType(int objectType) {
        getObjectType().setValue(objectType);
    }

    protected static native long getObjectType(long address);
    protected static native void setObjectType(long address, long objectType);

    public VkUInt64 getObject() {
        return new VkUInt64(getVkMemory(), getObject(getVkAddress()));
    }

    
    public void setObject(VkUInt64 object) {
        setObject(getVkAddress(), object != null ? object.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getObjectQ() {
        return getObject().getValue();
    }

    public void setObject(long object) {
        getObject().setValue(object);
    }

    protected static native long getObject(long address);
    protected static native void setObject(long address, long object);

    public VkChar getPObjectName() {
        return new VkChar(getVkMemory(), getPObjectName(getVkAddress()));
    }

    private VkObject pObjectName = null;
    public void setPObjectName(VkChar pObjectName) {
        setPObjectName(getVkAddress(), pObjectName != null ? pObjectName.getVkAddress() : VkPointer.NULL);
        this.pObjectName = pObjectName;
    }

    public String getPObjectNameQ() {
        return new VkString(getPObjectName()).toString();
    }

    public void setPObjectName(String pObjectName) {
        setPObjectName(new VkString(pObjectName));
    }

    protected static native long getPObjectName(long address);
    protected static native void setPObjectName(long address, long pObjectName);


    public static native long sizeof();

    public static class Array extends VkDebugMarkerObjectNameInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerObjectNameInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugMarkerObjectNameInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT));;
        }

        public Array(int count, VkDebugMarkerObjectNameInfoEXT o){
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
        public VkDebugMarkerObjectNameInfoEXT get(int i){
            return new VkDebugMarkerObjectNameInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
