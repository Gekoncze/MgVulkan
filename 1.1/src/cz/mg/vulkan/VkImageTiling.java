package cz.mg.vulkan;

public class VkImageTiling extends VkEnum {
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;

    public VkImageTiling() {
    }

    protected VkImageTiling(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageTiling(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageTiling(int value) {
        setValue(value);
    }

    public VkImageTiling(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_TILING_OPTIMAL) return "VK_IMAGE_TILING_OPTIMAL";
        if(getValue() == VK_IMAGE_TILING_LINEAR) return "VK_IMAGE_TILING_LINEAR";
        return "UNKNOWN";
    }

    public static class Array extends VkImageTiling implements cz.mg.collections.array.ReadonlyArray<VkImageTiling> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageTiling.sizeof()));
            this.count = count;
        }

        public Array(VkImageTiling o, int count){
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
        public VkImageTiling get(int i){
            return new VkImageTiling(getVkMemory(), addressAt(i));
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
