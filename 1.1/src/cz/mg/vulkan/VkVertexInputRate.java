package cz.mg.vulkan;

public class VkVertexInputRate extends VkEnum {
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

    public VkVertexInputRate() {
    }

    public VkVertexInputRate(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkVertexInputRate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkVertexInputRate(int value) {
        setValue(value);
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

        public Array(int count, VkVertexInputRate o){
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



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkVertexInputRate get(int i){
            return new VkVertexInputRate(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
