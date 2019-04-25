package cz.mg.vulkan;

public class VkBorderColor extends VkEnum {
    public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;
    public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;

    public VkBorderColor() {
    }

    public VkBorderColor(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBorderColor(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkBorderColor(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK) return "VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK";
        if(getValue() == VK_BORDER_COLOR_INT_TRANSPARENT_BLACK) return "VK_BORDER_COLOR_INT_TRANSPARENT_BLACK";
        if(getValue() == VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK) return "VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK";
        if(getValue() == VK_BORDER_COLOR_INT_OPAQUE_BLACK) return "VK_BORDER_COLOR_INT_OPAQUE_BLACK";
        if(getValue() == VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE) return "VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE";
        if(getValue() == VK_BORDER_COLOR_INT_OPAQUE_WHITE) return "VK_BORDER_COLOR_INT_OPAQUE_WHITE";
        return "UNKNOWN";
    }

    public static class Array extends VkBorderColor implements cz.mg.collections.array.ReadonlyArray<VkBorderColor> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBorderColor.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBorderColor o){
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
        public VkBorderColor get(int i){
            return new VkBorderColor(getVkMemory(), addressAt(i));
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
