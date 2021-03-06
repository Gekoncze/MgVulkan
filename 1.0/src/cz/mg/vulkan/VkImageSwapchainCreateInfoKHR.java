package cz.mg.vulkan;

public class VkImageSwapchainCreateInfoKHR extends VkObject {
    public VkImageSwapchainCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR));
    }

    public VkImageSwapchainCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageSwapchainCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageSwapchainCreateInfoKHR(VkPointer pointer) {
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


    public void set(VkImageSwapchainCreateInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImageSwapchainCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageSwapchainCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR));;
        }

        public Array(VkImageSwapchainCreateInfoKHR o, int count){
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
        public VkImageSwapchainCreateInfoKHR get(int i){
            return new VkImageSwapchainCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
