package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseMemoryBindFlags.html">khronos documentation</a>
 **/
public class VkSparseMemoryBindFlags extends VkFlags {
    public VkSparseMemoryBindFlags() {
    }

    public VkSparseMemoryBindFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseMemoryBindFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSparseMemoryBindFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkSparseMemoryBindFlags implements cz.mg.collections.array.ReadonlyArray<VkSparseMemoryBindFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseMemoryBindFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSparseMemoryBindFlags o){
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
        public VkSparseMemoryBindFlags get(int i){
            return new VkSparseMemoryBindFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSparseMemoryBindFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkSparseMemoryBindFlags[] a) {
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
