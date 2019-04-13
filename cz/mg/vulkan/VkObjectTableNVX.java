package cz.mg.vulkan;

public class VkObjectTableNVX extends VkNonDispatchableHandle {
    public VkObjectTableNVX() {
    }

    public VkObjectTableNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectTableNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkObjectTableNVX(long handle) {
        setValue(handle);
    }

    public static class Array extends VkObjectTableNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTableNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectTableNVX o){
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
        public VkObjectTableNVX get(int i){
            return new VkObjectTableNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
