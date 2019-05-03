package cz.mg.vulkan;

public class VkSwapchainKHR extends VkNonDispatchableHandle {
    public VkSwapchainKHR() {
    }

    protected VkSwapchainKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSwapchainKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSwapchainKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkSwapchainKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkSwapchainKHR implements cz.mg.collections.array.ReadonlyArray<VkSwapchainKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSwapchainKHR.sizeof()));
            this.count = count;
        }

        public Array(VkSwapchainKHR o, int count){
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



        public Array(VkSwapchainKHR... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i].getValue());
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSwapchainKHR get(int i){
            return new VkSwapchainKHR(getVkMemory(), address(i));
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
