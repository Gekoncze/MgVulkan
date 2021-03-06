package cz.mg.vulkan;

public class VkPhysicalDevicePushDescriptorPropertiesKHR extends VkObject {
    public VkPhysicalDevicePushDescriptorPropertiesKHR() {
        super(sizeof());
    }

    protected VkPhysicalDevicePushDescriptorPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDevicePushDescriptorPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDevicePushDescriptorPropertiesKHR(VkPointer pointer) {
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

    public VkUInt32 getMaxPushDescriptors() {
        return new VkUInt32(getVkMemory(), getMaxPushDescriptorsNative(getVkAddress()));
    }

    
    public void setMaxPushDescriptors(VkUInt32 maxPushDescriptors) {
        setMaxPushDescriptorsNative(getVkAddress(), maxPushDescriptors != null ? maxPushDescriptors.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPushDescriptorsQ() {
        return getMaxPushDescriptors().getValue();
    }

    public void setMaxPushDescriptors(int maxPushDescriptors) {
        getMaxPushDescriptors().setValue(maxPushDescriptors);
    }

    protected static native long getMaxPushDescriptorsNative(long address);
    protected static native void setMaxPushDescriptorsNative(long address, long maxPushDescriptors);


    public void set(VkPhysicalDevicePushDescriptorPropertiesKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDevicePushDescriptorPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePushDescriptorPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevicePushDescriptorPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDevicePushDescriptorPropertiesKHR o, int count){
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
        public VkPhysicalDevicePushDescriptorPropertiesKHR get(int i){
            return new VkPhysicalDevicePushDescriptorPropertiesKHR(getVkMemory(), address(i));
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
