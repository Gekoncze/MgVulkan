package cz.mg.vulkan;

public class VkDeviceGroupDeviceCreateInfoKHX extends VkObject {
    public VkDeviceGroupDeviceCreateInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX));
    }

    public VkDeviceGroupDeviceCreateInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupDeviceCreateInfoKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupDeviceCreateInfoKHX(VkPointer pointer) {
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

    public VkPhysicalDevice getPPhysicalDevices() {
        return new VkPhysicalDevice(getVkMemory(), getPPhysicalDevicesNative(getVkAddress()));
    }

    private VkObject pPhysicalDevices = null;
    public void setPPhysicalDevices(VkPhysicalDevice pPhysicalDevices) {
        setPPhysicalDevicesNative(getVkAddress(), pPhysicalDevices != null ? pPhysicalDevices.getVkAddress() : VkPointer.NULL);
        this.pPhysicalDevices = pPhysicalDevices;
    }

    protected static native long getPPhysicalDevicesNative(long address);
    protected static native void setPPhysicalDevicesNative(long address, long pPhysicalDevices);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupDeviceCreateInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupDeviceCreateInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupDeviceCreateInfoKHX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX));;
        }

        public Array(int count, VkDeviceGroupDeviceCreateInfoKHX o){
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
        public VkDeviceGroupDeviceCreateInfoKHX get(int i){
            return new VkDeviceGroupDeviceCreateInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
