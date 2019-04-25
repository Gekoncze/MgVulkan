package cz.mg.vulkan;

public class VkVertexInputBindingDescription extends VkObject {
    public VkVertexInputBindingDescription() {
        super(sizeof());
    }

    protected VkVertexInputBindingDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkVertexInputBindingDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkVertexInputBindingDescription(VkPointer pointer) {
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

    public VkUInt32 getStride() {
        return new VkUInt32(getVkMemory(), getStrideNative(getVkAddress()));
    }

    
    public void setStride(VkUInt32 stride) {
        setStrideNative(getVkAddress(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStrideQ() {
        return getStride().getValue();
    }

    public void setStride(int stride) {
        getStride().setValue(stride);
    }

    protected static native long getStrideNative(long address);
    protected static native void setStrideNative(long address, long stride);

    public VkVertexInputRate getInputRate() {
        return new VkVertexInputRate(getVkMemory(), getInputRateNative(getVkAddress()));
    }

    
    public void setInputRate(VkVertexInputRate inputRate) {
        setInputRateNative(getVkAddress(), inputRate != null ? inputRate.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInputRateQ() {
        return getInputRate().getValue();
    }

    public void setInputRate(int inputRate) {
        getInputRate().setValue(inputRate);
    }

    protected static native long getInputRateNative(long address);
    protected static native void setInputRateNative(long address, long inputRate);


    public static native long sizeof();

    public static class Array extends VkVertexInputBindingDescription implements cz.mg.collections.array.ReadonlyArray<VkVertexInputBindingDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkVertexInputBindingDescription.sizeof()));
            this.count = count;
        }

        public Array(VkVertexInputBindingDescription o, int count){
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
        public VkVertexInputBindingDescription get(int i){
            return new VkVertexInputBindingDescription(getVkMemory(), address(i));
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
