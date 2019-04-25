package cz.mg.vulkan;

public class VkClearDepthStencilValue extends VkObject {
    public VkClearDepthStencilValue() {
        super(sizeof());
    }

    protected VkClearDepthStencilValue(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkClearDepthStencilValue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkClearDepthStencilValue(VkPointer pointer) {
        super(pointer);
    }



    public VkFloat getDepth() {
        return new VkFloat(getVkMemory(), getDepthNative(getVkAddress()));
    }

    
    public void setDepth(VkFloat depth) {
        setDepthNative(getVkAddress(), depth != null ? depth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthQ() {
        return getDepth().getValue();
    }

    public void setDepth(float depth) {
        getDepth().setValue(depth);
    }

    protected static native long getDepthNative(long address);
    protected static native void setDepthNative(long address, long depth);

    public VkUInt32 getStencil() {
        return new VkUInt32(getVkMemory(), getStencilNative(getVkAddress()));
    }

    
    public void setStencil(VkUInt32 stencil) {
        setStencilNative(getVkAddress(), stencil != null ? stencil.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStencilQ() {
        return getStencil().getValue();
    }

    public void setStencil(int stencil) {
        getStencil().setValue(stencil);
    }

    protected static native long getStencilNative(long address);
    protected static native void setStencilNative(long address, long stencil);


    public static native long sizeof();

    public static class Array extends VkClearDepthStencilValue implements cz.mg.collections.array.ReadonlyArray<VkClearDepthStencilValue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearDepthStencilValue.sizeof()));
            this.count = count;
        }

        public Array(VkClearDepthStencilValue o, int count){
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
        public VkClearDepthStencilValue get(int i){
            return new VkClearDepthStencilValue(getVkMemory(), address(i));
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
