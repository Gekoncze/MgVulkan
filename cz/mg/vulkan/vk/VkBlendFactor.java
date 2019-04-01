package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBlendFactor.html">khronos documentation</a>
 **/
public class VkBlendFactor extends VkEnum {
    public static final int VK_BLEND_FACTOR_ZERO = 0;
    public static final int VK_BLEND_FACTOR_ONE = 1;
    public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;
    public static final int VK_BLEND_FACTOR_DST_COLOR = 4;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;
    public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;
    public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;
    public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;
    public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;
    public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;

    public VkBlendFactor() {
    }

    public VkBlendFactor(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBlendFactor(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBlendFactor(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_BLEND_FACTOR_ZERO) return "VK_BLEND_FACTOR_ZERO";
        if(getValue() == VK_BLEND_FACTOR_ONE) return "VK_BLEND_FACTOR_ONE";
        if(getValue() == VK_BLEND_FACTOR_SRC_COLOR) return "VK_BLEND_FACTOR_SRC_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR";
        if(getValue() == VK_BLEND_FACTOR_DST_COLOR) return "VK_BLEND_FACTOR_DST_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR";
        if(getValue() == VK_BLEND_FACTOR_SRC_ALPHA) return "VK_BLEND_FACTOR_SRC_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_DST_ALPHA) return "VK_BLEND_FACTOR_DST_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_CONSTANT_COLOR) return "VK_BLEND_FACTOR_CONSTANT_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR";
        if(getValue() == VK_BLEND_FACTOR_CONSTANT_ALPHA) return "VK_BLEND_FACTOR_CONSTANT_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_SRC_ALPHA_SATURATE) return "VK_BLEND_FACTOR_SRC_ALPHA_SATURATE";
        if(getValue() == VK_BLEND_FACTOR_SRC1_COLOR) return "VK_BLEND_FACTOR_SRC1_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR";
        if(getValue() == VK_BLEND_FACTOR_SRC1_ALPHA) return "VK_BLEND_FACTOR_SRC1_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA";
        return "UNKNOWN";
    }

    public static class Array extends VkBlendFactor implements cz.mg.collections.array.ReadonlyArray<VkBlendFactor> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBlendFactor.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBlendFactor o){
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
        public VkBlendFactor get(int i){
            return new VkBlendFactor(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBlendFactor.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkBlendFactor[] a) {
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
