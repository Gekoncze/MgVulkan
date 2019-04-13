package cz.mg.vulkan;

public class VkDisplayModeParametersKHR extends VkObject {
    public VkDisplayModeParametersKHR() {
        super(sizeof());
    }

    public VkDisplayModeParametersKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayModeParametersKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayModeParametersKHR(VkExtent2D visibleRegion, VkUInt32 refreshRate) {
        super(sizeof());
        setVisibleRegion(visibleRegion);
        setRefreshRate(refreshRate);
    }

    public VkExtent2D getVisibleRegion() {
        return new VkExtent2D(getVkMemory(), getVisibleRegion(getVkAddress()));
    }

    
    public void setVisibleRegion(VkExtent2D visibleRegion) {
        setVisibleRegion(getVkAddress(), visibleRegion != null ? visibleRegion.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getVisibleRegion(long address);
    private static native void setVisibleRegion(long address, long visibleRegion);

    public VkUInt32 getRefreshRate() {
        return new VkUInt32(getVkMemory(), getRefreshRate(getVkAddress()));
    }

    
    public void setRefreshRate(VkUInt32 refreshRate) {
        setRefreshRate(getVkAddress(), refreshRate != null ? refreshRate.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getRefreshRate(long address);
    private static native void setRefreshRate(long address, long refreshRate);


    public static native long sizeof();

    public static class Array extends VkDisplayModeParametersKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeParametersKHR> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModeParametersKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayModeParametersKHR o){
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
        public VkDisplayModeParametersKHR get(int i){
            return new VkDisplayModeParametersKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayModeParametersKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeParametersKHR.Pointer> {
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

            public Array(VkDisplayModeParametersKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayModeParametersKHR.Pointer get(int i){
                return new VkDisplayModeParametersKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
