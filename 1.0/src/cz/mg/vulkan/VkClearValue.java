package cz.mg.vulkan;

public class VkClearValue extends VkObject {
    public VkClearValue() {
        super(sizeof());
    }

    protected VkClearValue(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkClearValue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkClearValue(VkPointer pointer) {
        super(pointer);
    }

    public VkClearValue(float r, float g, float b, float a) {
        super(sizeof());
        VkFloat.Array floats = new VkFloat.Array(getColor().getFloat32(), 4);
        floats.get(0).setValue(r);
        floats.get(1).setValue(g);
        floats.get(2).setValue(b);
        floats.get(3).setValue(a);
    }

    public VkClearValue(float d, int s) {
        super(sizeof());
        getDepthStencil().setDepth(d);
        getDepthStencil().setStencil(s);
    }

    public VkClearColorValue getColor() {
        return new VkClearColorValue(getVkMemory(), getColor(getVkAddress()));
    }

    
    public void setColor(VkClearColorValue color) {
        setColor(getVkAddress(), color != null ? color.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getColor(long address);
    protected static native void setColor(long address, long color);

    public VkClearDepthStencilValue getDepthStencil() {
        return new VkClearDepthStencilValue(getVkMemory(), getDepthStencil(getVkAddress()));
    }

    
    public void setDepthStencil(VkClearDepthStencilValue depthStencil) {
        setDepthStencil(getVkAddress(), depthStencil != null ? depthStencil.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDepthStencil(long address);
    protected static native void setDepthStencil(long address, long depthStencil);


    public static native long sizeof();

    public static class Array extends VkClearValue implements cz.mg.collections.array.ReadonlyArray<VkClearValue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearValue.sizeof()));
            this.count = count;
        }

        public Array(VkClearValue o, int count){
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
        public VkClearValue get(int i){
            return new VkClearValue(getVkMemory(), addressAt(i));
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
