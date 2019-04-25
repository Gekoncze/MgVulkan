package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateTypeKHR extends VkEnum {
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR = 0;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;

    public VkDescriptorUpdateTemplateTypeKHR() {
    }

    protected VkDescriptorUpdateTemplateTypeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorUpdateTemplateTypeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorUpdateTemplateTypeKHR(int value) {
        setValue(value);
    }

    public VkDescriptorUpdateTemplateTypeKHR(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR) return "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR";
        if(getValue() == VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR) return "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkDescriptorUpdateTemplateTypeKHR implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateTypeKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateTypeKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDescriptorUpdateTemplateTypeKHR o, int count){
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



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDescriptorUpdateTemplateTypeKHR get(int i){
            return new VkDescriptorUpdateTemplateTypeKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
