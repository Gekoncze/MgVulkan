package cz.mg.vulkan;

public class VkDescriptorType extends VkEnum {
    public static final int VK_DESCRIPTOR_TYPE_SAMPLER = 0;
    public static final int VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1;
    public static final int VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 2;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 3;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 4;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 5;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 6;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 7;
    public static final int VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8;
    public static final int VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9;
    public static final int VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 10;

    public VkDescriptorType() {
    }

    protected VkDescriptorType(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorType(int value) {
        setValue(value);
    }

    public VkDescriptorType(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DESCRIPTOR_TYPE_SAMPLER) return "VK_DESCRIPTOR_TYPE_SAMPLER";
        if(getValue() == VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER) return "VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER";
        if(getValue() == VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE) return "VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE";
        if(getValue() == VK_DESCRIPTOR_TYPE_STORAGE_IMAGE) return "VK_DESCRIPTOR_TYPE_STORAGE_IMAGE";
        if(getValue() == VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER) return "VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER";
        if(getValue() == VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER) return "VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER";
        if(getValue() == VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER) return "VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER";
        if(getValue() == VK_DESCRIPTOR_TYPE_STORAGE_BUFFER) return "VK_DESCRIPTOR_TYPE_STORAGE_BUFFER";
        if(getValue() == VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC) return "VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC";
        if(getValue() == VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC) return "VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC";
        if(getValue() == VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT) return "VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT";
        return "UNKNOWN";
    }

    public static class Array extends VkDescriptorType implements cz.mg.collections.array.ReadonlyArray<VkDescriptorType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorType.sizeof()));
            this.count = count;
        }

        public Array(VkDescriptorType o, int count){
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
        public VkDescriptorType get(int i){
            return new VkDescriptorType(getVkMemory(), addressAt(i));
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
