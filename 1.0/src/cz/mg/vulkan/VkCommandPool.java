package cz.mg.vulkan;

public class VkCommandPool extends VkNonDispatchableHandle {
    public VkCommandPool() {
    }

    public VkCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

        public Array(int count, VkCommandPool o){
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
        public VkCommandPool get(int i){
            return new VkCommandPool(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
