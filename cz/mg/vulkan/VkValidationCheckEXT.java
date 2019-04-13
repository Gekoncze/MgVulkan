package cz.mg.vulkan;

public class VkValidationCheckEXT extends VkEnum {
    public static final int VK_VALIDATION_CHECK_ALL_EXT = 0;
    public static final int VK_VALIDATION_CHECK_SHADERS_EXT = 1;

    public VkValidationCheckEXT() {
    }

    public VkValidationCheckEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCheckEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkValidationCheckEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VALIDATION_CHECK_ALL_EXT) return "VK_VALIDATION_CHECK_ALL_EXT";
        if(getValue() == VK_VALIDATION_CHECK_SHADERS_EXT) return "VK_VALIDATION_CHECK_SHADERS_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkValidationCheckEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationCheckEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkValidationCheckEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkValidationCheckEXT o){
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
        public VkValidationCheckEXT get(int i){
            return new VkValidationCheckEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
