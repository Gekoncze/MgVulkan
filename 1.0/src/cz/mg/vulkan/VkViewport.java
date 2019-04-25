package cz.mg.vulkan;

public class VkViewport extends VkObject {
    public VkViewport() {
        super(sizeof());
    }

    protected VkViewport(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkViewport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkViewport(VkPointer pointer) {
        super(pointer);
    }

    public VkViewport(float x, float y, float width, float height, float minDepth, float maxDepth) {
        super(sizeof());
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setMinDepth(minDepth);
        setMaxDepth(maxDepth);
    }

    public VkFloat getX() {
        return new VkFloat(getVkMemory(), getXNative(getVkAddress()));
    }

    
    public void setX(VkFloat x) {
        setXNative(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getXQ() {
        return getX().getValue();
    }

    public void setX(float x) {
        getX().setValue(x);
    }

    protected static native long getXNative(long address);
    protected static native void setXNative(long address, long x);

    public VkFloat getY() {
        return new VkFloat(getVkMemory(), getYNative(getVkAddress()));
    }

    
    public void setY(VkFloat y) {
        setYNative(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getYQ() {
        return getY().getValue();
    }

    public void setY(float y) {
        getY().setValue(y);
    }

    protected static native long getYNative(long address);
    protected static native void setYNative(long address, long y);

    public VkFloat getWidth() {
        return new VkFloat(getVkMemory(), getWidthNative(getVkAddress()));
    }

    
    public void setWidth(VkFloat width) {
        setWidthNative(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getWidthQ() {
        return getWidth().getValue();
    }

    public void setWidth(float width) {
        getWidth().setValue(width);
    }

    protected static native long getWidthNative(long address);
    protected static native void setWidthNative(long address, long width);

    public VkFloat getHeight() {
        return new VkFloat(getVkMemory(), getHeightNative(getVkAddress()));
    }

    
    public void setHeight(VkFloat height) {
        setHeightNative(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getHeightQ() {
        return getHeight().getValue();
    }

    public void setHeight(float height) {
        getHeight().setValue(height);
    }

    protected static native long getHeightNative(long address);
    protected static native void setHeightNative(long address, long height);

    public VkFloat getMinDepth() {
        return new VkFloat(getVkMemory(), getMinDepthNative(getVkAddress()));
    }

    
    public void setMinDepth(VkFloat minDepth) {
        setMinDepthNative(getVkAddress(), minDepth != null ? minDepth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinDepthQ() {
        return getMinDepth().getValue();
    }

    public void setMinDepth(float minDepth) {
        getMinDepth().setValue(minDepth);
    }

    protected static native long getMinDepthNative(long address);
    protected static native void setMinDepthNative(long address, long minDepth);

    public VkFloat getMaxDepth() {
        return new VkFloat(getVkMemory(), getMaxDepthNative(getVkAddress()));
    }

    
    public void setMaxDepth(VkFloat maxDepth) {
        setMaxDepthNative(getVkAddress(), maxDepth != null ? maxDepth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxDepthQ() {
        return getMaxDepth().getValue();
    }

    public void setMaxDepth(float maxDepth) {
        getMaxDepth().setValue(maxDepth);
    }

    protected static native long getMaxDepthNative(long address);
    protected static native void setMaxDepthNative(long address, long maxDepth);


    public static native long sizeof();

    public static class Array extends VkViewport implements cz.mg.collections.array.ReadonlyArray<VkViewport> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewport.sizeof()));
            this.count = count;
        }

        public Array(VkViewport o, int count){
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
        public VkViewport get(int i){
            return new VkViewport(getVkMemory(), address(i));
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
