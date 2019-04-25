package cz.mg.vulkan;

public class VkDeviceMemory extends VkNonDispatchableHandle {
    public VkDeviceMemory() {
    }

    protected VkDeviceMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceMemory(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceMemory(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDeviceMemory implements cz.mg.collections.array.ReadonlyArray<VkDeviceMemory> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceMemory.sizeof()));
            this.count = count;
        }

        public Array(VkDeviceMemory o, int count){
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
        public VkDeviceMemory get(int i){
            return new VkDeviceMemory(getVkMemory(), addressAt(i));
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
