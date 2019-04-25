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



    public VkUInt32 getApiVersion() {
        return new VkUInt32(getVkMemory(), getApiVersion(getVkAddress()));
    }

    
    public void setApiVersion(VkUInt32 apiVersion) {
        setApiVersion(getVkAddress(), apiVersion != null ? apiVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getApiVersionQ() {
        return getApiVersion().getValue();
    }

    public void setApiVersion(int apiVersion) {
        getApiVersion().setValue(apiVersion);
    }

    protected static native long getApiVersion(long address);
    protected static native void setApiVersion(long address, long apiVersion);

    public VkUInt32 getDriverVersion() {
        return new VkUInt32(getVkMemory(), getDriverVersion(getVkAddress()));
    }

    
    public void setDriverVersion(VkUInt32 driverVersion) {
        setDriverVersion(getVkAddress(), driverVersion != null ? driverVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDriverVersionQ() {
        return getDriverVersion().getValue();
    }

    public void setDriverVersion(int driverVersion) {
        getDriverVersion().setValue(driverVersion);
    }

    protected static native long getDriverVersion(long address);
    protected static native void setDriverVersion(long address, long driverVersion);

    public VkUInt32 getVendorID() {
        return new VkUInt32(getVkMemory(), getVendorID(getVkAddress()));
    }

    
    public void setVendorID(VkUInt32 vendorID) {
        setVendorID(getVkAddress(), vendorID != null ? vendorID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVendorIDQ() {
        return getVendorID().getValue();
    }

    public void setVendorID(int vendorID) {
        getVendorID().setValue(vendorID);
    }

    protected static native long getVendorID(long address);
    protected static native void setVendorID(long address, long vendorID);

    public VkUInt32 getDeviceID() {
        return new VkUInt32(getVkMemory(), getDeviceID(getVkAddress()));
    }

    
    public void setDeviceID(VkUInt32 deviceID) {
        setDeviceID(getVkAddress(), deviceID != null ? deviceID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceIDQ() {
        return getDeviceID().getValue();
    }

    public void setDeviceID(int deviceID) {
        getDeviceID().setValue(deviceID);
    }

    protected static native long getDeviceID(long address);
    protected static native void setDeviceID(long address, long deviceID);

    public VkPhysicalDeviceType getDeviceType() {
        return new VkPhysicalDeviceType(getVkMemory(), getDeviceType(getVkAddress()));
    }

    
    public void setDeviceType(VkPhysicalDeviceType deviceType) {
        setDeviceType(getVkAddress(), deviceType != null ? deviceType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceTypeQ() {
        return getDeviceType().getValue();
    }

    public void setDeviceType(int deviceType) {
        getDeviceType().setValue(deviceType);
    }

    protected static native long getDeviceType(long address);
    protected static native void setDeviceType(long address, long deviceType);

    public VkChar getDeviceName() {
        return new VkChar(getVkMemory(), getDeviceName(getVkAddress()));
    }

    
    public void setDeviceName(VkChar deviceName) {
        setDeviceName(getVkAddress(), deviceName != null ? deviceName.getVkAddress() : VkPointer.NULL);
        
    }

    public String getDeviceNameQ() {
        return new VkString(getDeviceName()).toString();
    }

    public void setDeviceName(String deviceName) {
        setDeviceName(new VkString(deviceName));
    }

    protected static native long getDeviceName(long address);
    protected static native void setDeviceName(long address, long deviceName);

    public VkUInt8 getPipelineCacheUUID() {
        return new VkUInt8(getVkMemory(), getPipelineCacheUUID(getVkAddress()));
    }

    
    public void setPipelineCacheUUID(VkUInt8 pipelineCacheUUID) {
        setPipelineCacheUUID(getVkAddress(), pipelineCacheUUID != null ? pipelineCacheUUID.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPipelineCacheUUID(long address);
    protected static native void setPipelineCacheUUID(long address, long pipelineCacheUUID);

    public VkPhysicalDeviceLimits getLimits() {
        return new VkPhysicalDeviceLimits(getVkMemory(), getLimits(getVkAddress()));
    }

    
    public void setLimits(VkPhysicalDeviceLimits limits) {
        setLimits(getVkAddress(), limits != null ? limits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getLimits(long address);
    protected static native void setLimits(long address, long limits);

    public VkPhysicalDeviceSparseProperties getSparseProperties() {
        return new VkPhysicalDeviceSparseProperties(getVkMemory(), getSparseProperties(getVkAddress()));
    }

    
    public void setSparseProperties(VkPhysicalDeviceSparseProperties sparseProperties) {
        setSparseProperties(getVkAddress(), sparseProperties != null ? sparseProperties.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSparseProperties(long address);
    protected static native void setSparseProperties(long address, long sparseProperties);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProperties> {
        private final int count;

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
            return new VkPhysicalDeviceProperties(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceProperties.Pointer get(int i){
                return new VkPhysicalDeviceProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
