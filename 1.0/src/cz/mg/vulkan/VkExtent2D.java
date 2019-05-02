package cz.mg.vulkan;

public class VkExtent2D extends VkObject {
    public VkExtent2D() {
        super(sizeof());
    }

    protected VkExtent2D(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExtent2D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExtent2D(VkPointer pointer) {
        super(pointer);
    }

    public VkExtent2D(int width, int height) {
        super(sizeof());
        set(width, height);
    }

    public void set(int width, int height){
        getWidth().setValue(width);
        getHeight().setValue(height);
    }

    public VkUInt32 getWidth() {
        return new VkUInt32(getVkMemory(), getWidthNative(getVkAddress()));
    }

    
    public void setWidth(VkUInt32 width) {
        setWidthNative(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWidthQ() {
        return getWidth().getValue();
    }

    public void setWidth(int width) {
        getWidth().setValue(width);
    }

    protected static native long getWidthNative(long address);
    protected static native void setWidthNative(long address, long width);

    public VkUInt32 getHeight() {
        return new VkUInt32(getVkMemory(), getHeightNative(getVkAddress()));
    }

    
    public void setHeight(VkUInt32 height) {
        setHeightNative(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHeightQ() {
        return getHeight().getValue();
    }

    public void setHeight(int height) {
        getHeight().setValue(height);
    }

    protected static native long getHeightNative(long address);
    protected static native void setHeightNative(long address, long height);


    public void set(VkExtent2D o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkExtent2D implements cz.mg.collections.array.ReadonlyArray<VkExtent2D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExtent2D.sizeof()));
            this.count = count;
        }

        public Array(VkExtent2D o, int count){
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
        public VkExtent2D get(int i){
            return new VkExtent2D(getVkMemory(), address(i));
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
