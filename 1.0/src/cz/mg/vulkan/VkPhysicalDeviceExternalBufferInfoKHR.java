package cz.mg.vulkan;

public class VkPhysicalDeviceExternalBufferInfoKHR extends VkObject {
    public VkPhysicalDeviceExternalBufferInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR));
    }

    public VkPhysicalDeviceExternalBufferInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceExternalBufferInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceExternalBufferInfoKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
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

    public VkBufferCreateFlags getFlags() {
        return new VkBufferCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkBufferCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkBufferUsageFlags getUsage() {
        return new VkBufferUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    
    public void setUsage(VkBufferUsageFlags usage) {
        setUsage(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUsageQ() {
        return getUsage().getValue();
    }

    public void setUsage(int usage) {
        getUsage().setValue(usage);
    }

    protected static native long getUsage(long address);
    protected static native void setUsage(long address, long usage);

    public VkExternalMemoryHandleTypeFlagBitsKHR getHandleType() {
        return new VkExternalMemoryHandleTypeFlagBitsKHR(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalMemoryHandleTypeFlagBitsKHR handleType) {
        setHandleType(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHandleTypeQ() {
        return getHandleType().getValue();
    }

    public void setHandleType(int handleType) {
        getHandleType().setValue(handleType);
    }

    protected static native long getHandleType(long address);
    protected static native void setHandleType(long address, long handleType);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceExternalBufferInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalBufferInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceExternalBufferInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR));;
        }

        public Array(int count, VkPhysicalDeviceExternalBufferInfoKHR o){
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
        public VkPhysicalDeviceExternalBufferInfoKHR get(int i){
            return new VkPhysicalDeviceExternalBufferInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
