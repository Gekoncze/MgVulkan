package cz.mg.vulkan;

public class VkEnum extends VkInt32 {
    public VkEnum() {
    }

    protected VkEnum(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkEnum(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkEnum(VkPointer pointer) {
        super(pointer);
    }



    public VkEnum(int value) {
        setValue(value);
    }

    public static class Array extends VkEnum implements cz.mg.collections.array.ReadonlyArray<VkEnum> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkEnum.sizeof()));
            this.count = count;
        }

        public Array(VkEnum o, int count){
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





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkEnum get(int i){
            return new VkEnum(getVkMemory(), addressAt(i));
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
