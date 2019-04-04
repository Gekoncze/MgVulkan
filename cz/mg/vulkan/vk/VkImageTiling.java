package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageTiling.html">khronos documentation</a>
 **/
public class VkImageTiling extends VkEnum {
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;

    public VkImageTiling() {
    }

    public VkImageTiling(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageTiling(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageTiling(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_TILING_OPTIMAL) return "VK_IMAGE_TILING_OPTIMAL";
        if(getValue() == VK_IMAGE_TILING_LINEAR) return "VK_IMAGE_TILING_LINEAR";
        return "UNKNOWN";
    }

    public static class Array extends VkImageTiling implements cz.mg.collections.array.ReadonlyArray<VkImageTiling> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageTiling.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageTiling o){
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
        public VkImageTiling get(int i){
            return new VkImageTiling(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageTiling.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageTiling.Pointer> {
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

            public Array(VkImageTiling[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageTiling.Pointer get(int i){
                return new VkImageTiling.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
