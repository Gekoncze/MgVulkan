package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineCreateFlags extends VkFlags {
    public VkPipelineCreateFlags() {
    }

    public VkPipelineCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkPipelineCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkPipelineCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineCreateFlags o){
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
        public VkPipelineCreateFlags get(int i){
            return new VkPipelineCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineCreateFlags.Pointer> {
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

            public Array(VkPipelineCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineCreateFlags.Pointer get(int i){
                return new VkPipelineCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
