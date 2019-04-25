package cz.mg.vulkan;

public class VkLogicOp extends VkEnum {
    public static final int VK_LOGIC_OP_CLEAR = 0;
    public static final int VK_LOGIC_OP_AND = 1;
    public static final int VK_LOGIC_OP_AND_REVERSE = 2;
    public static final int VK_LOGIC_OP_COPY = 3;
    public static final int VK_LOGIC_OP_AND_INVERTED = 4;
    public static final int VK_LOGIC_OP_NO_OP = 5;
    public static final int VK_LOGIC_OP_XOR = 6;
    public static final int VK_LOGIC_OP_OR = 7;
    public static final int VK_LOGIC_OP_NOR = 8;
    public static final int VK_LOGIC_OP_EQUIVALENT = 9;
    public static final int VK_LOGIC_OP_INVERT = 10;
    public static final int VK_LOGIC_OP_OR_REVERSE = 11;
    public static final int VK_LOGIC_OP_COPY_INVERTED = 12;
    public static final int VK_LOGIC_OP_OR_INVERTED = 13;
    public static final int VK_LOGIC_OP_NAND = 14;
    public static final int VK_LOGIC_OP_SET = 15;

    public VkLogicOp() {
    }

    protected VkLogicOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkLogicOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkLogicOp(int value) {
        setValue(value);
    }

    public VkLogicOp(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_LOGIC_OP_CLEAR) return "VK_LOGIC_OP_CLEAR";
        if(getValue() == VK_LOGIC_OP_AND) return "VK_LOGIC_OP_AND";
        if(getValue() == VK_LOGIC_OP_AND_REVERSE) return "VK_LOGIC_OP_AND_REVERSE";
        if(getValue() == VK_LOGIC_OP_COPY) return "VK_LOGIC_OP_COPY";
        if(getValue() == VK_LOGIC_OP_AND_INVERTED) return "VK_LOGIC_OP_AND_INVERTED";
        if(getValue() == VK_LOGIC_OP_NO_OP) return "VK_LOGIC_OP_NO_OP";
        if(getValue() == VK_LOGIC_OP_XOR) return "VK_LOGIC_OP_XOR";
        if(getValue() == VK_LOGIC_OP_OR) return "VK_LOGIC_OP_OR";
        if(getValue() == VK_LOGIC_OP_NOR) return "VK_LOGIC_OP_NOR";
        if(getValue() == VK_LOGIC_OP_EQUIVALENT) return "VK_LOGIC_OP_EQUIVALENT";
        if(getValue() == VK_LOGIC_OP_INVERT) return "VK_LOGIC_OP_INVERT";
        if(getValue() == VK_LOGIC_OP_OR_REVERSE) return "VK_LOGIC_OP_OR_REVERSE";
        if(getValue() == VK_LOGIC_OP_COPY_INVERTED) return "VK_LOGIC_OP_COPY_INVERTED";
        if(getValue() == VK_LOGIC_OP_OR_INVERTED) return "VK_LOGIC_OP_OR_INVERTED";
        if(getValue() == VK_LOGIC_OP_NAND) return "VK_LOGIC_OP_NAND";
        if(getValue() == VK_LOGIC_OP_SET) return "VK_LOGIC_OP_SET";
        return "UNKNOWN";
    }

    public static class Array extends VkLogicOp implements cz.mg.collections.array.ReadonlyArray<VkLogicOp> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkLogicOp.sizeof()));
            this.count = count;
        }

        public Array(VkLogicOp o, int count){
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
        public VkLogicOp get(int i){
            return new VkLogicOp(getVkMemory(), address(i));
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
