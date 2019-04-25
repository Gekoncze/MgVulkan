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

    public VkObjectType getObjectType() {
        return new VkObjectType(getVkMemory(), getObjectType(getVkAddress()));
    }

    
    public void setObjectType(VkObjectType objectType) {
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

    public VkUInt64 getObjectHandle() {
        return new VkUInt64(getVkMemory(), getObjectHandle(getVkAddress()));
    }

    
    public void setObjectHandle(VkUInt64 objectHandle) {
        setObjectHandle(getVkAddress(), objectHandle != null ? objectHandle.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getObjectHandleQ() {
        return getObjectHandle().getValue();
    }

    public void setObjectHandle(long objectHandle) {
        getObjectHandle().setValue(objectHandle);
    }

    protected static native long getObjectHandle(long address);
    protected static native void setObjectHandle(long address, long objectHandle);

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


    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
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

        public static class Array extends VkDebugUtilsObjectTagInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsObjectTagInfoEXT.Pointer> {
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

            public Array(VkDebugUtilsObjectTagInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsObjectTagInfoEXT.Pointer get(int i){
                return new VkDebugUtilsObjectTagInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
