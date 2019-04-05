package cz.mg.vulkan.vk;

public class VkImage extends VkNonDispatchableHandle {
    public VkImage() {
    }

    public VkImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImage(long handle) {
        setValue(handle);
    }

    public static class Array extends VkImage implements cz.mg.collections.array.ReadonlyArray<VkImage> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImage.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImage o){
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
        public VkImage get(int i){
            return new VkImage(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
