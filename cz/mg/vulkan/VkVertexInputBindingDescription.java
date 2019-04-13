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


    public VkVertexInputBindingDescription(VkUInt32 binding, VkUInt32 stride, VkVertexInputRate inputRate) {
        super(sizeof());
        setBinding(binding);
        setStride(stride);
        setInputRate(inputRate);
    }

    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBinding(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBinding(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBinding(long address);
    private static native void setBinding(long address, long binding);

    public VkUInt32 getStride() {
        return new VkUInt32(getVkMemory(), getStride(getVkAddress()));
    }

    
    public void setStride(VkUInt32 stride) {
        setStride(getVkAddress(), stride != null ? stride.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getStride(long address);
    private static native void setStride(long address, long stride);

    public VkVertexInputRate getInputRate() {
        return new VkVertexInputRate(getVkMemory(), getInputRate(getVkAddress()));
    }

    
    public void setInputRate(VkVertexInputRate inputRate) {
        setInputRate(getVkAddress(), inputRate != null ? inputRate.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getInputRate(long address);
    private static native void setInputRate(long address, long inputRate);


    public static native long sizeof();

    public static class Array extends VkVertexInputBindingDescription implements cz.mg.collections.array.ReadonlyArray<VkVertexInputBindingDescription> {        private final int count;

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
            return new VkVertexInputBindingDescription(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkVertexInputBindingDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VkVertexInputBindingDescription.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkVertexInputBindingDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkVertexInputBindingDescription.Pointer get(int i){
                return new VkVertexInputBindingDescription.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
