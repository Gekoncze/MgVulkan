package cz.mg.vulkan;

public class VkSamplerYcbcrRange extends VkEnum {
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR = VK_SAMPLER_YCBCR_RANGE_ITU_FULL;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = VK_SAMPLER_YCBCR_RANGE_ITU_NARROW;

    public VkSamplerYcbcrRange() {
    }

    public VkSamplerYcbcrRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSamplerYcbcrRange(int value) {
        setValue(value);
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

        public Array(int count, VkSamplerYcbcrRange o){
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
    }
}
