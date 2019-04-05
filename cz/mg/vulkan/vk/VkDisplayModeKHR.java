package cz.mg.vulkan.vk;

public class VkDisplayModeKHR extends VkNonDispatchableHandle {
    public VkDisplayModeKHR() {
    }

    public VkDisplayModeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayModeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayModeKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDisplayModeKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModeKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayModeKHR o){
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
        public VkDisplayModeKHR get(int i){
            return new VkDisplayModeKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
