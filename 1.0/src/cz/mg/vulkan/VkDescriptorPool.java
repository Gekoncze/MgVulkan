package cz.mg.vulkan;

public class VkDescriptorPool extends VkNonDispatchableHandle {
    public VkDescriptorPool() {
    }

    public VkDescriptorPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorPool(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDescriptorPool implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPool> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorPool.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorPool o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDescriptorPool get(int i){
            return new VkDescriptorPool(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
