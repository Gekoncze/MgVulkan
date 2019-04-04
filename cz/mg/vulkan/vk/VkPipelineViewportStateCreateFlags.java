package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineViewportStateCreateFlags extends VkFlags {
    public VkPipelineViewportStateCreateFlags() {
    }

    public VkPipelineViewportStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineViewportStateCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkPipelineViewportStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportStateCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineViewportStateCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineViewportStateCreateFlags o){
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
        public VkPipelineViewportStateCreateFlags get(int i){
            return new VkPipelineViewportStateCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineViewportStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportStateCreateFlags.Pointer> {
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

            public Array(VkPipelineViewportStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineViewportStateCreateFlags.Pointer get(int i){
                return new VkPipelineViewportStateCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
