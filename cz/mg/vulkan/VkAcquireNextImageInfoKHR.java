package cz.mg.vulkan;

public class VkAcquireNextImageInfoKHR extends VkObject {
    public VkAcquireNextImageInfoKHR() {
        super(sizeof());
    }

    public VkAcquireNextImageInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAcquireNextImageInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAcquireNextImageInfoKHR(VkObject pNext, VkSwapchainKHR swapchain, VkUInt64 timeout, VkSemaphore semaphore, VkFence fence, VkUInt32 deviceMask) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR));
        setPNext(pNext);
        setSwapchain(swapchain);
        setTimeout(timeout);
        setSemaphore(semaphore);
        setFence(fence);
        setDeviceMask(deviceMask);
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

    public VkSwapchainKHR getSwapchain() {
        return new VkSwapchainKHR(getVkMemory(), getSwapchain(getVkAddress()));
    }

    
    public void setSwapchain(VkSwapchainKHR swapchain) {
        setSwapchain(getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSwapchain(long address);
    private static native void setSwapchain(long address, long swapchain);

    public VkUInt64 getTimeout() {
        return new VkUInt64(getVkMemory(), getTimeout(getVkAddress()));
    }

    
    public void setTimeout(VkUInt64 timeout) {
        setTimeout(getVkAddress(), timeout != null ? timeout.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getTimeout(long address);
    private static native void setTimeout(long address, long timeout);

    public VkSemaphore getSemaphore() {
        return new VkSemaphore(getVkMemory(), getSemaphore(getVkAddress()));
    }

    
    public void setSemaphore(VkSemaphore semaphore) {
        setSemaphore(getVkAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSemaphore(long address);
    private static native void setSemaphore(long address, long semaphore);

    public VkFence getFence() {
        return new VkFence(getVkMemory(), getFence(getVkAddress()));
    }

    
    public void setFence(VkFence fence) {
        setFence(getVkAddress(), fence != null ? fence.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFence(long address);
    private static native void setFence(long address, long fence);

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMask(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMask(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDeviceMask(long address);
    private static native void setDeviceMask(long address, long deviceMask);


    public static native long sizeof();

    public static class Array extends VkAcquireNextImageInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkAcquireNextImageInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAcquireNextImageInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAcquireNextImageInfoKHR o){
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
        public VkAcquireNextImageInfoKHR get(int i){
            return new VkAcquireNextImageInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkAcquireNextImageInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkAcquireNextImageInfoKHR.Pointer> {
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

            public Array(VkAcquireNextImageInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkAcquireNextImageInfoKHR.Pointer get(int i){
                return new VkAcquireNextImageInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
