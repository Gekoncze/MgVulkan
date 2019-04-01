package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampleCountFlagBits.html">khronos documentation</a>
 **/
public class VkSampleCountFlagBits extends VkFlagBits {
    public static final int VK_SAMPLE_COUNT_1_BIT = 0x00000001;
    public static final int VK_SAMPLE_COUNT_2_BIT = 0x00000002;
    public static final int VK_SAMPLE_COUNT_4_BIT = 0x00000004;
    public static final int VK_SAMPLE_COUNT_8_BIT = 0x00000008;
    public static final int VK_SAMPLE_COUNT_16_BIT = 0x00000010;
    public static final int VK_SAMPLE_COUNT_32_BIT = 0x00000020;
    public static final int VK_SAMPLE_COUNT_64_BIT = 0x00000040;

    public VkSampleCountFlagBits() {
    }

    public VkSampleCountFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSampleCountFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSampleCountFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SAMPLE_COUNT_1_BIT) s += "VK_SAMPLE_COUNT_1_BIT ";
        if(getValue() == VK_SAMPLE_COUNT_2_BIT) s += "VK_SAMPLE_COUNT_2_BIT ";
        if(getValue() == VK_SAMPLE_COUNT_4_BIT) s += "VK_SAMPLE_COUNT_4_BIT ";
        if(getValue() == VK_SAMPLE_COUNT_8_BIT) s += "VK_SAMPLE_COUNT_8_BIT ";
        if(getValue() == VK_SAMPLE_COUNT_16_BIT) s += "VK_SAMPLE_COUNT_16_BIT ";
        if(getValue() == VK_SAMPLE_COUNT_32_BIT) s += "VK_SAMPLE_COUNT_32_BIT ";
        if(getValue() == VK_SAMPLE_COUNT_64_BIT) s += "VK_SAMPLE_COUNT_64_BIT ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkSampleCountFlagBits implements cz.mg.collections.array.ReadonlyArray<VkSampleCountFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSampleCountFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSampleCountFlagBits o){
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
        public VkSampleCountFlagBits get(int i){
            return new VkSampleCountFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSampleCountFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkSampleCountFlagBits[] a) {
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
