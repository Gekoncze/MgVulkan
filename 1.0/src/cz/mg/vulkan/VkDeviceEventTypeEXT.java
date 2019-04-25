package cz.mg.vulkan;

public class VkDeviceEventTypeEXT extends VkEnum {
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;

    public VkDeviceEventTypeEXT() {
    }

    public VkDeviceEventTypeEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceEventTypeEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceEventTypeEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT) return "VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkDeviceEventTypeEXT implements cz.mg.collections.array.ReadonlyArray<VkDeviceEventTypeEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceEventTypeEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceEventTypeEXT o){
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
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDeviceEventTypeEXT get(int i){
            return new VkDeviceEventTypeEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
