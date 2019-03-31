package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTableCreateInfoNVX.html">khronos documentation</a>
 **/
public class VkObjectTableCreateInfoNVX extends VkObject {
    public VkObjectTableCreateInfoNVX() {
        super(sizeof());
    }

    public VkObjectTableCreateInfoNVX(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkObjectTableCreateInfoNVX(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkObjectTableCreateInfoNVX(VkObject pNext, VkUInt32 objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectEntryCounts, VkObjectEntryUsageFlagsNVX pObjectEntryUsageFlags, VkUInt32 maxUniformBuffersPerDescriptor, VkUInt32 maxStorageBuffersPerDescriptor, VkUInt32 maxStorageImagesPerDescriptor, VkUInt32 maxSampledImagesPerDescriptor, VkUInt32 maxPipelineLayouts) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX));
        setPNext(pNext);
        setObjectCount(objectCount);
        setPObjectEntryTypes(pObjectEntryTypes);
        setPObjectEntryCounts(pObjectEntryCounts);
        setPObjectEntryUsageFlags(pObjectEntryUsageFlags);
        setMaxUniformBuffersPerDescriptor(maxUniformBuffersPerDescriptor);
        setMaxStorageBuffersPerDescriptor(maxStorageBuffersPerDescriptor);
        setMaxStorageImagesPerDescriptor(maxStorageImagesPerDescriptor);
        setMaxSampledImagesPerDescriptor(maxSampledImagesPerDescriptor);
        setMaxPipelineLayouts(maxPipelineLayouts);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getObjectCount() {
        return new VkUInt32(getVkMemory(), getObjectCount(getVkAddress()));
    }

    public void setObjectCount(VkUInt32 objectCount) {
        setObjectCount(getVkAddress(), objectCount.getVkAddress());
    }

    private static native long getObjectCount(long address);
    private static native void setObjectCount(long address, long objectCount);

    public VkObjectEntryTypeNVX.Array getPObjectEntryTypes() {
        return new VkObjectEntryTypeNVX.Array(getVkMemory(), getPObjectEntryTypes(getVkAddress()), getObjectCount().getValue());
    }

    public void setPObjectEntryTypes(VkObjectEntryTypeNVX pObjectEntryTypes) {
        setPObjectEntryTypes(getVkAddress(), pObjectEntryTypes.getVkAddress());
    }

    private static native long getPObjectEntryTypes(long address);
    private static native void setPObjectEntryTypes(long address, long pObjectEntryTypes);

    public VkUInt32 getPObjectEntryCounts() {
        return new VkUInt32(getVkMemory(), getPObjectEntryCounts(getVkAddress()));
    }

    public void setPObjectEntryCounts(VkUInt32 pObjectEntryCounts) {
        setPObjectEntryCounts(getVkAddress(), pObjectEntryCounts.getVkAddress());
    }

    private static native long getPObjectEntryCounts(long address);
    private static native void setPObjectEntryCounts(long address, long pObjectEntryCounts);

    public VkObjectEntryUsageFlagsNVX getPObjectEntryUsageFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getPObjectEntryUsageFlags(getVkAddress()));
    }

    public void setPObjectEntryUsageFlags(VkObjectEntryUsageFlagsNVX pObjectEntryUsageFlags) {
        setPObjectEntryUsageFlags(getVkAddress(), pObjectEntryUsageFlags.getVkAddress());
    }

    private static native long getPObjectEntryUsageFlags(long address);
    private static native void setPObjectEntryUsageFlags(long address, long pObjectEntryUsageFlags);

    public VkUInt32 getMaxUniformBuffersPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxUniformBuffersPerDescriptor(getVkAddress()));
    }

    public void setMaxUniformBuffersPerDescriptor(VkUInt32 maxUniformBuffersPerDescriptor) {
        setMaxUniformBuffersPerDescriptor(getVkAddress(), maxUniformBuffersPerDescriptor.getVkAddress());
    }

    private static native long getMaxUniformBuffersPerDescriptor(long address);
    private static native void setMaxUniformBuffersPerDescriptor(long address, long maxUniformBuffersPerDescriptor);

    public VkUInt32 getMaxStorageBuffersPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxStorageBuffersPerDescriptor(getVkAddress()));
    }

    public void setMaxStorageBuffersPerDescriptor(VkUInt32 maxStorageBuffersPerDescriptor) {
        setMaxStorageBuffersPerDescriptor(getVkAddress(), maxStorageBuffersPerDescriptor.getVkAddress());
    }

    private static native long getMaxStorageBuffersPerDescriptor(long address);
    private static native void setMaxStorageBuffersPerDescriptor(long address, long maxStorageBuffersPerDescriptor);

    public VkUInt32 getMaxStorageImagesPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxStorageImagesPerDescriptor(getVkAddress()));
    }

    public void setMaxStorageImagesPerDescriptor(VkUInt32 maxStorageImagesPerDescriptor) {
        setMaxStorageImagesPerDescriptor(getVkAddress(), maxStorageImagesPerDescriptor.getVkAddress());
    }

    private static native long getMaxStorageImagesPerDescriptor(long address);
    private static native void setMaxStorageImagesPerDescriptor(long address, long maxStorageImagesPerDescriptor);

    public VkUInt32 getMaxSampledImagesPerDescriptor() {
        return new VkUInt32(getVkMemory(), getMaxSampledImagesPerDescriptor(getVkAddress()));
    }

    public void setMaxSampledImagesPerDescriptor(VkUInt32 maxSampledImagesPerDescriptor) {
        setMaxSampledImagesPerDescriptor(getVkAddress(), maxSampledImagesPerDescriptor.getVkAddress());
    }

    private static native long getMaxSampledImagesPerDescriptor(long address);
    private static native void setMaxSampledImagesPerDescriptor(long address, long maxSampledImagesPerDescriptor);

    public VkUInt32 getMaxPipelineLayouts() {
        return new VkUInt32(getVkMemory(), getMaxPipelineLayouts(getVkAddress()));
    }

    public void setMaxPipelineLayouts(VkUInt32 maxPipelineLayouts) {
        setMaxPipelineLayouts(getVkAddress(), maxPipelineLayouts.getVkAddress());
    }

    private static native long getMaxPipelineLayouts(long address);
    private static native void setMaxPipelineLayouts(long address, long maxPipelineLayouts);


    public static native long sizeof();

    public static class Array extends VkObjectTableCreateInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableCreateInfoNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
