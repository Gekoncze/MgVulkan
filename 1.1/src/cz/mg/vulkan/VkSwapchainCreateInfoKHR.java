package cz.mg.vulkan;

public class VkSwapchainCreateInfoKHR extends VkObject {
    public VkSwapchainCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR));
    }

    public VkSwapchainCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSwapchainCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSwapchainCreateInfoKHR(VkPointer pointer) {
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

    public VkSwapchainCreateFlagsKHR getFlags() {
        return new VkSwapchainCreateFlagsKHR(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkSwapchainCreateFlagsKHR flags) {
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

    public VkSurfaceKHR getSurface() {
        return new VkSurfaceKHR(getVkMemory(), getSurfaceNative(getVkAddress()));
    }

    
    public void setSurface(VkSurfaceKHR surface) {
        setSurfaceNative(getVkAddress(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSurfaceNative(long address);
    protected static native void setSurfaceNative(long address, long surface);

    public VkUInt32 getMinImageCount() {
        return new VkUInt32(getVkMemory(), getMinImageCountNative(getVkAddress()));
    }

    
    public void setMinImageCount(VkUInt32 minImageCount) {
        setMinImageCountNative(getVkAddress(), minImageCount != null ? minImageCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinImageCountQ() {
        return getMinImageCount().getValue();
    }

    public void setMinImageCount(int minImageCount) {
        getMinImageCount().setValue(minImageCount);
    }

    protected static native long getMinImageCountNative(long address);
    protected static native void setMinImageCountNative(long address, long minImageCount);

    public VkFormat getImageFormat() {
        return new VkFormat(getVkMemory(), getImageFormatNative(getVkAddress()));
    }

    
    public void setImageFormat(VkFormat imageFormat) {
        setImageFormatNative(getVkAddress(), imageFormat != null ? imageFormat.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageFormatQ() {
        return getImageFormat().getValue();
    }

    public void setImageFormat(int imageFormat) {
        getImageFormat().setValue(imageFormat);
    }

    protected static native long getImageFormatNative(long address);
    protected static native void setImageFormatNative(long address, long imageFormat);

    public VkColorSpaceKHR getImageColorSpace() {
        return new VkColorSpaceKHR(getVkMemory(), getImageColorSpaceNative(getVkAddress()));
    }

    
    public void setImageColorSpace(VkColorSpaceKHR imageColorSpace) {
        setImageColorSpaceNative(getVkAddress(), imageColorSpace != null ? imageColorSpace.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageColorSpaceQ() {
        return getImageColorSpace().getValue();
    }

    public void setImageColorSpace(int imageColorSpace) {
        getImageColorSpace().setValue(imageColorSpace);
    }

    protected static native long getImageColorSpaceNative(long address);
    protected static native void setImageColorSpaceNative(long address, long imageColorSpace);

    public VkExtent2D getImageExtent() {
        return new VkExtent2D(getVkMemory(), getImageExtentNative(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent2D imageExtent) {
        setImageExtentNative(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageExtentNative(long address);
    protected static native void setImageExtentNative(long address, long imageExtent);

    public VkUInt32 getImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getImageArrayLayersNative(getVkAddress()));
    }

    
    public void setImageArrayLayers(VkUInt32 imageArrayLayers) {
        setImageArrayLayersNative(getVkAddress(), imageArrayLayers != null ? imageArrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageArrayLayersQ() {
        return getImageArrayLayers().getValue();
    }

    public void setImageArrayLayers(int imageArrayLayers) {
        getImageArrayLayers().setValue(imageArrayLayers);
    }

    protected static native long getImageArrayLayersNative(long address);
    protected static native void setImageArrayLayersNative(long address, long imageArrayLayers);

    public VkImageUsageFlags getImageUsage() {
        return new VkImageUsageFlags(getVkMemory(), getImageUsageNative(getVkAddress()));
    }

    
    public void setImageUsage(VkImageUsageFlags imageUsage) {
        setImageUsageNative(getVkAddress(), imageUsage != null ? imageUsage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageUsageQ() {
        return getImageUsage().getValue();
    }

    public void setImageUsage(int imageUsage) {
        getImageUsage().setValue(imageUsage);
    }

    protected static native long getImageUsageNative(long address);
    protected static native void setImageUsageNative(long address, long imageUsage);

    public VkSharingMode getImageSharingMode() {
        return new VkSharingMode(getVkMemory(), getImageSharingModeNative(getVkAddress()));
    }

    
    public void setImageSharingMode(VkSharingMode imageSharingMode) {
        setImageSharingModeNative(getVkAddress(), imageSharingMode != null ? imageSharingMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageSharingModeQ() {
        return getImageSharingMode().getValue();
    }

    public void setImageSharingMode(int imageSharingMode) {
        getImageSharingMode().setValue(imageSharingMode);
    }

    protected static native long getImageSharingModeNative(long address);
    protected static native void setImageSharingModeNative(long address, long imageSharingMode);

    public VkUInt32 getQueueFamilyIndexCount() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexCountNative(getVkAddress()));
    }

    
    public void setQueueFamilyIndexCount(VkUInt32 queueFamilyIndexCount) {
        setQueueFamilyIndexCountNative(getVkAddress(), queueFamilyIndexCount != null ? queueFamilyIndexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueFamilyIndexCountQ() {
        return getQueueFamilyIndexCount().getValue();
    }

    public void setQueueFamilyIndexCount(int queueFamilyIndexCount) {
        getQueueFamilyIndexCount().setValue(queueFamilyIndexCount);
    }

    protected static native long getQueueFamilyIndexCountNative(long address);
    protected static native void setQueueFamilyIndexCountNative(long address, long queueFamilyIndexCount);

    public VkUInt32 getPQueueFamilyIndices() {
        return new VkUInt32(getVkMemory(), getPQueueFamilyIndicesNative(getVkAddress()));
    }

    private VkObject pQueueFamilyIndices = null;
    public void setPQueueFamilyIndices(VkUInt32 pQueueFamilyIndices) {
        setPQueueFamilyIndicesNative(getVkAddress(), pQueueFamilyIndices != null ? pQueueFamilyIndices.getVkAddress() : VkPointer.NULL);
        this.pQueueFamilyIndices = pQueueFamilyIndices;
    }

    public VkUInt32.Array getPQueueFamilyIndicesQ() {
        return new VkUInt32.Array(getPQueueFamilyIndices(), getQueueFamilyIndexCountQ());
    }

    protected static native long getPQueueFamilyIndicesNative(long address);
    protected static native void setPQueueFamilyIndicesNative(long address, long pQueueFamilyIndices);

    public VkSurfaceTransformFlagBitsKHR getPreTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getPreTransformNative(getVkAddress()));
    }

    
    public void setPreTransform(VkSurfaceTransformFlagBitsKHR preTransform) {
        setPreTransformNative(getVkAddress(), preTransform != null ? preTransform.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPreTransformQ() {
        return getPreTransform().getValue();
    }

    public void setPreTransform(int preTransform) {
        getPreTransform().setValue(preTransform);
    }

    protected static native long getPreTransformNative(long address);
    protected static native void setPreTransformNative(long address, long preTransform);

    public VkCompositeAlphaFlagBitsKHR getCompositeAlpha() {
        return new VkCompositeAlphaFlagBitsKHR(getVkMemory(), getCompositeAlphaNative(getVkAddress()));
    }

    
    public void setCompositeAlpha(VkCompositeAlphaFlagBitsKHR compositeAlpha) {
        setCompositeAlphaNative(getVkAddress(), compositeAlpha != null ? compositeAlpha.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompositeAlphaQ() {
        return getCompositeAlpha().getValue();
    }

    public void setCompositeAlpha(int compositeAlpha) {
        getCompositeAlpha().setValue(compositeAlpha);
    }

    protected static native long getCompositeAlphaNative(long address);
    protected static native void setCompositeAlphaNative(long address, long compositeAlpha);

    public VkPresentModeKHR getPresentMode() {
        return new VkPresentModeKHR(getVkMemory(), getPresentModeNative(getVkAddress()));
    }

    
    public void setPresentMode(VkPresentModeKHR presentMode) {
        setPresentModeNative(getVkAddress(), presentMode != null ? presentMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPresentModeQ() {
        return getPresentMode().getValue();
    }

    public void setPresentMode(int presentMode) {
        getPresentMode().setValue(presentMode);
    }

    protected static native long getPresentModeNative(long address);
    protected static native void setPresentModeNative(long address, long presentMode);

    public VkBool32 getClipped() {
        return new VkBool32(getVkMemory(), getClippedNative(getVkAddress()));
    }

    
    public void setClipped(VkBool32 clipped) {
        setClippedNative(getVkAddress(), clipped != null ? clipped.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getClippedQ() {
        return getClipped().getValue();
    }

    public void setClipped(int clipped) {
        getClipped().setValue(clipped);
    }

    protected static native long getClippedNative(long address);
    protected static native void setClippedNative(long address, long clipped);

    public VkSwapchainKHR getOldSwapchain() {
        return new VkSwapchainKHR(getVkMemory(), getOldSwapchainNative(getVkAddress()));
    }

    
    public void setOldSwapchain(VkSwapchainKHR oldSwapchain) {
        setOldSwapchainNative(getVkAddress(), oldSwapchain != null ? oldSwapchain.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getOldSwapchainNative(long address);
    protected static native void setOldSwapchainNative(long address, long oldSwapchain);


    public void set(VkSwapchainCreateInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkSwapchainCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSwapchainCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR));;
        }

        public Array(VkSwapchainCreateInfoKHR o, int count){
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
        public VkSwapchainCreateInfoKHR get(int i){
            return new VkSwapchainCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
