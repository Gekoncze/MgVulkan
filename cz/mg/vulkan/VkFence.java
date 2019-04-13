package cz.mg.vulkan;

public class VkFence extends VkNonDispatchableHandle {
    public VkFence() {
    }

    public VkFence(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFence(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

        public Array(int count, VkFence o){
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
        public VkFence get(int i){
            return new VkFence(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
