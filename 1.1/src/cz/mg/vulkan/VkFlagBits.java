package cz.mg.vulkan;

public class VkFlagBits extends VkInt32 {
    public VkFlagBits() {
    }

    protected VkFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkFlagBits(int value) {
        setValue(value);
    }

    public static class Array extends VkFlagBits implements cz.mg.collections.array.ReadonlyArray<VkFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFlagBits.sizeof()));
            this.count = count;
        }

        public Array(VkFlagBits o, int count){
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
        public VkFlagBits get(int i){
            return new VkFlagBits(getVkMemory(), address(i));
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
