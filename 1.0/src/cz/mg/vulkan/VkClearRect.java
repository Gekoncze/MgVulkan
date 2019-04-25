package cz.mg.vulkan;

public class VkClearRect extends VkObject {
    public VkClearRect() {
        super(sizeof());
    }

    public VkClearRect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkClearRect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

        public Array(int count, VkClearRect o){
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
        public VkClearRect get(int i){
            return new VkClearRect(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkClearRect.Pointer implements cz.mg.collections.array.ReadonlyArray<VkClearRect.Pointer> {
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

            public Array(VkClearRect[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkClearRect.Pointer get(int i){
                return new VkClearRect.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
