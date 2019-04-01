package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPowerStateEXT.html">khronos documentation</a>
 **/
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDisplayPowerStateEXT get(int i){
            return new VkDisplayPowerStateEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayPowerStateEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDisplayPowerStateEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
