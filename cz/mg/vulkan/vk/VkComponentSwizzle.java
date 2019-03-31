package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkComponentSwizzle.html">khronos documentation</a>
 **/
public class VkComponentSwizzle extends VkEnum {
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int VK_COMPONENT_SWIZZLE_ONE = 2;
    public static final int VK_COMPONENT_SWIZZLE_R = 3;
    public static final int VK_COMPONENT_SWIZZLE_G = 4;
    public static final int VK_COMPONENT_SWIZZLE_B = 5;
    public static final int VK_COMPONENT_SWIZZLE_A = 6;

    public VkComponentSwizzle() {
    }

    public VkComponentSwizzle(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkComponentSwizzle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkComponentSwizzle(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COMPONENT_SWIZZLE_IDENTITY) return "VK_COMPONENT_SWIZZLE_IDENTITY";
        if(getValue() == VK_COMPONENT_SWIZZLE_ZERO) return "VK_COMPONENT_SWIZZLE_ZERO";
        if(getValue() == VK_COMPONENT_SWIZZLE_ONE) return "VK_COMPONENT_SWIZZLE_ONE";
        if(getValue() == VK_COMPONENT_SWIZZLE_R) return "VK_COMPONENT_SWIZZLE_R";
        if(getValue() == VK_COMPONENT_SWIZZLE_G) return "VK_COMPONENT_SWIZZLE_G";
        if(getValue() == VK_COMPONENT_SWIZZLE_B) return "VK_COMPONENT_SWIZZLE_B";
        if(getValue() == VK_COMPONENT_SWIZZLE_A) return "VK_COMPONENT_SWIZZLE_A";
        return "UNKNOWN";
    }

    public static class Array extends VkComponentSwizzle implements cz.mg.collections.array.ReadonlyArray<VkComponentSwizzle> {
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
        public VkComponentSwizzle get(int i){
            return new VkComponentSwizzle(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkComponentSwizzle[] a) {
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
