package cz.mg.vulkan;

public class VkPresentTimesInfoGOOGLE extends VkObject {
    public VkPresentTimesInfoGOOGLE() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE));
    }

    public VkPresentTimesInfoGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPresentTimesInfoGOOGLE(VkMemory vkmemory, long vkaddress) {
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

    public VkPresentTimeGOOGLE getPTimes() {
        return new VkPresentTimeGOOGLE(getVkMemory(), getPTimes(getVkAddress()));
    }

    private VkObject pTimes = null;
    public void setPTimes(VkPresentTimeGOOGLE pTimes) {
        setPTimes(getVkAddress(), pTimes != null ? pTimes.getVkAddress() : VkPointer.NULL);
        this.pTimes = pTimes;
    }

    protected static native long getPTimes(long address);
    protected static native void setPTimes(long address, long pTimes);


    public static native long sizeof();

    public static class Array extends VkPresentTimesInfoGOOGLE implements cz.mg.collections.array.ReadonlyArray<VkPresentTimesInfoGOOGLE> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentTimesInfoGOOGLE.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE));;
        }

        public Array(int count, VkPresentTimesInfoGOOGLE o){
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
        public VkPresentTimesInfoGOOGLE get(int i){
            return new VkPresentTimesInfoGOOGLE(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
