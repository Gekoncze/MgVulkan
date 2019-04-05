package cz.mg.vulkan.vk;

public class VkImageView extends VkNonDispatchableHandle {
    public VkImageView() {
    }

    public VkImageView(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageView(long handle) {
        setValue(handle);
    }

    public static class Array extends VkImageView implements cz.mg.collections.array.ReadonlyArray<VkImageView> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageView.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageView o){
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
        public VkImageView get(int i){
            return new VkImageView(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
