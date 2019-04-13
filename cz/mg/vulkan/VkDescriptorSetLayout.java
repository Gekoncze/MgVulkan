package cz.mg.vulkan;

public class VkDescriptorSetLayout extends VkNonDispatchableHandle {
    public VkDescriptorSetLayout() {
    }

    public VkDescriptorSetLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorSetLayout(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDescriptorSetLayout implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayout> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayout.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSetLayout o){
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
        public VkDescriptorSetLayout get(int i){
            return new VkDescriptorSetLayout(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
