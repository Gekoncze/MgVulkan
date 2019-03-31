package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugMarkerObjectTagInfoEXT.html">khronos documentation</a>
 **/
public class VkDebugMarkerObjectTagInfoEXT extends VkObject {
    public VkDebugMarkerObjectTagInfoEXT() {
        super(sizeof());
    }

    public VkDebugMarkerObjectTagInfoEXT(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDebugMarkerObjectTagInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDebugMarkerObjectTagInfoEXT(VkObject pNext, VkDebugReportObjectTypeEXT objectType, VkUInt64 object, VkUInt64 tagName, VkSize tagSize, VkObject pTag) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT));
        setPNext(pNext);
        setObjectType(objectType);
        setObject(object);
        setTagName(tagName);
        setTagSize(tagSize);
        setPTag(pTag);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkDebugReportObjectTypeEXT getObjectType() {
        return new VkDebugReportObjectTypeEXT(getVkMemory(), getObjectType(getVkAddress()));
    }

    public void setObjectType(VkDebugReportObjectTypeEXT objectType) {
        setObjectType(getVkAddress(), objectType.getVkAddress());
    }

    private static native long getObjectType(long address);
    private static native void setObjectType(long address, long objectType);

    public VkUInt64 getObject() {
        return new VkUInt64(getVkMemory(), getObject(getVkAddress()));
    }

    public void setObject(VkUInt64 object) {
        setObject(getVkAddress(), object.getVkAddress());
    }

    private static native long getObject(long address);
    private static native void setObject(long address, long object);

    public VkUInt64 getTagName() {
        return new VkUInt64(getVkMemory(), getTagName(getVkAddress()));
    }

    public void setTagName(VkUInt64 tagName) {
        setTagName(getVkAddress(), tagName.getVkAddress());
    }

    private static native long getTagName(long address);
    private static native void setTagName(long address, long tagName);

    public VkSize getTagSize() {
        return new VkSize(getVkMemory(), getTagSize(getVkAddress()));
    }

    public void setTagSize(VkSize tagSize) {
        setTagSize(getVkAddress(), tagSize.getVkAddress());
    }

    private static native long getTagSize(long address);
    private static native void setTagSize(long address, long tagSize);

    public VkObject getPTag() {
        return new VkObject(getVkMemory(), getPTag(getVkAddress()));
    }

    public void setPTag(VkObject pTag) {
        setPTag(getVkAddress(), pTag.getVkAddress());
    }

    private static native long getPTag(long address);
    private static native void setPTag(long address, long pTag);


    public static native long sizeof();

    public static class Array extends VkDebugMarkerObjectTagInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerObjectTagInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkDebugMarkerObjectTagInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
