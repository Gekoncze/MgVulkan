package cz.mg.vulkan;

public class VkSamplerMipmapMode extends VkEnum {
    public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;
    public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;

    public VkSamplerMipmapMode() {
    }

    public VkSamplerMipmapMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerMipmapMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSamplerMipmapMode(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SAMPLER_MIPMAP_MODE_NEAREST) return "VK_SAMPLER_MIPMAP_MODE_NEAREST";
        if(getValue() == VK_SAMPLER_MIPMAP_MODE_LINEAR) return "VK_SAMPLER_MIPMAP_MODE_LINEAR";
        return "UNKNOWN";
    }

    public static class Array extends VkSamplerMipmapMode implements cz.mg.collections.array.ReadonlyArray<VkSamplerMipmapMode> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerMipmapMode.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSamplerMipmapMode o){
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
        public VkSamplerMipmapMode get(int i){
            return new VkSamplerMipmapMode(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
