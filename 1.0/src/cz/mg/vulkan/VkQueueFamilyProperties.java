package cz.mg.vulkan;

public class VkQueueFamilyProperties extends VkObject {
    public VkQueueFamilyProperties() {
        super(sizeof());
    }

    protected VkQueueFamilyProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueueFamilyProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueueFamilyProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkQueueFlags getQueueFlags() {
        return new VkQueueFlags(getVkMemory(), getQueueFlags(getVkAddress()));
    }

    
    public void setQueueFlags(VkQueueFlags queueFlags) {
        setQueueFlags(getVkAddress(), queueFlags != null ? queueFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueFlagsQ() {
        return getQueueFlags().getValue();
    }

    public void setQueueFlags(int queueFlags) {
        getQueueFlags().setValue(queueFlags);
    }

    protected static native long getQueueFlags(long address);
    protected static native void setQueueFlags(long address, long queueFlags);

    public VkUInt32 getQueueCount() {
        return new VkUInt32(getVkMemory(), getQueueCount(getVkAddress()));
    }

    
    public void setQueueCount(VkUInt32 queueCount) {
        setQueueCount(getVkAddress(), queueCount != null ? queueCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueCountQ() {
        return getQueueCount().getValue();
    }

    public void setQueueCount(int queueCount) {
        getQueueCount().setValue(queueCount);
    }

    protected static native long getQueueCount(long address);
    protected static native void setQueueCount(long address, long queueCount);

    public VkUInt32 getTimestampValidBits() {
        return new VkUInt32(getVkMemory(), getTimestampValidBits(getVkAddress()));
    }

    
    public void setTimestampValidBits(VkUInt32 timestampValidBits) {
        setTimestampValidBits(getVkAddress(), timestampValidBits != null ? timestampValidBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTimestampValidBitsQ() {
        return getTimestampValidBits().getValue();
    }

    public void setTimestampValidBits(int timestampValidBits) {
        getTimestampValidBits().setValue(timestampValidBits);
    }

    protected static native long getTimestampValidBits(long address);
    protected static native void setTimestampValidBits(long address, long timestampValidBits);

    public VkExtent3D getMinImageTransferGranularity() {
        return new VkExtent3D(getVkMemory(), getMinImageTransferGranularity(getVkAddress()));
    }

    
    public void setMinImageTransferGranularity(VkExtent3D minImageTransferGranularity) {
        setMinImageTransferGranularity(getVkAddress(), minImageTransferGranularity != null ? minImageTransferGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMinImageTransferGranularity(long address);
    protected static native void setMinImageTransferGranularity(long address, long minImageTransferGranularity);


    public static native long sizeof();

    public static class Array extends VkQueueFamilyProperties implements cz.mg.collections.array.ReadonlyArray<VkQueueFamilyProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueueFamilyProperties.sizeof()));
            this.count = count;
        }

        public Array(VkQueueFamilyProperties o, int count){
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
        public VkQueueFamilyProperties get(int i){
            return new VkQueueFamilyProperties(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
