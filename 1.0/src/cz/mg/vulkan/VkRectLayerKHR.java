package cz.mg.vulkan;

public class VkRectLayerKHR extends VkObject {
    public VkRectLayerKHR() {
        super(sizeof());
    }

    public VkRectLayerKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRectLayerKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkOffset2D getOffset() {
        return new VkOffset2D(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkOffset2D offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getOffset(long address);
    protected static native void setOffset(long address, long offset);

    public VkExtent2D getExtent() {
        return new VkExtent2D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent2D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getExtent(long address);
    protected static native void setExtent(long address, long extent);

    public VkUInt32 getLayer() {
        return new VkUInt32(getVkMemory(), getLayer(getVkAddress()));
    }

    
    public void setLayer(VkUInt32 layer) {
        setLayer(getVkAddress(), layer != null ? layer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayerQ() {
        return getLayer().getValue();
    }

    public void setLayer(int layer) {
        getLayer().setValue(layer);
    }

    protected static native long getLayer(long address);
    protected static native void setLayer(long address, long layer);


    public static native long sizeof();

    public static class Array extends VkRectLayerKHR implements cz.mg.collections.array.ReadonlyArray<VkRectLayerKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRectLayerKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkRectLayerKHR o){
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
        public VkRectLayerKHR get(int i){
            return new VkRectLayerKHR(getVkMemory(), addressAt(i));
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
