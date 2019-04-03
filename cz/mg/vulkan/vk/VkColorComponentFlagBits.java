package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkColorComponentFlagBits.html">khronos documentation</a>
 **/
public class VkColorComponentFlagBits extends VkFlagBits {
    public static final int VK_COLOR_COMPONENT_R_BIT = 0x00000001;
    public static final int VK_COLOR_COMPONENT_G_BIT = 0x00000002;
    public static final int VK_COLOR_COMPONENT_B_BIT = 0x00000004;
    public static final int VK_COLOR_COMPONENT_A_BIT = 0x00000008;

    public VkColorComponentFlagBits() {
    }

    public VkColorComponentFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkColorComponentFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkColorComponentFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COLOR_COMPONENT_R_BIT) s += "VK_COLOR_COMPONENT_R_BIT";
        if(getValue() == VK_COLOR_COMPONENT_G_BIT) s += "VK_COLOR_COMPONENT_G_BIT";
        if(getValue() == VK_COLOR_COMPONENT_B_BIT) s += "VK_COLOR_COMPONENT_B_BIT";
        if(getValue() == VK_COLOR_COMPONENT_A_BIT) s += "VK_COLOR_COMPONENT_A_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkColorComponentFlagBits implements cz.mg.collections.array.ReadonlyArray<VkColorComponentFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkColorComponentFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkColorComponentFlagBits o){
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
        public VkColorComponentFlagBits get(int i){
            return new VkColorComponentFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkColorComponentFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkColorComponentFlagBits[] a) {
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
