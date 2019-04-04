package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBorderColor.html">khronos documentation</a>
 **/
public class VkBorderColor extends VkEnum {
    public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;
    public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;

    public VkBorderColor() {
    }

    public VkBorderColor(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBorderColor(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBorderColor(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK) return "VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK";
        if(getValue() == VK_BORDER_COLOR_INT_TRANSPARENT_BLACK) return "VK_BORDER_COLOR_INT_TRANSPARENT_BLACK";
        if(getValue() == VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK) return "VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK";
        if(getValue() == VK_BORDER_COLOR_INT_OPAQUE_BLACK) return "VK_BORDER_COLOR_INT_OPAQUE_BLACK";
        if(getValue() == VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE) return "VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE";
        if(getValue() == VK_BORDER_COLOR_INT_OPAQUE_WHITE) return "VK_BORDER_COLOR_INT_OPAQUE_WHITE";
        return "UNKNOWN";
    }

    public static class Array extends VkBorderColor implements cz.mg.collections.array.ReadonlyArray<VkBorderColor> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBorderColor.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBorderColor o){
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
        public VkBorderColor get(int i){
            return new VkBorderColor(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBorderColor.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBorderColor.Pointer> {
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

            public Array(VkBorderColor[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBorderColor.Pointer get(int i){
                return new VkBorderColor.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
