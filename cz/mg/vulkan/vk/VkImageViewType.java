package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageViewType.html">khronos documentation</a>
 **/
public class VkImageViewType extends VkEnum {
    public static final int VK_IMAGE_VIEW_TYPE_1D = 0;
    public static final int VK_IMAGE_VIEW_TYPE_2D = 1;
    public static final int VK_IMAGE_VIEW_TYPE_3D = 2;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

    public VkImageViewType() {
    }

    public VkImageViewType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageViewType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageViewType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_VIEW_TYPE_1D) return "VK_IMAGE_VIEW_TYPE_1D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_2D) return "VK_IMAGE_VIEW_TYPE_2D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_3D) return "VK_IMAGE_VIEW_TYPE_3D";
        if(getValue() == VK_IMAGE_VIEW_TYPE_CUBE) return "VK_IMAGE_VIEW_TYPE_CUBE";
        if(getValue() == VK_IMAGE_VIEW_TYPE_1D_ARRAY) return "VK_IMAGE_VIEW_TYPE_1D_ARRAY";
        if(getValue() == VK_IMAGE_VIEW_TYPE_2D_ARRAY) return "VK_IMAGE_VIEW_TYPE_2D_ARRAY";
        if(getValue() == VK_IMAGE_VIEW_TYPE_CUBE_ARRAY) return "VK_IMAGE_VIEW_TYPE_CUBE_ARRAY";
        return "UNKNOWN";
    }

    public static class Array extends VkImageViewType implements cz.mg.collections.array.ReadonlyArray<VkImageViewType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageViewType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageViewType o){
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
        public VkImageViewType get(int i){
            return new VkImageViewType(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageViewType.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkImageViewType[] a) {
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
