package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPrimitiveTopology.html">khronos documentation</a>
 **/
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

    public VkPrimitiveTopology(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPrimitiveTopology(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPrimitiveTopology(int value) {
        setValue(value);
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

        public Array(int count, VkPrimitiveTopology o){
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
        public VkPrimitiveTopology get(int i){
            return new VkPrimitiveTopology(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPrimitiveTopology.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkPrimitiveTopology[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
