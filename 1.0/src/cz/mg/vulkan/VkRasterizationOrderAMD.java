package cz.mg.vulkan;

public class VkRasterizationOrderAMD extends VkEnum {
    public static final int VK_RASTERIZATION_ORDER_STRICT_AMD = 0;
    public static final int VK_RASTERIZATION_ORDER_RELAXED_AMD = 1;

    public VkRasterizationOrderAMD() {
    }

    protected VkRasterizationOrderAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkRasterizationOrderAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRasterizationOrderAMD(int value) {
        setValue(value);
    }

    public VkRasterizationOrderAMD(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_RASTERIZATION_ORDER_STRICT_AMD) return "VK_RASTERIZATION_ORDER_STRICT_AMD";
        if(getValue() == VK_RASTERIZATION_ORDER_RELAXED_AMD) return "VK_RASTERIZATION_ORDER_RELAXED_AMD";
        return "UNKNOWN";
    }

    public static class Array extends VkRasterizationOrderAMD implements cz.mg.collections.array.ReadonlyArray<VkRasterizationOrderAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRasterizationOrderAMD.sizeof()));
            this.count = count;
        }

        public Array(VkRasterizationOrderAMD o, int count){
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
        public VkRasterizationOrderAMD get(int i){
            return new VkRasterizationOrderAMD(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
