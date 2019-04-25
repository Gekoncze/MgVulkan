package cz.mg.vulkan;

public class VkIndexType extends VkEnum {
    public static final int VK_INDEX_TYPE_UINT16 = 0;
    public static final int VK_INDEX_TYPE_UINT32 = 1;

    public VkIndexType() {
    }

    public VkIndexType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndexType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkIndexType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_INDEX_TYPE_UINT16) return "VK_INDEX_TYPE_UINT16";
        if(getValue() == VK_INDEX_TYPE_UINT32) return "VK_INDEX_TYPE_UINT32";
        return "UNKNOWN";
    }

    public static class Array extends VkIndexType implements cz.mg.collections.array.ReadonlyArray<VkIndexType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndexType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndexType o){
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
        public VkIndexType get(int i){
            return new VkIndexType(getVkMemory(), addressAt(i));
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
