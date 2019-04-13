package cz.mg.vulkan;

public class VkPhysicalDeviceGroupProperties extends VkObject {
    public VkPhysicalDeviceGroupProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceGroupProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceGroupProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceGroupProperties(VkStructureType sType, VkObject pNext, VkUInt32 physicalDeviceCount, VkPhysicalDevice physicalDevices, VkBool32 subsetAllocation) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setPhysicalDeviceCount(physicalDeviceCount);
        setPhysicalDevices(physicalDevices);
        setSubsetAllocation(subsetAllocation);
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

    public VkUInt32 getPhysicalDeviceCount() {
        return new VkUInt32(getVkMemory(), getPhysicalDeviceCount(getVkAddress()));
    }

    
    public void setPhysicalDeviceCount(VkUInt32 physicalDeviceCount) {
        setPhysicalDeviceCount(getVkAddress(), physicalDeviceCount != null ? physicalDeviceCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPhysicalDeviceCount(long address);
    private static native void setPhysicalDeviceCount(long address, long physicalDeviceCount);

    public VkPhysicalDevice getPhysicalDevices() {
        return new VkPhysicalDevice(getVkMemory(), getPhysicalDevices(getVkAddress()));
    }

    
    public void setPhysicalDevices(VkPhysicalDevice physicalDevices) {
        setPhysicalDevices(getVkAddress(), physicalDevices != null ? physicalDevices.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getPhysicalDevices(long address);
    private static native void setPhysicalDevices(long address, long physicalDevices);

    public VkBool32 getSubsetAllocation() {
        return new VkBool32(getVkMemory(), getSubsetAllocation(getVkAddress()));
    }

    
    public void setSubsetAllocation(VkBool32 subsetAllocation) {
        setSubsetAllocation(getVkAddress(), subsetAllocation != null ? subsetAllocation.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSubsetAllocation(long address);
    private static native void setSubsetAllocation(long address, long subsetAllocation);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceGroupProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceGroupProperties> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceGroupProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceGroupProperties o){
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
        public VkPhysicalDeviceGroupProperties get(int i){
            return new VkPhysicalDeviceGroupProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceGroupProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceGroupProperties.Pointer> {
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

            public Array(VkPhysicalDeviceGroupProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceGroupProperties.Pointer get(int i){
                return new VkPhysicalDeviceGroupProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
