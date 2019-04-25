package cz.mg.vulkan;

public class VkShaderInfoTypeAMD extends VkEnum {
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    public VkShaderInfoTypeAMD() {
    }

    protected VkShaderInfoTypeAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkShaderInfoTypeAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkShaderInfoTypeAMD(int value) {
        setValue(value);
    }

    public VkShaderInfoTypeAMD(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SHADER_INFO_TYPE_STATISTICS_AMD) return "VK_SHADER_INFO_TYPE_STATISTICS_AMD";
        if(getValue() == VK_SHADER_INFO_TYPE_BINARY_AMD) return "VK_SHADER_INFO_TYPE_BINARY_AMD";
        if(getValue() == VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD) return "VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD";
        return "UNKNOWN";
    }

    public static class Array extends VkShaderInfoTypeAMD implements cz.mg.collections.array.ReadonlyArray<VkShaderInfoTypeAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderInfoTypeAMD.sizeof()));
            this.count = count;
        }

        public Array(VkShaderInfoTypeAMD o, int count){
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
        public VkShaderInfoTypeAMD get(int i){
            return new VkShaderInfoTypeAMD(getVkMemory(), address(i));
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
