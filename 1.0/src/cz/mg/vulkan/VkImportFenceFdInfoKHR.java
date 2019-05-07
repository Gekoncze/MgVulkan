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

    public VkFence getFence() {
        return new VkFence(getVkMemory(), getFenceNative(getVkAddress()));
    }

    
    public void setFence(VkFence fence) {
        setFenceNative(getVkAddress(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFenceNative(long address);
    protected static native void setFenceNative(long address, long fence);

    public VkFenceImportFlags getFlags() {
        return new VkFenceImportFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkFenceImportFlags flags) {
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

    public VkExternalFenceHandleTypeFlagBits getHandleType() {
        return new VkExternalFenceHandleTypeFlagBits(getVkMemory(), getHandleTypeNative(getVkAddress()));
    }

    
    public void setHandleType(VkExternalFenceHandleTypeFlagBits handleType) {
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


    public void set(VkImportFenceFdInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImportFenceFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImportFenceFdInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImportFenceFdInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR));;
        }

        public Array(VkImportFenceFdInfoKHR o, int count){
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
