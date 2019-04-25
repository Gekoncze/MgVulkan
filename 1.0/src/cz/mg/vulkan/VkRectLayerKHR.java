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

        public static class Array extends VkRectLayerKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRectLayerKHR.Pointer> {
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

            public Array(VkRectLayerKHR[] a) {
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
            public VkRectLayerKHR.Pointer get(int i){
                return new VkRectLayerKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
