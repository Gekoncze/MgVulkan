package cz.mg.vulkan;

public class VkTessellationDomainOriginKHR extends VkEnum {
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR = 0;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR = 1;

    public VkTessellationDomainOriginKHR() {
    }

    protected VkTessellationDomainOriginKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkTessellationDomainOriginKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkTessellationDomainOriginKHR(int value) {
        setValue(value);
    }

    public VkTessellationDomainOriginKHR(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR) return "VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR";
        if(getValue() == VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR) return "VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkTessellationDomainOriginKHR implements cz.mg.collections.array.ReadonlyArray<VkTessellationDomainOriginKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkTessellationDomainOriginKHR.sizeof()));
            this.count = count;
        }

        public Array(VkTessellationDomainOriginKHR o, int count){
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
        public VkTessellationDomainOriginKHR get(int i){
            return new VkTessellationDomainOriginKHR(getVkMemory(), address(i));
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
