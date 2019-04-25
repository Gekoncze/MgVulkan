package cz.mg.vulkan;

public class VkPresentTimeGOOGLE extends VkObject {
    public VkPresentTimeGOOGLE() {
        super(sizeof());
    }

    protected VkPresentTimeGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPresentTimeGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPresentTimeGOOGLE(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getPresentID() {
        return new VkUInt32(getVkMemory(), getPresentID(getVkAddress()));
    }

    
    public void setPresentID(VkUInt32 presentID) {
        setPresentID(getVkAddress(), presentID != null ? presentID.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPresentIDQ() {
        return getPresentID().getValue();
    }

    public void setPresentID(int presentID) {
        getPresentID().setValue(presentID);
    }

    protected static native long getPresentID(long address);
    protected static native void setPresentID(long address, long presentID);

    public VkUInt64 getDesiredPresentTime() {
        return new VkUInt64(getVkMemory(), getDesiredPresentTime(getVkAddress()));
    }

    
    public void setDesiredPresentTime(VkUInt64 desiredPresentTime) {
        setDesiredPresentTime(getVkAddress(), desiredPresentTime != null ? desiredPresentTime.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDesiredPresentTimeQ() {
        return getDesiredPresentTime().getValue();
    }

    public void setDesiredPresentTime(long desiredPresentTime) {
        getDesiredPresentTime().setValue(desiredPresentTime);
    }

    protected static native long getDesiredPresentTime(long address);
    protected static native void setDesiredPresentTime(long address, long desiredPresentTime);


    public static native long sizeof();

    public static class Array extends VkPresentTimeGOOGLE implements cz.mg.collections.array.ReadonlyArray<VkPresentTimeGOOGLE> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentTimeGOOGLE.sizeof()));
            this.count = count;
        }

        public Array(VkPresentTimeGOOGLE o, int count){
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
        public VkPresentTimeGOOGLE get(int i){
            return new VkPresentTimeGOOGLE(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
