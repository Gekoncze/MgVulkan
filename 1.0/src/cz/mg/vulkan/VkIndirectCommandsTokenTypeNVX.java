package cz.mg.vulkan;

public class VkIndirectCommandsTokenTypeNVX extends VkEnum {
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX = 0;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX = 3;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX = 4;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX = 5;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX = 6;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX = 7;

    public VkIndirectCommandsTokenTypeNVX() {
    }

    public VkIndirectCommandsTokenTypeNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsTokenTypeNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkIndirectCommandsTokenTypeNVX(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX";
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX";
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX";
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX";
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX";
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX";
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX";
        if(getValue() == VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX) return "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX";
        return "UNKNOWN";
    }

    public static class Array extends VkIndirectCommandsTokenTypeNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsTokenTypeNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsTokenTypeNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndirectCommandsTokenTypeNVX o){
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
        public VkIndirectCommandsTokenTypeNVX get(int i){
            return new VkIndirectCommandsTokenTypeNVX(getVkMemory(), addressAt(i));
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
