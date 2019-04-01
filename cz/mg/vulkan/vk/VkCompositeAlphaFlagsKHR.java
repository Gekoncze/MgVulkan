package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompositeAlphaFlagsKHR.html">khronos documentation</a>
 **/
public class VkCompositeAlphaFlagsKHR extends VkFlags {
    public VkCompositeAlphaFlagsKHR() {
    }

    public VkCompositeAlphaFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCompositeAlphaFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCompositeAlphaFlagsKHR(int value) {
        setValue(value);
    }

    public static class Array extends VkCompositeAlphaFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VkCompositeAlphaFlagsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCompositeAlphaFlagsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCompositeAlphaFlagsKHR o){
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
        public VkCompositeAlphaFlagsKHR get(int i){
            return new VkCompositeAlphaFlagsKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCompositeAlphaFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkCompositeAlphaFlagsKHR[] a) {
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
