package cz.mg.vulkan;

public class VkDescriptorSet extends VkNonDispatchableHandle {
    public VkDescriptorSet() {
    }

    public VkDescriptorSet(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSet(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorSet(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSet> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSet.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSet o){
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
        public VkDescriptorSet get(int i){
            return new VkDescriptorSet(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
