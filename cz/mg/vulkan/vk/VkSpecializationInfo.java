package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSpecializationInfo.html">khronos documentation</a>
 **/
public class VkSpecializationInfo extends VkObject {
    public VkSpecializationInfo() {
        super(sizeof());
    }

    public VkSpecializationInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSpecializationInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSpecializationInfo(VkUInt32 mapEntryCount, VkSpecializationMapEntry pMapEntries, VkSize dataSize, VkObject pData) {
        super(sizeof());
        setMapEntryCount(mapEntryCount);
        setPMapEntries(pMapEntries);
        setDataSize(dataSize);
        setPData(pData);
    }

    public VkUInt32 getMapEntryCount() {
        return new VkUInt32(getVkMemory(), getMapEntryCount(getVkAddress()));
    }

    public void setMapEntryCount(VkUInt32 mapEntryCount) {
        setMapEntryCount(getVkAddress(), mapEntryCount.getVkAddress());
    }

    private static native long getMapEntryCount(long address);
    private static native void setMapEntryCount(long address, long mapEntryCount);

    public VkSpecializationMapEntry.Array getPMapEntries() {
        return new VkSpecializationMapEntry.Array(getVkMemory(), getPMapEntries(getVkAddress()), getMapEntryCount().getValue());
    }

    public void setPMapEntries(VkSpecializationMapEntry pMapEntries) {
        setPMapEntries(getVkAddress(), pMapEntries.getVkAddress());
    }

    private static native long getPMapEntries(long address);
    private static native void setPMapEntries(long address, long pMapEntries);

    public VkSize getDataSize() {
        return new VkSize(getVkMemory(), getDataSize(getVkAddress()));
    }

    public void setDataSize(VkSize dataSize) {
        setDataSize(getVkAddress(), dataSize.getVkAddress());
    }

    private static native long getDataSize(long address);
    private static native void setDataSize(long address, long dataSize);

    public VkObject getPData() {
        return new VkObject(getVkMemory(), getPData(getVkAddress()));
    }

    public void setPData(VkObject pData) {
        setPData(getVkAddress(), pData.getVkAddress());
    }

    private static native long getPData(long address);
    private static native void setPData(long address, long pData);


    public static native long sizeof();

    public static class Array extends VkSpecializationInfo implements cz.mg.collections.array.ReadonlyArray<VkSpecializationInfo> {
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
        public VkSpecializationInfo get(int i){
            return new VkSpecializationInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSpecializationInfo[] a) {
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
