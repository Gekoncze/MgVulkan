package cz.mg.vulkan;

public class VkSampler extends VkNonDispatchableHandle {
    public VkSampler() {
    }

    public VkSampler(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSampler(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSampler(long handle) {
        setValue(handle);
    }

    public static class Array extends VkSampler implements cz.mg.collections.array.ReadonlyArray<VkSampler> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSampler.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSampler o){
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
        public VkSampler get(int i){
            return new VkSampler(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
