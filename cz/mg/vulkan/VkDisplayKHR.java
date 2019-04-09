package cz.mg.vulkan;

public class VkDisplayKHR extends VkNonDispatchableHandle {
    public VkDisplayKHR() {
    }

    public VkDisplayKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDisplayKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayKHR> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayKHR o){
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
        public VkDisplayKHR get(int i){
            return new VkDisplayKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
