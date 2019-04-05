package cz.mg.vulkan.vk;

public class VkDeviceMemory extends VkNonDispatchableHandle {
    public VkDeviceMemory() {
    }

    public VkDeviceMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceMemory(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDeviceMemory implements cz.mg.collections.array.ReadonlyArray<VkDeviceMemory> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceMemory.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceMemory o){
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
        public VkDeviceMemory get(int i){
            return new VkDeviceMemory(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
