package cz.mg.vulkan;

public class VkImportMemoryFdInfoKHR extends VkObject {
    public VkImportMemoryFdInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR));
    }

    public VkImportMemoryFdInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImportMemoryFdInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImportMemoryFdInfoKHR(VkPointer pointer) {
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

    public VkExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VkExternalMemoryHandleTypeFlagBits(getVkMemory(), getHandleTypeNative(getVkAddress()));
    }

    
    public void setHandleType(VkExternalMemoryHandleTypeFlagBits handleType) {
        setHandleTypeNative(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHandleTypeQ() {
        return getHandleType().getValue();
    }

    public void setHandleType(int handleType) {
        getHandleType().setValue(handleType);
    }

    protected static native long getHandleTypeNative(long address);
    protected static native void setHandleTypeNative(long address, long handleType);

    public VkInt getFd() {
        return new VkInt(getVkMemory(), getFdNative(getVkAddress()));
    }

    
    public void setFd(VkInt fd) {
        setFdNative(getVkAddress(), fd != null ? fd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFdQ() {
        return getFd().getValue();
    }

    public void setFd(int fd) {
        getFd().setValue(fd);
    }

    protected static native long getFdNative(long address);
    protected static native void setFdNative(long address, long fd);


    public void set(VkImportMemoryFdInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImportMemoryFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImportMemoryFdInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImportMemoryFdInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR));;
        }

        public Array(int count, VkImportMemoryFdInfoKHR o){
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
        public VkImportMemoryFdInfoKHR get(int i){
            return new VkImportMemoryFdInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
