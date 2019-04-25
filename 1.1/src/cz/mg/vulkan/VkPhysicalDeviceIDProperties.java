package cz.mg.vulkan;

public class VkPhysicalDeviceIDProperties extends VkObject {
    public VkPhysicalDeviceIDProperties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceIDProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceIDProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceIDProperties(VkPointer pointer) {
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

    public VkUInt8 getDeviceUUID() {
        return new VkUInt8(getVkMemory(), getDeviceUUID(getVkAddress()));
    }

    
    public void setDeviceUUID(VkUInt8 deviceUUID) {
        setDeviceUUID(getVkAddress(), deviceUUID != null ? deviceUUID.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getDeviceUUID(long address);
    protected static native void setDeviceUUID(long address, long deviceUUID);

    public VkUInt8 getDriverUUID() {
        return new VkUInt8(getVkMemory(), getDriverUUID(getVkAddress()));
    }

    
    public void setDriverUUID(VkUInt8 driverUUID) {
        setDriverUUID(getVkAddress(), driverUUID != null ? driverUUID.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getDriverUUID(long address);
    protected static native void setDriverUUID(long address, long driverUUID);

    public VkUInt8 getDeviceLUID() {
        return new VkUInt8(getVkMemory(), getDeviceLUID(getVkAddress()));
    }

    
    public void setDeviceLUID(VkUInt8 deviceLUID) {
        setDeviceLUID(getVkAddress(), deviceLUID != null ? deviceLUID.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getDeviceLUID(long address);
    protected static native void setDeviceLUID(long address, long deviceLUID);

    public VkUInt32 getDeviceNodeMask() {
        return new VkUInt32(getVkMemory(), getDeviceNodeMask(getVkAddress()));
    }

    
    public void setDeviceNodeMask(VkUInt32 deviceNodeMask) {
        setDeviceNodeMask(getVkAddress(), deviceNodeMask != null ? deviceNodeMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceNodeMaskQ() {
        return getDeviceNodeMask().getValue();
    }

    public void setDeviceNodeMask(int deviceNodeMask) {
        getDeviceNodeMask().setValue(deviceNodeMask);
    }

    protected static native long getDeviceNodeMask(long address);
    protected static native void setDeviceNodeMask(long address, long deviceNodeMask);

    public VkBool32 getDeviceLUIDValid() {
        return new VkBool32(getVkMemory(), getDeviceLUIDValid(getVkAddress()));
    }

    
    public void setDeviceLUIDValid(VkBool32 deviceLUIDValid) {
        setDeviceLUIDValid(getVkAddress(), deviceLUIDValid != null ? deviceLUIDValid.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceLUIDValidQ() {
        return getDeviceLUIDValid().getValue();
    }

    public void setDeviceLUIDValid(int deviceLUIDValid) {
        getDeviceLUIDValid().setValue(deviceLUIDValid);
    }

    protected static native long getDeviceLUIDValid(long address);
    protected static native void setDeviceLUIDValid(long address, long deviceLUIDValid);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceIDProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceIDProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceIDProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceIDProperties o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceIDProperties get(int i){
            return new VkPhysicalDeviceIDProperties(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
