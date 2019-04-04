package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkVertexInputRate.html">khronos documentation</a>
 **/
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkVertexInputRate get(int i){
            return new VkVertexInputRate(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkVertexInputRate.Pointer implements cz.mg.collections.array.ReadonlyArray<VkVertexInputRate.Pointer> {
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

            public Array(VkVertexInputRate[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkVertexInputRate.Pointer get(int i){
                return new VkVertexInputRate.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
