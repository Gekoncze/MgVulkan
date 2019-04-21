package cz.mg.vulkan;

public class VkSamplerYcbcrRangeKHR extends VkEnum {
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = 1;

    public VkSamplerYcbcrRangeKHR() {
    }

    public VkSamplerYcbcrRangeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrRangeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSamplerYcbcrRangeKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR) return "VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR) return "VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkSamplerYcbcrRangeKHR implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrRangeKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrRangeKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSamplerYcbcrRangeKHR o){
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
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSamplerYcbcrRangeKHR get(int i){
            return new VkSamplerYcbcrRangeKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
