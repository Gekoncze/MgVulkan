package cz.mg.vulkan;

public class VkImageType extends VkEnum {
    public static final int VK_IMAGE_TYPE_1D = 0;
    public static final int VK_IMAGE_TYPE_2D = 1;
    public static final int VK_IMAGE_TYPE_3D = 2;

    public VkImageType() {
    }

    protected VkImageType(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageType(int value) {
        setValue(value);
    }

    public VkImageType(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_TYPE_1D) return "VK_IMAGE_TYPE_1D";
        if(getValue() == VK_IMAGE_TYPE_2D) return "VK_IMAGE_TYPE_2D";
        if(getValue() == VK_IMAGE_TYPE_3D) return "VK_IMAGE_TYPE_3D";
        return "UNKNOWN";
    }

    public static class Array extends VkImageType implements cz.mg.collections.array.ReadonlyArray<VkImageType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageType.sizeof()));
            this.count = count;
        }

        public Array(VkImageType o, int count){
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
        public VkImageType get(int i){
            return new VkImageType(getVkMemory(), address(i));
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
