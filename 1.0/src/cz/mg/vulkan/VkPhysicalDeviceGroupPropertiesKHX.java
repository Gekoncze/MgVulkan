package cz.mg.vulkan;

public class VkPhysicalDeviceGroupPropertiesKHX extends VkObject {
    public VkPhysicalDeviceGroupPropertiesKHX() {
        super(sizeof());
    }

    public VkPhysicalDeviceGroupPropertiesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceGroupPropertiesKHX(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getPhysicalDeviceCount() {
        return new VkUInt32(getVkMemory(), getPhysicalDeviceCount(getVkAddress()));
    }

    
    public void setPhysicalDeviceCount(VkUInt32 physicalDeviceCount) {
        setPhysicalDeviceCount(getVkAddress(), physicalDeviceCount != null ? physicalDeviceCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPhysicalDeviceCountQ() {
        return getPhysicalDeviceCount().getValue();
    }

    public void setPhysicalDeviceCount(int physicalDeviceCount) {
        getPhysicalDeviceCount().setValue(physicalDeviceCount);
    }

    protected static native long getPhysicalDeviceCount(long address);
    protected static native void setPhysicalDeviceCount(long address, long physicalDeviceCount);

    public VkPhysicalDevice getPhysicalDevices() {
        return new VkPhysicalDevice(getVkMemory(), getPhysicalDevices(getVkAddress()));
    }

    
    public void setPhysicalDevices(VkPhysicalDevice physicalDevices) {
        setPhysicalDevices(getVkAddress(), physicalDevices != null ? physicalDevices.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPhysicalDevices(long address);
    protected static native void setPhysicalDevices(long address, long physicalDevices);

    public VkBool32 getSubsetAllocation() {
        return new VkBool32(getVkMemory(), getSubsetAllocation(getVkAddress()));
    }

    
    public void setSubsetAllocation(VkBool32 subsetAllocation) {
        setSubsetAllocation(getVkAddress(), subsetAllocation != null ? subsetAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubsetAllocationQ() {
        return getSubsetAllocation().getValue();
    }

    public void setSubsetAllocation(int subsetAllocation) {
        getSubsetAllocation().setValue(subsetAllocation);
    }

    protected static native long getSubsetAllocation(long address);
    protected static native void setSubsetAllocation(long address, long subsetAllocation);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceGroupPropertiesKHX implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceGroupPropertiesKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceGroupPropertiesKHX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceGroupPropertiesKHX o){
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
        public VkPhysicalDeviceGroupPropertiesKHX get(int i){
            return new VkPhysicalDeviceGroupPropertiesKHX(getVkMemory(), addressAt(i));
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

        public static class Array extends VkPhysicalDeviceGroupPropertiesKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceGroupPropertiesKHX.Pointer> {
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

            public Array(VkPhysicalDeviceGroupPropertiesKHX[] a) {
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
            public VkPhysicalDeviceGroupPropertiesKHX.Pointer get(int i){
                return new VkPhysicalDeviceGroupPropertiesKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
