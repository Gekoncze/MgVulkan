package cz.mg.vulkan;

public class VkRect2D extends VkObject {
    public VkRect2D() {
        super(sizeof());
    }

    protected VkRect2D(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkRect2D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRect2D(VkPointer pointer) {
        super(pointer);
    }

    public VkRect2D(int x, int y, int width, int height) {
        super(sizeof());
        set(x, y, width, height);
    }

    public void set(int x, int y, int width, int height){
        getOffset().getX().setValue(x);
        getOffset().getY().setValue(y);
        getExtent().getWidth().setValue(width);
        getExtent().getHeight().setValue(height);
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


    public void set(VkRect2D o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkRect2D implements cz.mg.collections.array.ReadonlyArray<VkRect2D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRect2D.sizeof()));
            this.count = count;
        }

        public Array(VkRect2D o, int count){
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
        public VkRect2D get(int i){
            return new VkRect2D(getVkMemory(), address(i));
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
