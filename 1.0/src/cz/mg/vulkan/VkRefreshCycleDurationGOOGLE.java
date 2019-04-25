package cz.mg.vulkan;

public class VkRefreshCycleDurationGOOGLE extends VkObject {
    public VkRefreshCycleDurationGOOGLE() {
        super(sizeof());
    }

    public VkRefreshCycleDurationGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRefreshCycleDurationGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt64 getRefreshDuration() {
        return new VkUInt64(getVkMemory(), getRefreshDuration(getVkAddress()));
    }

    
    public void setRefreshDuration(VkUInt64 refreshDuration) {
        setRefreshDuration(getVkAddress(), refreshDuration != null ? refreshDuration.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getRefreshDurationQ() {
        return getRefreshDuration().getValue();
    }

    public void setRefreshDuration(long refreshDuration) {
        getRefreshDuration().setValue(refreshDuration);
    }

    protected static native long getRefreshDuration(long address);
    protected static native void setRefreshDuration(long address, long refreshDuration);


    public static native long sizeof();

    public static class Array extends VkRefreshCycleDurationGOOGLE implements cz.mg.collections.array.ReadonlyArray<VkRefreshCycleDurationGOOGLE> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRefreshCycleDurationGOOGLE.sizeof()));
            this.count = count;
        }

        public Array(int count, VkRefreshCycleDurationGOOGLE o){
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
        public VkRefreshCycleDurationGOOGLE get(int i){
            return new VkRefreshCycleDurationGOOGLE(getVkMemory(), addressAt(i));
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
