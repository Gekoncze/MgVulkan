package cz.mg.vulkan;

public class VkPhysicalDeviceExternalFenceInfo extends VkObject {
    public VkPhysicalDeviceExternalFenceInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO));
    }

    public VkPhysicalDeviceExternalFenceInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceExternalFenceInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceExternalFenceInfo(VkPointer pointer) {
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

    public VkExternalFenceHandleTypeFlagBits getHandleType() {
        return new VkExternalFenceHandleTypeFlagBits(getVkMemory(), getHandleTypeNative(getVkAddress()));
    }

    
    public void setHandleType(VkExternalFenceHandleTypeFlagBits handleType) {
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


    public void set(VkPhysicalDeviceExternalFenceInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceExternalFenceInfo implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalFenceInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceExternalFenceInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO));;
        }

        public Array(int count, VkPhysicalDeviceExternalFenceInfo o){
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
        public VkPhysicalDeviceExternalFenceInfo get(int i){
            return new VkPhysicalDeviceExternalFenceInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
