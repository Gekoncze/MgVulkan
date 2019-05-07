package cz.mg.vulkan;

public class VkPresentRegionKHR extends VkObject {
    public VkPresentRegionKHR() {
        super(sizeof());
    }

    protected VkPresentRegionKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPresentRegionKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPresentRegionKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getRectangleCount() {
        return new VkUInt32(getVkMemory(), getRectangleCountNative(getVkAddress()));
    }

    
    public void setRectangleCount(VkUInt32 rectangleCount) {
        setRectangleCountNative(getVkAddress(), rectangleCount != null ? rectangleCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRectangleCountQ() {
        return getRectangleCount().getValue();
    }

    public void setRectangleCount(int rectangleCount) {
        getRectangleCount().setValue(rectangleCount);
    }

    protected static native long getRectangleCountNative(long address);
    protected static native void setRectangleCountNative(long address, long rectangleCount);

    public VkRectLayerKHR getPRectangles() {
        return new VkRectLayerKHR(getVkMemory(), getPRectanglesNative(getVkAddress()));
    }

    private VkObject pRectangles = null;
    public void setPRectangles(VkRectLayerKHR pRectangles) {
        setPRectanglesNative(getVkAddress(), pRectangles != null ? pRectangles.getVkAddress() : VkPointer.NULL);
        this.pRectangles = pRectangles;
    }

    public VkRectLayerKHR.Array getPRectanglesQ() {
        return new VkRectLayerKHR.Array(getPRectangles(), getRectangleCountQ());
    }

    protected static native long getPRectanglesNative(long address);
    protected static native void setPRectanglesNative(long address, long pRectangles);


    public void set(VkPresentRegionKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPresentRegionKHR implements cz.mg.collections.array.ReadonlyArray<VkPresentRegionKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentRegionKHR.sizeof()));
            this.count = count;
        }

        public Array(VkPresentRegionKHR o, int count){
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
        public VkPresentRegionKHR get(int i){
            return new VkPresentRegionKHR(getVkMemory(), address(i));
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
