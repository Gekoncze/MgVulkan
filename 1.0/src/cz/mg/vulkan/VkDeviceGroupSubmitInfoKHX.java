package cz.mg.vulkan;

public class VkDeviceGroupSubmitInfoKHX extends VkObject {
    public VkDeviceGroupSubmitInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX));
    }

    public VkDeviceGroupSubmitInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupSubmitInfoKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCount(getVkAddress()));
    }

    
    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCount(getVkAddress(), waitSemaphoreCount != null ? waitSemaphoreCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWaitSemaphoreCountQ() {
        return getWaitSemaphoreCount().getValue();
    }

    public void setWaitSemaphoreCount(int waitSemaphoreCount) {
        getWaitSemaphoreCount().setValue(waitSemaphoreCount);
    }

    protected static native long getWaitSemaphoreCount(long address);
    protected static native void setWaitSemaphoreCount(long address, long waitSemaphoreCount);

    public VkUInt32 getPWaitSemaphoreDeviceIndices() {
        return new VkUInt32(getVkMemory(), getPWaitSemaphoreDeviceIndices(getVkAddress()));
    }

    private VkObject pWaitSemaphoreDeviceIndices = null;
    public void setPWaitSemaphoreDeviceIndices(VkUInt32 pWaitSemaphoreDeviceIndices) {
        setPWaitSemaphoreDeviceIndices(getVkAddress(), pWaitSemaphoreDeviceIndices != null ? pWaitSemaphoreDeviceIndices.getVkAddress() : VkPointer.NULL);
        this.pWaitSemaphoreDeviceIndices = pWaitSemaphoreDeviceIndices;
    }

    protected static native long getPWaitSemaphoreDeviceIndices(long address);
    protected static native void setPWaitSemaphoreDeviceIndices(long address, long pWaitSemaphoreDeviceIndices);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCount(getVkAddress()));
    }

    
    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCount(getVkAddress(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCommandBufferCountQ() {
        return getCommandBufferCount().getValue();
    }

    public void setCommandBufferCount(int commandBufferCount) {
        getCommandBufferCount().setValue(commandBufferCount);
    }

    protected static native long getCommandBufferCount(long address);
    protected static native void setCommandBufferCount(long address, long commandBufferCount);

    public VkUInt32 getPCommandBufferDeviceMasks() {
        return new VkUInt32(getVkMemory(), getPCommandBufferDeviceMasks(getVkAddress()));
    }

    private VkObject pCommandBufferDeviceMasks = null;
    public void setPCommandBufferDeviceMasks(VkUInt32 pCommandBufferDeviceMasks) {
        setPCommandBufferDeviceMasks(getVkAddress(), pCommandBufferDeviceMasks != null ? pCommandBufferDeviceMasks.getVkAddress() : VkPointer.NULL);
        this.pCommandBufferDeviceMasks = pCommandBufferDeviceMasks;
    }

    protected static native long getPCommandBufferDeviceMasks(long address);
    protected static native void setPCommandBufferDeviceMasks(long address, long pCommandBufferDeviceMasks);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCount(getVkAddress()));
    }

    
    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCount(getVkAddress(), signalSemaphoreCount != null ? signalSemaphoreCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSignalSemaphoreCountQ() {
        return getSignalSemaphoreCount().getValue();
    }

    public void setSignalSemaphoreCount(int signalSemaphoreCount) {
        getSignalSemaphoreCount().setValue(signalSemaphoreCount);
    }

    protected static native long getSignalSemaphoreCount(long address);
    protected static native void setSignalSemaphoreCount(long address, long signalSemaphoreCount);

    public VkUInt32 getPSignalSemaphoreDeviceIndices() {
        return new VkUInt32(getVkMemory(), getPSignalSemaphoreDeviceIndices(getVkAddress()));
    }

    private VkObject pSignalSemaphoreDeviceIndices = null;
    public void setPSignalSemaphoreDeviceIndices(VkUInt32 pSignalSemaphoreDeviceIndices) {
        setPSignalSemaphoreDeviceIndices(getVkAddress(), pSignalSemaphoreDeviceIndices != null ? pSignalSemaphoreDeviceIndices.getVkAddress() : VkPointer.NULL);
        this.pSignalSemaphoreDeviceIndices = pSignalSemaphoreDeviceIndices;
    }

    protected static native long getPSignalSemaphoreDeviceIndices(long address);
    protected static native void setPSignalSemaphoreDeviceIndices(long address, long pSignalSemaphoreDeviceIndices);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupSubmitInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupSubmitInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupSubmitInfoKHX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX));;
        }

        public Array(int count, VkDeviceGroupSubmitInfoKHX o){
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
        public VkDeviceGroupSubmitInfoKHX get(int i){
            return new VkDeviceGroupSubmitInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
