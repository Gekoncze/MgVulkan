package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageUsageFlags.html">khronos documentation</a>
 **/
public class VkImageUsageFlags extends VkFlags {
    public VkImageUsageFlags() {
    }

    public VkImageUsageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageUsageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageUsageFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkImageUsageFlags implements cz.mg.collections.array.ReadonlyArray<VkImageUsageFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageUsageFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageUsageFlags o){
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
        public VkImageUsageFlags get(int i){
            return new VkImageUsageFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageUsageFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageUsageFlags.Pointer> {
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

            public Array(VkImageUsageFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageUsageFlags.Pointer get(int i){
                return new VkImageUsageFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
