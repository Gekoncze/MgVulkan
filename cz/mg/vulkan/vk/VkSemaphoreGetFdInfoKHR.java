package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphoreGetFdInfoKHR.html">khronos documentation</a>
 **/
public class VkSemaphoreGetFdInfoKHR extends VkObject {
    public VkSemaphoreGetFdInfoKHR() {
        super(sizeof());
    }

    public VkSemaphoreGetFdInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSemaphoreGetFdInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSemaphoreGetFdInfoKHR(VkObject pNext, VkSemaphore semaphore, VkExternalSemaphoreHandleTypeFlagBits handleType) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR));
        setPNext(pNext);
        setSemaphore(semaphore);
        setHandleType(handleType);
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

    public VkSemaphore getSemaphore() {
        return new VkSemaphore(getVkMemory(), getSemaphore(getVkAddress()));
    }

    
    public void setSemaphore(VkSemaphore semaphore) {
        setSemaphore(getVkAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSemaphore(long address);
    private static native void setSemaphore(long address, long semaphore);

    public VkExternalSemaphoreHandleTypeFlagBits getHandleType() {
        return new VkExternalSemaphoreHandleTypeFlagBits(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalSemaphoreHandleTypeFlagBits handleType) {
        setHandleType(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getHandleType(long address);
    private static native void setHandleType(long address, long handleType);


    public static native long sizeof();

    public static class Array extends VkSemaphoreGetFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkSemaphoreGetFdInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSemaphoreGetFdInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSemaphoreGetFdInfoKHR o){
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
        public VkSemaphoreGetFdInfoKHR get(int i){
            return new VkSemaphoreGetFdInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSemaphoreGetFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkSemaphoreGetFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
