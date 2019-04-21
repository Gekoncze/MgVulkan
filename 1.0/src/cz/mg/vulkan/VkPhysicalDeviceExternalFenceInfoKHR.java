package cz.mg.vulkan;

public class VkPhysicalDeviceExternalFenceInfoKHR extends VkObject {
    public VkPhysicalDeviceExternalFenceInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR));
    }

    public VkPhysicalDeviceExternalFenceInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceExternalFenceInfoKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkExternalFenceHandleTypeFlagBitsKHR getHandleType() {
        return new VkExternalFenceHandleTypeFlagBitsKHR(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalFenceHandleTypeFlagBitsKHR handleType) {
        setHandleType(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getHandleTypeQ() {
        return getHandleType().getValue();
    }

    public void setHandleType(int handleType) {
        getHandleType().setValue(handleType);
    }

    private static native long getHandleType(long address);
    private static native void setHandleType(long address, long handleType);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceExternalFenceInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalFenceInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceExternalFenceInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceExternalFenceInfoKHR o){
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
        public VkPhysicalDeviceExternalFenceInfoKHR get(int i){
            return new VkPhysicalDeviceExternalFenceInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceExternalFenceInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalFenceInfoKHR.Pointer> {
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

            public Array(VkPhysicalDeviceExternalFenceInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceExternalFenceInfoKHR.Pointer get(int i){
                return new VkPhysicalDeviceExternalFenceInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
