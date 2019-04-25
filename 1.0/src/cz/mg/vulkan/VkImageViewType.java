package cz.mg.vulkan;

public class VkImageViewType extends VkEnum {
    public static final int VK_IMAGE_VIEW_TYPE_1D = 0;
    public static final int VK_IMAGE_VIEW_TYPE_2D = 1;
    public static final int VK_IMAGE_VIEW_TYPE_3D = 2;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

    public VkImageViewType() {
    }

    public VkImageViewType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageViewType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageViewType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_VIEW_TYPE_1D) return "VK_IMAGE_VIEW_TYPE_1D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_2D) return "VK_IMAGE_VIEW_TYPE_2D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_3D) return "VK_IMAGE_VIEW_TYPE_3D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_CUBE) return "VK_IMAGE_VIEW_TYPE_CUBE";
        if(getValue() == VK_IMAGE_VIEW_TYPE_1D_ARRAY) return "VK_IMAGE_VIEW_TYPE_1D_ARRAY";
        if(getValue() == VK_IMAGE_VIEW_TYPE_2D_ARRAY) return "VK_IMAGE_VIEW_TYPE_2D_ARRAY";
        if(getValue() == VK_IMAGE_VIEW_TYPE_CUBE_ARRAY) return "VK_IMAGE_VIEW_TYPE_CUBE_ARRAY";
        return "UNKNOWN";
    }

    public static class Array extends VkImageViewType implements cz.mg.collections.array.ReadonlyArray<VkImageViewType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageViewType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageViewType o){
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
        public VkImageViewType get(int i){
            return new VkImageViewType(getVkMemory(), addressAt(i));
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
