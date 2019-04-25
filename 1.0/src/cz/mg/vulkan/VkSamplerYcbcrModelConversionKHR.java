package cz.mg.vulkan;

public class VkSamplerYcbcrModelConversionKHR extends VkEnum {
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR = 2;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR = 3;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR = 4;

    public VkSamplerYcbcrModelConversionKHR() {
    }

    protected VkSamplerYcbcrModelConversionKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSamplerYcbcrModelConversionKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerYcbcrModelConversionKHR(int value) {
        setValue(value);
    }

    public VkSamplerYcbcrModelConversionKHR(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR";
        if(getValue() == VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR) return "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkSamplerYcbcrModelConversionKHR implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrModelConversionKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrModelConversionKHR.sizeof()));
            this.count = count;
        }

        public Array(VkSamplerYcbcrModelConversionKHR o, int count){
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
        public VkSamplerYcbcrModelConversionKHR get(int i){
            return new VkSamplerYcbcrModelConversionKHR(getVkMemory(), addressAt(i));
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
