package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateKHR extends VkNonDispatchableHandle {
    public VkDescriptorUpdateTemplateKHR() {
    }

    protected VkDescriptorUpdateTemplateKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorUpdateTemplateKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorUpdateTemplateKHR(VkPointer pointer) {
        super(pointer);
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

        public Array(VkDescriptorUpdateTemplateKHR o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDescriptorUpdateTemplateKHR get(int i){
            return new VkDescriptorUpdateTemplateKHR(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
