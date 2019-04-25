package cz.mg.vulkan;

public class VkPhysicalDeviceGroupPropertiesKHX extends VkObject {
    public VkPhysicalDeviceGroupPropertiesKHX() {
        super(sizeof());
    }

    protected VkPhysicalDeviceGroupPropertiesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceGroupPropertiesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceGroupPropertiesKHX(VkPointer pointer) {
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

    public VkUInt32 getPhysicalDeviceCount() {
        return new VkUInt32(getVkMemory(), getPhysicalDeviceCountNative(getVkAddress()));
    }

    
    public void setPhysicalDeviceCount(VkUInt32 physicalDeviceCount) {
        setPhysicalDeviceCountNative(getVkAddress(), physicalDeviceCount != null ? physicalDeviceCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPhysicalDeviceCountQ() {
        return getPhysicalDeviceCount().getValue();
    }

    public void setPhysicalDeviceCount(int physicalDeviceCount) {
        getPhysicalDeviceCount().setValue(physicalDeviceCount);
    }

    protected static native long getPhysicalDeviceCountNative(long address);
    protected static native void setPhysicalDeviceCountNative(long address, long physicalDeviceCount);

    public VkPhysicalDevice getPhysicalDevices() {
        return new VkPhysicalDevice(getVkMemory(), getPhysicalDevicesNative(getVkAddress()));
    }

    
    public void setPhysicalDevices(VkPhysicalDevice physicalDevices) {
        setPhysicalDevicesNative(getVkAddress(), physicalDevices != null ? physicalDevices.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPhysicalDevicesNative(long address);
    protected static native void setPhysicalDevicesNative(long address, long physicalDevices);

    public VkBool32 getSubsetAllocation() {
        return new VkBool32(getVkMemory(), getSubsetAllocationNative(getVkAddress()));
    }

    
    public void setSubsetAllocation(VkBool32 subsetAllocation) {
        setSubsetAllocationNative(getVkAddress(), subsetAllocation != null ? subsetAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubsetAllocationQ() {
        return getSubsetAllocation().getValue();
    }

    public void setSubsetAllocation(int subsetAllocation) {
        getSubsetAllocation().setValue(subsetAllocation);
    }

    protected static native long getSubsetAllocationNative(long address);
    protected static native void setSubsetAllocationNative(long address, long subsetAllocation);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceGroupPropertiesKHX implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceGroupPropertiesKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceGroupPropertiesKHX.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceGroupPropertiesKHX o, int count){
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
        public VkPhysicalDeviceGroupPropertiesKHX get(int i){
            return new VkPhysicalDeviceGroupPropertiesKHX(getVkMemory(), address(i));
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
