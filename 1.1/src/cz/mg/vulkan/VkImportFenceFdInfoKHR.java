package cz.mg.vulkan;

public class VkImportFenceFdInfoKHR extends VkObject {
    public VkImportFenceFdInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR));
    }

    public VkImportFenceFdInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImportFenceFdInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImportFenceFdInfoKHR(VkPointer pointer) {
        super(pointer);
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

    public VkFence getFence() {
        return new VkFence(getVkMemory(), getFence(getVkAddress()));
    }

    
    public void setFence(VkFence fence) {
        setFence(getVkAddress(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFence(long address);
    protected static native void setFence(long address, long fence);

    public VkFenceImportFlags getFlags() {
        return new VkFenceImportFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkFenceImportFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkExternalFenceHandleTypeFlagBits getHandleType() {
        return new VkExternalFenceHandleTypeFlagBits(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalFenceHandleTypeFlagBits handleType) {
        setHandleType(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHandleTypeQ() {
        return getHandleType().getValue();
    }

    public void setHandleType(int handleType) {
        getHandleType().setValue(handleType);
    }

    protected static native long getHandleType(long address);
    protected static native void setHandleType(long address, long handleType);

    public VkInt getFd() {
        return new VkInt(getVkMemory(), getFd(getVkAddress()));
    }

    
    public void setFd(VkInt fd) {
        setFd(getVkAddress(), fd != null ? fd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFdQ() {
        return getFd().getValue();
    }

    public void setFd(int fd) {
        getFd().setValue(fd);
    }

    protected static native long getFd(long address);
    protected static native void setFd(long address, long fd);


    public static native long sizeof();

    public static class Array extends VkImportFenceFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImportFenceFdInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImportFenceFdInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR));;
        }

        public Array(int count, VkImportFenceFdInfoKHR o){
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
        public VkImportFenceFdInfoKHR get(int i){
            return new VkImportFenceFdInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
