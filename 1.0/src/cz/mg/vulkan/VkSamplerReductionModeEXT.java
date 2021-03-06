package cz.mg.vulkan;

public class VkSamplerReductionModeEXT extends VkEnum {
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT = 0;
    public static final int VK_SAMPLER_REDUCTION_MODE_MIN_EXT = 1;
    public static final int VK_SAMPLER_REDUCTION_MODE_MAX_EXT = 2;

    public VkSamplerReductionModeEXT() {
    }

    protected VkSamplerReductionModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSamplerReductionModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerReductionModeEXT(int value) {
        setValue(value);
    }

    public VkSamplerReductionModeEXT(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT) return "VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT";
        if(getValue() == VK_SAMPLER_REDUCTION_MODE_MIN_EXT) return "VK_SAMPLER_REDUCTION_MODE_MIN_EXT";
        if(getValue() == VK_SAMPLER_REDUCTION_MODE_MAX_EXT) return "VK_SAMPLER_REDUCTION_MODE_MAX_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkSamplerReductionModeEXT implements cz.mg.collections.array.ReadonlyArray<VkSamplerReductionModeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerReductionModeEXT.sizeof()));
            this.count = count;
        }

        public Array(VkSamplerReductionModeEXT o, int count){
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
        public VkSamplerReductionModeEXT get(int i){
            return new VkSamplerReductionModeEXT(getVkMemory(), address(i));
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
