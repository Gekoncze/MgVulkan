package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportSwizzleStateCreateFlagsNV.html">khronos documentation</a>
 **/
public class VkPipelineViewportSwizzleStateCreateFlagsNV extends VkFlags {
    public VkPipelineViewportSwizzleStateCreateFlagsNV() {
    }

    public VkPipelineViewportSwizzleStateCreateFlagsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportSwizzleStateCreateFlagsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineViewportSwizzleStateCreateFlagsNV(int value) {
        setValue(value);
    }

    public static class Array extends VkPipelineViewportSwizzleStateCreateFlagsNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineViewportSwizzleStateCreateFlagsNV> {
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
        public VkPipelineViewportSwizzleStateCreateFlagsNV get(int i){
            return new VkPipelineViewportSwizzleStateCreateFlagsNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineViewportSwizzleStateCreateFlagsNV[] a) {
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
