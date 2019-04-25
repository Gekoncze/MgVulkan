package cz.mg.vulkan;

public class VkSurfaceCapabilitiesKHR extends VkObject {
    public VkSurfaceCapabilitiesKHR() {
        super(sizeof());
    }

    public VkSurfaceCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getMinImageCount() {
        return new VkUInt32(getVkMemory(), getMinImageCount(getVkAddress()));
    }

    
    public void setMinImageCount(VkUInt32 minImageCount) {
        setMinImageCount(getVkAddress(), minImageCount != null ? minImageCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinImageCountQ() {
        return getMinImageCount().getValue();
    }

    public void setMinImageCount(int minImageCount) {
        getMinImageCount().setValue(minImageCount);
    }

    protected static native long getMinImageCount(long address);
    protected static native void setMinImageCount(long address, long minImageCount);

    public VkUInt32 getMaxImageCount() {
        return new VkUInt32(getVkMemory(), getMaxImageCount(getVkAddress()));
    }

    
    public void setMaxImageCount(VkUInt32 maxImageCount) {
        setMaxImageCount(getVkAddress(), maxImageCount != null ? maxImageCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageCountQ() {
        return getMaxImageCount().getValue();
    }

    public void setMaxImageCount(int maxImageCount) {
        getMaxImageCount().setValue(maxImageCount);
    }

    protected static native long getMaxImageCount(long address);
    protected static native void setMaxImageCount(long address, long maxImageCount);

    public VkExtent2D getCurrentExtent() {
        return new VkExtent2D(getVkMemory(), getCurrentExtent(getVkAddress()));
    }

    
    public void setCurrentExtent(VkExtent2D currentExtent) {
        setCurrentExtent(getVkAddress(), currentExtent != null ? currentExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getCurrentExtent(long address);
    protected static native void setCurrentExtent(long address, long currentExtent);

    public VkExtent2D getMinImageExtent() {
        return new VkExtent2D(getVkMemory(), getMinImageExtent(getVkAddress()));
    }

    
    public void setMinImageExtent(VkExtent2D minImageExtent) {
        setMinImageExtent(getVkAddress(), minImageExtent != null ? minImageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMinImageExtent(long address);
    protected static native void setMinImageExtent(long address, long minImageExtent);

    public VkExtent2D getMaxImageExtent() {
        return new VkExtent2D(getVkMemory(), getMaxImageExtent(getVkAddress()));
    }

    
    public void setMaxImageExtent(VkExtent2D maxImageExtent) {
        setMaxImageExtent(getVkAddress(), maxImageExtent != null ? maxImageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxImageExtent(long address);
    protected static native void setMaxImageExtent(long address, long maxImageExtent);

    public VkUInt32 getMaxImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxImageArrayLayers(getVkAddress()));
    }

    
    public void setMaxImageArrayLayers(VkUInt32 maxImageArrayLayers) {
        setMaxImageArrayLayers(getVkAddress(), maxImageArrayLayers != null ? maxImageArrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxImageArrayLayersQ() {
        return getMaxImageArrayLayers().getValue();
    }

    public void setMaxImageArrayLayers(int maxImageArrayLayers) {
        getMaxImageArrayLayers().setValue(maxImageArrayLayers);
    }

    protected static native long getMaxImageArrayLayers(long address);
    protected static native void setMaxImageArrayLayers(long address, long maxImageArrayLayers);

    public VkSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VkSurfaceTransformFlagsKHR(getVkMemory(), getSupportedTransforms(getVkAddress()));
    }

    
    public void setSupportedTransforms(VkSurfaceTransformFlagsKHR supportedTransforms) {
        setSupportedTransforms(getVkAddress(), supportedTransforms != null ? supportedTransforms.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedTransformsQ() {
        return getSupportedTransforms().getValue();
    }

    public void setSupportedTransforms(int supportedTransforms) {
        getSupportedTransforms().setValue(supportedTransforms);
    }

    protected static native long getSupportedTransforms(long address);
    protected static native void setSupportedTransforms(long address, long supportedTransforms);

    public VkSurfaceTransformFlagBitsKHR getCurrentTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getCurrentTransform(getVkAddress()));
    }

    
    public void setCurrentTransform(VkSurfaceTransformFlagBitsKHR currentTransform) {
        setCurrentTransform(getVkAddress(), currentTransform != null ? currentTransform.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCurrentTransformQ() {
        return getCurrentTransform().getValue();
    }

    public void setCurrentTransform(int currentTransform) {
        getCurrentTransform().setValue(currentTransform);
    }

    protected static native long getCurrentTransform(long address);
    protected static native void setCurrentTransform(long address, long currentTransform);

    public VkCompositeAlphaFlagsKHR getSupportedCompositeAlpha() {
        return new VkCompositeAlphaFlagsKHR(getVkMemory(), getSupportedCompositeAlpha(getVkAddress()));
    }

    
    public void setSupportedCompositeAlpha(VkCompositeAlphaFlagsKHR supportedCompositeAlpha) {
        setSupportedCompositeAlpha(getVkAddress(), supportedCompositeAlpha != null ? supportedCompositeAlpha.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedCompositeAlphaQ() {
        return getSupportedCompositeAlpha().getValue();
    }

    public void setSupportedCompositeAlpha(int supportedCompositeAlpha) {
        getSupportedCompositeAlpha().setValue(supportedCompositeAlpha);
    }

    protected static native long getSupportedCompositeAlpha(long address);
    protected static native void setSupportedCompositeAlpha(long address, long supportedCompositeAlpha);

    public VkImageUsageFlags getSupportedUsageFlags() {
        return new VkImageUsageFlags(getVkMemory(), getSupportedUsageFlags(getVkAddress()));
    }

    
    public void setSupportedUsageFlags(VkImageUsageFlags supportedUsageFlags) {
        setSupportedUsageFlags(getVkAddress(), supportedUsageFlags != null ? supportedUsageFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedUsageFlagsQ() {
        return getSupportedUsageFlags().getValue();
    }

    public void setSupportedUsageFlags(int supportedUsageFlags) {
        getSupportedUsageFlags().setValue(supportedUsageFlags);
    }

    protected static native long getSupportedUsageFlags(long address);
    protected static native void setSupportedUsageFlags(long address, long supportedUsageFlags);


    public static native long sizeof();

    public static class Array extends VkSurfaceCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilitiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceCapabilitiesKHR o){
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
        public VkSurfaceCapabilitiesKHR get(int i){
            return new VkSurfaceCapabilitiesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
