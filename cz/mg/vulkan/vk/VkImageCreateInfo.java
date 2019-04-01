package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCreateInfo.html">khronos documentation</a>
 **/
public class VkImageCreateInfo extends VkObject {
    public VkImageCreateInfo() {
        super(sizeof());
    }

    public VkImageCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageCreateInfo(VkObject pNext, VkImageCreateFlags flags, VkImageType imageType, VkFormat format, VkExtent3D extent, VkUInt32 mipLevels, VkUInt32 arrayLayers, VkSampleCountFlagBits samples, VkImageTiling tiling, VkImageUsageFlags usage, VkSharingMode sharingMode, VkUInt32 queueFamilyIndexCount, VkUInt32 pQueueFamilyIndices, VkImageLayout initialLayout) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setImageType(imageType);
        setFormat(format);
        setExtent(extent);
        setMipLevels(mipLevels);
        setArrayLayers(arrayLayers);
        setSamples(samples);
        setTiling(tiling);
        setUsage(usage);
        setSharingMode(sharingMode);
        setQueueFamilyIndexCount(queueFamilyIndexCount);
        setPQueueFamilyIndices(pQueueFamilyIndices);
        setInitialLayout(initialLayout);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkImageCreateFlags getFlags() {
        return new VkImageCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkImageCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkImageType getImageType() {
        return new VkImageType(getVkMemory(), getImageType(getVkAddress()));
    }

    
    public void setImageType(VkImageType imageType) {
        setImageType(getVkAddress(), imageType != null ? imageType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getImageType(long address);
    private static native void setImageType(long address, long imageType);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExtent(long address);
    private static native void setExtent(long address, long extent);

    public VkUInt32 getMipLevels() {
        return new VkUInt32(getVkMemory(), getMipLevels(getVkAddress()));
    }

    
    public void setMipLevels(VkUInt32 mipLevels) {
        setMipLevels(getVkAddress(), mipLevels != null ? mipLevels.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMipLevels(long address);
    private static native void setMipLevels(long address, long mipLevels);

    public VkUInt32 getArrayLayers() {
        return new VkUInt32(getVkMemory(), getArrayLayers(getVkAddress()));
    }

    
    public void setArrayLayers(VkUInt32 arrayLayers) {
        setArrayLayers(getVkAddress(), arrayLayers != null ? arrayLayers.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getArrayLayers(long address);
    private static native void setArrayLayers(long address, long arrayLayers);

    public VkSampleCountFlagBits getSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getSamples(getVkAddress()));
    }

    
    public void setSamples(VkSampleCountFlagBits samples) {
        setSamples(getVkAddress(), samples != null ? samples.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSamples(long address);
    private static native void setSamples(long address, long samples);

    public VkImageTiling getTiling() {
        return new VkImageTiling(getVkMemory(), getTiling(getVkAddress()));
    }

    
    public void setTiling(VkImageTiling tiling) {
        setTiling(getVkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getTiling(long address);
    private static native void setTiling(long address, long tiling);

    public VkImageUsageFlags getUsage() {
        return new VkImageUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    
    public void setUsage(VkImageUsageFlags usage) {
        setUsage(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getUsage(long address);
    private static native void setUsage(long address, long usage);

    public VkSharingMode getSharingMode() {
        return new VkSharingMode(getVkMemory(), getSharingMode(getVkAddress()));
    }

    
    public void setSharingMode(VkSharingMode sharingMode) {
        setSharingMode(getVkAddress(), sharingMode != null ? sharingMode.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSharingMode(long address);
    private static native void setSharingMode(long address, long sharingMode);

    public VkUInt32 getQueueFamilyIndexCount() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexCount(getVkAddress()));
    }

    
    public void setQueueFamilyIndexCount(VkUInt32 queueFamilyIndexCount) {
        setQueueFamilyIndexCount(getVkAddress(), queueFamilyIndexCount != null ? queueFamilyIndexCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getQueueFamilyIndexCount(long address);
    private static native void setQueueFamilyIndexCount(long address, long queueFamilyIndexCount);

    public VkUInt32 getPQueueFamilyIndices() {
        return new VkUInt32(getVkMemory(), getPQueueFamilyIndices(getVkAddress()));
    }

    private VkObject pQueueFamilyIndices = null;
    public void setPQueueFamilyIndices(VkUInt32 pQueueFamilyIndices) {
        setPQueueFamilyIndices(getVkAddress(), pQueueFamilyIndices != null ? pQueueFamilyIndices.getVkAddress() : VkPointer.NULL);
        this.pQueueFamilyIndices = pQueueFamilyIndices;
    }

    private static native long getPQueueFamilyIndices(long address);
    private static native void setPQueueFamilyIndices(long address, long pQueueFamilyIndices);

    public VkImageLayout getInitialLayout() {
        return new VkImageLayout(getVkMemory(), getInitialLayout(getVkAddress()));
    }

    
    public void setInitialLayout(VkImageLayout initialLayout) {
        setInitialLayout(getVkAddress(), initialLayout != null ? initialLayout.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getInitialLayout(long address);
    private static native void setInitialLayout(long address, long initialLayout);


    public static native long sizeof();

    public static class Array extends VkImageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkImageCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageCreateInfo.sizeof()));
            this.count = count;
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

        public static class Array extends VkImageCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
