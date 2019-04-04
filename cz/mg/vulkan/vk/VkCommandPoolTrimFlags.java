package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolTrimFlags.html">khronos documentation</a>
 **/
public class VkCommandPoolTrimFlags extends VkFlags {
    public VkCommandPoolTrimFlags() {
    }

    public VkCommandPoolTrimFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolTrimFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolTrimFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkCommandPoolTrimFlags implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolTrimFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandPoolTrimFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandPoolTrimFlags o){
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
        public VkCommandPoolTrimFlags get(int i){
            return new VkCommandPoolTrimFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandPoolTrimFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolTrimFlags.Pointer> {
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

            public Array(VkCommandPoolTrimFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCommandPoolTrimFlags.Pointer get(int i){
                return new VkCommandPoolTrimFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
