package cz.mg.vulkan;

public class VkAcquireNextImageInfoKHR extends VkObject {
    public VkAcquireNextImageInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR));
    }

    public VkAcquireNextImageInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAcquireNextImageInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAcquireNextImageInfoKHR(VkPointer pointer) {
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

    public VkSwapchainKHR getSwapchain() {
        return new VkSwapchainKHR(getVkMemory(), getSwapchainNative(getVkAddress()));
    }

    
    public void setSwapchain(VkSwapchainKHR swapchain) {
        setSwapchainNative(getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSwapchainNative(long address);
    protected static native void setSwapchainNative(long address, long swapchain);

    public VkUInt64 getTimeout() {
        return new VkUInt64(getVkMemory(), getTimeoutNative(getVkAddress()));
    }

    
    public void setTimeout(VkUInt64 timeout) {
        setTimeoutNative(getVkAddress(), timeout != null ? timeout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getTimeoutQ() {
        return getTimeout().getValue();
    }

    public void setTimeout(long timeout) {
        getTimeout().setValue(timeout);
    }

    protected static native long getTimeoutNative(long address);
    protected static native void setTimeoutNative(long address, long timeout);

    public VkSemaphore getSemaphore() {
        return new VkSemaphore(getVkMemory(), getSemaphoreNative(getVkAddress()));
    }

    
    public void setSemaphore(VkSemaphore semaphore) {
        setSemaphoreNative(getVkAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSemaphoreNative(long address);
    protected static native void setSemaphoreNative(long address, long semaphore);

    public VkFence getFence() {
        return new VkFence(getVkMemory(), getFenceNative(getVkAddress()));
    }

    
    public void setFence(VkFence fence) {
        setFenceNative(getVkAddress(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFenceNative(long address);
    protected static native void setFenceNative(long address, long fence);

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMaskNative(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMaskNative(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceMaskQ() {
        return getDeviceMask().getValue();
    }

    public void setDeviceMask(int deviceMask) {
        getDeviceMask().setValue(deviceMask);
    }

    protected static native long getDeviceMaskNative(long address);
    protected static native void setDeviceMaskNative(long address, long deviceMask);


    public void set(VkAcquireNextImageInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkAcquireNextImageInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkAcquireNextImageInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAcquireNextImageInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR));;
        }

        public Array(VkAcquireNextImageInfoKHR o, int count){
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

}
