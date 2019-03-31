package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupDeviceCreateInfo.html">khronos documentation</a>
 **/
public class VkDeviceGroupDeviceCreateInfo extends VkObject {
    public VkDeviceGroupDeviceCreateInfo() {
        super(sizeof());
    }

    public VkDeviceGroupDeviceCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDeviceGroupDeviceCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDeviceGroupDeviceCreateInfo(VkObject pNext, VkUInt32 physicalDeviceCount, VkPhysicalDevice pPhysicalDevices) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO));
        setPNext(pNext);
        setPhysicalDeviceCount(physicalDeviceCount);
        setPPhysicalDevices(pPhysicalDevices);
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

    public VkPhysicalDevice.Array getPPhysicalDevices() {
        return new VkPhysicalDevice.Array(getVkMemory(), getPPhysicalDevices(getVkAddress()), getPhysicalDeviceCount().getValue());
    }

    public void setPPhysicalDevices(VkPhysicalDevice pPhysicalDevices) {
        setPPhysicalDevices(getVkAddress(), pPhysicalDevices.getVkAddress());
    }

    private static native long getPPhysicalDevices(long address);
    private static native void setPPhysicalDevices(long address, long pPhysicalDevices);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupDeviceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupDeviceCreateInfo> {
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
        public VkDeviceGroupDeviceCreateInfo get(int i){
            return new VkDeviceGroupDeviceCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkDeviceGroupDeviceCreateInfo[] a) {
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
