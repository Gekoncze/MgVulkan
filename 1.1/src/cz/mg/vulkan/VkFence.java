package cz.mg.vulkan;

public class VkFence extends VkNonDispatchableHandle {
    public VkFence() {
    }

    protected VkFence(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFence(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFence(VkPointer pointer) {
        super(pointer);
    }



    public VkFence(long handle) {
        setValue(handle);
    }

    public static class Array extends VkFence implements cz.mg.collections.array.ReadonlyArray<VkFence> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFence.sizeof()));
            this.count = count;
        }

        public Array(VkFence o, int count){
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



        public Array(VkFence... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i].getValue());
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkFence get(int i){
            return new VkFence(getVkMemory(), address(i));
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
