package cz.mg.vulkan;

public class VkConservativeRasterizationModeEXT extends VkEnum {
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = 0;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = 1;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = 2;

    public VkConservativeRasterizationModeEXT() {
    }

    protected VkConservativeRasterizationModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkConservativeRasterizationModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkConservativeRasterizationModeEXT(int value) {
        setValue(value);
    }

    public VkConservativeRasterizationModeEXT(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkConservativeRasterizationModeEXT implements cz.mg.collections.array.ReadonlyArray<VkConservativeRasterizationModeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkConservativeRasterizationModeEXT.sizeof()));
            this.count = count;
        }

        public Array(VkConservativeRasterizationModeEXT o, int count){
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
        public VkConservativeRasterizationModeEXT get(int i){
            return new VkConservativeRasterizationModeEXT(getVkMemory(), address(i));
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
