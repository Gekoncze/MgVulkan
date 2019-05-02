package cz.mg.vulkan;

public class VkImageFormatProperties extends VkObject {
    public VkImageFormatProperties() {
        super(sizeof());
    }

    protected VkImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageFormatProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkExtent3D getMaxExtent() {
        return new VkExtent3D(getVkMemory(), getMaxExtentNative(getVkAddress()));
    }

    
    public void setMaxExtent(VkExtent3D maxExtent) {
        setMaxExtentNative(getVkAddress(), maxExtent != null ? maxExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxExtentNative(long address);
    protected static native void setMaxExtentNative(long address, long maxExtent);

    public VkUInt32 getMaxMipLevels() {
        return new VkUInt32(getVkMemory(), getMaxMipLevelsNative(getVkAddress()));
    }

    
    public void setMaxMipLevels(VkUInt32 maxMipLevels) {
        setMaxMipLevelsNative(getVkAddress(), maxMipLevels != null ? maxMipLevels.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMipLevelsQ() {
        return getMaxMipLevels().getValue();
    }

    public void setMaxMipLevels(int maxMipLevels) {
        getMaxMipLevels().setValue(maxMipLevels);
    }

    protected static native long getMaxMipLevelsNative(long address);
    protected static native void setMaxMipLevelsNative(long address, long maxMipLevels);

    public VkUInt32 getMaxArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxArrayLayersNative(getVkAddress()));
    }

    
    public void setMaxArrayLayers(VkUInt32 maxArrayLayers) {
        setMaxArrayLayersNative(getVkAddress(), maxArrayLayers != null ? maxArrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxArrayLayersQ() {
        return getMaxArrayLayers().getValue();
    }

    public void setMaxArrayLayers(int maxArrayLayers) {
        getMaxArrayLayers().setValue(maxArrayLayers);
    }

    protected static native long getMaxArrayLayersNative(long address);
    protected static native void setMaxArrayLayersNative(long address, long maxArrayLayers);

    public VkSampleCountFlags getSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampleCountsNative(getVkAddress()));
    }

    
    public void setSampleCounts(VkSampleCountFlags sampleCounts) {
        setSampleCountsNative(getVkAddress(), sampleCounts != null ? sampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleCountsQ() {
        return getSampleCounts().getValue();
    }

    public void setSampleCounts(int sampleCounts) {
        getSampleCounts().setValue(sampleCounts);
    }

    protected static native long getSampleCountsNative(long address);
    protected static native void setSampleCountsNative(long address, long sampleCounts);

    public VkDeviceSize getMaxResourceSize() {
        return new VkDeviceSize(getVkMemory(), getMaxResourceSizeNative(getVkAddress()));
    }

    
    public void setMaxResourceSize(VkDeviceSize maxResourceSize) {
        setMaxResourceSizeNative(getVkAddress(), maxResourceSize != null ? maxResourceSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMaxResourceSizeQ() {
        return getMaxResourceSize().getValue();
    }

    public void setMaxResourceSize(long maxResourceSize) {
        getMaxResourceSize().setValue(maxResourceSize);
    }

    protected static native long getMaxResourceSizeNative(long address);
    protected static native void setMaxResourceSizeNative(long address, long maxResourceSize);


    public void set(VkImageFormatProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkImageFormatProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageFormatProperties.sizeof()));
            this.count = count;
        }

        public Array(VkImageFormatProperties o, int count){
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
        public VkImageFormatProperties get(int i){
            return new VkImageFormatProperties(getVkMemory(), address(i));
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
