package cz.mg.vulkan;

public class VkSurfaceCapabilities2EXT extends VkObject {
    public VkSurfaceCapabilities2EXT() {
        super(sizeof());
    }

    protected VkSurfaceCapabilities2EXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSurfaceCapabilities2EXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSurfaceCapabilities2EXT(VkPointer pointer) {
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

    public VkUInt32 getMaxImageCount() {
        return new VkUInt32(getVkMemory(), getMaxImageCountNative(getVkAddress()));
    }

    
    public void setMaxImageCount(VkUInt32 maxImageCount) {
        setMaxImageCountNative(getVkAddress(), maxImageCount != null ? maxImageCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageCountQ() {
        return getMaxImageCount().getValue();
    }

    public void setMaxImageCount(int maxImageCount) {
        getMaxImageCount().setValue(maxImageCount);
    }

    protected static native long getMaxImageCountNative(long address);
    protected static native void setMaxImageCountNative(long address, long maxImageCount);

    public VkExtent2D getCurrentExtent() {
        return new VkExtent2D(getVkMemory(), getCurrentExtentNative(getVkAddress()));
    }

    
    public void setCurrentExtent(VkExtent2D currentExtent) {
        setCurrentExtentNative(getVkAddress(), currentExtent != null ? currentExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getCurrentExtentNative(long address);
    protected static native void setCurrentExtentNative(long address, long currentExtent);

    public VkExtent2D getMinImageExtent() {
        return new VkExtent2D(getVkMemory(), getMinImageExtentNative(getVkAddress()));
    }

    
    public void setMinImageExtent(VkExtent2D minImageExtent) {
        setMinImageExtentNative(getVkAddress(), minImageExtent != null ? minImageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMinImageExtentNative(long address);
    protected static native void setMinImageExtentNative(long address, long minImageExtent);

    public VkExtent2D getMaxImageExtent() {
        return new VkExtent2D(getVkMemory(), getMaxImageExtentNative(getVkAddress()));
    }

    
    public void setMaxImageExtent(VkExtent2D maxImageExtent) {
        setMaxImageExtentNative(getVkAddress(), maxImageExtent != null ? maxImageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxImageExtentNative(long address);
    protected static native void setMaxImageExtentNative(long address, long maxImageExtent);

    public VkUInt32 getMaxImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxImageArrayLayersNative(getVkAddress()));
    }

    
    public void setMaxImageArrayLayers(VkUInt32 maxImageArrayLayers) {
        setMaxImageArrayLayersNative(getVkAddress(), maxImageArrayLayers != null ? maxImageArrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageArrayLayersQ() {
        return getMaxImageArrayLayers().getValue();
    }

    public void setMaxImageArrayLayers(int maxImageArrayLayers) {
        getMaxImageArrayLayers().setValue(maxImageArrayLayers);
    }

    protected static native long getMaxImageArrayLayersNative(long address);
    protected static native void setMaxImageArrayLayersNative(long address, long maxImageArrayLayers);

    public VkSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VkSurfaceTransformFlagsKHR(getVkMemory(), getSupportedTransformsNative(getVkAddress()));
    }

    
    public void setSupportedTransforms(VkSurfaceTransformFlagsKHR supportedTransforms) {
        setSupportedTransformsNative(getVkAddress(), supportedTransforms != null ? supportedTransforms.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedTransformsQ() {
        return getSupportedTransforms().getValue();
    }

    public void setSupportedTransforms(int supportedTransforms) {
        getSupportedTransforms().setValue(supportedTransforms);
    }

    protected static native long getSupportedTransformsNative(long address);
    protected static native void setSupportedTransformsNative(long address, long supportedTransforms);

    public VkSurfaceTransformFlagBitsKHR getCurrentTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getCurrentTransformNative(getVkAddress()));
    }

    
    public void setCurrentTransform(VkSurfaceTransformFlagBitsKHR currentTransform) {
        setCurrentTransformNative(getVkAddress(), currentTransform != null ? currentTransform.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCurrentTransformQ() {
        return getCurrentTransform().getValue();
    }

    public void setCurrentTransform(int currentTransform) {
        getCurrentTransform().setValue(currentTransform);
    }

    protected static native long getCurrentTransformNative(long address);
    protected static native void setCurrentTransformNative(long address, long currentTransform);

    public VkCompositeAlphaFlagsKHR getSupportedCompositeAlpha() {
        return new VkCompositeAlphaFlagsKHR(getVkMemory(), getSupportedCompositeAlphaNative(getVkAddress()));
    }

    
    public void setSupportedCompositeAlpha(VkCompositeAlphaFlagsKHR supportedCompositeAlpha) {
        setSupportedCompositeAlphaNative(getVkAddress(), supportedCompositeAlpha != null ? supportedCompositeAlpha.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedCompositeAlphaQ() {
        return getSupportedCompositeAlpha().getValue();
    }

    public void setSupportedCompositeAlpha(int supportedCompositeAlpha) {
        getSupportedCompositeAlpha().setValue(supportedCompositeAlpha);
    }

    protected static native long getSupportedCompositeAlphaNative(long address);
    protected static native void setSupportedCompositeAlphaNative(long address, long supportedCompositeAlpha);

    public VkImageUsageFlags getSupportedUsageFlags() {
        return new VkImageUsageFlags(getVkMemory(), getSupportedUsageFlagsNative(getVkAddress()));
    }

    
    public void setSupportedUsageFlags(VkImageUsageFlags supportedUsageFlags) {
        setSupportedUsageFlagsNative(getVkAddress(), supportedUsageFlags != null ? supportedUsageFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedUsageFlagsQ() {
        return getSupportedUsageFlags().getValue();
    }

    public void setSupportedUsageFlags(int supportedUsageFlags) {
        getSupportedUsageFlags().setValue(supportedUsageFlags);
    }

    protected static native long getSupportedUsageFlagsNative(long address);
    protected static native void setSupportedUsageFlagsNative(long address, long supportedUsageFlags);

    public VkSurfaceCounterFlagsEXT getSupportedSurfaceCounters() {
        return new VkSurfaceCounterFlagsEXT(getVkMemory(), getSupportedSurfaceCountersNative(getVkAddress()));
    }

    
    public void setSupportedSurfaceCounters(VkSurfaceCounterFlagsEXT supportedSurfaceCounters) {
        setSupportedSurfaceCountersNative(getVkAddress(), supportedSurfaceCounters != null ? supportedSurfaceCounters.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedSurfaceCountersQ() {
        return getSupportedSurfaceCounters().getValue();
    }

    public void setSupportedSurfaceCounters(int supportedSurfaceCounters) {
        getSupportedSurfaceCounters().setValue(supportedSurfaceCounters);
    }

    protected static native long getSupportedSurfaceCountersNative(long address);
    protected static native void setSupportedSurfaceCountersNative(long address, long supportedSurfaceCounters);


    public static native long sizeof();

    public static class Array extends VkSurfaceCapabilities2EXT implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilities2EXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceCapabilities2EXT.sizeof()));
            this.count = count;
        }

        public Array(VkSurfaceCapabilities2EXT o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSurfaceCapabilities2EXT get(int i){
            return new VkSurfaceCapabilities2EXT(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
