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
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkBlendOverlapEXT get(int i){
            return new VkBlendOverlapEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
