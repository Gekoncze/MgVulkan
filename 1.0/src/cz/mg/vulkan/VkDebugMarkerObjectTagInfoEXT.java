package cz.mg.vulkan;

public class VkDebugMarkerObjectTagInfoEXT extends VkObject {
    public VkDebugMarkerObjectTagInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT));
    }

    public VkDebugMarkerObjectTagInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugMarkerObjectTagInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugMarkerObjectTagInfoEXT(VkPointer pointer) {
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

    public VkUInt64 getTagName() {
        return new VkUInt64(getVkMemory(), getTagName(getVkAddress()));
    }

    
    public void setTagName(VkUInt64 tagName) {
        setTagName(getVkAddress(), tagName != null ? tagName.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getTagNameQ() {
        return getTagName().getValue();
    }

    public void setTagName(long tagName) {
        getTagName().setValue(tagName);
    }

    protected static native long getTagName(long address);
    protected static native void setTagName(long address, long tagName);

    public VkSize getTagSize() {
        return new VkSize(getVkMemory(), getTagSize(getVkAddress()));
    }

    
    public void setTagSize(VkSize tagSize) {
        setTagSize(getVkAddress(), tagSize != null ? tagSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getTagSizeQ() {
        return getTagSize().getValue();
    }

    public void setTagSize(long tagSize) {
        getTagSize().setValue(tagSize);
    }

    protected static native long getTagSize(long address);
    protected static native void setTagSize(long address, long tagSize);

    public VkObject getPTag() {
        return new VkObject(getVkMemory(), getPTag(getVkAddress()));
    }

    private VkObject pTag = null;
    public void setPTag(VkObject pTag) {
        setPTag(getVkAddress(), pTag != null ? pTag.getVkAddress() : VkPointer.NULL);
        this.pTag = pTag;
    }

    protected static native long getPTag(long address);
    protected static native void setPTag(long address, long pTag);


    public static native long sizeof();

    public static class Array extends VkDebugMarkerObjectTagInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerObjectTagInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugMarkerObjectTagInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT));;
        }

        public Array(int count, VkDebugMarkerObjectTagInfoEXT o){
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
        public VkDebugMarkerObjectTagInfoEXT get(int i){
            return new VkDebugMarkerObjectTagInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
