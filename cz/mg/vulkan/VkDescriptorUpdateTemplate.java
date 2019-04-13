package cz.mg.vulkan;

public class VkDescriptorUpdateTemplate extends VkNonDispatchableHandle {
    public VkDescriptorUpdateTemplate() {
    }

    public VkDescriptorUpdateTemplate(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorUpdateTemplate(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDescriptorUpdateTemplate implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplate> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplate.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorUpdateTemplate o){
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
        public VkDescriptorUpdateTemplate get(int i){
            return new VkDescriptorUpdateTemplate(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
