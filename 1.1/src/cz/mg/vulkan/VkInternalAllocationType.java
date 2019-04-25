package cz.mg.vulkan;

public class VkInternalAllocationType extends VkEnum {
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

    public VkInternalAllocationType() {
    }

    protected VkInternalAllocationType(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkInternalAllocationType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInternalAllocationType(int value) {
        setValue(value);
    }

    public VkInternalAllocationType(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE) return "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE";
        return "UNKNOWN";
    }

    public static class Array extends VkInternalAllocationType implements cz.mg.collections.array.ReadonlyArray<VkInternalAllocationType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInternalAllocationType.sizeof()));
            this.count = count;
        }

        public Array(VkInternalAllocationType o, int count){
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



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkInternalAllocationType get(int i){
            return new VkInternalAllocationType(getVkMemory(), addressAt(i));
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
