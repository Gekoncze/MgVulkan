package cz.mg.vulkan;

public class VkPhysicalDeviceProperties extends VkObject {
    public VkPhysicalDeviceProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceProperties(VkUInt32 apiVersion, VkUInt32 driverVersion, VkUInt32 vendorID, VkUInt32 deviceID, VkPhysicalDeviceType deviceType, VkChar deviceName, VkUInt8 pipelineCacheUUID, VkPhysicalDeviceLimits limits, VkPhysicalDeviceSparseProperties sparseProperties) {
        super(sizeof());
        setApiVersion(apiVersion);
        setDriverVersion(driverVersion);
        setVendorID(vendorID);
        setDeviceID(deviceID);
        setDeviceType(deviceType);
        setDeviceName(deviceName);
        setPipelineCacheUUID(pipelineCacheUUID);
        setLimits(limits);
        setSparseProperties(sparseProperties);
    }

    public VkUInt32 getApiVersion() {
        return new VkUInt32(getVkMemory(), getApiVersion(getVkAddress()));
    }

    
    public void setApiVersion(VkUInt32 apiVersion) {
        setApiVersion(getVkAddress(), apiVersion != null ? apiVersion.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getApiVersion(long address);
    private static native void setApiVersion(long address, long apiVersion);

    public VkUInt32 getDriverVersion() {
        return new VkUInt32(getVkMemory(), getDriverVersion(getVkAddress()));
    }

    
    public void setDriverVersion(VkUInt32 driverVersion) {
        setDriverVersion(getVkAddress(), driverVersion != null ? driverVersion.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDriverVersion(long address);
    private static native void setDriverVersion(long address, long driverVersion);

    public VkUInt32 getVendorID() {
        return new VkUInt32(getVkMemory(), getVendorID(getVkAddress()));
    }

    
    public void setVendorID(VkUInt32 vendorID) {
        setVendorID(getVkAddress(), vendorID != null ? vendorID.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getVendorID(long address);
    private static native void setVendorID(long address, long vendorID);

    public VkUInt32 getDeviceID() {
        return new VkUInt32(getVkMemory(), getDeviceID(getVkAddress()));
    }

    
    public void setDeviceID(VkUInt32 deviceID) {
        setDeviceID(getVkAddress(), deviceID != null ? deviceID.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDeviceID(long address);
    private static native void setDeviceID(long address, long deviceID);

    public VkPhysicalDeviceType getDeviceType() {
        return new VkPhysicalDeviceType(getVkMemory(), getDeviceType(getVkAddress()));
    }

    
    public void setDeviceType(VkPhysicalDeviceType deviceType) {
        setDeviceType(getVkAddress(), deviceType != null ? deviceType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDeviceType(long address);
    private static native void setDeviceType(long address, long deviceType);

    public VkChar getDeviceName() {
        return new VkChar(getVkMemory(), getDeviceName(getVkAddress()));
    }

    
    public void setDeviceName(VkChar deviceName) {
        setDeviceName(getVkAddress(), deviceName != null ? deviceName.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getDeviceName(long address);
    private static native void setDeviceName(long address, long deviceName);

    public VkUInt8 getPipelineCacheUUID() {
        return new VkUInt8(getVkMemory(), getPipelineCacheUUID(getVkAddress()));
    }

    
    public void setPipelineCacheUUID(VkUInt8 pipelineCacheUUID) {
        setPipelineCacheUUID(getVkAddress(), pipelineCacheUUID != null ? pipelineCacheUUID.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getPipelineCacheUUID(long address);
    private static native void setPipelineCacheUUID(long address, long pipelineCacheUUID);

    public VkPhysicalDeviceLimits getLimits() {
        return new VkPhysicalDeviceLimits(getVkMemory(), getLimits(getVkAddress()));
    }

    
    public void setLimits(VkPhysicalDeviceLimits limits) {
        setLimits(getVkAddress(), limits != null ? limits.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getLimits(long address);
    private static native void setLimits(long address, long limits);

    public VkPhysicalDeviceSparseProperties getSparseProperties() {
        return new VkPhysicalDeviceSparseProperties(getVkMemory(), getSparseProperties(getVkAddress()));
    }

    
    public void setSparseProperties(VkPhysicalDeviceSparseProperties sparseProperties) {
        setSparseProperties(getVkAddress(), sparseProperties != null ? sparseProperties.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getSparseProperties(long address);
    private static native void setSparseProperties(long address, long sparseProperties);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProperties> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceProperties o){
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
        public VkPhysicalDeviceProperties get(int i){
            return new VkPhysicalDeviceProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProperties.Pointer> {
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

            public Array(VkPhysicalDeviceProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceProperties.Pointer get(int i){
                return new VkPhysicalDeviceProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
