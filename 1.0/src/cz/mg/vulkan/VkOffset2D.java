package cz.mg.vulkan;

public class VkOffset2D extends VkObject {
    public VkOffset2D() {
        super(sizeof());
    }

    public VkOffset2D(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkOffset2D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkOffset2D(int x, int y){
        super(sizeof());
        getX().setValue(x);
        getY().setValue(y);
    }

    public VkInt32 getX() {
        return new VkInt32(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkInt32 x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getXQ() {
        return getX().getValue();
    }

    public void setX(int x) {
        getX().setValue(x);
    }

    protected static native long getX(long address);
    protected static native void setX(long address, long x);

    public VkInt32 getY() {
        return new VkInt32(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkInt32 y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getYQ() {
        return getY().getValue();
    }

    public void setY(int y) {
        getY().setValue(y);
    }

    protected static native long getY(long address);
    protected static native void setY(long address, long y);


    public static native long sizeof();

    public static class Array extends VkOffset2D implements cz.mg.collections.array.ReadonlyArray<VkOffset2D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkOffset2D.sizeof()));
            this.count = count;
        }

        public Array(int count, VkOffset2D o){
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
        public VkOffset2D get(int i){
            return new VkOffset2D(getVkMemory(), addressAt(i));
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
