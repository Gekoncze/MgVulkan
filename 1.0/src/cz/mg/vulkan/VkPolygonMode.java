package cz.mg.vulkan;

public class VkPolygonMode extends VkEnum {
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_POLYGON_MODE_FILL_RECTANGLE_NV = 1000153000;

    public VkPolygonMode() {
    }

    public VkPolygonMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPolygonMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPolygonMode(int value) {
        setValue(value);
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

        public Array(int count, VkPolygonMode o){
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
        public VkPolygonMode get(int i){
            return new VkPolygonMode(getVkMemory(), addressAt(i));
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
