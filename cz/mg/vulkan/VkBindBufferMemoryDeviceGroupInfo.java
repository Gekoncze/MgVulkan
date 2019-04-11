package cz.mg.vulkan;

public class VkBindBufferMemoryDeviceGroupInfo extends VkObject {
    public VkBindBufferMemoryDeviceGroupInfo() {
        super(sizeof());
    }

    public VkBindBufferMemoryDeviceGroupInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindBufferMemoryDeviceGroupInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBindBufferMemoryDeviceGroupInfo(VkObject pNext, VkUInt32 deviceIndexCount, VkUInt32 pDeviceIndices) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO));
        setPNext(pNext);
        setDeviceIndexCount(deviceIndexCount);
        setPDeviceIndices(pDeviceIndices);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkUInt32 getDeviceIndexCount() {
        return new VkUInt32(getVkMemory(), getDeviceIndexCount(getVkAddress()));
    }

    
    public void setDeviceIndexCount(VkUInt32 deviceIndexCount) {
        setDeviceIndexCount(getVkAddress(), deviceIndexCount != null ? deviceIndexCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDeviceIndexCount(long address);
    private static native void setDeviceIndexCount(long address, long deviceIndexCount);

    public VkUInt32 getPDeviceIndices() {
        return new VkUInt32(getVkMemory(), getPDeviceIndices(getVkAddress()));
    }

    private VkObject pDeviceIndices = null;
    public void setPDeviceIndices(VkUInt32 pDeviceIndices) {
        setPDeviceIndices(getVkAddress(), pDeviceIndices != null ? pDeviceIndices.getVkAddress() : VkPointer.NULL);
        this.pDeviceIndices = pDeviceIndices;
    }

    private static native long getPDeviceIndices(long address);
    private static native void setPDeviceIndices(long address, long pDeviceIndices);


    public static native long sizeof();

    public static class Array extends VkBindBufferMemoryDeviceGroupInfo implements cz.mg.collections.array.ReadonlyArray<VkBindBufferMemoryDeviceGroupInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindBufferMemoryDeviceGroupInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBindBufferMemoryDeviceGroupInfo o){
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
        public VkBindBufferMemoryDeviceGroupInfo get(int i){
            return new VkBindBufferMemoryDeviceGroupInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkBindBufferMemoryDeviceGroupInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBindBufferMemoryDeviceGroupInfo.Pointer> {
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

            public Array(VkBindBufferMemoryDeviceGroupInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBindBufferMemoryDeviceGroupInfo.Pointer get(int i){
                return new VkBindBufferMemoryDeviceGroupInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
