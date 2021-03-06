package cz.mg.vulkan;

public class VkVertexInputRate extends VkEnum {
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

    public VkVertexInputRate() {
    }

    protected VkVertexInputRate(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkVertexInputRate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkVertexInputRate(int value) {
        setValue(value);
    }

    public VkVertexInputRate(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VERTEX_INPUT_RATE_VERTEX) return "VK_VERTEX_INPUT_RATE_VERTEX";
        if(getValue() == VK_VERTEX_INPUT_RATE_INSTANCE) return "VK_VERTEX_INPUT_RATE_INSTANCE";
        return "UNKNOWN";
    }

    public static class Array extends VkVertexInputRate implements cz.mg.collections.array.ReadonlyArray<VkVertexInputRate> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkVertexInputRate.sizeof()));
            this.count = count;
        }

        public Array(VkVertexInputRate o, int count){
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
        public VkVertexInputRate get(int i){
            return new VkVertexInputRate(getVkMemory(), address(i));
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
