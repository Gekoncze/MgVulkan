package cz.mg.vulkan;

public class VkChromaLocation extends VkEnum {
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN_KHR = VK_CHROMA_LOCATION_COSITED_EVEN;
    public static final int VK_CHROMA_LOCATION_MIDPOINT_KHR = VK_CHROMA_LOCATION_MIDPOINT;

    public VkChromaLocation() {
    }

    public VkChromaLocation(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkChromaLocation(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkChromaLocation(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CHROMA_LOCATION_COSITED_EVEN) return "VK_CHROMA_LOCATION_COSITED_EVEN";
        if(getValue() == VK_CHROMA_LOCATION_MIDPOINT) return "VK_CHROMA_LOCATION_MIDPOINT";
        if(getValue() == VK_CHROMA_LOCATION_COSITED_EVEN_KHR) return "VK_CHROMA_LOCATION_COSITED_EVEN_KHR";
        if(getValue() == VK_CHROMA_LOCATION_MIDPOINT_KHR) return "VK_CHROMA_LOCATION_MIDPOINT_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkChromaLocation implements cz.mg.collections.array.ReadonlyArray<VkChromaLocation> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkChromaLocation.sizeof()));
            this.count = count;
        }

        public Array(int count, VkChromaLocation o){
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
        public VkChromaLocation get(int i){
            return new VkChromaLocation(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
