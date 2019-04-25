package cz.mg.vulkan;

public class VkPhysicalDeviceProperties extends VkObject {
    public VkPhysicalDeviceProperties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getApiVersion() {
        return new VkUInt32(getVkMemory(), getApiVersionNative(getVkAddress()));
    }

    
    public void setApiVersion(VkUInt32 apiVersion) {
        setApiVersionNative(getVkAddress(), apiVersion != null ? apiVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getApiVersionQ() {
        return getApiVersion().getValue();
    }

    public void setApiVersion(int apiVersion) {
        getApiVersion().setValue(apiVersion);
    }

    protected static native long getApiVersionNative(long address);
    protected static native void setApiVersionNative(long address, long apiVersion);

    public VkUInt32 getDriverVersion() {
        return new VkUInt32(getVkMemory(), getDriverVersionNative(getVkAddress()));
    }

    
    public void setDriverVersion(VkUInt32 driverVersion) {
        setDriverVersionNative(getVkAddress(), driverVersion != null ? driverVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDriverVersionQ() {
        return getDriverVersion().getValue();
    }

    public void setDriverVersion(int driverVersion) {
        getDriverVersion().setValue(driverVersion);
    }

    protected static native long getDriverVersionNative(long address);
    protected static native void setDriverVersionNative(long address, long driverVersion);

    public VkUInt32 getVendorID() {
        return new VkUInt32(getVkMemory(), getVendorIDNative(getVkAddress()));
    }

    
    public void setVendorID(VkUInt32 vendorID) {
        setVendorIDNative(getVkAddress(), vendorID != null ? vendorID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVendorIDQ() {
        return getVendorID().getValue();
    }

    public void setVendorID(int vendorID) {
        getVendorID().setValue(vendorID);
    }

    protected static native long getVendorIDNative(long address);
    protected static native void setVendorIDNative(long address, long vendorID);

    public VkUInt32 getDeviceID() {
        return new VkUInt32(getVkMemory(), getDeviceIDNative(getVkAddress()));
    }

    
    public void setDeviceID(VkUInt32 deviceID) {
        setDeviceIDNative(getVkAddress(), deviceID != null ? deviceID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceIDQ() {
        return getDeviceID().getValue();
    }

    public void setDeviceID(int deviceID) {
        getDeviceID().setValue(deviceID);
    }

    protected static native long getDeviceIDNative(long address);
    protected static native void setDeviceIDNative(long address, long deviceID);

    public VkPhysicalDeviceType getDeviceType() {
        return new VkPhysicalDeviceType(getVkMemory(), getDeviceTypeNative(getVkAddress()));
    }

    
    public void setDeviceType(VkPhysicalDeviceType deviceType) {
        setDeviceTypeNative(getVkAddress(), deviceType != null ? deviceType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceTypeQ() {
        return getDeviceType().getValue();
    }

    public void setDeviceType(int deviceType) {
        getDeviceType().setValue(deviceType);
    }

    protected static native long getDeviceTypeNative(long address);
    protected static native void setDeviceTypeNative(long address, long deviceType);

    public VkChar getDeviceName() {
        return new VkChar(getVkMemory(), getDeviceNameNative(getVkAddress()));
    }

    
    public void setDeviceName(VkChar deviceName) {
        setDeviceNameNative(getVkAddress(), deviceName != null ? deviceName.getVkAddress() : VkPointer.NULL);
        
    }

    public String getDeviceNameQ() {
        return new VkString(getDeviceName()).toString();
    }

    public void setDeviceName(String deviceName) {
        setDeviceName(new VkString(deviceName));
    }

    protected static native long getDeviceNameNative(long address);
    protected static native void setDeviceNameNative(long address, long deviceName);

    public VkUInt8 getPipelineCacheUUID() {
        return new VkUInt8(getVkMemory(), getPipelineCacheUUIDNative(getVkAddress()));
    }

    
    public void setPipelineCacheUUID(VkUInt8 pipelineCacheUUID) {
        setPipelineCacheUUIDNative(getVkAddress(), pipelineCacheUUID != null ? pipelineCacheUUID.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPipelineCacheUUIDNative(long address);
    protected static native void setPipelineCacheUUIDNative(long address, long pipelineCacheUUID);

    public VkPhysicalDeviceLimits getLimits() {
        return new VkPhysicalDeviceLimits(getVkMemory(), getLimitsNative(getVkAddress()));
    }

    
    public void setLimits(VkPhysicalDeviceLimits limits) {
        setLimitsNative(getVkAddress(), limits != null ? limits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getLimitsNative(long address);
    protected static native void setLimitsNative(long address, long limits);

    public VkPhysicalDeviceSparseProperties getSparseProperties() {
        return new VkPhysicalDeviceSparseProperties(getVkMemory(), getSparsePropertiesNative(getVkAddress()));
    }

    
    public void setSparseProperties(VkPhysicalDeviceSparseProperties sparseProperties) {
        setSparsePropertiesNative(getVkAddress(), sparseProperties != null ? sparseProperties.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSparsePropertiesNative(long address);
    protected static native void setSparsePropertiesNative(long address, long sparseProperties);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceProperties o, int count){
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
        public VkPhysicalDeviceProperties get(int i){
            return new VkPhysicalDeviceProperties(getVkMemory(), address(i));
        }

        protected long address(int i){
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
