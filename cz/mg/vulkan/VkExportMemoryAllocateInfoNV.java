package cz.mg.vulkan;

public class VkExportMemoryAllocateInfoNV extends VkObject {
    public VkExportMemoryAllocateInfoNV() {
        super(sizeof());
    }

    public VkExportMemoryAllocateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExportMemoryAllocateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExportMemoryAllocateInfoNV(VkObject pNext, VkExternalMemoryHandleTypeFlagsNV handleTypes) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV));
        setPNext(pNext);
        setHandleTypes(handleTypes);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkExternalMemoryHandleTypeFlagsNV getHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsNV(getVkMemory(), getHandleTypes(getVkAddress()));
    }

    
    public void setHandleTypes(VkExternalMemoryHandleTypeFlagsNV handleTypes) {
        setHandleTypes(getVkAddress(), handleTypes != null ? handleTypes.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getHandleTypes(long address);
    private static native void setHandleTypes(long address, long handleTypes);


    public static native long sizeof();

    public static class Array extends VkExportMemoryAllocateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkExportMemoryAllocateInfoNV> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExportMemoryAllocateInfoNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExportMemoryAllocateInfoNV o){
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
        public VkExportMemoryAllocateInfoNV get(int i){
            return new VkExportMemoryAllocateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExportMemoryAllocateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExportMemoryAllocateInfoNV.Pointer> {
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

            public Array(VkExportMemoryAllocateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExportMemoryAllocateInfoNV.Pointer get(int i){
                return new VkExportMemoryAllocateInfoNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
