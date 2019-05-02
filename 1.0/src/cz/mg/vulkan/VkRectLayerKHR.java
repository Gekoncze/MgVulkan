package cz.mg.vulkan;

public class VkRectLayerKHR extends VkObject {
    public VkRectLayerKHR() {
        super(sizeof());
    }

    protected VkRectLayerKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkRectLayerKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRectLayerKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkOffset2D getOffset() {
        return new VkOffset2D(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkOffset2D offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);

    public VkExtent2D getExtent() {
        return new VkExtent2D(getVkMemory(), getExtentNative(getVkAddress()));
    }

    
    public void setExtent(VkExtent2D extent) {
        setExtentNative(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getExtentNative(long address);
    protected static native void setExtentNative(long address, long extent);

    public VkUInt32 getLayer() {
        return new VkUInt32(getVkMemory(), getLayerNative(getVkAddress()));
    }

    
    public void setLayer(VkUInt32 layer) {
        setLayerNative(getVkAddress(), layer != null ? layer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayerQ() {
        return getLayer().getValue();
    }

    public void setLayer(int layer) {
        getLayer().setValue(layer);
    }

    protected static native long getLayerNative(long address);
    protected static native void setLayerNative(long address, long layer);


    public void set(VkRectLayerKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkRectLayerKHR implements cz.mg.collections.array.ReadonlyArray<VkRectLayerKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRectLayerKHR.sizeof()));
            this.count = count;
        }

        public Array(VkRectLayerKHR o, int count){
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
        public VkRectLayerKHR get(int i){
            return new VkRectLayerKHR(getVkMemory(), address(i));
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
