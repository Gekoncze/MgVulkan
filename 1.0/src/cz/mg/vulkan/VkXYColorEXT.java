package cz.mg.vulkan;

public class VkXYColorEXT extends VkObject {
    public VkXYColorEXT() {
        super(sizeof());
    }

    protected VkXYColorEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkXYColorEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkXYColorEXT(VkPointer pointer) {
        super(pointer);
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


    public void set(VkXYColorEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkXYColorEXT implements cz.mg.collections.array.ReadonlyArray<VkXYColorEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkXYColorEXT.sizeof()));
            this.count = count;
        }

        public Array(VkXYColorEXT o, int count){
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
        public VkXYColorEXT get(int i){
            return new VkXYColorEXT(getVkMemory(), address(i));
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
