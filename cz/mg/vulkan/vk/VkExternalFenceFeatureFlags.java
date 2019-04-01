package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceFeatureFlags.html">khronos documentation</a>
 **/
public class VkExternalFenceFeatureFlags extends VkFlags {
    public VkExternalFenceFeatureFlags() {
    }

    public VkExternalFenceFeatureFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceFeatureFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalFenceFeatureFlags(int value) {
        setValue(value);
    }

    public static class Array extends VkExternalFenceFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VkExternalFenceFeatureFlags> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalFenceFeatureFlags.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalFenceFeatureFlags o){
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
        public VkExternalFenceFeatureFlags get(int i){
            return new VkExternalFenceFeatureFlags(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalFenceFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkExternalFenceFeatureFlags[] a) {
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
