package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateKHR extends VkNonDispatchableHandle {
    public VkDescriptorUpdateTemplateKHR() {
    }

    public VkDescriptorUpdateTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorUpdateTemplateKHR(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDescriptorUpdateTemplateKHR implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorUpdateTemplateKHR o){
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
        public VkDescriptorUpdateTemplateKHR get(int i){
            return new VkDescriptorUpdateTemplateKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
