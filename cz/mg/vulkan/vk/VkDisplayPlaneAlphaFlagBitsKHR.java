package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPlaneAlphaFlagBitsKHR.html">khronos documentation</a>
 **/
public class VkDisplayPlaneAlphaFlagBitsKHR extends VkFlagBits {
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x00000002;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x00000004;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x00000008;

    public VkDisplayPlaneAlphaFlagBitsKHR() {
    }

    public VkDisplayPlaneAlphaFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPlaneAlphaFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayPlaneAlphaFlagBitsKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkDisplayPlaneAlphaFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlaneAlphaFlagBitsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPlaneAlphaFlagBitsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayPlaneAlphaFlagBitsKHR o){
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
        public VkDisplayPlaneAlphaFlagBitsKHR get(int i){
            return new VkDisplayPlaneAlphaFlagBitsKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayPlaneAlphaFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlaneAlphaFlagBitsKHR.Pointer> {
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

            public Array(VkDisplayPlaneAlphaFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayPlaneAlphaFlagBitsKHR.Pointer get(int i){
                return new VkDisplayPlaneAlphaFlagBitsKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
