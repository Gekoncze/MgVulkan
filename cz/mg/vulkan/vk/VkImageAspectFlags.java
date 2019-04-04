package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageAspectFlags.html">khronos documentation</a>
 **/
public class VkImageAspectFlags extends VkFlags {
    public VkImageAspectFlags() {
    }

    public VkImageAspectFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageAspectFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageAspectFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkImageAspectFlags implements cz.mg.collections.array.ReadonlyArray<VkImageAspectFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageAspectFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageAspectFlags o){
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
        public VkImageAspectFlags get(int i){
            return new VkImageAspectFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageAspectFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageAspectFlags.Pointer> {
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

            public Array(VkImageAspectFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageAspectFlags.Pointer get(int i){
                return new VkImageAspectFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
