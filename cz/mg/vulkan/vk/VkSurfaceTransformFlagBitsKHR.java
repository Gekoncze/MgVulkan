package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceTransformFlagBitsKHR.html">khronos documentation</a>
 **/
public class VkSurfaceTransformFlagBitsKHR extends VkFlagBits {
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 0x00000001;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 0x00000002;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 0x00000004;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 0x00000008;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 0x00000010;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 0x00000020;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x00000040;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x00000080;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 0x00000100;

    public VkSurfaceTransformFlagBitsKHR() {
    }

    public VkSurfaceTransformFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceTransformFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceTransformFlagBitsKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR) s += "VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR) s += "VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR) s += "VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR) s += "VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR) s += "VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkSurfaceTransformFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceTransformFlagBitsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceTransformFlagBitsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceTransformFlagBitsKHR o){
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
        public VkSurfaceTransformFlagBitsKHR get(int i){
            return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSurfaceTransformFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSurfaceTransformFlagBitsKHR.Pointer> {
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

            public Array(VkSurfaceTransformFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSurfaceTransformFlagBitsKHR.Pointer get(int i){
                return new VkSurfaceTransformFlagBitsKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
