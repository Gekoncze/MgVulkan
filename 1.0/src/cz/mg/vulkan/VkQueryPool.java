package cz.mg.vulkan;

public class VkQueryPool extends VkNonDispatchableHandle {
    public VkQueryPool() {
    }

    public VkQueryPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkQueryPool(long handle) {
        setValue(handle);
    }

    public static class Array extends VkQueryPool implements cz.mg.collections.array.ReadonlyArray<VkQueryPool> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueryPool.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueryPool o){
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
        public VkQueryPool get(int i){
            return new VkQueryPool(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
