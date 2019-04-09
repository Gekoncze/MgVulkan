package cz.mg.vulkan;

public class VkImportMemoryHostPointerInfoEXT extends VkObject {
    public VkImportMemoryHostPointerInfoEXT() {
        super(sizeof());
    }

    public VkImportMemoryHostPointerInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImportMemoryHostPointerInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImportMemoryHostPointerInfoEXT(VkObject pNext, VkExternalMemoryHandleTypeFlagBits handleType, VkObject pHostPointer) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT));
        setPNext(pNext);
        setHandleType(handleType);
        setPHostPointer(pHostPointer);
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

    public VkExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VkExternalMemoryHandleTypeFlagBits(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalMemoryHandleTypeFlagBits handleType) {
        setHandleType(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getHandleType(long address);
    private static native void setHandleType(long address, long handleType);

    public VkObject getPHostPointer() {
        return new VkObject(getVkMemory(), getPHostPointer(getVkAddress()));
    }

    private VkObject pHostPointer = null;
    public void setPHostPointer(VkObject pHostPointer) {
        setPHostPointer(getVkAddress(), pHostPointer != null ? pHostPointer.getVkAddress() : VkPointer.NULL);
        this.pHostPointer = pHostPointer;
    }

    private static native long getPHostPointer(long address);
    private static native void setPHostPointer(long address, long pHostPointer);


    public static native long sizeof();

    public static class Array extends VkImportMemoryHostPointerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkImportMemoryHostPointerInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImportMemoryHostPointerInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImportMemoryHostPointerInfoEXT o){
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
        public VkImportMemoryHostPointerInfoEXT get(int i){
            return new VkImportMemoryHostPointerInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImportMemoryHostPointerInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImportMemoryHostPointerInfoEXT.Pointer> {
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

            public Array(VkImportMemoryHostPointerInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImportMemoryHostPointerInfoEXT.Pointer get(int i){
                return new VkImportMemoryHostPointerInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
