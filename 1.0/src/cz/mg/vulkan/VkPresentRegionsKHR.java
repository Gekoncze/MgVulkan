package cz.mg.vulkan;

public class VkPresentRegionsKHR extends VkObject {
    public VkPresentRegionsKHR() {
        super(sizeof());
    }

    public VkPresentRegionsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPresentRegionsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkUInt32 getSwapchainCount() {
        return new VkUInt32(getVkMemory(), getSwapchainCount(getVkAddress()));
    }

    
    public void setSwapchainCount(VkUInt32 swapchainCount) {
        setSwapchainCount(getVkAddress(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSwapchainCountQ() {
        return getSwapchainCount().getValue();
    }

    public void setSwapchainCount(int swapchainCount) {
        getSwapchainCount().setValue(swapchainCount);
    }

    protected static native long getSwapchainCount(long address);
    protected static native void setSwapchainCount(long address, long swapchainCount);

    public VkPresentRegionKHR getPRegions() {
        return new VkPresentRegionKHR(getVkMemory(), getPRegions(getVkAddress()));
    }

    private VkObject pRegions = null;
    public void setPRegions(VkPresentRegionKHR pRegions) {
        setPRegions(getVkAddress(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
        this.pRegions = pRegions;
    }

    protected static native long getPRegions(long address);
    protected static native void setPRegions(long address, long pRegions);


    public static native long sizeof();

    public static class Array extends VkPresentRegionsKHR implements cz.mg.collections.array.ReadonlyArray<VkPresentRegionsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentRegionsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPresentRegionsKHR o){
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
        public VkPresentRegionsKHR get(int i){
            return new VkPresentRegionsKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
