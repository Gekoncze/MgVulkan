package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageAspectFlagBits.html">khronos documentation</a>
 **/
public class VkImageAspectFlagBits extends VkFlagBits {
    public static final int VK_IMAGE_ASPECT_COLOR_BIT = 0x00000001;
    public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 0x00000002;
    public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 0x00000004;
    public static final int VK_IMAGE_ASPECT_METADATA_BIT = 0x00000008;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = 0x00000010;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = 0x00000020;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = 0x00000040;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT_KHR = VK_IMAGE_ASPECT_PLANE_0_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT_KHR = VK_IMAGE_ASPECT_PLANE_1_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT_KHR = VK_IMAGE_ASPECT_PLANE_2_BIT;

    public VkImageAspectFlagBits() {
    }

    public VkImageAspectFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageAspectFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageAspectFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_IMAGE_ASPECT_COLOR_BIT) s += "VK_IMAGE_ASPECT_COLOR_BIT ";
        if(getValue() == VK_IMAGE_ASPECT_DEPTH_BIT) s += "VK_IMAGE_ASPECT_DEPTH_BIT ";
        if(getValue() == VK_IMAGE_ASPECT_STENCIL_BIT) s += "VK_IMAGE_ASPECT_STENCIL_BIT ";
        if(getValue() == VK_IMAGE_ASPECT_METADATA_BIT) s += "VK_IMAGE_ASPECT_METADATA_BIT ";
        if(getValue() == VK_IMAGE_ASPECT_PLANE_0_BIT) s += "VK_IMAGE_ASPECT_PLANE_0_BIT ";
        if(getValue() == VK_IMAGE_ASPECT_PLANE_1_BIT) s += "VK_IMAGE_ASPECT_PLANE_1_BIT ";
        if(getValue() == VK_IMAGE_ASPECT_PLANE_2_BIT) s += "VK_IMAGE_ASPECT_PLANE_2_BIT ";
        if(getValue() == VK_IMAGE_ASPECT_PLANE_0_BIT_KHR) s += "VK_IMAGE_ASPECT_PLANE_0_BIT_KHR ";
        if(getValue() == VK_IMAGE_ASPECT_PLANE_1_BIT_KHR) s += "VK_IMAGE_ASPECT_PLANE_1_BIT_KHR ";
        if(getValue() == VK_IMAGE_ASPECT_PLANE_2_BIT_KHR) s += "VK_IMAGE_ASPECT_PLANE_2_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkImageAspectFlagBits implements cz.mg.collections.array.ReadonlyArray<VkImageAspectFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkImageAspectFlagBits get(int i){
            return new VkImageAspectFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkImageAspectFlagBits[] a) {
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
