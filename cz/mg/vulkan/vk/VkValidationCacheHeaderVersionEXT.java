package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheHeaderVersionEXT.html">khronos documentation</a>
 **/
public class VkValidationCacheHeaderVersionEXT extends VkEnum {
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;

    public VkValidationCacheHeaderVersionEXT() {
    }

    public VkValidationCacheHeaderVersionEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCacheHeaderVersionEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkValidationCacheHeaderVersionEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT) return "VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkValidationCacheHeaderVersionEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationCacheHeaderVersionEXT> {
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
        public VkValidationCacheHeaderVersionEXT get(int i){
            return new VkValidationCacheHeaderVersionEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkValidationCacheHeaderVersionEXT[] a) {
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
