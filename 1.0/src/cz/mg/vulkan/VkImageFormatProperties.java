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
        return new VkExtent3D(getVkMemory(), getMaxExtent(getVkAddress()));
    }

    
    public void setMaxExtent(VkExtent3D maxExtent) {
        setMaxExtent(getVkAddress(), maxExtent != null ? maxExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxExtent(long address);
    protected static native void setMaxExtent(long address, long maxExtent);

    public VkUInt32 getMaxMipLevels() {
        return new VkUInt32(getVkMemory(), getMaxMipLevels(getVkAddress()));
    }

    
    public void setMaxMipLevels(VkUInt32 maxMipLevels) {
        setMaxMipLevels(getVkAddress(), maxMipLevels != null ? maxMipLevels.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxMipLevelsQ() {
        return getMaxMipLevels().getValue();
    }

    public void setMaxMipLevels(int maxMipLevels) {
        getMaxMipLevels().setValue(maxMipLevels);
    }

    protected static native long getMaxMipLevels(long address);
    protected static native void setMaxMipLevels(long address, long maxMipLevels);

    public VkUInt32 getMaxArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxArrayLayers(getVkAddress()));
    }

    
    public void setMaxArrayLayers(VkUInt32 maxArrayLayers) {
        setMaxArrayLayers(getVkAddress(), maxArrayLayers != null ? maxArrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxArrayLayersQ() {
        return getMaxArrayLayers().getValue();
    }

    public void setMaxArrayLayers(int maxArrayLayers) {
        getMaxArrayLayers().setValue(maxArrayLayers);
    }

    protected static native long getMaxArrayLayers(long address);
    protected static native void setMaxArrayLayers(long address, long maxArrayLayers);

    public VkSampleCountFlags getSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampleCounts(getVkAddress()));
    }

    
    public void setSampleCounts(VkSampleCountFlags sampleCounts) {
        setSampleCounts(getVkAddress(), sampleCounts != null ? sampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleCountsQ() {
        return getSampleCounts().getValue();
    }

    public void setSampleCounts(int sampleCounts) {
        getSampleCounts().setValue(sampleCounts);
    }

    protected static native long getSampleCounts(long address);
    protected static native void setSampleCounts(long address, long sampleCounts);

    public VkDeviceSize getMaxResourceSize() {
        return new VkDeviceSize(getVkMemory(), getMaxResourceSize(getVkAddress()));
    }

    
    public void setMaxResourceSize(VkDeviceSize maxResourceSize) {
        setMaxResourceSize(getVkAddress(), maxResourceSize != null ? maxResourceSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMaxResourceSizeQ() {
        return getMaxResourceSize().getValue();
    }

    public void setMaxResourceSize(long maxResourceSize) {
        getMaxResourceSize().setValue(maxResourceSize);
    }

    protected static native long getMaxResourceSize(long address);
    protected static native void setMaxResourceSize(long address, long maxResourceSize);


    public static native long sizeof();

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
            return new VkImageFormatProperties(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
