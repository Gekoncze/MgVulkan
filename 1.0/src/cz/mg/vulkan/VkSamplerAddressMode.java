package cz.mg.vulkan;

public class VkSamplerAddressMode extends VkEnum {
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;

    public VkSamplerAddressMode() {
    }

    protected VkSamplerAddressMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSamplerAddressMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerAddressMode(int value) {
        setValue(value);
    }

    public VkSamplerAddressMode(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_REPEAT) return "VK_SAMPLER_ADDRESS_MODE_REPEAT";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT) return "VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE) return "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER) return "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER";
        if(getValue() == VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE) return "VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE";
        return "UNKNOWN";
    }

    public static class Array extends VkSamplerAddressMode implements cz.mg.collections.array.ReadonlyArray<VkSamplerAddressMode> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerAddressMode.sizeof()));
            this.count = count;
        }

        public Array(VkSamplerAddressMode o, int count){
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
        public VkSamplerAddressMode get(int i){
            return new VkSamplerAddressMode(getVkMemory(), addressAt(i));
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
