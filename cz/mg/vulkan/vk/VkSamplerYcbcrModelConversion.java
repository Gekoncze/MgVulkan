package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerYcbcrModelConversion.html">khronos documentation</a>
 **/
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

    public VkSamplerYcbcrModelConversion(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrModelConversion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerYcbcrModelConversion(int value) {
        setValue(value);
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

        public Array(int count, VkSamplerYcbcrModelConversion o){
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
        public VkSamplerYcbcrModelConversion get(int i){
            return new VkSamplerYcbcrModelConversion(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSamplerYcbcrModelConversion.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkSamplerYcbcrModelConversion[] a) {
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
