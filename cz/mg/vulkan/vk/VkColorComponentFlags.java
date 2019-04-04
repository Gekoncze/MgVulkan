package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkColorComponentFlags.html">khronos documentation</a>
 **/
public class VkColorComponentFlags extends VkFlags {
    public VkColorComponentFlags() {
    }

    public VkColorComponentFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkColorComponentFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkColorComponentFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkColorComponentFlags implements cz.mg.collections.array.ReadonlyArray<VkColorComponentFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkColorComponentFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkColorComponentFlags o){
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
        public VkColorComponentFlags get(int i){
            return new VkColorComponentFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkColorComponentFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkColorComponentFlags.Pointer> {
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

            public Array(VkColorComponentFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkColorComponentFlags.Pointer get(int i){
                return new VkColorComponentFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
