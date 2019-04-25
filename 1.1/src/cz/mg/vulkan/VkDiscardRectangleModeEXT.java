package cz.mg.vulkan;

public class VkDiscardRectangleModeEXT extends VkEnum {
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    public VkDiscardRectangleModeEXT() {
    }

    protected VkDiscardRectangleModeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDiscardRectangleModeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDiscardRectangleModeEXT(int value) {
        setValue(value);
    }

    public VkDiscardRectangleModeEXT(VkPointer pointer) {
        super(pointer);
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

        public Array(VkDiscardRectangleModeEXT o, int count){
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

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
