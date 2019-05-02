package cz.mg.vulkan;

public class VkDebugUtilsObjectTagInfoEXT extends VkObject {
    public VkDebugUtilsObjectTagInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT));
    }

    public VkDebugUtilsObjectTagInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsObjectTagInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsObjectTagInfoEXT(VkPointer pointer) {
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

    public VkUInt64 getTagName() {
        return new VkUInt64(getVkMemory(), getTagNameNative(getVkAddress()));
    }

    
    public void setTagName(VkUInt64 tagName) {
        setTagNameNative(getVkAddress(), tagName != null ? tagName.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getTagNameQ() {
        return getTagName().getValue();
    }

    public void setTagName(long tagName) {
        getTagName().setValue(tagName);
    }

    protected static native long getTagNameNative(long address);
    protected static native void setTagNameNative(long address, long tagName);

    public VkSize getTagSize() {
        return new VkSize(getVkMemory(), getTagSizeNative(getVkAddress()));
    }

    
    public void setTagSize(VkSize tagSize) {
        setTagSizeNative(getVkAddress(), tagSize != null ? tagSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getTagSizeQ() {
        return getTagSize().getValue();
    }

    public void setTagSize(long tagSize) {
        getTagSize().setValue(tagSize);
    }

    protected static native long getTagSizeNative(long address);
    protected static native void setTagSizeNative(long address, long tagSize);

    public VkObject getPTag() {
        return new VkObject(getVkMemory(), getPTagNative(getVkAddress()));
    }

    private VkObject pTag = null;
    public void setPTag(VkObject pTag) {
        setPTagNative(getVkAddress(), pTag != null ? pTag.getVkAddress() : VkPointer.NULL);
        this.pTag = pTag;
    }

    protected static native long getPTagNative(long address);
    protected static native void setPTagNative(long address, long pTag);


    public void set(VkDebugUtilsObjectTagInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDebugUtilsObjectTagInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsObjectTagInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsObjectTagInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT));;
        }

        public Array(int count, VkDebugUtilsObjectTagInfoEXT o){
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
        public VkDebugUtilsObjectTagInfoEXT get(int i){
            return new VkDebugUtilsObjectTagInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
