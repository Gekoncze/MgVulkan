package cz.mg.vulkan;

public class VkFramebuffer extends VkNonDispatchableHandle {
    public VkFramebuffer() {
    }

    public VkFramebuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFramebuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFramebuffer(long handle) {
        setValue(handle);
    }

    public static class Array extends VkFramebuffer implements cz.mg.collections.array.ReadonlyArray<VkFramebuffer> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFramebuffer.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFramebuffer o){
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
        public VkFramebuffer get(int i){
            return new VkFramebuffer(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
