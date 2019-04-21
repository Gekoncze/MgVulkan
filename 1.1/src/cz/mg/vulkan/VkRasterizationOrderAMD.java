package cz.mg.vulkan;

public class VkRasterizationOrderAMD extends VkEnum {
    public static final int VK_RASTERIZATION_ORDER_STRICT_AMD = 0;
    public static final int VK_RASTERIZATION_ORDER_RELAXED_AMD = 1;

    public VkRasterizationOrderAMD() {
    }

    public VkRasterizationOrderAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRasterizationOrderAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkRasterizationOrderAMD(int value) {
        setValue(value);
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

        public Array(int count, VkRasterizationOrderAMD o){
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
        public VkRasterizationOrderAMD get(int i){
            return new VkRasterizationOrderAMD(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
