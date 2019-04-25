package cz.mg.vulkan;

public class VkClearDepthStencilValue extends VkObject {
    public VkClearDepthStencilValue() {
        super(sizeof());
    }

    public VkClearDepthStencilValue(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkClearDepthStencilValue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFloat getDepth() {
        return new VkFloat(getVkMemory(), getDepth(getVkAddress()));
    }

    
    public void setDepth(VkFloat depth) {
        setDepth(getVkAddress(), depth != null ? depth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthQ() {
        return getDepth().getValue();
    }

    public void setDepth(float depth) {
        getDepth().setValue(depth);
    }

    protected static native long getDepth(long address);
    protected static native void setDepth(long address, long depth);

    public VkUInt32 getStencil() {
        return new VkUInt32(getVkMemory(), getStencil(getVkAddress()));
    }

    
    public void setStencil(VkUInt32 stencil) {
        setStencil(getVkAddress(), stencil != null ? stencil.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStencilQ() {
        return getStencil().getValue();
    }

    public void setStencil(int stencil) {
        getStencil().setValue(stencil);
    }

    protected static native long getStencil(long address);
    protected static native void setStencil(long address, long stencil);


    public static native long sizeof();

    public static class Array extends VkClearDepthStencilValue implements cz.mg.collections.array.ReadonlyArray<VkClearDepthStencilValue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearDepthStencilValue.sizeof()));
            this.count = count;
        }

        public Array(int count, VkClearDepthStencilValue o){
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
        public VkClearDepthStencilValue get(int i){
            return new VkClearDepthStencilValue(getVkMemory(), addressAt(i));
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

        public static class Array extends VkClearDepthStencilValue.Pointer implements cz.mg.collections.array.ReadonlyArray<VkClearDepthStencilValue.Pointer> {
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

            public Array(VkClearDepthStencilValue[] a) {
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
            public VkClearDepthStencilValue.Pointer get(int i){
                return new VkClearDepthStencilValue.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
