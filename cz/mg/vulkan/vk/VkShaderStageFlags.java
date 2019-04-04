package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderStageFlags.html">khronos documentation</a>
 **/
public class VkShaderStageFlags extends VkFlags {
    public VkShaderStageFlags() {
    }

    public VkShaderStageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderStageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderStageFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkShaderStageFlags implements cz.mg.collections.array.ReadonlyArray<VkShaderStageFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderStageFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkShaderStageFlags o){
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
        public VkShaderStageFlags get(int i){
            return new VkShaderStageFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkShaderStageFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkShaderStageFlags.Pointer> {
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

            public Array(VkShaderStageFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkShaderStageFlags.Pointer get(int i){
                return new VkShaderStageFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
