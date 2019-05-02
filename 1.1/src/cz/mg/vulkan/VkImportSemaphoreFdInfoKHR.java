package cz.mg.vulkan;

public class VkImportSemaphoreFdInfoKHR extends VkObject {
    public VkImportSemaphoreFdInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR));
    }

    public VkImportSemaphoreFdInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImportSemaphoreFdInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImportSemaphoreFdInfoKHR(VkPointer pointer) {
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

    public VkSemaphore getSemaphore() {
        return new VkSemaphore(getVkMemory(), getSemaphoreNative(getVkAddress()));
    }

    
    public void setSemaphore(VkSemaphore semaphore) {
        setSemaphoreNative(getVkAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSemaphoreNative(long address);
    protected static native void setSemaphoreNative(long address, long semaphore);

    public VkSemaphoreImportFlags getFlags() {
        return new VkSemaphoreImportFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkSemaphoreImportFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkExternalSemaphoreHandleTypeFlagBits getHandleType() {
        return new VkExternalSemaphoreHandleTypeFlagBits(getVkMemory(), getHandleTypeNative(getVkAddress()));
    }

    
    public void setHandleType(VkExternalSemaphoreHandleTypeFlagBits handleType) {
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


    public void set(VkImportSemaphoreFdInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImportSemaphoreFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImportSemaphoreFdInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImportSemaphoreFdInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR));;
        }

        public Array(int count, VkImportSemaphoreFdInfoKHR o){
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
        public VkImportSemaphoreFdInfoKHR get(int i){
            return new VkImportSemaphoreFdInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
