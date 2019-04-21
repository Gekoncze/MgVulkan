package cz.mg.vulkan;

public class VkDisplayEventTypeEXT extends VkEnum {
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    public VkDisplayEventTypeEXT() {
    }

    public VkDisplayEventTypeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayEventTypeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDisplayEventTypeEXT(int value) {
        setValue(value);
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

        public Array(int count, VkDisplayEventTypeEXT o){
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
        public VkDisplayEventTypeEXT get(int i){
            return new VkDisplayEventTypeEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
