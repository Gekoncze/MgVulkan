package cz.mg.vulkan;

public class VkComponentMapping extends VkObject {
    public VkComponentMapping() {
        super(sizeof());
    }

    protected VkComponentMapping(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkComponentMapping(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkComponentMapping(VkPointer pointer) {
        super(pointer);
    }



    public VkComponentSwizzle getR() {
        return new VkComponentSwizzle(getVkMemory(), getRNative(getVkAddress()));
    }

    
    public void setR(VkComponentSwizzle r) {
        setRNative(getVkAddress(), r != null ? r.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRQ() {
        return getR().getValue();
    }

    public void setR(int r) {
        getR().setValue(r);
    }

    protected static native long getRNative(long address);
    protected static native void setRNative(long address, long r);

    public VkComponentSwizzle getG() {
        return new VkComponentSwizzle(getVkMemory(), getGNative(getVkAddress()));
    }

    
    public void setG(VkComponentSwizzle g) {
        setGNative(getVkAddress(), g != null ? g.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getGQ() {
        return getG().getValue();
    }

    public void setG(int g) {
        getG().setValue(g);
    }

    protected static native long getGNative(long address);
    protected static native void setGNative(long address, long g);

    public VkComponentSwizzle getB() {
        return new VkComponentSwizzle(getVkMemory(), getBNative(getVkAddress()));
    }

    
    public void setB(VkComponentSwizzle b) {
        setBNative(getVkAddress(), b != null ? b.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBQ() {
        return getB().getValue();
    }

    public void setB(int b) {
        getB().setValue(b);
    }

    protected static native long getBNative(long address);
    protected static native void setBNative(long address, long b);

    public VkComponentSwizzle getA() {
        return new VkComponentSwizzle(getVkMemory(), getANative(getVkAddress()));
    }

    
    public void setA(VkComponentSwizzle a) {
        setANative(getVkAddress(), a != null ? a.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAQ() {
        return getA().getValue();
    }

    public void setA(int a) {
        getA().setValue(a);
    }

    protected static native long getANative(long address);
    protected static native void setANative(long address, long a);


    public void set(VkComponentMapping o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkComponentMapping implements cz.mg.collections.array.ReadonlyArray<VkComponentMapping> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkComponentMapping.sizeof()));
            this.count = count;
        }

        public Array(VkComponentMapping o, int count){
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
        public VkComponentMapping get(int i){
            return new VkComponentMapping(getVkMemory(), address(i));
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
