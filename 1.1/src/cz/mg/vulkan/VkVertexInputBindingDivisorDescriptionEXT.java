package cz.mg.vulkan;

public class VkVertexInputBindingDivisorDescriptionEXT extends VkObject {
    public VkVertexInputBindingDivisorDescriptionEXT() {
        super(sizeof());
    }

    protected VkVertexInputBindingDivisorDescriptionEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkVertexInputBindingDivisorDescriptionEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkVertexInputBindingDivisorDescriptionEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBindingNative(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBindingNative(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindingQ() {
        return getBinding().getValue();
    }

    public void setBinding(int binding) {
        getBinding().setValue(binding);
    }

    protected static native long getBindingNative(long address);
    protected static native void setBindingNative(long address, long binding);

    public VkUInt32 getDivisor() {
        return new VkUInt32(getVkMemory(), getDivisorNative(getVkAddress()));
    }

    
    public void setDivisor(VkUInt32 divisor) {
        setDivisorNative(getVkAddress(), divisor != null ? divisor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDivisorQ() {
        return getDivisor().getValue();
    }

    public void setDivisor(int divisor) {
        getDivisor().setValue(divisor);
    }

    protected static native long getDivisorNative(long address);
    protected static native void setDivisorNative(long address, long divisor);


    public void set(VkVertexInputBindingDivisorDescriptionEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkVertexInputBindingDivisorDescriptionEXT implements cz.mg.collections.array.ReadonlyArray<VkVertexInputBindingDivisorDescriptionEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkVertexInputBindingDivisorDescriptionEXT.sizeof()));
            this.count = count;
        }

        public Array(VkVertexInputBindingDivisorDescriptionEXT o, int count){
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
        public VkVertexInputBindingDivisorDescriptionEXT get(int i){
            return new VkVertexInputBindingDivisorDescriptionEXT(getVkMemory(), address(i));
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
