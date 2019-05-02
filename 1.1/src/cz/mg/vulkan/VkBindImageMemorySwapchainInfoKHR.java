package cz.mg.vulkan;

public class VkBindImageMemorySwapchainInfoKHR extends VkObject {
    public VkBindImageMemorySwapchainInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR));
    }

    public VkBindImageMemorySwapchainInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindImageMemorySwapchainInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBindImageMemorySwapchainInfoKHR(VkPointer pointer) {
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

    public VkUInt32 getImageIndex() {
        return new VkUInt32(getVkMemory(), getImageIndexNative(getVkAddress()));
    }

    
    public void setImageIndex(VkUInt32 imageIndex) {
        setImageIndexNative(getVkAddress(), imageIndex != null ? imageIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageIndexQ() {
        return getImageIndex().getValue();
    }

    public void setImageIndex(int imageIndex) {
        getImageIndex().setValue(imageIndex);
    }

    protected static native long getImageIndexNative(long address);
    protected static native void setImageIndexNative(long address, long imageIndex);


    public void set(VkBindImageMemorySwapchainInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkBindImageMemorySwapchainInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemorySwapchainInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindImageMemorySwapchainInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR));;
        }

        public Array(int count, VkBindImageMemorySwapchainInfoKHR o){
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
        public VkBindImageMemorySwapchainInfoKHR get(int i){
            return new VkBindImageMemorySwapchainInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
