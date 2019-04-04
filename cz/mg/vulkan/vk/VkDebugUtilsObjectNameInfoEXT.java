package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsObjectNameInfoEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsObjectNameInfoEXT extends VkObject {
    public VkDebugUtilsObjectNameInfoEXT() {
        super(sizeof());
    }

    public VkDebugUtilsObjectNameInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsObjectNameInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugUtilsObjectNameInfoEXT(VkObject pNext, VkObjectType objectType, VkUInt64 objectHandle, VkChar pObjectName) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT));
        setPNext(pNext);
        setObjectType(objectType);
        setObjectHandle(objectHandle);
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

    public VkObjectType getObjectType() {
        return new VkObjectType(getVkMemory(), getObjectType(getVkAddress()));
    }

    
    public void setObjectType(VkObjectType objectType) {
        setObjectType(getVkAddress(), objectType != null ? objectType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getObjectType(long address);
    private static native void setObjectType(long address, long objectType);

    public VkUInt64 getObjectHandle() {
        return new VkUInt64(getVkMemory(), getObjectHandle(getVkAddress()));
    }

    
    public void setObjectHandle(VkUInt64 objectHandle) {
        setObjectHandle(getVkAddress(), objectHandle != null ? objectHandle.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getObjectHandle(long address);
    private static native void setObjectHandle(long address, long objectHandle);

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

    public static class Array extends VkDebugUtilsObjectNameInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsObjectNameInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsObjectNameInfoEXT.sizeof()));
            this.count = count;
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

        public static class Array extends VkDebugUtilsObjectNameInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsObjectNameInfoEXT.Pointer> {
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

            public Array(VkDebugUtilsObjectNameInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsObjectNameInfoEXT.Pointer get(int i){
                return new VkDebugUtilsObjectNameInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
