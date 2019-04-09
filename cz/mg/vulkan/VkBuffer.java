package cz.mg.vulkan;

public class VkBuffer extends VkNonDispatchableHandle {
    public VkBuffer() {
    }

    public VkBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBuffer(long handle) {
        setValue(handle);
    }

    public static class Array extends VkBuffer implements cz.mg.collections.array.ReadonlyArray<VkBuffer> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBuffer.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBuffer o){
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
        public VkBuffer get(int i){
            return new VkBuffer(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
