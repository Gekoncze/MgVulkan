package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolResetFlags.html">khronos documentation</a>
 **/
public class VkCommandPoolResetFlags extends VkFlags {
    public VkCommandPoolResetFlags() {
    }

    public VkCommandPoolResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolResetFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkCommandPoolResetFlags implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolResetFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandPoolResetFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandPoolResetFlags o){
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
        public VkCommandPoolResetFlags get(int i){
            return new VkCommandPoolResetFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandPoolResetFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolResetFlags.Pointer> {
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

            public Array(VkCommandPoolResetFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCommandPoolResetFlags.Pointer get(int i){
                return new VkCommandPoolResetFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
