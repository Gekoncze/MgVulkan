package cz.mg.vulkan;

public class VkClearRect extends VkObject {
    public VkClearRect() {
        super(sizeof());
    }

    protected VkClearRect(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkClearRect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkClearRect(VkPointer pointer) {
        super(pointer);
    }



    public VkRect2D getRect() {
        return new VkRect2D(getVkMemory(), getRect(getVkAddress()));
    }

    
    public void setRect(VkRect2D rect) {
        setRect(getVkAddress(), rect != null ? rect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getRect(long address);
    protected static native void setRect(long address, long rect);

    public VkUInt32 getBaseArrayLayer() {
        return new VkUInt32(getVkMemory(), getBaseArrayLayer(getVkAddress()));
    }

    
    public void setBaseArrayLayer(VkUInt32 baseArrayLayer) {
        setBaseArrayLayer(getVkAddress(), baseArrayLayer != null ? baseArrayLayer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBaseArrayLayerQ() {
        return getBaseArrayLayer().getValue();
    }

    public void setBaseArrayLayer(int baseArrayLayer) {
        getBaseArrayLayer().setValue(baseArrayLayer);
    }

    protected static native long getBaseArrayLayer(long address);
    protected static native void setBaseArrayLayer(long address, long baseArrayLayer);

    public VkUInt32 getLayerCount() {
        return new VkUInt32(getVkMemory(), getLayerCount(getVkAddress()));
    }

    
    public void setLayerCount(VkUInt32 layerCount) {
        setLayerCount(getVkAddress(), layerCount != null ? layerCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayerCountQ() {
        return getLayerCount().getValue();
    }

    public void setLayerCount(int layerCount) {
        getLayerCount().setValue(layerCount);
    }

    protected static native long getLayerCount(long address);
    protected static native void setLayerCount(long address, long layerCount);


    public static native long sizeof();

    public static class Array extends VkClearRect implements cz.mg.collections.array.ReadonlyArray<VkClearRect> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearRect.sizeof()));
            this.count = count;
        }

        public Array(VkClearRect o, int count){
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
        public VkClearRect get(int i){
            return new VkClearRect(getVkMemory(), addressAt(i));
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
