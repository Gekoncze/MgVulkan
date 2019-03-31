package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCoverageModulationModeNV.html">khronos documentation</a>
 **/
public class VkCoverageModulationModeNV extends VkEnum {
    public static final int VK_COVERAGE_MODULATION_MODE_NONE_NV = 0;
    public static final int VK_COVERAGE_MODULATION_MODE_RGB_NV = 1;
    public static final int VK_COVERAGE_MODULATION_MODE_ALPHA_NV = 2;
    public static final int VK_COVERAGE_MODULATION_MODE_RGBA_NV = 3;

    public VkCoverageModulationModeNV() {
    }

    public VkCoverageModulationModeNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCoverageModulationModeNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCoverageModulationModeNV(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COVERAGE_MODULATION_MODE_NONE_NV) return "VK_COVERAGE_MODULATION_MODE_NONE_NV";
        if(getValue() == VK_COVERAGE_MODULATION_MODE_RGB_NV) return "VK_COVERAGE_MODULATION_MODE_RGB_NV";
        if(getValue() == VK_COVERAGE_MODULATION_MODE_ALPHA_NV) return "VK_COVERAGE_MODULATION_MODE_ALPHA_NV";
        if(getValue() == VK_COVERAGE_MODULATION_MODE_RGBA_NV) return "VK_COVERAGE_MODULATION_MODE_RGBA_NV";
        return "UNKNOWN";
    }

    public static class Array extends VkCoverageModulationModeNV implements cz.mg.collections.array.ReadonlyArray<VkCoverageModulationModeNV> {
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
        public VkCoverageModulationModeNV get(int i){
            return new VkCoverageModulationModeNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkCoverageModulationModeNV[] a) {
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
