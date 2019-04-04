package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCacheCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineCacheCreateFlags extends VkFlags {
    public VkPipelineCacheCreateFlags() {
    }

    public VkPipelineCacheCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCacheCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCacheCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkPipelineCacheCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkPipelineCacheCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCacheCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineCacheCreateFlags o){
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
        public VkPipelineCacheCreateFlags get(int i){
            return new VkPipelineCacheCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineCacheCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineCacheCreateFlags.Pointer> {
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

            public Array(VkPipelineCacheCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineCacheCreateFlags.Pointer get(int i){
                return new VkPipelineCacheCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
