package cz.mg.vulkan;

public class VkSurfaceCapabilities2EXT extends VkObject {
    public VkSurfaceCapabilities2EXT() {
        super(sizeof());
    }

    public VkSurfaceCapabilities2EXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCapabilities2EXT(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getMaxImageCount() {
        return new VkUInt32(getVkMemory(), getMaxImageCount(getVkAddress()));
    }

    
    public void setMaxImageCount(VkUInt32 maxImageCount) {
        setMaxImageCount(getVkAddress(), maxImageCount != null ? maxImageCount.getVkAddress() : VkPointer.getNullAddress());
        
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
        setCurrentExtent(getVkAddress(), currentExtent != null ? currentExtent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getCurrentExtent(long address);
    protected static native void setCurrentExtent(long address, long currentExtent);

    public VkExtent2D getMinImageExtent() {
        return new VkExtent2D(getVkMemory(), getMinImageExtent(getVkAddress()));
    }

    
    public void setMinImageExtent(VkExtent2D minImageExtent) {
        setMinImageExtent(getVkAddress(), minImageExtent != null ? minImageExtent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getMinImageExtent(long address);
    protected static native void setMinImageExtent(long address, long minImageExtent);

    public VkExtent2D getMaxImageExtent() {
        return new VkExtent2D(getVkMemory(), getMaxImageExtent(getVkAddress()));
    }

    
    public void setMaxImageExtent(VkExtent2D maxImageExtent) {
        setMaxImageExtent(getVkAddress(), maxImageExtent != null ? maxImageExtent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getMaxImageExtent(long address);
    protected static native void setMaxImageExtent(long address, long maxImageExtent);

    public VkUInt32 getMaxImageArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxImageArrayLayers(getVkAddress()));
    }

    
    public void setMaxImageArrayLayers(VkUInt32 maxImageArrayLayers) {
        setMaxImageArrayLayers(getVkAddress(), maxImageArrayLayers != null ? maxImageArrayLayers.getVkAddress() : VkPointer.getNullAddress());
        
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
        setSupportedTransforms(getVkAddress(), supportedTransforms != null ? supportedTransforms.getVkAddress() : VkPointer.getNullAddress());
        
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
        setCurrentTransform(getVkAddress(), currentTransform != null ? currentTransform.getVkAddress() : VkPointer.getNullAddress());
        
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
        setSupportedCompositeAlpha(getVkAddress(), supportedCompositeAlpha != null ? supportedCompositeAlpha.getVkAddress() : VkPointer.getNullAddress());
        
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
        setSupportedUsageFlags(getVkAddress(), supportedUsageFlags != null ? supportedUsageFlags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSupportedUsageFlagsQ() {
        return getSupportedUsageFlags().getValue();
    }

    public void setSupportedUsageFlags(int supportedUsageFlags) {
        getSupportedUsageFlags().setValue(supportedUsageFlags);
    }

    protected static native long getSupportedUsageFlags(long address);
    protected static native void setSupportedUsageFlags(long address, long supportedUsageFlags);

    public VkSurfaceCounterFlagsEXT getSupportedSurfaceCounters() {
        return new VkSurfaceCounterFlagsEXT(getVkMemory(), getSupportedSurfaceCounters(getVkAddress()));
    }

    
    public void setSupportedSurfaceCounters(VkSurfaceCounterFlagsEXT supportedSurfaceCounters) {
        setSupportedSurfaceCounters(getVkAddress(), supportedSurfaceCounters != null ? supportedSurfaceCounters.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSupportedSurfaceCountersQ() {
        return getSupportedSurfaceCounters().getValue();
    }

    public void setSupportedSurfaceCounters(int supportedSurfaceCounters) {
        getSupportedSurfaceCounters().setValue(supportedSurfaceCounters);
    }

    protected static native long getSupportedSurfaceCounters(long address);
    protected static native void setSupportedSurfaceCounters(long address, long supportedSurfaceCounters);


    public static native long sizeof();

    public static class Array extends VkSurfaceCapabilities2EXT implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilities2EXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceCapabilities2EXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceCapabilities2EXT o){
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
        public VkSurfaceCapabilities2EXT get(int i){
            return new VkSurfaceCapabilities2EXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSurfaceCapabilities2EXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCapabilities2EXT.Pointer> {
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

            public Array(VkSurfaceCapabilities2EXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSurfaceCapabilities2EXT.Pointer get(int i){
                return new VkSurfaceCapabilities2EXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
