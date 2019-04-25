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

    public VkSemaphore getSemaphore() {
        return new VkSemaphore(getVkMemory(), getSemaphore(getVkAddress()));
    }

    
    public void setSemaphore(VkSemaphore semaphore) {
        setSemaphore(getVkAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSemaphore(long address);
    protected static native void setSemaphore(long address, long semaphore);

    public VkSemaphoreImportFlags getFlags() {
        return new VkSemaphoreImportFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSemaphoreImportFlags flags) {
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

    public VkExternalSemaphoreHandleTypeFlagBits getHandleType() {
        return new VkExternalSemaphoreHandleTypeFlagBits(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalSemaphoreHandleTypeFlagBits handleType) {
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

        public static class Array extends VkImportSemaphoreFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImportSemaphoreFdInfoKHR.Pointer> {
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

            public Array(VkImportSemaphoreFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImportSemaphoreFdInfoKHR.Pointer get(int i){
                return new VkImportSemaphoreFdInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
