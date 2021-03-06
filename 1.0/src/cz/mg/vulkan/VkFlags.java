package cz.mg.vulkan;

public class VkFlags extends VkUInt32 {
    public VkFlags() {
    }

    protected VkFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkFlags implements cz.mg.collections.array.ReadonlyArray<VkFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFlags.sizeof()));
            this.count = count;
        }

        public Array(VkFlags o, int count){
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
        public VkFlags get(int i){
            return new VkFlags(getVkMemory(), address(i));
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
