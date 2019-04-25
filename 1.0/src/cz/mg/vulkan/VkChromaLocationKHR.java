package cz.mg.vulkan;

public class VkChromaLocationKHR extends VkEnum {
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN_KHR = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT_KHR = 1;

    public VkChromaLocationKHR() {
    }

    protected VkChromaLocationKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkChromaLocationKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkChromaLocationKHR(int value) {
        setValue(value);
    }

    public VkChromaLocationKHR(VkPointer pointer) {
        super(pointer);
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

        public Array(VkChromaLocationKHR o, int count){
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
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkChromaLocationKHR get(int i){
            return new VkChromaLocationKHR(getVkMemory(), address(i));
        }

        protected long address(int i){
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
