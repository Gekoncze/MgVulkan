package cz.mg.vulkan;

public class VkImportFenceFdInfoKHR extends VkObject {
    public VkImportFenceFdInfoKHR() {
        super(sizeof());
    }

    public VkImportFenceFdInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImportFenceFdInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImportFenceFdInfoKHR(VkObject pNext, VkFence fence, VkFenceImportFlags flags, VkExternalFenceHandleTypeFlagBits handleType, VkInt fd) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR));
        setPNext(pNext);
        setFence(fence);
        setFlags(flags);
        setHandleType(handleType);
        setFd(fd);
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

    public VkFence getFence() {
        return new VkFence(getVkMemory(), getFence(getVkAddress()));
    }

    
    public void setFence(VkFence fence) {
        setFence(getVkAddress(), fence != null ? fence.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFence(long address);
    private static native void setFence(long address, long fence);

    public VkFenceImportFlags getFlags() {
        return new VkFenceImportFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkFenceImportFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkExternalFenceHandleTypeFlagBits getHandleType() {
        return new VkExternalFenceHandleTypeFlagBits(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalFenceHandleTypeFlagBits handleType) {
        setHandleType(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getHandleType(long address);
    private static native void setHandleType(long address, long handleType);

    public VkInt getFd() {
        return new VkInt(getVkMemory(), getFd(getVkAddress()));
    }

    
    public void setFd(VkInt fd) {
        setFd(getVkAddress(), fd != null ? fd.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFd(long address);
    private static native void setFd(long address, long fd);


    public static native long sizeof();

    public static class Array extends VkImportFenceFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImportFenceFdInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImportFenceFdInfoKHR.sizeof()));
            this.count = count;
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

        public static class Array extends VkImportFenceFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImportFenceFdInfoKHR.Pointer> {
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

            public Array(VkImportFenceFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImportFenceFdInfoKHR.Pointer get(int i){
                return new VkImportFenceFdInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
