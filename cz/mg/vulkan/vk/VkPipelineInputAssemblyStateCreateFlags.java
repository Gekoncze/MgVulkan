package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineInputAssemblyStateCreateFlags.html">khronos documentation</a>
 **/
public class VkPipelineInputAssemblyStateCreateFlags extends VkFlags {
    public VkPipelineInputAssemblyStateCreateFlags() {
    }

    public VkPipelineInputAssemblyStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineInputAssemblyStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineInputAssemblyStateCreateFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkPipelineInputAssemblyStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VkPipelineInputAssemblyStateCreateFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineInputAssemblyStateCreateFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineInputAssemblyStateCreateFlags o){
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
        public VkPipelineInputAssemblyStateCreateFlags get(int i){
            return new VkPipelineInputAssemblyStateCreateFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineInputAssemblyStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineInputAssemblyStateCreateFlags.Pointer> {
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

            public Array(VkPipelineInputAssemblyStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineInputAssemblyStateCreateFlags.Pointer get(int i){
                return new VkPipelineInputAssemblyStateCreateFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
