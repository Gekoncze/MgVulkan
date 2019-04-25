package cz.mg.vulkan;

public class VkPolygonMode extends VkEnum {
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_POLYGON_MODE_FILL_RECTANGLE_NV = 1000153000;

    public VkPolygonMode() {
    }

    protected VkPolygonMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPolygonMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPolygonMode(int value) {
        setValue(value);
    }

    public VkPolygonMode(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_POLYGON_MODE_FILL) return "VK_POLYGON_MODE_FILL";
        if(getValue() == VK_POLYGON_MODE_LINE) return "VK_POLYGON_MODE_LINE";
        if(getValue() == VK_POLYGON_MODE_POINT) return "VK_POLYGON_MODE_POINT";
        if(getValue() == VK_POLYGON_MODE_FILL_RECTANGLE_NV) return "VK_POLYGON_MODE_FILL_RECTANGLE_NV";
        return "UNKNOWN";
    }

    public static class Array extends VkPolygonMode implements cz.mg.collections.array.ReadonlyArray<VkPolygonMode> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPolygonMode.sizeof()));
            this.count = count;
        }

        public Array(VkPolygonMode o, int count){
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
        public VkPolygonMode get(int i){
            return new VkPolygonMode(getVkMemory(), address(i));
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
