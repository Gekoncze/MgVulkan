package cz.mg.vulkan.vk;

public class VkInstance extends VkDispatchableHandle {
    public VkInstance() {
    }

    public VkInstance(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInstance(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkInstance(long handle) {
        setValue(handle);
    }

    public static class Array extends VkInstance implements cz.mg.collections.array.ReadonlyArray<VkInstance> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInstance.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInstance o){
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
        public VkInstance get(int i){
            return new VkInstance(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
