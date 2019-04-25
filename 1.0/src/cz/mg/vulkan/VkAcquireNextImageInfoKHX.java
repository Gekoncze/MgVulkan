package cz.mg.vulkan;

public class VkAcquireNextImageInfoKHX extends VkObject {
    public VkAcquireNextImageInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX));
    }

    public VkAcquireNextImageInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAcquireNextImageInfoKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAcquireNextImageInfoKHX(VkPointer pointer) {
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

    public VkSwapchainKHR getSwapchain() {
        return new VkSwapchainKHR(getVkMemory(), getSwapchain(getVkAddress()));
    }

    
    public void setSwapchain(VkSwapchainKHR swapchain) {
        setSwapchain(getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSwapchain(long address);
    protected static native void setSwapchain(long address, long swapchain);

    public VkUInt64 getTimeout() {
        return new VkUInt64(getVkMemory(), getTimeout(getVkAddress()));
    }

    
    public void setTimeout(VkUInt64 timeout) {
        setTimeout(getVkAddress(), timeout != null ? timeout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getTimeoutQ() {
        return getTimeout().getValue();
    }

    public void setTimeout(long timeout) {
        getTimeout().setValue(timeout);
    }

    protected static native long getTimeout(long address);
    protected static native void setTimeout(long address, long timeout);

    public VkSemaphore getSemaphore() {
        return new VkSemaphore(getVkMemory(), getSemaphore(getVkAddress()));
    }

    
    public void setSemaphore(VkSemaphore semaphore) {
        setSemaphore(getVkAddress(), semaphore != null ? semaphore.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSemaphore(long address);
    protected static native void setSemaphore(long address, long semaphore);

    public VkFence getFence() {
        return new VkFence(getVkMemory(), getFence(getVkAddress()));
    }

    
    public void setFence(VkFence fence) {
        setFence(getVkAddress(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFence(long address);
    protected static native void setFence(long address, long fence);

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMask(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMask(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceMaskQ() {
        return getDeviceMask().getValue();
    }

    public void setDeviceMask(int deviceMask) {
        getDeviceMask().setValue(deviceMask);
    }

    protected static native long getDeviceMask(long address);
    protected static native void setDeviceMask(long address, long deviceMask);


    public static native long sizeof();

    public static class Array extends VkAcquireNextImageInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkAcquireNextImageInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAcquireNextImageInfoKHX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX));;
        }

        public Array(int count, VkAcquireNextImageInfoKHX o){
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
        public VkAcquireNextImageInfoKHX get(int i){
            return new VkAcquireNextImageInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
