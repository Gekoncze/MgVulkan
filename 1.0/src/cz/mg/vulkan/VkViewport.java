package cz.mg.vulkan;

public class VkViewport extends VkObject {
    public VkViewport() {
        super(sizeof());
    }

    public VkViewport(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkViewport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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
        return new VkFloat(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkFloat x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getXQ() {
        return getX().getValue();
    }

    public void setX(float x) {
        getX().setValue(x);
    }

    protected static native long getX(long address);
    protected static native void setX(long address, long x);

    public VkFloat getY() {
        return new VkFloat(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkFloat y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getYQ() {
        return getY().getValue();
    }

    public void setY(float y) {
        getY().setValue(y);
    }

    protected static native long getY(long address);
    protected static native void setY(long address, long y);

    public VkFloat getWidth() {
        return new VkFloat(getVkMemory(), getWidth(getVkAddress()));
    }

    
    public void setWidth(VkFloat width) {
        setWidth(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getWidthQ() {
        return getWidth().getValue();
    }

    public void setWidth(float width) {
        getWidth().setValue(width);
    }

    protected static native long getWidth(long address);
    protected static native void setWidth(long address, long width);

    public VkFloat getHeight() {
        return new VkFloat(getVkMemory(), getHeight(getVkAddress()));
    }

    
    public void setHeight(VkFloat height) {
        setHeight(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getHeightQ() {
        return getHeight().getValue();
    }

    public void setHeight(float height) {
        getHeight().setValue(height);
    }

    protected static native long getHeight(long address);
    protected static native void setHeight(long address, long height);

    public VkFloat getMinDepth() {
        return new VkFloat(getVkMemory(), getMinDepth(getVkAddress()));
    }

    
    public void setMinDepth(VkFloat minDepth) {
        setMinDepth(getVkAddress(), minDepth != null ? minDepth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinDepthQ() {
        return getMinDepth().getValue();
    }

    public void setMinDepth(float minDepth) {
        getMinDepth().setValue(minDepth);
    }

    protected static native long getMinDepth(long address);
    protected static native void setMinDepth(long address, long minDepth);

    public VkFloat getMaxDepth() {
        return new VkFloat(getVkMemory(), getMaxDepth(getVkAddress()));
    }

    
    public void setMaxDepth(VkFloat maxDepth) {
        setMaxDepth(getVkAddress(), maxDepth != null ? maxDepth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxDepthQ() {
        return getMaxDepth().getValue();
    }

    public void setMaxDepth(float maxDepth) {
        getMaxDepth().setValue(maxDepth);
    }

    protected static native long getMaxDepth(long address);
    protected static native void setMaxDepth(long address, long maxDepth);


    public static native long sizeof();

    public static class Array extends VkViewport implements cz.mg.collections.array.ReadonlyArray<VkViewport> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewport.sizeof()));
            this.count = count;
        }

        public Array(int count, VkViewport o){
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
        public VkViewport get(int i){
            return new VkViewport(getVkMemory(), addressAt(i));
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
