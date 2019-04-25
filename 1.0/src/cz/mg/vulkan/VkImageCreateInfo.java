package cz.mg.vulkan;

public class VkImageCreateInfo extends VkObject {
    public VkImageCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO));
    }

    public VkImageCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageCreateInfo(VkPointer pointer) {
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

    public VkImageCreateFlags getFlags() {
        return new VkImageCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkImageCreateFlags flags) {
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

    public VkImageType getImageType() {
        return new VkImageType(getVkMemory(), getImageTypeNative(getVkAddress()));
    }

    
    public void setImageType(VkImageType imageType) {
        setImageTypeNative(getVkAddress(), imageType != null ? imageType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageTypeQ() {
        return getImageType().getValue();
    }

    public void setImageType(int imageType) {
        getImageType().setValue(imageType);
    }

    protected static native long getImageTypeNative(long address);
    protected static native void setImageTypeNative(long address, long imageType);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormatNative(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormatNative(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormatNative(long address);
    protected static native void setFormatNative(long address, long format);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtentNative(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtentNative(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getExtentNative(long address);
    protected static native void setExtentNative(long address, long extent);

    public VkUInt32 getMipLevels() {
        return new VkUInt32(getVkMemory(), getMipLevelsNative(getVkAddress()));
    }

    
    public void setMipLevels(VkUInt32 mipLevels) {
        setMipLevelsNative(getVkAddress(), mipLevels != null ? mipLevels.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipLevelsQ() {
        return getMipLevels().getValue();
    }

    public void setMipLevels(int mipLevels) {
        getMipLevels().setValue(mipLevels);
    }

    protected static native long getMipLevelsNative(long address);
    protected static native void setMipLevelsNative(long address, long mipLevels);

    public VkUInt32 getArrayLayers() {
        return new VkUInt32(getVkMemory(), getArrayLayersNative(getVkAddress()));
    }

    
    public void setArrayLayers(VkUInt32 arrayLayers) {
        setArrayLayersNative(getVkAddress(), arrayLayers != null ? arrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getArrayLayersQ() {
        return getArrayLayers().getValue();
    }

    public void setArrayLayers(int arrayLayers) {
        getArrayLayers().setValue(arrayLayers);
    }

    protected static native long getArrayLayersNative(long address);
    protected static native void setArrayLayersNative(long address, long arrayLayers);

    public VkSampleCountFlagBits getSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getSamplesNative(getVkAddress()));
    }

    
    public void setSamples(VkSampleCountFlagBits samples) {
        setSamplesNative(getVkAddress(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSamplesQ() {
        return getSamples().getValue();
    }

    public void setSamples(int samples) {
        getSamples().setValue(samples);
    }

    protected static native long getSamplesNative(long address);
    protected static native void setSamplesNative(long address, long samples);

    public VkImageTiling getTiling() {
        return new VkImageTiling(getVkMemory(), getTilingNative(getVkAddress()));
    }

    
    public void setTiling(VkImageTiling tiling) {
        setTilingNative(getVkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTilingQ() {
        return getTiling().getValue();
    }

    public void setTiling(int tiling) {
        getTiling().setValue(tiling);
    }

    protected static native long getTilingNative(long address);
    protected static native void setTilingNative(long address, long tiling);

    public VkImageUsageFlags getUsage() {
        return new VkImageUsageFlags(getVkMemory(), getUsageNative(getVkAddress()));
    }

    
    public void setUsage(VkImageUsageFlags usage) {
        setUsageNative(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUsageQ() {
        return getUsage().getValue();
    }

    public void setUsage(int usage) {
        getUsage().setValue(usage);
    }

    protected static native long getUsageNative(long address);
    protected static native void setUsageNative(long address, long usage);

    public VkSharingMode getSharingMode() {
        return new VkSharingMode(getVkMemory(), getSharingModeNative(getVkAddress()));
    }

    
    public void setSharingMode(VkSharingMode sharingMode) {
        setSharingModeNative(getVkAddress(), sharingMode != null ? sharingMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSharingModeQ() {
        return getSharingMode().getValue();
    }

    public void setSharingMode(int sharingMode) {
        getSharingMode().setValue(sharingMode);
    }

    protected static native long getSharingModeNative(long address);
    protected static native void setSharingModeNative(long address, long sharingMode);

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

    protected static native long getPQueueFamilyIndicesNative(long address);
    protected static native void setPQueueFamilyIndicesNative(long address, long pQueueFamilyIndices);

    public VkImageLayout getInitialLayout() {
        return new VkImageLayout(getVkMemory(), getInitialLayoutNative(getVkAddress()));
    }

    
    public void setInitialLayout(VkImageLayout initialLayout) {
        setInitialLayoutNative(getVkAddress(), initialLayout != null ? initialLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInitialLayoutQ() {
        return getInitialLayout().getValue();
    }

    public void setInitialLayout(int initialLayout) {
        getInitialLayout().setValue(initialLayout);
    }

    protected static native long getInitialLayoutNative(long address);
    protected static native void setInitialLayoutNative(long address, long initialLayout);


    public static native long sizeof();

    public static class Array extends VkImageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkImageCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO));;
        }

        public Array(int count, VkImageCreateInfo o){
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
        public VkImageCreateInfo get(int i){
            return new VkImageCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
