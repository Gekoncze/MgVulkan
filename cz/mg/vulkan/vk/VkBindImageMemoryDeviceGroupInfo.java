package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBindImageMemoryDeviceGroupInfo.html">khronos documentation</a>
 **/
public class VkBindImageMemoryDeviceGroupInfo extends VkObject {
    public VkBindImageMemoryDeviceGroupInfo() {
        super(sizeof());
    }

    public VkBindImageMemoryDeviceGroupInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkBindImageMemoryDeviceGroupInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkBindImageMemoryDeviceGroupInfo(VkObject pNext, VkUInt32 deviceIndexCount, VkUInt32 pDeviceIndices, VkUInt32 splitInstanceBindRegionCount, VkRect2D pSplitInstanceBindRegions) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO));
        setPNext(pNext);
        setDeviceIndexCount(deviceIndexCount);
        setPDeviceIndices(pDeviceIndices);
        setSplitInstanceBindRegionCount(splitInstanceBindRegionCount);
        setPSplitInstanceBindRegions(pSplitInstanceBindRegions);
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

    public VkUInt32 getDeviceIndexCount() {
        return new VkUInt32(getVkMemory(), getDeviceIndexCount(getVkAddress()));
    }

    public void setDeviceIndexCount(VkUInt32 deviceIndexCount) {
        setDeviceIndexCount(getVkAddress(), deviceIndexCount.getVkAddress());
    }

    private static native long getDeviceIndexCount(long address);
    private static native void setDeviceIndexCount(long address, long deviceIndexCount);

    public VkUInt32.Array getPDeviceIndices() {
        return new VkUInt32.Array(getVkMemory(), getPDeviceIndices(getVkAddress()), getDeviceIndexCount().getValue());
    }

    public void setPDeviceIndices(VkUInt32 pDeviceIndices) {
        setPDeviceIndices(getVkAddress(), pDeviceIndices.getVkAddress());
    }

    private static native long getPDeviceIndices(long address);
    private static native void setPDeviceIndices(long address, long pDeviceIndices);

    public VkUInt32 getSplitInstanceBindRegionCount() {
        return new VkUInt32(getVkMemory(), getSplitInstanceBindRegionCount(getVkAddress()));
    }

    public void setSplitInstanceBindRegionCount(VkUInt32 splitInstanceBindRegionCount) {
        setSplitInstanceBindRegionCount(getVkAddress(), splitInstanceBindRegionCount.getVkAddress());
    }

    private static native long getSplitInstanceBindRegionCount(long address);
    private static native void setSplitInstanceBindRegionCount(long address, long splitInstanceBindRegionCount);

    public VkRect2D.Array getPSplitInstanceBindRegions() {
        return new VkRect2D.Array(getVkMemory(), getPSplitInstanceBindRegions(getVkAddress()), getSplitInstanceBindRegionCount().getValue());
    }

    public void setPSplitInstanceBindRegions(VkRect2D pSplitInstanceBindRegions) {
        setPSplitInstanceBindRegions(getVkAddress(), pSplitInstanceBindRegions.getVkAddress());
    }

    private static native long getPSplitInstanceBindRegions(long address);
    private static native void setPSplitInstanceBindRegions(long address, long pSplitInstanceBindRegions);


    public static native long sizeof();

    public static class Array extends VkBindImageMemoryDeviceGroupInfo implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemoryDeviceGroupInfo> {
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
        public VkBindImageMemoryDeviceGroupInfo get(int i){
            return new VkBindImageMemoryDeviceGroupInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkBindImageMemoryDeviceGroupInfo[] a) {
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
