package cz.mg.vulkan;

public class VkObjectTableCreateInfoNVX extends VkObject {
    public VkObjectTableCreateInfoNVX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX));
    }

    public VkObjectTableCreateInfoNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectTableCreateInfoNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectTableCreateInfoNVX(VkPointer pointer) {
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

    public VkUInt32 getObjectCount() {
        return new VkUInt32(getVkMemory(), getObjectCountNative(getVkAddress()));
    }

    
    public void setObjectCount(VkUInt32 objectCount) {
        setObjectCountNative(getVkAddress(), objectCount != null ? objectCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getObjectCountQ() {
        return getObjectCount().getValue();
    }

    public void setObjectCount(int objectCount) {
        getObjectCount().setValue(objectCount);
    }

    protected static native long getObjectCountNative(long address);
    protected static native void setObjectCountNative(long address, long objectCount);

    public VkObjectEntryTypeNVX getPObjectEntryTypes() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getPObjectEntryTypesNative(getVkAddress()));
    }

    private VkObject pObjectEntryTypes = null;
    public void setPObjectEntryTypes(VkObjectEntryTypeNVX pObjectEntryTypes) {
        setPObjectEntryTypesNative(getVkAddress(), pObjectEntryTypes != null ? pObjectEntryTypes.getVkAddress() : VkPointer.NULL);
        this.pObjectEntryTypes = pObjectEntryTypes;
    }

    protected static native long getPObjectEntryTypesNative(long address);
    protected static native void setPObjectEntryTypesNative(long address, long pObjectEntryTypes);

    public VkUInt32 getPObjectEntryCounts() {
        return new VkUInt32(getVkMemory(), getPObjectEntryCountsNative(getVkAddress()));
    }

    private VkObject pObjectEntryCounts = null;
    public void setPObjectEntryCounts(VkUInt32 pObjectEntryCounts) {
        setPObjectEntryCountsNative(getVkAddress(), pObjectEntryCounts != null ? pObjectEntryCounts.getVkAddress() : VkPointer.NULL);
        this.pObjectEntryCounts = pObjectEntryCounts;
    }

    protected static native long getPObjectEntryCountsNative(long address);
    protected static native void setPObjectEntryCountsNative(long address, long pObjectEntryCounts);

    public VkObjectEntryUsageFlagsNVX getPObjectEntryUsageFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getPObjectEntryUsageFlagsNative(getVkAddress()));
    }

    private VkObject pObjectEntryUsageFlags = null;
    public void setPObjectEntryUsageFlags(VkObjectEntryUsageFlagsNVX pObjectEntryUsageFlags) {
        setPObjectEntryUsageFlagsNative(getVkAddress(), pObjectEntryUsageFlags != null ? pObjectEntryUsageFlags.getVkAddress() : VkPointer.NULL);
        this.pObjectEntryUsageFlags = pObjectEntryUsageFlags;
    }

    protected static native long getPObjectEntryUsageFlagsNative(long address);
    protected static native void setPObjectEntryUsageFlagsNative(long address, long pObjectEntryUsageFlags);

    public VkUInt32 getMaxUniformBuffersPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxUniformBuffersPerDescriptorNative(getVkAddress()));
    }

    
    public void setMaxUniformBuffersPerDescriptor(VkUInt32 maxUniformBuffersPerDescriptor) {
        setMaxUniformBuffersPerDescriptorNative(getVkAddress(), maxUniformBuffersPerDescriptor != null ? maxUniformBuffersPerDescriptor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxUniformBuffersPerDescriptorQ() {
        return getMaxUniformBuffersPerDescriptor().getValue();
    }

    public void setMaxUniformBuffersPerDescriptor(int maxUniformBuffersPerDescriptor) {
        getMaxUniformBuffersPerDescriptor().setValue(maxUniformBuffersPerDescriptor);
    }

    protected static native long getMaxUniformBuffersPerDescriptorNative(long address);
    protected static native void setMaxUniformBuffersPerDescriptorNative(long address, long maxUniformBuffersPerDescriptor);

    public VkUInt32 getMaxStorageBuffersPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxStorageBuffersPerDescriptorNative(getVkAddress()));
    }

    
    public void setMaxStorageBuffersPerDescriptor(VkUInt32 maxStorageBuffersPerDescriptor) {
        setMaxStorageBuffersPerDescriptorNative(getVkAddress(), maxStorageBuffersPerDescriptor != null ? maxStorageBuffersPerDescriptor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxStorageBuffersPerDescriptorQ() {
        return getMaxStorageBuffersPerDescriptor().getValue();
    }

    public void setMaxStorageBuffersPerDescriptor(int maxStorageBuffersPerDescriptor) {
        getMaxStorageBuffersPerDescriptor().setValue(maxStorageBuffersPerDescriptor);
    }

    protected static native long getMaxStorageBuffersPerDescriptorNative(long address);
    protected static native void setMaxStorageBuffersPerDescriptorNative(long address, long maxStorageBuffersPerDescriptor);

    public VkUInt32 getMaxStorageImagesPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxStorageImagesPerDescriptorNative(getVkAddress()));
    }

    
    public void setMaxStorageImagesPerDescriptor(VkUInt32 maxStorageImagesPerDescriptor) {
        setMaxStorageImagesPerDescriptorNative(getVkAddress(), maxStorageImagesPerDescriptor != null ? maxStorageImagesPerDescriptor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxStorageImagesPerDescriptorQ() {
        return getMaxStorageImagesPerDescriptor().getValue();
    }

    public void setMaxStorageImagesPerDescriptor(int maxStorageImagesPerDescriptor) {
        getMaxStorageImagesPerDescriptor().setValue(maxStorageImagesPerDescriptor);
    }

    protected static native long getMaxStorageImagesPerDescriptorNative(long address);
    protected static native void setMaxStorageImagesPerDescriptorNative(long address, long maxStorageImagesPerDescriptor);

    public VkUInt32 getMaxSampledImagesPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxSampledImagesPerDescriptorNative(getVkAddress()));
    }

    
    public void setMaxSampledImagesPerDescriptor(VkUInt32 maxSampledImagesPerDescriptor) {
        setMaxSampledImagesPerDescriptorNative(getVkAddress(), maxSampledImagesPerDescriptor != null ? maxSampledImagesPerDescriptor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSampledImagesPerDescriptorQ() {
        return getMaxSampledImagesPerDescriptor().getValue();
    }

    public void setMaxSampledImagesPerDescriptor(int maxSampledImagesPerDescriptor) {
        getMaxSampledImagesPerDescriptor().setValue(maxSampledImagesPerDescriptor);
    }

    protected static native long getMaxSampledImagesPerDescriptorNative(long address);
    protected static native void setMaxSampledImagesPerDescriptorNative(long address, long maxSampledImagesPerDescriptor);

    public VkUInt32 getMaxPipelineLayouts() {
        return new VkUInt32(getVkMemory(), getMaxPipelineLayoutsNative(getVkAddress()));
    }

    
    public void setMaxPipelineLayouts(VkUInt32 maxPipelineLayouts) {
        setMaxPipelineLayoutsNative(getVkAddress(), maxPipelineLayouts != null ? maxPipelineLayouts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPipelineLayoutsQ() {
        return getMaxPipelineLayouts().getValue();
    }

    public void setMaxPipelineLayouts(int maxPipelineLayouts) {
        getMaxPipelineLayouts().setValue(maxPipelineLayouts);
    }

    protected static native long getMaxPipelineLayoutsNative(long address);
    protected static native void setMaxPipelineLayoutsNative(long address, long maxPipelineLayouts);


    public void set(VkObjectTableCreateInfoNVX o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkObjectTableCreateInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableCreateInfoNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTableCreateInfoNVX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX));;
        }

        public Array(int count, VkObjectTableCreateInfoNVX o){
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
        public VkObjectTableCreateInfoNVX get(int i){
            return new VkObjectTableCreateInfoNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
