package cz.mg.vulkan.vk;

public class VkSwapchainKHR extends VkNonDispatchableHandle {
    public VkSwapchainKHR() {
    }

    public VkSwapchainKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSwapchainKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSwapchainKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkSwapchainKHR implements cz.mg.collections.array.ReadonlyArray<VkSwapchainKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSwapchainKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSwapchainKHR o){
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
        public VkSwapchainKHR get(int i){
            return new VkSwapchainKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
