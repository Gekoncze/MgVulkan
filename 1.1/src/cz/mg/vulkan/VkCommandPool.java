package cz.mg.vulkan;

public class VkCommandPool extends VkNonDispatchableHandle {
    public VkCommandPool() {
    }

    protected VkCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandPool(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandPool(long handle) {
        setValue(handle);
    }

    public static class Array extends VkCommandPool implements cz.mg.collections.array.ReadonlyArray<VkCommandPool> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandPool.sizeof()));
            this.count = count;
        }

        public Array(VkCommandPool o, int count){
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
        public VkCommandPool get(int i){
            return new VkCommandPool(getVkMemory(), addressAt(i));
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
