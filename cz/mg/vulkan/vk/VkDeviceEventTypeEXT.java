package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceEventTypeEXT.html">khronos documentation</a>
 **/
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDeviceEventTypeEXT get(int i){
            return new VkDeviceEventTypeEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceEventTypeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDeviceEventTypeEXT[] a) {
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
