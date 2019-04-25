package cz.mg.vulkan;

public class VkPastPresentationTimingGOOGLE extends VkObject {
    public VkPastPresentationTimingGOOGLE() {
        super(sizeof());
    }

    protected VkPastPresentationTimingGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPastPresentationTimingGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPastPresentationTimingGOOGLE(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getPresentID() {
        return new VkUInt32(getVkMemory(), getPresentIDNative(getVkAddress()));
    }

    
    public void setPresentID(VkUInt32 presentID) {
        setPresentIDNative(getVkAddress(), presentID != null ? presentID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPresentIDQ() {
        return getPresentID().getValue();
    }

    public void setPresentID(int presentID) {
        getPresentID().setValue(presentID);
    }

    protected static native long getPresentIDNative(long address);
    protected static native void setPresentIDNative(long address, long presentID);

    public VkUInt64 getDesiredPresentTime() {
        return new VkUInt64(getVkMemory(), getDesiredPresentTimeNative(getVkAddress()));
    }

    
    public void setDesiredPresentTime(VkUInt64 desiredPresentTime) {
        setDesiredPresentTimeNative(getVkAddress(), desiredPresentTime != null ? desiredPresentTime.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDesiredPresentTimeQ() {
        return getDesiredPresentTime().getValue();
    }

    public void setDesiredPresentTime(long desiredPresentTime) {
        getDesiredPresentTime().setValue(desiredPresentTime);
    }

    protected static native long getDesiredPresentTimeNative(long address);
    protected static native void setDesiredPresentTimeNative(long address, long desiredPresentTime);

    public VkUInt64 getActualPresentTime() {
        return new VkUInt64(getVkMemory(), getActualPresentTimeNative(getVkAddress()));
    }

    
    public void setActualPresentTime(VkUInt64 actualPresentTime) {
        setActualPresentTimeNative(getVkAddress(), actualPresentTime != null ? actualPresentTime.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getActualPresentTimeQ() {
        return getActualPresentTime().getValue();
    }

    public void setActualPresentTime(long actualPresentTime) {
        getActualPresentTime().setValue(actualPresentTime);
    }

    protected static native long getActualPresentTimeNative(long address);
    protected static native void setActualPresentTimeNative(long address, long actualPresentTime);

    public VkUInt64 getEarliestPresentTime() {
        return new VkUInt64(getVkMemory(), getEarliestPresentTimeNative(getVkAddress()));
    }

    
    public void setEarliestPresentTime(VkUInt64 earliestPresentTime) {
        setEarliestPresentTimeNative(getVkAddress(), earliestPresentTime != null ? earliestPresentTime.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getEarliestPresentTimeQ() {
        return getEarliestPresentTime().getValue();
    }

    public void setEarliestPresentTime(long earliestPresentTime) {
        getEarliestPresentTime().setValue(earliestPresentTime);
    }

    protected static native long getEarliestPresentTimeNative(long address);
    protected static native void setEarliestPresentTimeNative(long address, long earliestPresentTime);

    public VkUInt64 getPresentMargin() {
        return new VkUInt64(getVkMemory(), getPresentMarginNative(getVkAddress()));
    }

    
    public void setPresentMargin(VkUInt64 presentMargin) {
        setPresentMarginNative(getVkAddress(), presentMargin != null ? presentMargin.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getPresentMarginQ() {
        return getPresentMargin().getValue();
    }

    public void setPresentMargin(long presentMargin) {
        getPresentMargin().setValue(presentMargin);
    }

    protected static native long getPresentMarginNative(long address);
    protected static native void setPresentMarginNative(long address, long presentMargin);


    public static native long sizeof();

    public static class Array extends VkPastPresentationTimingGOOGLE implements cz.mg.collections.array.ReadonlyArray<VkPastPresentationTimingGOOGLE> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPastPresentationTimingGOOGLE.sizeof()));
            this.count = count;
        }

        public Array(VkPastPresentationTimingGOOGLE o, int count){
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
        public VkPastPresentationTimingGOOGLE get(int i){
            return new VkPastPresentationTimingGOOGLE(getVkMemory(), address(i));
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
