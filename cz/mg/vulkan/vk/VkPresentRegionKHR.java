package cz.mg.vulkan.vk;

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


    public VkPresentRegionKHR(VkUInt32 rectangleCount, VkRectLayerKHR pRectangles) {
        super(sizeof());
        setRectangleCount(rectangleCount);
        setPRectangles(pRectangles);
    }

    public VkUInt32 getRectangleCount() {
        return new VkUInt32(getVkMemory(), getRectangleCount(getVkAddress()));
    }

    
    public void setRectangleCount(VkUInt32 rectangleCount) {
        setRectangleCount(getVkAddress(), rectangleCount != null ? rectangleCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getRectangleCount(long address);
    private static native void setRectangleCount(long address, long rectangleCount);

    public VkRectLayerKHR getPRectangles() {
        return new VkRectLayerKHR(getVkMemory(), getPRectangles(getVkAddress()));
    }

    private VkObject pRectangles = null;
    public void setPRectangles(VkRectLayerKHR pRectangles) {
        setPRectangles(getVkAddress(), pRectangles != null ? pRectangles.getVkAddress() : VkPointer.NULL);
        this.pRectangles = pRectangles;
    }

    private static native long getPRectangles(long address);
    private static native void setPRectangles(long address, long pRectangles);


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
            return new VkPresentRegionKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPresentRegionKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPresentRegionKHR.Pointer> {
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

            public Array(VkPresentRegionKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPresentRegionKHR.Pointer get(int i){
                return new VkPresentRegionKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
