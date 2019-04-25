package cz.mg.vulkan;

public class VkCompareOp extends VkEnum {
    public static final int VK_COMPARE_OP_NEVER = 0;
    public static final int VK_COMPARE_OP_LESS = 1;
    public static final int VK_COMPARE_OP_EQUAL = 2;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;
    public static final int VK_COMPARE_OP_GREATER = 4;
    public static final int VK_COMPARE_OP_NOT_EQUAL = 5;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;
    public static final int VK_COMPARE_OP_ALWAYS = 7;

    public VkCompareOp() {
    }

    protected VkCompareOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCompareOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCompareOp(int value) {
        setValue(value);
    }

    public VkCompareOp(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COMPARE_OP_NEVER) return "VK_COMPARE_OP_NEVER";
        if(getValue() == VK_COMPARE_OP_LESS) return "VK_COMPARE_OP_LESS";
        if(getValue() == VK_COMPARE_OP_EQUAL) return "VK_COMPARE_OP_EQUAL";
        if(getValue() == VK_COMPARE_OP_LESS_OR_EQUAL) return "VK_COMPARE_OP_LESS_OR_EQUAL";
        if(getValue() == VK_COMPARE_OP_GREATER) return "VK_COMPARE_OP_GREATER";
        if(getValue() == VK_COMPARE_OP_NOT_EQUAL) return "VK_COMPARE_OP_NOT_EQUAL";
        if(getValue() == VK_COMPARE_OP_GREATER_OR_EQUAL) return "VK_COMPARE_OP_GREATER_OR_EQUAL";
        if(getValue() == VK_COMPARE_OP_ALWAYS) return "VK_COMPARE_OP_ALWAYS";
        return "UNKNOWN";
    }

    public static class Array extends VkCompareOp implements cz.mg.collections.array.ReadonlyArray<VkCompareOp> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCompareOp.sizeof()));
            this.count = count;
        }

        public Array(VkCompareOp o, int count){
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
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkCompareOp get(int i){
            return new VkCompareOp(getVkMemory(), address(i));
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
