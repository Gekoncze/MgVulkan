package cz.mg.vulkan;

public class VkDebugMarkerObjectNameInfoEXT extends VkObject {
    public VkDebugMarkerObjectNameInfoEXT() {
        super(sizeof());
    }

    public VkDebugMarkerObjectNameInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugMarkerObjectNameInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugMarkerObjectNameInfoEXT(VkObject pNext, VkDebugReportObjectTypeEXT objectType, VkUInt64 object, VkChar pObjectName) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT));
        setPNext(pNext);
        setObjectType(objectType);
        setObject(object);
        setPObjectName(pObjectName);
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

    public VkDebugReportObjectTypeEXT getObjectType() {
        return new VkDebugReportObjectTypeEXT(getVkMemory(), getObjectType(getVkAddress()));
    }

    
    public void setObjectType(VkDebugReportObjectTypeEXT objectType) {
        setObjectType(getVkAddress(), objectType != null ? objectType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getObjectType(long address);
    private static native void setObjectType(long address, long objectType);

    public VkUInt64 getObject() {
        return new VkUInt64(getVkMemory(), getObject(getVkAddress()));
    }

    
    public void setObject(VkUInt64 object) {
        setObject(getVkAddress(), object != null ? object.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getObject(long address);
    private static native void setObject(long address, long object);

    public VkChar getPObjectName() {
        return new VkChar(getVkMemory(), getPObjectName(getVkAddress()));
    }

    private VkObject pObjectName = null;
    public void setPObjectName(VkChar pObjectName) {
        setPObjectName(getVkAddress(), pObjectName != null ? pObjectName.getVkAddress() : VkPointer.NULL);
        this.pObjectName = pObjectName;
    }

    private static native long getPObjectName(long address);
    private static native void setPObjectName(long address, long pObjectName);


    public static native long sizeof();

    public static class Array extends VkDebugMarkerObjectNameInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerObjectNameInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugMarkerObjectNameInfoEXT.sizeof()));
            this.count = count;
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

        public static class Array extends VkDebugMarkerObjectNameInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerObjectNameInfoEXT.Pointer> {
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

            public Array(VkDebugMarkerObjectNameInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugMarkerObjectNameInfoEXT.Pointer get(int i){
                return new VkDebugMarkerObjectNameInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
