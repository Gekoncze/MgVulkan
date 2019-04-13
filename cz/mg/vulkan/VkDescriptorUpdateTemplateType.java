package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateType extends VkEnum {
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR = VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET;

    public VkDescriptorUpdateTemplateType() {
    }

    public VkDescriptorUpdateTemplateType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplateType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorUpdateTemplateType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET) return "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET";
        if(getValue() == VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR) return "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR";
        if(getValue() == VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR) return "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkDescriptorUpdateTemplateType implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateType> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorUpdateTemplateType o){
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
        public VkDescriptorUpdateTemplateType get(int i){
            return new VkDescriptorUpdateTemplateType(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
