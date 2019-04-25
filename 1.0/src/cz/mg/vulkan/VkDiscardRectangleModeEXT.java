package cz.mg.vulkan;

public class VkDiscardRectangleModeEXT extends VkEnum {
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    public VkDiscardRectangleModeEXT() {
    }

    public VkDiscardRectangleModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDiscardRectangleModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDiscardRectangleModeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT) return "VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT";
        if(getValue() == VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT) return "VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkDiscardRectangleModeEXT implements cz.mg.collections.array.ReadonlyArray<VkDiscardRectangleModeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDiscardRectangleModeEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDiscardRectangleModeEXT o){
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
        public VkDiscardRectangleModeEXT get(int i){
            return new VkDiscardRectangleModeEXT(getVkMemory(), addressAt(i));
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
