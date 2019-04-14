package cz.mg.vulkan;

public class VkPhysicalDeviceIDProperties extends VkObject {
    public VkPhysicalDeviceIDProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceIDProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceIDProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkUInt8 getDeviceUUID() {
        return new VkUInt8(getVkMemory(), getDeviceUUID(getVkAddress()));
    }

    
    public void setDeviceUUID(VkUInt8 deviceUUID) {
        setDeviceUUID(getVkAddress(), deviceUUID != null ? deviceUUID.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getDeviceUUID(long address);
    private static native void setDeviceUUID(long address, long deviceUUID);

    public VkUInt8 getDriverUUID() {
        return new VkUInt8(getVkMemory(), getDriverUUID(getVkAddress()));
    }

    
    public void setDriverUUID(VkUInt8 driverUUID) {
        setDriverUUID(getVkAddress(), driverUUID != null ? driverUUID.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getDriverUUID(long address);
    private static native void setDriverUUID(long address, long driverUUID);

    public VkUInt8 getDeviceLUID() {
        return new VkUInt8(getVkMemory(), getDeviceLUID(getVkAddress()));
    }

    
    public void setDeviceLUID(VkUInt8 deviceLUID) {
        setDeviceLUID(getVkAddress(), deviceLUID != null ? deviceLUID.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getDeviceLUID(long address);
    private static native void setDeviceLUID(long address, long deviceLUID);

    public VkUInt32 getDeviceNodeMask() {
        return new VkUInt32(getVkMemory(), getDeviceNodeMask(getVkAddress()));
    }

    
    public void setDeviceNodeMask(VkUInt32 deviceNodeMask) {
        setDeviceNodeMask(getVkAddress(), deviceNodeMask != null ? deviceNodeMask.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setDeviceNodeMask(int deviceNodeMask) {
        getDeviceNodeMask().setValue(deviceNodeMask);
    }

    private static native long getDeviceNodeMask(long address);
    private static native void setDeviceNodeMask(long address, long deviceNodeMask);

    public VkBool32 getDeviceLUIDValid() {
        return new VkBool32(getVkMemory(), getDeviceLUIDValid(getVkAddress()));
    }

    
    public void setDeviceLUIDValid(VkBool32 deviceLUIDValid) {
        setDeviceLUIDValid(getVkAddress(), deviceLUIDValid != null ? deviceLUIDValid.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setDeviceLUIDValid(int deviceLUIDValid) {
        getDeviceLUIDValid().setValue(deviceLUIDValid);
    }

    private static native long getDeviceLUIDValid(long address);
    private static native void setDeviceLUIDValid(long address, long deviceLUIDValid);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceIDProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceIDProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceIDProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceIDProperties o){
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
        public VkPhysicalDeviceIDProperties get(int i){
            return new VkPhysicalDeviceIDProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceIDProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceIDProperties.Pointer> {
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

            public Array(VkPhysicalDeviceIDProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceIDProperties.Pointer get(int i){
                return new VkPhysicalDeviceIDProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
