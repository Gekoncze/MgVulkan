package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDynamicStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineDynamicStateCreateFlags extends VkFlags {
    public VkPipelineDynamicStateCreateFlags() {
    }

    public VkPipelineDynamicStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDynamicStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineDynamicStateCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkPipelineDynamicStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkPipelineDynamicStateCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineDynamicStateCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineDynamicStateCreateFlags o){
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
        public VkPipelineDynamicStateCreateFlags get(int i){
            return new VkPipelineDynamicStateCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineDynamicStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineDynamicStateCreateFlags.Pointer> {
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

            public Array(VkPipelineDynamicStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineDynamicStateCreateFlags.Pointer get(int i){
                return new VkPipelineDynamicStateCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
