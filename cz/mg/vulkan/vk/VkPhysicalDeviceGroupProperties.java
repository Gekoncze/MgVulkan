package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceGroupProperties.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceGroupProperties extends VkObject {
    public VkPhysicalDeviceGroupProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceGroupProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPhysicalDeviceGroupProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
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
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getPhysicalDeviceCount() {
        return new VkUInt32(getVkMemory(), getPhysicalDeviceCount(getVkAddress()));
    }

    public void setPhysicalDeviceCount(VkUInt32 physicalDeviceCount) {
        setPhysicalDeviceCount(getVkAddress(), physicalDeviceCount.getVkAddress());
    }

    private static native long getPhysicalDeviceCount(long address);
    private static native void setPhysicalDeviceCount(long address, long physicalDeviceCount);

    public VkPhysicalDevice.Array getPhysicalDevices() {
        return new VkPhysicalDevice.Array(getVkMemory(), getPhysicalDevices(getVkAddress()), getPhysicalDeviceCount().getValue());
    }

    public void setPhysicalDevices(VkPhysicalDevice physicalDevices) {
        setPhysicalDevices(getVkAddress(), physicalDevices.getVkAddress());
    }

    private static native long getPhysicalDevices(long address);
    private static native void setPhysicalDevices(long address, long physicalDevices);

    public VkBool32 getSubsetAllocation() {
        return new VkBool32(getVkMemory(), getSubsetAllocation(getVkAddress()));
    }

    public void setSubsetAllocation(VkBool32 subsetAllocation) {
        setSubsetAllocation(getVkAddress(), subsetAllocation.getVkAddress());
    }

    private static native long getSubsetAllocation(long address);
    private static native void setSubsetAllocation(long address, long subsetAllocation);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceGroupProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceGroupProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
