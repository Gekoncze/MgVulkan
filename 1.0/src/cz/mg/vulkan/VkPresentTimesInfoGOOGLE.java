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

    public VkPresentTimesInfoGOOGLE(VkPointer pointer) {
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

    public VkPresentTimeGOOGLE getPTimes() {
        return new VkPresentTimeGOOGLE(getVkMemory(), getPTimesNative(getVkAddress()));
    }

    private VkObject pTimes = null;
    public void setPTimes(VkPresentTimeGOOGLE pTimes) {
        setPTimesNative(getVkAddress(), pTimes != null ? pTimes.getVkAddress() : VkPointer.NULL);
        this.pTimes = pTimes;
    }

    public VkPresentTimeGOOGLE.Array getPTimesQ() {
        return new VkPresentTimeGOOGLE.Array(getPTimes(), getSwapchainCountQ());
    }

    protected static native long getPTimesNative(long address);
    protected static native void setPTimesNative(long address, long pTimes);


    public void set(VkPresentTimesInfoGOOGLE o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPresentTimesInfoGOOGLE implements cz.mg.collections.array.ReadonlyArray<VkPresentTimesInfoGOOGLE> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentTimesInfoGOOGLE.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE));;
        }

        public Array(VkPresentTimesInfoGOOGLE o, int count){
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
