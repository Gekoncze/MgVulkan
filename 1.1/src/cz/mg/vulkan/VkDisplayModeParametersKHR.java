package cz.mg.vulkan;

public class VkDisplayModeParametersKHR extends VkObject {
    public VkDisplayModeParametersKHR() {
        super(sizeof());
    }

    protected VkDisplayModeParametersKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayModeParametersKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayModeParametersKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExtent2D getVisibleRegion() {
        return new VkExtent2D(getVkMemory(), getVisibleRegionNative(getVkAddress()));
    }

    
    public void setVisibleRegion(VkExtent2D visibleRegion) {
        setVisibleRegionNative(getVkAddress(), visibleRegion != null ? visibleRegion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getVisibleRegionNative(long address);
    protected static native void setVisibleRegionNative(long address, long visibleRegion);

    public VkUInt32 getRefreshRate() {
        return new VkUInt32(getVkMemory(), getRefreshRateNative(getVkAddress()));
    }

    
    public void setRefreshRate(VkUInt32 refreshRate) {
        setRefreshRateNative(getVkAddress(), refreshRate != null ? refreshRate.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRefreshRateQ() {
        return getRefreshRate().getValue();
    }

    public void setRefreshRate(int refreshRate) {
        getRefreshRate().setValue(refreshRate);
    }

    protected static native long getRefreshRateNative(long address);
    protected static native void setRefreshRateNative(long address, long refreshRate);


    public static native long sizeof();

    public static class Array extends VkDisplayModeParametersKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeParametersKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModeParametersKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayModeParametersKHR o, int count){
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
        public VkDisplayModeParametersKHR get(int i){
            return new VkDisplayModeParametersKHR(getVkMemory(), address(i));
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
