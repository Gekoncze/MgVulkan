package cz.mg.vulkan;

public class VkSharedPresentSurfaceCapabilitiesKHR extends VkObject {
    public VkSharedPresentSurfaceCapabilitiesKHR() {
        super(sizeof());
    }

    protected VkSharedPresentSurfaceCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSharedPresentSurfaceCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSharedPresentSurfaceCapabilitiesKHR(VkPointer pointer) {
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

    public VkImageUsageFlags getSharedPresentSupportedUsageFlags() {
        return new VkImageUsageFlags(getVkMemory(), getSharedPresentSupportedUsageFlagsNative(getVkAddress()));
    }

    
    public void setSharedPresentSupportedUsageFlags(VkImageUsageFlags sharedPresentSupportedUsageFlags) {
        setSharedPresentSupportedUsageFlagsNative(getVkAddress(), sharedPresentSupportedUsageFlags != null ? sharedPresentSupportedUsageFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSharedPresentSupportedUsageFlagsQ() {
        return getSharedPresentSupportedUsageFlags().getValue();
    }

    public void setSharedPresentSupportedUsageFlags(int sharedPresentSupportedUsageFlags) {
        getSharedPresentSupportedUsageFlags().setValue(sharedPresentSupportedUsageFlags);
    }

    protected static native long getSharedPresentSupportedUsageFlagsNative(long address);
    protected static native void setSharedPresentSupportedUsageFlagsNative(long address, long sharedPresentSupportedUsageFlags);


    public void set(VkSharedPresentSurfaceCapabilitiesKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSharedPresentSurfaceCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkSharedPresentSurfaceCapabilitiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSharedPresentSurfaceCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkSharedPresentSurfaceCapabilitiesKHR o, int count){
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
        public VkSharedPresentSurfaceCapabilitiesKHR get(int i){
            return new VkSharedPresentSurfaceCapabilitiesKHR(getVkMemory(), address(i));
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
