package cz.mg.vulkan;

public class VkOffset3D extends VkObject {
    public VkOffset3D() {
        super(sizeof());
    }

    protected VkOffset3D(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkOffset3D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkOffset3D(VkPointer pointer) {
        super(pointer);
    }

    public VkOffset3D(int x, int y, int z){
        super(sizeof());
        getX().setValue(x);
        getY().setValue(y);
        getZ().setValue(z);
    }

    public VkInt32 getX() {
        return new VkInt32(getVkMemory(), getXNative(getVkAddress()));
    }

    
    public void setX(VkInt32 x) {
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

    public VkInt32 getY() {
        return new VkInt32(getVkMemory(), getYNative(getVkAddress()));
    }

    
    public void setY(VkInt32 y) {
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

    public VkInt32 getZ() {
        return new VkInt32(getVkMemory(), getZNative(getVkAddress()));
    }

    
    public void setZ(VkInt32 z) {
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


    public static native long sizeof();

    public static class Array extends VkOffset3D implements cz.mg.collections.array.ReadonlyArray<VkOffset3D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkOffset3D.sizeof()));
            this.count = count;
        }

        public Array(VkOffset3D o, int count){
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
        public VkOffset3D get(int i){
            return new VkOffset3D(getVkMemory(), address(i));
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
