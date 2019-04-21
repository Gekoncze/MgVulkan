package cz.mg.vulkan;

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



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
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
}
