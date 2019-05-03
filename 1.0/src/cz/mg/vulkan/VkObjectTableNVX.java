package cz.mg.vulkan;

public class VkObjectTableNVX extends VkNonDispatchableHandle {
    public VkObjectTableNVX() {
    }

    protected VkObjectTableNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkObjectTableNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectTableNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkObjectTableNVX(long handle) {
        setValue(handle);
    }

    public static class Array extends VkObjectTableNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTableNVX.sizeof()));
            this.count = count;
        }

        public Array(VkObjectTableNVX o, int count){
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



        public Array(VkObjectTableNVX... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i].getValue());
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkObjectTableNVX get(int i){
            return new VkObjectTableNVX(getVkMemory(), address(i));
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
