package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryResultFlagBits.html">khronos documentation</a>
 **/
public class VkQueryResultFlagBits extends VkFlagBits {
    public static final int VK_QUERY_RESULT_64_BIT = 0x00000001;
    public static final int VK_QUERY_RESULT_WAIT_BIT = 0x00000002;
    public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004;
    public static final int VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008;

    public VkQueryResultFlagBits() {
    }

    public VkQueryResultFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryResultFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryResultFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_QUERY_RESULT_64_BIT) s += "VK_QUERY_RESULT_64_BIT";
        if(getValue() == VK_QUERY_RESULT_WAIT_BIT) s += "VK_QUERY_RESULT_WAIT_BIT";
        if(getValue() == VK_QUERY_RESULT_WITH_AVAILABILITY_BIT) s += "VK_QUERY_RESULT_WITH_AVAILABILITY_BIT";
        if(getValue() == VK_QUERY_RESULT_PARTIAL_BIT) s += "VK_QUERY_RESULT_PARTIAL_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkQueryResultFlagBits implements cz.mg.collections.array.ReadonlyArray<VkQueryResultFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueryResultFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueryResultFlagBits o){
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
        public VkQueryResultFlagBits get(int i){
            return new VkQueryResultFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkQueryResultFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkQueryResultFlagBits[] a) {
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
