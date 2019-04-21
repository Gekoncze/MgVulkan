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

    public VkUInt32 getPhysicalDeviceCount() {
        return new VkUInt32(getVkMemory(), getPhysicalDeviceCount(getVkAddress()));
    }

    
    public void setPhysicalDeviceCount(VkUInt32 physicalDeviceCount) {
        setPhysicalDeviceCount(getVkAddress(), physicalDeviceCount != null ? physicalDeviceCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPhysicalDeviceCountQ() {
        return getPhysicalDeviceCount().getValue();
    }

    public void setPhysicalDeviceCount(int physicalDeviceCount) {
        getPhysicalDeviceCount().setValue(physicalDeviceCount);
    }

    private static native long getPhysicalDeviceCount(long address);
    private static native void setPhysicalDeviceCount(long address, long physicalDeviceCount);

    public VkPhysicalDevice getPPhysicalDevices() {
        return new VkPhysicalDevice(getVkMemory(), getPPhysicalDevices(getVkAddress()));
    }

    private VkObject pPhysicalDevices = null;
    public void setPPhysicalDevices(VkPhysicalDevice pPhysicalDevices) {
        setPPhysicalDevices(getVkAddress(), pPhysicalDevices != null ? pPhysicalDevices.getVkAddress() : VkPointer.NULL);
        this.pPhysicalDevices = pPhysicalDevices;
    }

    private static native long getPPhysicalDevices(long address);
    private static native void setPPhysicalDevices(long address, long pPhysicalDevices);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupDeviceCreateInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupDeviceCreateInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupDeviceCreateInfoKHX.sizeof()));
            this.count = count;
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

        public static class Array extends VkDeviceGroupDeviceCreateInfoKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupDeviceCreateInfoKHX.Pointer> {
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

            public Array(VkDeviceGroupDeviceCreateInfoKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupDeviceCreateInfoKHX.Pointer get(int i){
                return new VkDeviceGroupDeviceCreateInfoKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
