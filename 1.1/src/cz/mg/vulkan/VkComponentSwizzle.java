package cz.mg.vulkan;

public class VkComponentSwizzle extends VkEnum {
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int VK_COMPONENT_SWIZZLE_ONE = 2;
    public static final int VK_COMPONENT_SWIZZLE_R = 3;
    public static final int VK_COMPONENT_SWIZZLE_G = 4;
    public static final int VK_COMPONENT_SWIZZLE_B = 5;
    public static final int VK_COMPONENT_SWIZZLE_A = 6;

    public VkComponentSwizzle() {
    }

    protected VkComponentSwizzle(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkComponentSwizzle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkComponentSwizzle(int value) {
        setValue(value);
    }

    public VkComponentSwizzle(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COMPONENT_SWIZZLE_IDENTITY) return "VK_COMPONENT_SWIZZLE_IDENTITY";
        if(getValue() == VK_COMPONENT_SWIZZLE_ZERO) return "VK_COMPONENT_SWIZZLE_ZERO";
        if(getValue() == VK_COMPONENT_SWIZZLE_ONE) return "VK_COMPONENT_SWIZZLE_ONE";
        if(getValue() == VK_COMPONENT_SWIZZLE_R) return "VK_COMPONENT_SWIZZLE_R";
        if(getValue() == VK_COMPONENT_SWIZZLE_G) return "VK_COMPONENT_SWIZZLE_G";
        if(getValue() == VK_COMPONENT_SWIZZLE_B) return "VK_COMPONENT_SWIZZLE_B";
        if(getValue() == VK_COMPONENT_SWIZZLE_A) return "VK_COMPONENT_SWIZZLE_A";
        return "UNKNOWN";
    }

    public static class Array extends VkComponentSwizzle implements cz.mg.collections.array.ReadonlyArray<VkComponentSwizzle> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkComponentSwizzle.sizeof()));
            this.count = count;
        }

        public Array(VkComponentSwizzle o, int count){
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
        public VkComponentSwizzle get(int i){
            return new VkComponentSwizzle(getVkMemory(), address(i));
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
