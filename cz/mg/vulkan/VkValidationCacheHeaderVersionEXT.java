package cz.mg.vulkan;

public class VkValidationCacheHeaderVersionEXT extends VkEnum {
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;

    public VkValidationCacheHeaderVersionEXT() {
    }

    public VkValidationCacheHeaderVersionEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCacheHeaderVersionEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkValidationCacheHeaderVersionEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT) return "VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkValidationCacheHeaderVersionEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationCacheHeaderVersionEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkValidationCacheHeaderVersionEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkValidationCacheHeaderVersionEXT o){
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
        public VkValidationCacheHeaderVersionEXT get(int i){
            return new VkValidationCacheHeaderVersionEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
