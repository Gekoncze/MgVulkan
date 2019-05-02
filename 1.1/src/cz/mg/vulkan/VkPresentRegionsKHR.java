package cz.mg.vulkan;

public class VkPresentRegionsKHR extends VkObject {
    public VkPresentRegionsKHR() {
        super(sizeof());
    }

    protected VkPresentRegionsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPresentRegionsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPresentRegionsKHR(VkPointer pointer) {
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

    public VkUInt32 getSwapchainCount() {
        return new VkUInt32(getVkMemory(), getSwapchainCountNative(getVkAddress()));
    }

    
    public void setSwapchainCount(VkUInt32 swapchainCount) {
        setSwapchainCountNative(getVkAddress(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSwapchainCountQ() {
        return getSwapchainCount().getValue();
    }

    public void setSwapchainCount(int swapchainCount) {
        getSwapchainCount().setValue(swapchainCount);
    }

    protected static native long getSwapchainCountNative(long address);
    protected static native void setSwapchainCountNative(long address, long swapchainCount);

    public VkPresentRegionKHR getPRegions() {
        return new VkPresentRegionKHR(getVkMemory(), getPRegionsNative(getVkAddress()));
    }

    private VkObject pRegions = null;
    public void setPRegions(VkPresentRegionKHR pRegions) {
        setPRegionsNative(getVkAddress(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
        this.pRegions = pRegions;
    }

    protected static native long getPRegionsNative(long address);
    protected static native void setPRegionsNative(long address, long pRegions);


    public void set(VkPresentRegionsKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPresentRegionsKHR implements cz.mg.collections.array.ReadonlyArray<VkPresentRegionsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentRegionsKHR.sizeof()));
            this.count = count;
        }

        public Array(VkPresentRegionsKHR o, int count){
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
        public VkPresentRegionsKHR get(int i){
            return new VkPresentRegionsKHR(getVkMemory(), address(i));
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
