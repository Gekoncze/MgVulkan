package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerReductionModeEXT.html">khronos documentation</a>
 **/
public class VkSamplerReductionModeEXT extends VkEnum {
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT = 0;
    public static final int VK_SAMPLER_REDUCTION_MODE_MIN_EXT = 1;
    public static final int VK_SAMPLER_REDUCTION_MODE_MAX_EXT = 2;

    public VkSamplerReductionModeEXT() {
    }

    public VkSamplerReductionModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerReductionModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerReductionModeEXT(int value) {
        setValue(value);
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
            super(new VkMemory(count*sizeof()));
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
        public VkSamplerReductionModeEXT get(int i){
            return new VkSamplerReductionModeEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkSamplerReductionModeEXT[] a) {
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
