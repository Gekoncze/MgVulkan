package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCacheHeaderVersion.html">khronos documentation</a>
 **/
public class VkPipelineCacheHeaderVersion extends VkEnum {
    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;

    public VkPipelineCacheHeaderVersion() {
    }

    public VkPipelineCacheHeaderVersion(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCacheHeaderVersion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCacheHeaderVersion(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PIPELINE_CACHE_HEADER_VERSION_ONE) return "VK_PIPELINE_CACHE_HEADER_VERSION_ONE";
        return "UNKNOWN";
    }

    public static class Array extends VkPipelineCacheHeaderVersion implements cz.mg.collections.array.ReadonlyArray<VkPipelineCacheHeaderVersion> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCacheHeaderVersion.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineCacheHeaderVersion o){
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
        public VkPipelineCacheHeaderVersion get(int i){
            return new VkPipelineCacheHeaderVersion(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineCacheHeaderVersion.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineCacheHeaderVersion.Pointer> {
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

            public Array(VkPipelineCacheHeaderVersion[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineCacheHeaderVersion.Pointer get(int i){
                return new VkPipelineCacheHeaderVersion.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
