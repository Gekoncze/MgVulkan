package cz.mg.vulkan;

public class VkQueue extends VkDispatchableHandle {
    public VkQueue() {
    }

    public VkQueue(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkQueue(long handle) {
        setValue(handle);
    }

    public static class Array extends VkQueue implements cz.mg.collections.array.ReadonlyArray<VkQueue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueue.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueue o){
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
        public VkQueue get(int i){
            return new VkQueue(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
