package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueFamilyProperties.html">khronos documentation</a>
 **/
public class VkQueueFamilyProperties extends VkObject {
    public VkQueueFamilyProperties() {
        super(sizeof());
    }

    public VkQueueFamilyProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkQueueFamilyProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkQueueFamilyProperties(VkQueueFlags queueFlags, VkUInt32 queueCount, VkUInt32 timestampValidBits, VkExtent3D minImageTransferGranularity) {
        super(sizeof());
        setQueueFlags(queueFlags);
        setQueueCount(queueCount);
        setTimestampValidBits(timestampValidBits);
        setMinImageTransferGranularity(minImageTransferGranularity);
    }

    public VkQueueFlags getQueueFlags() {
        return new VkQueueFlags(getVkMemory(), getQueueFlags(getVkAddress()));
    }

    public void setQueueFlags(VkQueueFlags queueFlags) {
        setQueueFlags(getVkAddress(), queueFlags.getVkAddress());
    }

    private static native long getQueueFlags(long address);
    private static native void setQueueFlags(long address, long queueFlags);

    public VkUInt32 getQueueCount() {
        return new VkUInt32(getVkMemory(), getQueueCount(getVkAddress()));
    }

    public void setQueueCount(VkUInt32 queueCount) {
        setQueueCount(getVkAddress(), queueCount.getVkAddress());
    }

    private static native long getQueueCount(long address);
    private static native void setQueueCount(long address, long queueCount);

    public VkUInt32.Array getTimestampValidBits() {
        return new VkUInt32.Array(getVkMemory(), getTimestampValidBits(getVkAddress()), getQueueCount().getValue());
    }

    public void setTimestampValidBits(VkUInt32 timestampValidBits) {
        setTimestampValidBits(getVkAddress(), timestampValidBits.getVkAddress());
    }

    private static native long getTimestampValidBits(long address);
    private static native void setTimestampValidBits(long address, long timestampValidBits);

    public VkExtent3D getMinImageTransferGranularity() {
        return new VkExtent3D(getVkMemory(), getMinImageTransferGranularity(getVkAddress()));
    }

    public void setMinImageTransferGranularity(VkExtent3D minImageTransferGranularity) {
        setMinImageTransferGranularity(getVkAddress(), minImageTransferGranularity.getVkAddress());
    }

    private static native long getMinImageTransferGranularity(long address);
    private static native void setMinImageTransferGranularity(long address, long minImageTransferGranularity);


    public static native long sizeof();

    public static class Array extends VkQueueFamilyProperties implements cz.mg.collections.array.ReadonlyArray<VkQueueFamilyProperties> {
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
        public VkQueueFamilyProperties get(int i){
            return new VkQueueFamilyProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkQueueFamilyProperties[] a) {
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
