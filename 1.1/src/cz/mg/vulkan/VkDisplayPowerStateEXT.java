package cz.mg.vulkan;

public class VkDisplayPowerStateEXT extends VkEnum {
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = 0;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = 2;

    public VkDisplayPowerStateEXT() {
    }

    public VkDisplayPowerStateEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPowerStateEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDisplayPowerStateEXT(int value) {
        setValue(value);
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

        public Array(int count, VkDisplayPowerStateEXT o){
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



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDisplayPowerStateEXT get(int i){
            return new VkDisplayPowerStateEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
