package cz.mg.vulkan;

public class VkConservativeRasterizationModeEXT extends VkEnum {
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = 0;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = 1;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = 2;

    public VkConservativeRasterizationModeEXT() {
    }

    public VkConservativeRasterizationModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkConservativeRasterizationModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkConservativeRasterizationModeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
        if(getValue() == VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT) return "VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkConservativeRasterizationModeEXT implements cz.mg.collections.array.ReadonlyArray<VkConservativeRasterizationModeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkConservativeRasterizationModeEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkConservativeRasterizationModeEXT o){
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
        public VkConservativeRasterizationModeEXT get(int i){
            return new VkConservativeRasterizationModeEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
