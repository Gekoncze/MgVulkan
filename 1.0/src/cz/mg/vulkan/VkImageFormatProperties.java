package cz.mg.vulkan;

public class VkImageFormatProperties extends VkObject {
    public VkImageFormatProperties() {
        super(sizeof());
    }

    public VkImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExtent3D getMaxExtent() {
        return new VkExtent3D(getVkMemory(), getMaxExtent(getVkAddress()));
    }

    
    public void setMaxExtent(VkExtent3D maxExtent) {
        setMaxExtent(getVkAddress(), maxExtent != null ? maxExtent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getMaxExtent(long address);
    protected static native void setMaxExtent(long address, long maxExtent);

    public VkUInt32 getMaxMipLevels() {
        return new VkUInt32(getVkMemory(), getMaxMipLevels(getVkAddress()));
    }

    
    public void setMaxMipLevels(VkUInt32 maxMipLevels) {
        setMaxMipLevels(getVkAddress(), maxMipLevels != null ? maxMipLevels.getVkAddress() : VkPointer.getNullAddress());
        
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
        setMaxArrayLayers(getVkAddress(), maxArrayLayers != null ? maxArrayLayers.getVkAddress() : VkPointer.getNullAddress());
        
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
        setSampleCounts(getVkAddress(), sampleCounts != null ? sampleCounts.getVkAddress() : VkPointer.getNullAddress());
        
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
        setMaxResourceSize(getVkAddress(), maxResourceSize != null ? maxResourceSize.getVkAddress() : VkPointer.getNullAddress());
        
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

        public Array(int count, VkImageFormatProperties o){
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
        public VkImageFormatProperties get(int i){
            return new VkImageFormatProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageFormatProperties.Pointer> {
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

            public Array(VkImageFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageFormatProperties.Pointer get(int i){
                return new VkImageFormatProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
