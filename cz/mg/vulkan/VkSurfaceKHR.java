package cz.mg.vulkan;

public class VkSurfaceKHR extends VkNonDispatchableHandle {
    public VkSurfaceKHR() {
    }

    public VkSurfaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkSurfaceKHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceKHR> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceKHR o){
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
        public VkSurfaceKHR get(int i){
            return new VkSurfaceKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
