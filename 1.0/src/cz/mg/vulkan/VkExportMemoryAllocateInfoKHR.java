package cz.mg.vulkan;

public class VkExportMemoryAllocateInfoKHR extends VkObject {
    public VkExportMemoryAllocateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHR));
    }

    public VkExportMemoryAllocateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExportMemoryAllocateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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

    public VkExternalMemoryHandleTypeFlagsKHR getHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsKHR(getVkMemory(), getHandleTypes(getVkAddress()));
    }

    
    public void setHandleTypes(VkExternalMemoryHandleTypeFlagsKHR handleTypes) {
        setHandleTypes(getVkAddress(), handleTypes != null ? handleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getHandleTypesQ() {
        return getHandleTypes().getValue();
    }

    public void setHandleTypes(int handleTypes) {
        getHandleTypes().setValue(handleTypes);
    }

    private static native long getHandleTypes(long address);
    private static native void setHandleTypes(long address, long handleTypes);


    public static native long sizeof();

    public static class Array extends VkExportMemoryAllocateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkExportMemoryAllocateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExportMemoryAllocateInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExportMemoryAllocateInfoKHR o){
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
        public VkExportMemoryAllocateInfoKHR get(int i){
            return new VkExportMemoryAllocateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExportMemoryAllocateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExportMemoryAllocateInfoKHR.Pointer> {
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

            public Array(VkExportMemoryAllocateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExportMemoryAllocateInfoKHR.Pointer get(int i){
                return new VkExportMemoryAllocateInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
