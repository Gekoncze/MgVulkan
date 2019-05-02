package cz.mg.vulkan;

public class VkDeviceGroupPresentInfoKHR extends VkObject {
    public VkDeviceGroupPresentInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR));
    }

    public VkDeviceGroupPresentInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupPresentInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupPresentInfoKHR(VkPointer pointer) {
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

    public VkUInt32 getSwapchainCount() {
        return new VkUInt32(getVkMemory(), getSwapchainCountNative(getVkAddress()));
    }

    
    public void setSwapchainCount(VkUInt32 swapchainCount) {
        setSwapchainCountNative(getVkAddress(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSwapchainCountQ() {
        return getSwapchainCount().getValue();
    }

    public void setSwapchainCount(int swapchainCount) {
        getSwapchainCount().setValue(swapchainCount);
    }

    protected static native long getSwapchainCountNative(long address);
    protected static native void setSwapchainCountNative(long address, long swapchainCount);

    public VkUInt32 getPDeviceMasks() {
        return new VkUInt32(getVkMemory(), getPDeviceMasksNative(getVkAddress()));
    }

    private VkObject pDeviceMasks = null;
    public void setPDeviceMasks(VkUInt32 pDeviceMasks) {
        setPDeviceMasksNative(getVkAddress(), pDeviceMasks != null ? pDeviceMasks.getVkAddress() : VkPointer.NULL);
        this.pDeviceMasks = pDeviceMasks;
    }

    protected static native long getPDeviceMasksNative(long address);
    protected static native void setPDeviceMasksNative(long address, long pDeviceMasks);

    public VkDeviceGroupPresentModeFlagBitsKHR getMode() {
        return new VkDeviceGroupPresentModeFlagBitsKHR(getVkMemory(), getModeNative(getVkAddress()));
    }

    
    public void setMode(VkDeviceGroupPresentModeFlagBitsKHR mode) {
        setModeNative(getVkAddress(), mode != null ? mode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getModeQ() {
        return getMode().getValue();
    }

    public void setMode(int mode) {
        getMode().setValue(mode);
    }

    protected static native long getModeNative(long address);
    protected static native void setModeNative(long address, long mode);


    public void set(VkDeviceGroupPresentInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDeviceGroupPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupPresentInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR));;
        }

        public Array(int count, VkDeviceGroupPresentInfoKHR o){
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
        public VkDeviceGroupPresentInfoKHR get(int i){
            return new VkDeviceGroupPresentInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
