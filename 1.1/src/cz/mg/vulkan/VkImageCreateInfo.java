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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
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

    public VkImageCreateFlags getFlags() {
        return new VkImageCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkImageCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkImageType getImageType() {
        return new VkImageType(getVkMemory(), getImageType(getVkAddress()));
    }

    
    public void setImageType(VkImageType imageType) {
        setImageType(getVkAddress(), imageType != null ? imageType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageTypeQ() {
        return getImageType().getValue();
    }

    public void setImageType(int imageType) {
        getImageType().setValue(imageType);
    }

    protected static native long getImageType(long address);
    protected static native void setImageType(long address, long imageType);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormat(long address);
    protected static native void setFormat(long address, long format);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getExtent(long address);
    protected static native void setExtent(long address, long extent);

    public VkUInt32 getMipLevels() {
        return new VkUInt32(getVkMemory(), getMipLevels(getVkAddress()));
    }

    
    public void setMipLevels(VkUInt32 mipLevels) {
        setMipLevels(getVkAddress(), mipLevels != null ? mipLevels.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipLevelsQ() {
        return getMipLevels().getValue();
    }

    public void setMipLevels(int mipLevels) {
        getMipLevels().setValue(mipLevels);
    }

    protected static native long getMipLevels(long address);
    protected static native void setMipLevels(long address, long mipLevels);

    public VkUInt32 getArrayLayers() {
        return new VkUInt32(getVkMemory(), getArrayLayers(getVkAddress()));
    }

    
    public void setArrayLayers(VkUInt32 arrayLayers) {
        setArrayLayers(getVkAddress(), arrayLayers != null ? arrayLayers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getArrayLayersQ() {
        return getArrayLayers().getValue();
    }

    public void setArrayLayers(int arrayLayers) {
        getArrayLayers().setValue(arrayLayers);
    }

    protected static native long getArrayLayers(long address);
    protected static native void setArrayLayers(long address, long arrayLayers);

    public VkSampleCountFlagBits getSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getSamples(getVkAddress()));
    }

    
    public void setSamples(VkSampleCountFlagBits samples) {
        setSamples(getVkAddress(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSamplesQ() {
        return getSamples().getValue();
    }

    public void setSamples(int samples) {
        getSamples().setValue(samples);
    }

    protected static native long getSamples(long address);
    protected static native void setSamples(long address, long samples);

    public VkImageTiling getTiling() {
        return new VkImageTiling(getVkMemory(), getTiling(getVkAddress()));
    }

    
    public void setTiling(VkImageTiling tiling) {
        setTiling(getVkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTilingQ() {
        return getTiling().getValue();
    }

    public void setTiling(int tiling) {
        getTiling().setValue(tiling);
    }

    protected static native long getTiling(long address);
    protected static native void setTiling(long address, long tiling);

    public VkImageUsageFlags getUsage() {
        return new VkImageUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    
    public void setUsage(VkImageUsageFlags usage) {
        setUsage(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUsageQ() {
        return getUsage().getValue();
    }

    public void setUsage(int usage) {
        getUsage().setValue(usage);
    }

    protected static native long getUsage(long address);
    protected static native void setUsage(long address, long usage);

    public VkSharingMode getSharingMode() {
        return new VkSharingMode(getVkMemory(), getSharingMode(getVkAddress()));
    }

    
    public void setSharingMode(VkSharingMode sharingMode) {
        setSharingMode(getVkAddress(), sharingMode != null ? sharingMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSharingModeQ() {
        return getSharingMode().getValue();
    }

    public void setSharingMode(int sharingMode) {
        getSharingMode().setValue(sharingMode);
    }

    protected static native long getSharingMode(long address);
    protected static native void setSharingMode(long address, long sharingMode);

    public VkUInt32 getQueueFamilyIndexCount() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexCount(getVkAddress()));
    }

    
    public void setQueueFamilyIndexCount(VkUInt32 queueFamilyIndexCount) {
        setQueueFamilyIndexCount(getVkAddress(), queueFamilyIndexCount != null ? queueFamilyIndexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
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

    public VkImageLayout getInitialLayout() {
        return new VkImageLayout(getVkMemory(), getInitialLayout(getVkAddress()));
    }

    
    public void setInitialLayout(VkImageLayout initialLayout) {
        setInitialLayout(getVkAddress(), initialLayout != null ? initialLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInitialLayoutQ() {
        return getInitialLayout().getValue();
    }

    public void setInitialLayout(int initialLayout) {
        getInitialLayout().setValue(initialLayout);
    }

    protected static native long getInitialLayout(long address);
    protected static native void setInitialLayout(long address, long initialLayout);


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

        public static class Array extends VkImageCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageCreateInfo.Pointer> {
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

            public Array(VkImageCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageCreateInfo.Pointer get(int i){
                return new VkImageCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
