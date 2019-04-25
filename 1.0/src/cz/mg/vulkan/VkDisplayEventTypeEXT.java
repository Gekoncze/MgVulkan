package cz.mg.vulkan;

public class VkDisplayEventTypeEXT extends VkEnum {
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    public VkDisplayEventTypeEXT() {
    }

    protected VkDisplayEventTypeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayEventTypeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayEventTypeEXT(int value) {
        setValue(value);
    }

    public VkDisplayEventTypeEXT(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT) return "VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkDisplayEventTypeEXT implements cz.mg.collections.array.ReadonlyArray<VkDisplayEventTypeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayEventTypeEXT.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayEventTypeEXT o, int count){
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
        public VkDisplayEventTypeEXT get(int i){
            return new VkDisplayEventTypeEXT(getVkMemory(), address(i));
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
