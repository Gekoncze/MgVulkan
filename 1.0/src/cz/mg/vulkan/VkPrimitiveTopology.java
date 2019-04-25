package cz.mg.vulkan;

public class VkPrimitiveTopology extends VkEnum {
    public static final int VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6;
    public static final int VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8;
    public static final int VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9;
    public static final int VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10;

    public VkPrimitiveTopology() {
    }

    protected VkPrimitiveTopology(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPrimitiveTopology(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPrimitiveTopology(int value) {
        setValue(value);
    }

    public VkPrimitiveTopology(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_POINT_LIST) return "VK_PRIMITIVE_TOPOLOGY_POINT_LIST";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_LIST) return "VK_PRIMITIVE_TOPOLOGY_LINE_LIST";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_STRIP) return "VK_PRIMITIVE_TOPOLOGY_LINE_STRIP";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY) return "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY";
        if(getValue() == VK_PRIMITIVE_TOPOLOGY_PATCH_LIST) return "VK_PRIMITIVE_TOPOLOGY_PATCH_LIST";
        return "UNKNOWN";
    }

    public static class Array extends VkPrimitiveTopology implements cz.mg.collections.array.ReadonlyArray<VkPrimitiveTopology> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPrimitiveTopology.sizeof()));
            this.count = count;
        }

        public Array(VkPrimitiveTopology o, int count){
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
        public VkPrimitiveTopology get(int i){
            return new VkPrimitiveTopology(getVkMemory(), address(i));
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
