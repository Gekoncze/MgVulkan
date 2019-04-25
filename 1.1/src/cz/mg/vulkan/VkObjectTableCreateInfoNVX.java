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

    public VkUInt32 getObjectCount() {
        return new VkUInt32(getVkMemory(), getObjectCount(getVkAddress()));
    }

    
    public void setObjectCount(VkUInt32 objectCount) {
        setObjectCount(getVkAddress(), objectCount != null ? objectCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getObjectCountQ() {
        return getObjectCount().getValue();
    }

    public void setObjectCount(int objectCount) {
        getObjectCount().setValue(objectCount);
    }

    protected static native long getObjectCount(long address);
    protected static native void setObjectCount(long address, long objectCount);

    public VkObjectEntryTypeNVX getPObjectEntryTypes() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getPObjectEntryTypes(getVkAddress()));
    }

    private VkObject pObjectEntryTypes = null;
    public void setPObjectEntryTypes(VkObjectEntryTypeNVX pObjectEntryTypes) {
        setPObjectEntryTypes(getVkAddress(), pObjectEntryTypes != null ? pObjectEntryTypes.getVkAddress() : VkPointer.NULL);
        this.pObjectEntryTypes = pObjectEntryTypes;
    }

    protected static native long getPObjectEntryTypes(long address);
    protected static native void setPObjectEntryTypes(long address, long pObjectEntryTypes);

    public VkUInt32 getPObjectEntryCounts() {
        return new VkUInt32(getVkMemory(), getPObjectEntryCounts(getVkAddress()));
    }

    private VkObject pObjectEntryCounts = null;
    public void setPObjectEntryCounts(VkUInt32 pObjectEntryCounts) {
        setPObjectEntryCounts(getVkAddress(), pObjectEntryCounts != null ? pObjectEntryCounts.getVkAddress() : VkPointer.NULL);
        this.pObjectEntryCounts = pObjectEntryCounts;
    }

    protected static native long getPObjectEntryCounts(long address);
    protected static native void setPObjectEntryCounts(long address, long pObjectEntryCounts);

    public VkObjectEntryUsageFlagsNVX getPObjectEntryUsageFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getPObjectEntryUsageFlags(getVkAddress()));
    }

    private VkObject pObjectEntryUsageFlags = null;
    public void setPObjectEntryUsageFlags(VkObjectEntryUsageFlagsNVX pObjectEntryUsageFlags) {
        setPObjectEntryUsageFlags(getVkAddress(), pObjectEntryUsageFlags != null ? pObjectEntryUsageFlags.getVkAddress() : VkPointer.NULL);
        this.pObjectEntryUsageFlags = pObjectEntryUsageFlags;
    }

    protected static native long getPObjectEntryUsageFlags(long address);
    protected static native void setPObjectEntryUsageFlags(long address, long pObjectEntryUsageFlags);

    public VkUInt32 getMaxUniformBuffersPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxUniformBuffersPerDescriptor(getVkAddress()));
    }

    
    public void setMaxUniformBuffersPerDescriptor(VkUInt32 maxUniformBuffersPerDescriptor) {
        setMaxUniformBuffersPerDescriptor(getVkAddress(), maxUniformBuffersPerDescriptor != null ? maxUniformBuffersPerDescriptor.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxUniformBuffersPerDescriptorQ() {
        return getMaxUniformBuffersPerDescriptor().getValue();
    }

    public void setMaxUniformBuffersPerDescriptor(int maxUniformBuffersPerDescriptor) {
        getMaxUniformBuffersPerDescriptor().setValue(maxUniformBuffersPerDescriptor);
    }

    protected static native long getMaxUniformBuffersPerDescriptor(long address);
    protected static native void setMaxUniformBuffersPerDescriptor(long address, long maxUniformBuffersPerDescriptor);

    public VkUInt32 getMaxStorageBuffersPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxStorageBuffersPerDescriptor(getVkAddress()));
    }

    
    public void setMaxStorageBuffersPerDescriptor(VkUInt32 maxStorageBuffersPerDescriptor) {
        setMaxStorageBuffersPerDescriptor(getVkAddress(), maxStorageBuffersPerDescriptor != null ? maxStorageBuffersPerDescriptor.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxStorageBuffersPerDescriptorQ() {
        return getMaxStorageBuffersPerDescriptor().getValue();
    }

    public void setMaxStorageBuffersPerDescriptor(int maxStorageBuffersPerDescriptor) {
        getMaxStorageBuffersPerDescriptor().setValue(maxStorageBuffersPerDescriptor);
    }

    protected static native long getMaxStorageBuffersPerDescriptor(long address);
    protected static native void setMaxStorageBuffersPerDescriptor(long address, long maxStorageBuffersPerDescriptor);

    public VkUInt32 getMaxStorageImagesPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxStorageImagesPerDescriptor(getVkAddress()));
    }

    
    public void setMaxStorageImagesPerDescriptor(VkUInt32 maxStorageImagesPerDescriptor) {
        setMaxStorageImagesPerDescriptor(getVkAddress(), maxStorageImagesPerDescriptor != null ? maxStorageImagesPerDescriptor.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxStorageImagesPerDescriptorQ() {
        return getMaxStorageImagesPerDescriptor().getValue();
    }

    public void setMaxStorageImagesPerDescriptor(int maxStorageImagesPerDescriptor) {
        getMaxStorageImagesPerDescriptor().setValue(maxStorageImagesPerDescriptor);
    }

    protected static native long getMaxStorageImagesPerDescriptor(long address);
    protected static native void setMaxStorageImagesPerDescriptor(long address, long maxStorageImagesPerDescriptor);

    public VkUInt32 getMaxSampledImagesPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxSampledImagesPerDescriptor(getVkAddress()));
    }

    
    public void setMaxSampledImagesPerDescriptor(VkUInt32 maxSampledImagesPerDescriptor) {
        setMaxSampledImagesPerDescriptor(getVkAddress(), maxSampledImagesPerDescriptor != null ? maxSampledImagesPerDescriptor.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxSampledImagesPerDescriptorQ() {
        return getMaxSampledImagesPerDescriptor().getValue();
    }

    public void setMaxSampledImagesPerDescriptor(int maxSampledImagesPerDescriptor) {
        getMaxSampledImagesPerDescriptor().setValue(maxSampledImagesPerDescriptor);
    }

    protected static native long getMaxSampledImagesPerDescriptor(long address);
    protected static native void setMaxSampledImagesPerDescriptor(long address, long maxSampledImagesPerDescriptor);

    public VkUInt32 getMaxPipelineLayouts() {
        return new VkUInt32(getVkMemory(), getMaxPipelineLayouts(getVkAddress()));
    }

    
    public void setMaxPipelineLayouts(VkUInt32 maxPipelineLayouts) {
        setMaxPipelineLayouts(getVkAddress(), maxPipelineLayouts != null ? maxPipelineLayouts.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxPipelineLayoutsQ() {
        return getMaxPipelineLayouts().getValue();
    }

    public void setMaxPipelineLayouts(int maxPipelineLayouts) {
        getMaxPipelineLayouts().setValue(maxPipelineLayouts);
    }

    protected static native long getMaxPipelineLayouts(long address);
    protected static native void setMaxPipelineLayouts(long address, long maxPipelineLayouts);


    public static native long sizeof();

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

        public static class Array extends VkObjectTableCreateInfoNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkObjectTableCreateInfoNVX.Pointer> {
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

            public Array(VkObjectTableCreateInfoNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkObjectTableCreateInfoNVX.Pointer get(int i){
                return new VkObjectTableCreateInfoNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
