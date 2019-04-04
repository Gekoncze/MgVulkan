package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayEventTypeEXT.html">khronos documentation</a>
 **/
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDisplayEventTypeEXT get(int i){
            return new VkDisplayEventTypeEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayEventTypeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayEventTypeEXT.Pointer> {
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

            public Array(VkDisplayEventTypeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayEventTypeEXT.Pointer get(int i){
                return new VkDisplayEventTypeEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
