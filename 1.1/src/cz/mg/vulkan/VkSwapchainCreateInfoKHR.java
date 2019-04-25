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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkSwapchainCreateFlagsKHR getFlags() {
        return new VkSwapchainCreateFlagsKHR(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSwapchainCreateFlagsKHR flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkSurfaceKHR getSurface() {
        return new VkSurfaceKHR(getVkMemory(), getSurface(getVkAddress()));
    }

    
    public void setSurface(VkSurfaceKHR surface) {
        setSurface(getVkAddress(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getSurface(long address);
    protected static native void setSurface(long address, long surface);

    public VkUInt32 getMinImageCount() {
        return new VkUInt32(getVkMemory(), getMinImageCount(getVkAddress()));
    }

    
    public void setMinImageCount(VkUInt32 minImageCount) {
        setMinImageCount(getVkAddress(), minImageCount != null ? minImageCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMinImageCountQ() {
        return getMinImageCount().getValue();
    }

    public void setMinImageCount(int minImageCount) {
        getMinImageCount().setValue(minImageCount);
    }

    protected static native long getMinImageCount(long address);
    protected static native void setMinImageCount(long address, long minImageCount);

    public VkFormat getImageFormat() {
        return new VkFormat(getVkMemory(), getImageFormat(getVkAddress()));
    }

    
    public void setImageFormat(VkFormat imageFormat) {
        setImageFormat(getVkAddress(), imageFormat != null ? imageFormat.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageFormatQ() {
        return getImageFormat().getValue();
    }

    public void setImageFormat(int imageFormat) {
        getImageFormat().setValue(imageFormat);
    }

    protected static native long getImageFormat(long address);
    protected static native void setImageFormat(long address, long imageFormat);

    public VkColorSpaceKHR getImageColorSpace() {
        return new VkColorSpaceKHR(getVkMemory(), getImageColorSpace(getVkAddress()));
    }

    
    public void setImageColorSpace(VkColorSpaceKHR imageColorSpace) {
        setImageColorSpace(getVkAddress(), imageColorSpace != null ? imageColorSpace.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageColorSpaceQ() {
        return getImageColorSpace().getValue();
    }

    public void setImageColorSpace(int imageColorSpace) {
        getImageColorSpace().setValue(imageColorSpace);
    }

    protected static native long getImageColorSpace(long address);
    protected static native void setImageColorSpace(long address, long imageColorSpace);

    public VkExtent2D getImageExtent() {
        return new VkExtent2D(getVkMemory(), getImageExtent(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent2D imageExtent) {
        setImageExtent(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getImageExtent(long address);
    protected static native void setImageExtent(long address, long imageExtent);

    public VkUInt32 getImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getImageArrayLayers(getVkAddress()));
    }

    
    public void setImageArrayLayers(VkUInt32 imageArrayLayers) {
        setImageArrayLayers(getVkAddress(), imageArrayLayers != null ? imageArrayLayers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageArrayLayersQ() {
        return getImageArrayLayers().getValue();
    }

    public void setImageArrayLayers(int imageArrayLayers) {
        getImageArrayLayers().setValue(imageArrayLayers);
    }

    protected static native long getImageArrayLayers(long address);
    protected static native void setImageArrayLayers(long address, long imageArrayLayers);

    public VkImageUsageFlags getImageUsage() {
        return new VkImageUsageFlags(getVkMemory(), getImageUsage(getVkAddress()));
    }

    
    public void setImageUsage(VkImageUsageFlags imageUsage) {
        setImageUsage(getVkAddress(), imageUsage != null ? imageUsage.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageUsageQ() {
        return getImageUsage().getValue();
    }

    public void setImageUsage(int imageUsage) {
        getImageUsage().setValue(imageUsage);
    }

    protected static native long getImageUsage(long address);
    protected static native void setImageUsage(long address, long imageUsage);

    public VkSharingMode getImageSharingMode() {
        return new VkSharingMode(getVkMemory(), getImageSharingMode(getVkAddress()));
    }

    
    public void setImageSharingMode(VkSharingMode imageSharingMode) {
        setImageSharingMode(getVkAddress(), imageSharingMode != null ? imageSharingMode.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageSharingModeQ() {
        return getImageSharingMode().getValue();
    }

    public void setImageSharingMode(int imageSharingMode) {
        getImageSharingMode().setValue(imageSharingMode);
    }

    protected static native long getImageSharingMode(long address);
    protected static native void setImageSharingMode(long address, long imageSharingMode);

    public VkUInt32 getQueueFamilyIndexCount() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexCount(getVkAddress()));
    }

    
    public void setQueueFamilyIndexCount(VkUInt32 queueFamilyIndexCount) {
        setQueueFamilyIndexCount(getVkAddress(), queueFamilyIndexCount != null ? queueFamilyIndexCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getQueueFamilyIndexCountQ() {
        return getQueueFamilyIndexCount().getValue();
    }

    public void setQueueFamilyIndexCount(int queueFamilyIndexCount) {
        getQueueFamilyIndexCount().setValue(queueFamilyIndexCount);
    }

    protected static native long getQueueFamilyIndexCount(long address);
    protected static native void setQueueFamilyIndexCount(long address, long queueFamilyIndexCount);

    public VkUInt32 getPQueueFamilyIndices() {
        return new VkUInt32(getVkMemory(), getPQueueFamilyIndices(getVkAddress()));
    }

    private VkObject pQueueFamilyIndices = null;
    public void setPQueueFamilyIndices(VkUInt32 pQueueFamilyIndices) {
        setPQueueFamilyIndices(getVkAddress(), pQueueFamilyIndices != null ? pQueueFamilyIndices.getVkAddress() : VkPointer.NULL);
        this.pQueueFamilyIndices = pQueueFamilyIndices;
    }

    protected static native long getPQueueFamilyIndices(long address);
    protected static native void setPQueueFamilyIndices(long address, long pQueueFamilyIndices);

    public VkSurfaceTransformFlagBitsKHR getPreTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getPreTransform(getVkAddress()));
    }

    
    public void setPreTransform(VkSurfaceTransformFlagBitsKHR preTransform) {
        setPreTransform(getVkAddress(), preTransform != null ? preTransform.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPreTransformQ() {
        return getPreTransform().getValue();
    }

    public void setPreTransform(int preTransform) {
        getPreTransform().setValue(preTransform);
    }

    protected static native long getPreTransform(long address);
    protected static native void setPreTransform(long address, long preTransform);

    public VkCompositeAlphaFlagBitsKHR getCompositeAlpha() {
        return new VkCompositeAlphaFlagBitsKHR(getVkMemory(), getCompositeAlpha(getVkAddress()));
    }

    
    public void setCompositeAlpha(VkCompositeAlphaFlagBitsKHR compositeAlpha) {
        setCompositeAlpha(getVkAddress(), compositeAlpha != null ? compositeAlpha.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getCompositeAlphaQ() {
        return getCompositeAlpha().getValue();
    }

    public void setCompositeAlpha(int compositeAlpha) {
        getCompositeAlpha().setValue(compositeAlpha);
    }

    protected static native long getCompositeAlpha(long address);
    protected static native void setCompositeAlpha(long address, long compositeAlpha);

    public VkPresentModeKHR getPresentMode() {
        return new VkPresentModeKHR(getVkMemory(), getPresentMode(getVkAddress()));
    }

    
    public void setPresentMode(VkPresentModeKHR presentMode) {
        setPresentMode(getVkAddress(), presentMode != null ? presentMode.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPresentModeQ() {
        return getPresentMode().getValue();
    }

    public void setPresentMode(int presentMode) {
        getPresentMode().setValue(presentMode);
    }

    protected static native long getPresentMode(long address);
    protected static native void setPresentMode(long address, long presentMode);

    public VkBool32 getClipped() {
        return new VkBool32(getVkMemory(), getClipped(getVkAddress()));
    }

    
    public void setClipped(VkBool32 clipped) {
        setClipped(getVkAddress(), clipped != null ? clipped.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getClippedQ() {
        return getClipped().getValue();
    }

    public void setClipped(int clipped) {
        getClipped().setValue(clipped);
    }

    protected static native long getClipped(long address);
    protected static native void setClipped(long address, long clipped);

    public VkSwapchainKHR getOldSwapchain() {
        return new VkSwapchainKHR(getVkMemory(), getOldSwapchain(getVkAddress()));
    }

    
    public void setOldSwapchain(VkSwapchainKHR oldSwapchain) {
        setOldSwapchain(getVkAddress(), oldSwapchain != null ? oldSwapchain.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getOldSwapchain(long address);
    protected static native void setOldSwapchain(long address, long oldSwapchain);


    public static native long sizeof();

    public static class Array extends VkSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkSwapchainCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSwapchainCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR));;
        }

        public Array(int count, VkSwapchainCreateInfoKHR o){
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

        public static class Array extends VkSwapchainCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSwapchainCreateInfoKHR.Pointer> {
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

            public Array(VkSwapchainCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSwapchainCreateInfoKHR.Pointer get(int i){
                return new VkSwapchainCreateInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
