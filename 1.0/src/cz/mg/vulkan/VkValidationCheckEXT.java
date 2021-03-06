package cz.mg.vulkan;

public class VkValidationCheckEXT extends VkEnum {
    public static final int VK_VALIDATION_CHECK_ALL_EXT = 0;
    public static final int VK_VALIDATION_CHECK_SHADERS_EXT = 1;

    public VkValidationCheckEXT() {
    }

    protected VkValidationCheckEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkValidationCheckEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkValidationCheckEXT(int value) {
        setValue(value);
    }

    public VkValidationCheckEXT(VkPointer pointer) {
        super(pointer);
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

        public Array(VkValidationCheckEXT o, int count){
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
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkValidationCheckEXT get(int i){
            return new VkValidationCheckEXT(getVkMemory(), address(i));
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
