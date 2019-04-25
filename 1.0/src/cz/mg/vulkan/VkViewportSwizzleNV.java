package cz.mg.vulkan;

public class VkViewportSwizzleNV extends VkObject {
    public VkViewportSwizzleNV() {
        super(sizeof());
    }

    public VkViewportSwizzleNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkViewportSwizzleNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkViewportCoordinateSwizzleNV getX() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkViewportCoordinateSwizzleNV x) {
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

    public VkViewportCoordinateSwizzleNV getY() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkViewportCoordinateSwizzleNV y) {
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

    public VkViewportCoordinateSwizzleNV getZ() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getZ(getVkAddress()));
    }

    
    public void setZ(VkViewportCoordinateSwizzleNV z) {
        setZ(getVkAddress(), z != null ? z.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getZQ() {
        return getZ().getValue();
    }

    public void setZ(int z) {
        getZ().setValue(z);
    }

    protected static native long getZ(long address);
    protected static native void setZ(long address, long z);

    public VkViewportCoordinateSwizzleNV getW() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getW(getVkAddress()));
    }

    
    public void setW(VkViewportCoordinateSwizzleNV w) {
        setW(getVkAddress(), w != null ? w.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWQ() {
        return getW().getValue();
    }

    public void setW(int w) {
        getW().setValue(w);
    }

    protected static native long getW(long address);
    protected static native void setW(long address, long w);


    public static native long sizeof();

    public static class Array extends VkViewportSwizzleNV implements cz.mg.collections.array.ReadonlyArray<VkViewportSwizzleNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewportSwizzleNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkViewportSwizzleNV o){
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
        public VkViewportSwizzleNV get(int i){
            return new VkViewportSwizzleNV(getVkMemory(), addressAt(i));
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
