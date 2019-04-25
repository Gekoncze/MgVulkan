package cz.mg.vulkan;

public class VkVertexInputBindingDescription extends VkObject {
    public VkVertexInputBindingDescription() {
        super(sizeof());
    }

    public VkVertexInputBindingDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkVertexInputBindingDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBinding(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBinding(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindingQ() {
        return getBinding().getValue();
    }

    public void setBinding(int binding) {
        getBinding().setValue(binding);
    }

    protected static native long getBinding(long address);
    protected static native void setBinding(long address, long binding);

    public VkUInt32 getStride() {
        return new VkUInt32(getVkMemory(), getStride(getVkAddress()));
    }

    
    public void setStride(VkUInt32 stride) {
        setStride(getVkAddress(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStrideQ() {
        return getStride().getValue();
    }

    public void setStride(int stride) {
        getStride().setValue(stride);
    }

    protected static native long getStride(long address);
    protected static native void setStride(long address, long stride);

    public VkVertexInputRate getInputRate() {
        return new VkVertexInputRate(getVkMemory(), getInputRate(getVkAddress()));
    }

    
    public void setInputRate(VkVertexInputRate inputRate) {
        setInputRate(getVkAddress(), inputRate != null ? inputRate.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInputRateQ() {
        return getInputRate().getValue();
    }

    public void setInputRate(int inputRate) {
        getInputRate().setValue(inputRate);
    }

    protected static native long getInputRate(long address);
    protected static native void setInputRate(long address, long inputRate);


    public static native long sizeof();

    public static class Array extends VkVertexInputBindingDescription implements cz.mg.collections.array.ReadonlyArray<VkVertexInputBindingDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkVertexInputBindingDescription.sizeof()));
            this.count = count;
        }

        public Array(int count, VkVertexInputBindingDescription o){
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
        public VkVertexInputBindingDescription get(int i){
            return new VkVertexInputBindingDescription(getVkMemory(), addressAt(i));
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
