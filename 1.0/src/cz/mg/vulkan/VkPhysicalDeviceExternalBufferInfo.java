package cz.mg.vulkan;

public class VkPhysicalDeviceExternalBufferInfo extends VkObject {
    public VkPhysicalDeviceExternalBufferInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO));
    }

    public VkPhysicalDeviceExternalBufferInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceExternalBufferInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceExternalBufferInfo(VkPointer pointer) {
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

    public VkBufferCreateFlags getFlags() {
        return new VkBufferCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkBufferCreateFlags flags) {
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

    public VkBufferUsageFlags getUsage() {
        return new VkBufferUsageFlags(getVkMemory(), getUsageNative(getVkAddress()));
    }

    
    public void setUsage(VkBufferUsageFlags usage) {
        setUsageNative(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUsageQ() {
        return getUsage().getValue();
    }

    public void setUsage(int usage) {
        getUsage().setValue(usage);
    }

    protected static native long getUsageNative(long address);
    protected static native void setUsageNative(long address, long usage);

    public VkExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VkExternalMemoryHandleTypeFlagBits(getVkMemory(), getHandleTypeNative(getVkAddress()));
    }

    
    public void setHandleType(VkExternalMemoryHandleTypeFlagBits handleType) {
        setHandleTypeNative(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHandleTypeQ() {
        return getHandleType().getValue();
    }

    public void setHandleType(int handleType) {
        getHandleType().setValue(handleType);
    }

    protected static native long getHandleTypeNative(long address);
    protected static native void setHandleTypeNative(long address, long handleType);


    public void set(VkPhysicalDeviceExternalBufferInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceExternalBufferInfo implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalBufferInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceExternalBufferInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO));;
        }

        public Array(VkPhysicalDeviceExternalBufferInfo o, int count){
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
        public VkPhysicalDeviceExternalBufferInfo get(int i){
            return new VkPhysicalDeviceExternalBufferInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
