package cz.mg.vulkan;

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
            super(new VkMemory(count*VkCoverageModulationModeNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCoverageModulationModeNV o){
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
        public VkCoverageModulationModeNV get(int i){
            return new VkCoverageModulationModeNV(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
