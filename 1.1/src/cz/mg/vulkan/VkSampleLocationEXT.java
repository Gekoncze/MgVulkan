package cz.mg.vulkan;

public class VkSampleLocationEXT extends VkObject {
    public VkSampleLocationEXT() {
        super(sizeof());
    }

    protected VkSampleLocationEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSampleLocationEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSampleLocationEXT(VkPointer pointer) {
        super(pointer);
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


    public static native long sizeof();

    public static class Array extends VkSampleLocationEXT implements cz.mg.collections.array.ReadonlyArray<VkSampleLocationEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSampleLocationEXT.sizeof()));
            this.count = count;
        }

        public Array(VkSampleLocationEXT o, int count){
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
        public VkSampleLocationEXT get(int i){
            return new VkSampleLocationEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
