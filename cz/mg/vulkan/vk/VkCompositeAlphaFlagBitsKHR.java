package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompositeAlphaFlagBitsKHR.html">khronos documentation</a>
 **/
public class VkCompositeAlphaFlagBitsKHR extends VkFlagBits {
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x00000002;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x00000004;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x00000008;

    public VkCompositeAlphaFlagBitsKHR() {
    }

    public VkCompositeAlphaFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCompositeAlphaFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCompositeAlphaFlagBitsKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR) s += "VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR";
        if(getValue() == VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR) s += "VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR";
        if(getValue() == VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR) s += "VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR";
        if(getValue() == VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR) s += "VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkCompositeAlphaFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VkCompositeAlphaFlagBitsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCompositeAlphaFlagBitsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCompositeAlphaFlagBitsKHR o){
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
        public VkCompositeAlphaFlagBitsKHR get(int i){
            return new VkCompositeAlphaFlagBitsKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCompositeAlphaFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCompositeAlphaFlagBitsKHR.Pointer> {
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

            public Array(VkCompositeAlphaFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCompositeAlphaFlagBitsKHR.Pointer get(int i){
                return new VkCompositeAlphaFlagBitsKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
