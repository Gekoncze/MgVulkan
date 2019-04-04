package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatFeatureFlags.html">khronos documentation</a>
 **/
public class VkFormatFeatureFlags extends VkFlags {
    public VkFormatFeatureFlags() {
    }

    public VkFormatFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFormatFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFormatFeatureFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkFormatFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VkFormatFeatureFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFormatFeatureFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFormatFeatureFlags o){
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
        public VkFormatFeatureFlags get(int i){
            return new VkFormatFeatureFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkFormatFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFormatFeatureFlags.Pointer> {
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

            public Array(VkFormatFeatureFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFormatFeatureFlags.Pointer get(int i){
                return new VkFormatFeatureFlags.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
