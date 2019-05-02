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

    public VkMemoryAllocateFlagsInfo(VkPointer pointer) {
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

    public VkMemoryAllocateFlags getFlags() {
        return new VkMemoryAllocateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkMemoryAllocateFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMaskNative(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMaskNative(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceMaskQ() {
        return getDeviceMask().getValue();
    }

    public void setDeviceMask(int deviceMask) {
        getDeviceMask().setValue(deviceMask);
    }

    protected static native long getDeviceMaskNative(long address);
    protected static native void setDeviceMaskNative(long address, long deviceMask);


    public void set(VkMemoryAllocateFlagsInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkMemoryAllocateFlagsInfo implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateFlagsInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryAllocateFlagsInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO));;
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

}
