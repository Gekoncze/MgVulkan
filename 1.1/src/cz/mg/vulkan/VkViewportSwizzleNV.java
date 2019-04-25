package cz.mg.vulkan;

public class VkViewportSwizzleNV extends VkObject {
    public VkViewportSwizzleNV() {
        super(sizeof());
    }

    protected VkViewportSwizzleNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkViewportSwizzleNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkViewportSwizzleNV(VkPointer pointer) {
        super(pointer);
    }



    public VkViewportCoordinateSwizzleNV getX() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getXNative(getVkAddress()));
    }

    
    public void setX(VkViewportCoordinateSwizzleNV x) {
        setXNative(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getXQ() {
        return getX().getValue();
    }

    public void setX(int x) {
        getX().setValue(x);
    }

    protected static native long getXNative(long address);
    protected static native void setXNative(long address, long x);

    public VkViewportCoordinateSwizzleNV getY() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getYNative(getVkAddress()));
    }

    
    public void setY(VkViewportCoordinateSwizzleNV y) {
        setYNative(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getYQ() {
        return getY().getValue();
    }

    public void setY(int y) {
        getY().setValue(y);
    }

    protected static native long getYNative(long address);
    protected static native void setYNative(long address, long y);

    public VkViewportCoordinateSwizzleNV getZ() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getZNative(getVkAddress()));
    }

    
    public void setZ(VkViewportCoordinateSwizzleNV z) {
        setZNative(getVkAddress(), z != null ? z.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getZQ() {
        return getZ().getValue();
    }

    public void setZ(int z) {
        getZ().setValue(z);
    }

    protected static native long getZNative(long address);
    protected static native void setZNative(long address, long z);

    public VkViewportCoordinateSwizzleNV getW() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getWNative(getVkAddress()));
    }

    
    public void setW(VkViewportCoordinateSwizzleNV w) {
        setWNative(getVkAddress(), w != null ? w.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWQ() {
        return getW().getValue();
    }

    public void setW(int w) {
        getW().setValue(w);
    }

    protected static native long getWNative(long address);
    protected static native void setWNative(long address, long w);


    public static native long sizeof();

    public static class Array extends VkViewportSwizzleNV implements cz.mg.collections.array.ReadonlyArray<VkViewportSwizzleNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewportSwizzleNV.sizeof()));
            this.count = count;
        }

        public Array(VkViewportSwizzleNV o, int count){
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
        public VkViewportSwizzleNV get(int i){
            return new VkViewportSwizzleNV(getVkMemory(), address(i));
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
