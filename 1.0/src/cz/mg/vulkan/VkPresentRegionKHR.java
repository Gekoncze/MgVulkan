package cz.mg.vulkan;

public class VkPresentRegionKHR extends VkObject {
    public VkPresentRegionKHR() {
        super(sizeof());
    }

    public VkPresentRegionKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPresentRegionKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getRectangleCount() {
        return new VkUInt32(getVkMemory(), getRectangleCount(getVkAddress()));
    }

    
    public void setRectangleCount(VkUInt32 rectangleCount) {
        setRectangleCount(getVkAddress(), rectangleCount != null ? rectangleCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRectangleCountQ() {
        return getRectangleCount().getValue();
    }

    public void setRectangleCount(int rectangleCount) {
        getRectangleCount().setValue(rectangleCount);
    }

    protected static native long getRectangleCount(long address);
    protected static native void setRectangleCount(long address, long rectangleCount);

    public VkRectLayerKHR getPRectangles() {
        return new VkRectLayerKHR(getVkMemory(), getPRectangles(getVkAddress()));
    }

    private VkObject pRectangles = null;
    public void setPRectangles(VkRectLayerKHR pRectangles) {
        setPRectangles(getVkAddress(), pRectangles != null ? pRectangles.getVkAddress() : VkPointer.NULL);
        this.pRectangles = pRectangles;
    }

    protected static native long getPRectangles(long address);
    protected static native void setPRectangles(long address, long pRectangles);


    public static native long sizeof();

    public static class Array extends VkPresentRegionKHR implements cz.mg.collections.array.ReadonlyArray<VkPresentRegionKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentRegionKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPresentRegionKHR o){
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
        public VkPresentRegionKHR get(int i){
            return new VkPresentRegionKHR(getVkMemory(), addressAt(i));
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
