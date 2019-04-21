package cz.mg.vulkan;

public class VkChromaLocationKHR extends VkEnum {
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN_KHR = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT_KHR = 1;

    public VkChromaLocationKHR() {
    }

    public VkChromaLocationKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkChromaLocationKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkChromaLocationKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_CHROMA_LOCATION_COSITED_EVEN_KHR) return "VK_CHROMA_LOCATION_COSITED_EVEN_KHR";
        if(getValue() == VK_CHROMA_LOCATION_MIDPOINT_KHR) return "VK_CHROMA_LOCATION_MIDPOINT_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkChromaLocationKHR implements cz.mg.collections.array.ReadonlyArray<VkChromaLocationKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkChromaLocationKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkChromaLocationKHR o){
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
        public VkChromaLocationKHR get(int i){
            return new VkChromaLocationKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
