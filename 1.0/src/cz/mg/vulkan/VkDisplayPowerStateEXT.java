package cz.mg.vulkan;

public class VkDisplayPowerStateEXT extends VkEnum {
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = 0;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = 2;

    public VkDisplayPowerStateEXT() {
    }

    protected VkDisplayPowerStateEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayPowerStateEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayPowerStateEXT(int value) {
        setValue(value);
    }

    public VkDisplayPowerStateEXT(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DISPLAY_POWER_STATE_OFF_EXT) return "VK_DISPLAY_POWER_STATE_OFF_EXT";
        if(getValue() == VK_DISPLAY_POWER_STATE_SUSPEND_EXT) return "VK_DISPLAY_POWER_STATE_SUSPEND_EXT";
        if(getValue() == VK_DISPLAY_POWER_STATE_ON_EXT) return "VK_DISPLAY_POWER_STATE_ON_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkDisplayPowerStateEXT implements cz.mg.collections.array.ReadonlyArray<VkDisplayPowerStateEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPowerStateEXT.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayPowerStateEXT o, int count){
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
        public VkDisplayPowerStateEXT get(int i){
            return new VkDisplayPowerStateEXT(getVkMemory(), address(i));
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
