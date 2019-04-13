package cz.mg.vulkan;

public class VkVertexInputBindingDivisorDescriptionEXT extends VkObject {
    public VkVertexInputBindingDivisorDescriptionEXT() {
        super(sizeof());
    }

    public VkVertexInputBindingDivisorDescriptionEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkVertexInputBindingDivisorDescriptionEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkVertexInputBindingDivisorDescriptionEXT(VkUInt32 binding, VkUInt32 divisor) {
        super(sizeof());
        setBinding(binding);
        setDivisor(divisor);
    }

    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBinding(getVkAddress()));
    }

    
    public void setBinding(VkUInt32 binding) {
        setBinding(getVkAddress(), binding != null ? binding.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBinding(long address);
    private static native void setBinding(long address, long binding);

    public VkUInt32 getDivisor() {
        return new VkUInt32(getVkMemory(), getDivisor(getVkAddress()));
    }

    
    public void setDivisor(VkUInt32 divisor) {
        setDivisor(getVkAddress(), divisor != null ? divisor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDivisor(long address);
    private static native void setDivisor(long address, long divisor);


    public static native long sizeof();

    public static class Array extends VkVertexInputBindingDivisorDescriptionEXT implements cz.mg.collections.array.ReadonlyArray<VkVertexInputBindingDivisorDescriptionEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkVertexInputBindingDivisorDescriptionEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkVertexInputBindingDivisorDescriptionEXT o){
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
        public VkVertexInputBindingDivisorDescriptionEXT get(int i){
            return new VkVertexInputBindingDivisorDescriptionEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
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

        public static class Array extends VkVertexInputBindingDivisorDescriptionEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkVertexInputBindingDivisorDescriptionEXT.Pointer> {
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

            public Array(VkVertexInputBindingDivisorDescriptionEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkVertexInputBindingDivisorDescriptionEXT.Pointer get(int i){
                return new VkVertexInputBindingDivisorDescriptionEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
