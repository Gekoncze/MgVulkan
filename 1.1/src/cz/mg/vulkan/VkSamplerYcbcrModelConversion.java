package cz.mg.vulkan;

public class VkSamplerYcbcrModelConversion extends VkEnum {
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 = 2;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 = 3;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 = 4;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR = VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR = VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR = VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR = VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR = VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020;

    public VkSamplerYcbcrModelConversion() {
    }

    protected VkSamplerYcbcrModelConversion(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSamplerYcbcrModelConversion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerYcbcrModelConversion(int value) {
        setValue(value);
    }

    public VkSamplerYcbcrModelConversion(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkSamplerYcbcrModelConversion implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrModelConversion> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrModelConversion.sizeof()));
            this.count = count;
        }

        public Array(VkSamplerYcbcrModelConversion o, int count){
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
        public VkSamplerYcbcrModelConversion get(int i){
            return new VkSamplerYcbcrModelConversion(getVkMemory(), address(i));
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
