package cz.mg.vulkan;

public class VkBlendOverlapEXT extends VkEnum {
    public static final int VK_BLEND_OVERLAP_UNCORRELATED_EXT = 0;
    public static final int VK_BLEND_OVERLAP_DISJOINT_EXT = 1;
    public static final int VK_BLEND_OVERLAP_CONJOINT_EXT = 2;

    public VkBlendOverlapEXT() {
    }

    public VkBlendOverlapEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBlendOverlapEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkBlendOverlapEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_BLEND_OVERLAP_UNCORRELATED_EXT) return "VK_BLEND_OVERLAP_UNCORRELATED_EXT";
        if(getValue() == VK_BLEND_OVERLAP_DISJOINT_EXT) return "VK_BLEND_OVERLAP_DISJOINT_EXT";
        if(getValue() == VK_BLEND_OVERLAP_CONJOINT_EXT) return "VK_BLEND_OVERLAP_CONJOINT_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkBlendOverlapEXT implements cz.mg.collections.array.ReadonlyArray<VkBlendOverlapEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBlendOverlapEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBlendOverlapEXT o){
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
        public VkBlendOverlapEXT get(int i){
            return new VkBlendOverlapEXT(getVkMemory(), addressAt(i));
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
