package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryMapFlags.html">khronos documentation</a>
 **/
public class VkMemoryMapFlags extends VkFlags {
    public VkMemoryMapFlags() {
    }

    public VkMemoryMapFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryMapFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryMapFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkMemoryMapFlags implements cz.mg.collections.array.ReadonlyArray<VkMemoryMapFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryMapFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryMapFlags o){
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
        public VkMemoryMapFlags get(int i){
            return new VkMemoryMapFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryMapFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryMapFlags.Pointer> {
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

            public Array(VkMemoryMapFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryMapFlags.Pointer get(int i){
                return new VkMemoryMapFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
