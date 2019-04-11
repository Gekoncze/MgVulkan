package cz.mg.vulkan;

public class VkPastPresentationTimingGOOGLE extends VkObject {
    public VkPastPresentationTimingGOOGLE() {
        super(sizeof());
    }

    public VkPastPresentationTimingGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPastPresentationTimingGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPastPresentationTimingGOOGLE(VkUInt32 presentID, VkUInt64 desiredPresentTime, VkUInt64 actualPresentTime, VkUInt64 earliestPresentTime, VkUInt64 presentMargin) {
        super(sizeof());
        setPresentID(presentID);
        setDesiredPresentTime(desiredPresentTime);
        setActualPresentTime(actualPresentTime);
        setEarliestPresentTime(earliestPresentTime);
        setPresentMargin(presentMargin);
    }

    public VkUInt32 getPresentID() {
        return new VkUInt32(getVkMemory(), getPresentID(getVkAddress()));
    }

    
    public void setPresentID(VkUInt32 presentID) {
        setPresentID(getVkAddress(), presentID != null ? presentID.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getPresentID(long address);
    private static native void setPresentID(long address, long presentID);

    public VkUInt64 getDesiredPresentTime() {
        return new VkUInt64(getVkMemory(), getDesiredPresentTime(getVkAddress()));
    }

    
    public void setDesiredPresentTime(VkUInt64 desiredPresentTime) {
        setDesiredPresentTime(getVkAddress(), desiredPresentTime != null ? desiredPresentTime.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDesiredPresentTime(long address);
    private static native void setDesiredPresentTime(long address, long desiredPresentTime);

    public VkUInt64 getActualPresentTime() {
        return new VkUInt64(getVkMemory(), getActualPresentTime(getVkAddress()));
    }

    
    public void setActualPresentTime(VkUInt64 actualPresentTime) {
        setActualPresentTime(getVkAddress(), actualPresentTime != null ? actualPresentTime.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getActualPresentTime(long address);
    private static native void setActualPresentTime(long address, long actualPresentTime);

    public VkUInt64 getEarliestPresentTime() {
        return new VkUInt64(getVkMemory(), getEarliestPresentTime(getVkAddress()));
    }

    
    public void setEarliestPresentTime(VkUInt64 earliestPresentTime) {
        setEarliestPresentTime(getVkAddress(), earliestPresentTime != null ? earliestPresentTime.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getEarliestPresentTime(long address);
    private static native void setEarliestPresentTime(long address, long earliestPresentTime);

    public VkUInt64 getPresentMargin() {
        return new VkUInt64(getVkMemory(), getPresentMargin(getVkAddress()));
    }

    
    public void setPresentMargin(VkUInt64 presentMargin) {
        setPresentMargin(getVkAddress(), presentMargin != null ? presentMargin.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getPresentMargin(long address);
    private static native void setPresentMargin(long address, long presentMargin);


    public static native long sizeof();

    public static class Array extends VkPastPresentationTimingGOOGLE implements cz.mg.collections.array.ReadonlyArray<VkPastPresentationTimingGOOGLE> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPastPresentationTimingGOOGLE.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPastPresentationTimingGOOGLE o){
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
        public VkPastPresentationTimingGOOGLE get(int i){
            return new VkPastPresentationTimingGOOGLE(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkPastPresentationTimingGOOGLE.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPastPresentationTimingGOOGLE.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkPastPresentationTimingGOOGLE[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPastPresentationTimingGOOGLE.Pointer get(int i){
                return new VkPastPresentationTimingGOOGLE.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
