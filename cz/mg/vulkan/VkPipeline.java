package cz.mg.vulkan;

public class VkPipeline extends VkNonDispatchableHandle {
    public VkPipeline() {
    }

    public VkPipeline(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipeline(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipeline(long handle) {
        setValue(handle);
    }

    public static class Array extends VkPipeline implements cz.mg.collections.array.ReadonlyArray<VkPipeline> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipeline.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipeline o){
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
        public VkPipeline get(int i){
            return new VkPipeline(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
