package cz.mg.vulkan;

public class VkQueryType extends VkEnum {
    public static final int VK_QUERY_TYPE_OCCLUSION = 0;
    public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;
    public static final int VK_QUERY_TYPE_TIMESTAMP = 2;

    public VkQueryType() {
    }

    public VkQueryType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkQueryType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_QUERY_TYPE_OCCLUSION) return "VK_QUERY_TYPE_OCCLUSION";
        if(getValue() == VK_QUERY_TYPE_PIPELINE_STATISTICS) return "VK_QUERY_TYPE_PIPELINE_STATISTICS";
        if(getValue() == VK_QUERY_TYPE_TIMESTAMP) return "VK_QUERY_TYPE_TIMESTAMP";
        return "UNKNOWN";
    }

    public static class Array extends VkQueryType implements cz.mg.collections.array.ReadonlyArray<VkQueryType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueryType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueryType o){
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
        public VkQueryType get(int i){
            return new VkQueryType(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
