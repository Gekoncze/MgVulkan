package cz.mg.vulkan;

public class VkDeviceGroupPresentInfoKHR extends VkObject {
    public VkDeviceGroupPresentInfoKHR() {
        super(sizeof());
    }

    public VkDeviceGroupPresentInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupPresentInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceGroupPresentInfoKHR(VkObject pNext, VkUInt32 swapchainCount, VkUInt32 pDeviceMasks, VkDeviceGroupPresentModeFlagBitsKHR mode) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR));
        setPNext(pNext);
        setSwapchainCount(swapchainCount);
        setPDeviceMasks(pDeviceMasks);
        setMode(mode);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkUInt32 getSwapchainCount() {
        return new VkUInt32(getVkMemory(), getSwapchainCount(getVkAddress()));
    }

    
    public void setSwapchainCount(VkUInt32 swapchainCount) {
        setSwapchainCount(getVkAddress(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSwapchainCount(long address);
    private static native void setSwapchainCount(long address, long swapchainCount);

    public VkUInt32 getPDeviceMasks() {
        return new VkUInt32(getVkMemory(), getPDeviceMasks(getVkAddress()));
    }

    private VkObject pDeviceMasks = null;
    public void setPDeviceMasks(VkUInt32 pDeviceMasks) {
        setPDeviceMasks(getVkAddress(), pDeviceMasks != null ? pDeviceMasks.getVkAddress() : VkPointer.NULL);
        this.pDeviceMasks = pDeviceMasks;
    }

    private static native long getPDeviceMasks(long address);
    private static native void setPDeviceMasks(long address, long pDeviceMasks);

    public VkDeviceGroupPresentModeFlagBitsKHR getMode() {
        return new VkDeviceGroupPresentModeFlagBitsKHR(getVkMemory(), getMode(getVkAddress()));
    }

    
    public void setMode(VkDeviceGroupPresentModeFlagBitsKHR mode) {
        setMode(getVkAddress(), mode != null ? mode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMode(long address);
    private static native void setMode(long address, long mode);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentInfoKHR> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupPresentInfoKHR.sizeof()));
            this.count = count;
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

        public static class Array extends VkDeviceGroupPresentInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentInfoKHR.Pointer> {
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

            public Array(VkDeviceGroupPresentInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupPresentInfoKHR.Pointer get(int i){
                return new VkDeviceGroupPresentInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
