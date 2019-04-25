package cz.mg.vulkan;

public class VkShaderInfoTypeAMD extends VkEnum {
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    public VkShaderInfoTypeAMD() {
    }

    public VkShaderInfoTypeAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderInfoTypeAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkShaderInfoTypeAMD(int value) {
        setValue(value);
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

        public Array(int count, VkShaderInfoTypeAMD o){
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
        public VkShaderInfoTypeAMD get(int i){
            return new VkShaderInfoTypeAMD(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
