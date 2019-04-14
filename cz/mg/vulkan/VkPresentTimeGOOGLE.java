package cz.mg.vulkan;

public class VkPresentTimeGOOGLE extends VkObject {
    public VkPresentTimeGOOGLE() {
        super(sizeof());
    }

    public VkPresentTimeGOOGLE(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPresentTimeGOOGLE(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getPresentID() {
        return new VkUInt32(getVkMemory(), getPresentID(getVkAddress()));
    }

    
    public void setPresentID(VkUInt32 presentID) {
        setPresentID(getVkAddress(), presentID != null ? presentID.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setPresentID(int presentID) {
        getPresentID().setValue(presentID);
    }

    private static native long getPresentID(long address);
    private static native void setPresentID(long address, long presentID);

    public VkUInt64 getDesiredPresentTime() {
        return new VkUInt64(getVkMemory(), getDesiredPresentTime(getVkAddress()));
    }

    
    public void setDesiredPresentTime(VkUInt64 desiredPresentTime) {
        setDesiredPresentTime(getVkAddress(), desiredPresentTime != null ? desiredPresentTime.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setDesiredPresentTime(long desiredPresentTime) {
        getDesiredPresentTime().setValue(desiredPresentTime);
    }

    private static native long getDesiredPresentTime(long address);
    private static native void setDesiredPresentTime(long address, long desiredPresentTime);


    public static native long sizeof();

    public static class Array extends VkPresentTimeGOOGLE implements cz.mg.collections.array.ReadonlyArray<VkPresentTimeGOOGLE> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentTimeGOOGLE.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPresentTimeGOOGLE o){
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
        public VkPresentTimeGOOGLE get(int i){
            return new VkPresentTimeGOOGLE(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
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

        public static class Array extends VkPresentTimeGOOGLE.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPresentTimeGOOGLE.Pointer> {
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

            public Array(VkPresentTimeGOOGLE[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPresentTimeGOOGLE.Pointer get(int i){
                return new VkPresentTimeGOOGLE.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
