package cz.mg.vulkan;

public class VkDisplayKHR extends VkNonDispatchableHandle {
    public VkDisplayKHR() {
    }

    protected VkDisplayKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDisplayKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDisplayKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayKHR o, int count){
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
        public VkDisplayKHR get(int i){
            return new VkDisplayKHR(getVkMemory(), address(i));
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
