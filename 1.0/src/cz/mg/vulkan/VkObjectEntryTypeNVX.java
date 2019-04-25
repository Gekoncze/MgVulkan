package cz.mg.vulkan;

public class VkObjectEntryTypeNVX extends VkEnum {
    public static final int VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX = 0;
    public static final int VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX = 1;
    public static final int VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX = 2;
    public static final int VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX = 3;
    public static final int VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX = 4;

    public VkObjectEntryTypeNVX() {
    }

    protected VkObjectEntryTypeNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkObjectEntryTypeNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectEntryTypeNVX(int value) {
        setValue(value);
    }

    public VkObjectEntryTypeNVX(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX) return "VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX) return "VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX) return "VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX) return "VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX";
        if(getValue() == VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX) return "VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX";
        return "UNKNOWN";
    }

    public static class Array extends VkObjectEntryTypeNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectEntryTypeNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectEntryTypeNVX.sizeof()));
            this.count = count;
        }

        public Array(VkObjectEntryTypeNVX o, int count){
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
        public VkObjectEntryTypeNVX get(int i){
            return new VkObjectEntryTypeNVX(getVkMemory(), address(i));
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
