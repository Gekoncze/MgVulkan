package cz.mg.vulkan;

public class VkDebugUtilsObjectTagInfoEXT extends VkObject {
    public VkDebugUtilsObjectTagInfoEXT() {
        super(sizeof());
    }

    public VkDebugUtilsObjectTagInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsObjectTagInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsObjectTagInfoEXT(VkObject pNext, VkObjectType objectType, VkUInt64 objectHandle, VkUInt64 tagName, VkSize tagSize, VkObject pTag) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT));
        setPNext(pNext);
        setObjectType(objectType);
        setObjectHandle(objectHandle);
        setTagName(tagName);
        setTagSize(tagSize);
        setPTag(pTag);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkObjectType getObjectType() {
        return new VkObjectType(getVkMemory(), getObjectType(getVkAddress()));
    }

    
    public void setObjectType(VkObjectType objectType) {
        setObjectType(getVkAddress(), objectType != null ? objectType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getObjectType(long address);
    private static native void setObjectType(long address, long objectType);

    public VkUInt64 getObjectHandle() {
        return new VkUInt64(getVkMemory(), getObjectHandle(getVkAddress()));
    }

    
    public void setObjectHandle(VkUInt64 objectHandle) {
        setObjectHandle(getVkAddress(), objectHandle != null ? objectHandle.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getObjectHandle(long address);
    private static native void setObjectHandle(long address, long objectHandle);

    public VkUInt64 getTagName() {
        return new VkUInt64(getVkMemory(), getTagName(getVkAddress()));
    }

    
    public void setTagName(VkUInt64 tagName) {
        setTagName(getVkAddress(), tagName != null ? tagName.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getTagName(long address);
    private static native void setTagName(long address, long tagName);

    public VkSize getTagSize() {
        return new VkSize(getVkMemory(), getTagSize(getVkAddress()));
    }

    
    public void setTagSize(VkSize tagSize) {
        setTagSize(getVkAddress(), tagSize != null ? tagSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getTagSize(long address);
    private static native void setTagSize(long address, long tagSize);

    public VkObject getPTag() {
        return new VkObject(getVkMemory(), getPTag(getVkAddress()));
    }

    private VkObject pTag = null;
    public void setPTag(VkObject pTag) {
        setPTag(getVkAddress(), pTag != null ? pTag.getVkAddress() : VkPointer.NULL);
        this.pTag = pTag;
    }

    private static native long getPTag(long address);
    private static native void setPTag(long address, long pTag);


    public static native long sizeof();

    public static class Array extends VkDebugUtilsObjectTagInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsObjectTagInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsObjectTagInfoEXT.sizeof()));
            this.count = count;
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsObjectTagInfoEXT.Pointer get(int i){
                return new VkDebugUtilsObjectTagInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
