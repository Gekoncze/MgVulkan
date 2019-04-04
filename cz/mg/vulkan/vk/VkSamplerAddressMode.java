package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerAddressMode.html">khronos documentation</a>
 **/
public class VkSamplerAddressMode extends VkEnum {
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;

    public VkSamplerAddressMode() {
    }

    public VkSamplerAddressMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerAddressMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerAddressMode(int value) {
        setValue(value);
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

        public Array(int count, VkSamplerAddressMode o){
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
        public VkSamplerAddressMode get(int i){
            return new VkSamplerAddressMode(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkSamplerAddressMode.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSamplerAddressMode.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkSamplerAddressMode[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSamplerAddressMode.Pointer get(int i){
                return new VkSamplerAddressMode.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
