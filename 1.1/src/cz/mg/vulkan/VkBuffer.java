package cz.mg.vulkan;

public class VkBuffer extends VkNonDispatchableHandle {
    public VkBuffer() {
    }

    protected VkBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBuffer(VkPointer pointer) {
        super(pointer);
    }



    public VkBuffer(long handle) {
        setValue(handle);
    }

    public static class Array extends VkBuffer implements cz.mg.collections.array.ReadonlyArray<VkBuffer> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBuffer.sizeof()));
            this.count = count;
        }

        public Array(VkBuffer o, int count){
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
        public VkBuffer get(int i){
            return new VkBuffer(getVkMemory(), address(i));
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
