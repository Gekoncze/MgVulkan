package cz.mg.vulkan;

public class VkCommandBuffer extends VkDispatchableHandle {
    public VkCommandBuffer() {
    }

    public VkCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkCommandBuffer(long handle) {
        setValue(handle);
    }

    public static class Array extends VkCommandBuffer implements cz.mg.collections.array.ReadonlyArray<VkCommandBuffer> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBuffer.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandBuffer o){
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
        public VkCommandBuffer get(int i){
            return new VkCommandBuffer(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
