package cz.mg.vulkan.vk;

public class VkSamplerYcbcrConversion extends VkNonDispatchableHandle {
    public VkSamplerYcbcrConversion() {
    }

    public VkSamplerYcbcrConversion(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrConversion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSamplerYcbcrConversion(long handle) {
        setValue(handle);
    }

    public static class Array extends VkSamplerYcbcrConversion implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversion> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversion.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSamplerYcbcrConversion o){
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
        public VkSamplerYcbcrConversion get(int i){
            return new VkSamplerYcbcrConversion(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
