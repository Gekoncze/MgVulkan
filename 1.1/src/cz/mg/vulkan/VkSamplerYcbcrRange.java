package cz.mg.vulkan;

public class VkSamplerYcbcrRange extends VkEnum {
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR = VK_SAMPLER_YCBCR_RANGE_ITU_FULL;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = VK_SAMPLER_YCBCR_RANGE_ITU_NARROW;

    public VkSamplerYcbcrRange() {
    }

    protected VkSamplerYcbcrRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSamplerYcbcrRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerYcbcrRange(int value) {
        setValue(value);
    }

    public VkSamplerYcbcrRange(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_FULL) return "VK_SAMPLER_YCBCR_RANGE_ITU_FULL";
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_NARROW) return "VK_SAMPLER_YCBCR_RANGE_ITU_NARROW";
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR) return "VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR) return "VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkSamplerYcbcrRange implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrRange> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrRange.sizeof()));
            this.count = count;
        }

        public Array(VkSamplerYcbcrRange o, int count){
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
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSamplerYcbcrRange get(int i){
            return new VkSamplerYcbcrRange(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
