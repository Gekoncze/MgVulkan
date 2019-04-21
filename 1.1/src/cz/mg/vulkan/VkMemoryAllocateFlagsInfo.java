package cz.mg.vulkan;

public class VkMemoryAllocateFlagsInfo extends VkObject {
    public VkMemoryAllocateFlagsInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO));
    }

    public VkMemoryAllocateFlagsInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryAllocateFlagsInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkMemoryAllocateFlags getFlags() {
        return new VkMemoryAllocateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkMemoryAllocateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMask(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMask(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDeviceMaskQ() {
        return getDeviceMask().getValue();
    }

    public void setDeviceMask(int deviceMask) {
        getDeviceMask().setValue(deviceMask);
    }

    private static native long getDeviceMask(long address);
    private static native void setDeviceMask(long address, long deviceMask);


    public static native long sizeof();

    public static class Array extends VkMemoryAllocateFlagsInfo implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateFlagsInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryAllocateFlagsInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryAllocateFlagsInfo o){
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
        public VkMemoryAllocateFlagsInfo get(int i){
            return new VkMemoryAllocateFlagsInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryAllocateFlagsInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateFlagsInfo.Pointer> {
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

            public Array(VkMemoryAllocateFlagsInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryAllocateFlagsInfo.Pointer get(int i){
                return new VkMemoryAllocateFlagsInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
