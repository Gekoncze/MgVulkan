package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayoutCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineLayoutCreateFlags extends VkFlags {
    public VkPipelineLayoutCreateFlags() {
    }

    public VkPipelineLayoutCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineLayoutCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineLayoutCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkPipelineLayoutCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkPipelineLayoutCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineLayoutCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineLayoutCreateFlags o){
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
        public VkPipelineLayoutCreateFlags get(int i){
            return new VkPipelineLayoutCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineLayoutCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkPipelineLayoutCreateFlags[] a) {
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
