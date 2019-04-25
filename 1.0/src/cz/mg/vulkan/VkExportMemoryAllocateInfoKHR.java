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

    public VkExternalMemoryHandleTypeFlagsKHR getHandleTypes() {
        return new VkExternalMemoryHandleTypeFlagsKHR(getVkMemory(), getHandleTypes(getVkAddress()));
    }

    
    public void setHandleTypes(VkExternalMemoryHandleTypeFlagsKHR handleTypes) {
        setHandleTypes(getVkAddress(), handleTypes != null ? handleTypes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHandleTypesQ() {
        return getHandleTypes().getValue();
    }

    public void setHandleTypes(int handleTypes) {
        getHandleTypes().setValue(handleTypes);
    }

    protected static native long getHandleTypes(long address);
    protected static native void setHandleTypes(long address, long handleTypes);


    public static native long sizeof();

    public static class Array extends VkExportMemoryAllocateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkExportMemoryAllocateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExportMemoryAllocateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHR));;
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

}
