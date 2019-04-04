package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheEXT.html">khronos documentation</a>
 **/
public class VkValidationCacheEXT extends VkNonDispatchableHandle {
    public VkValidationCacheEXT() {
    }

    public VkValidationCacheEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCacheEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkValidationCacheEXT(long handle) {
        setValue(handle);
    }

    public static class Array extends VkValidationCacheEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationCacheEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkValidationCacheEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkValidationCacheEXT o){
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
        public VkValidationCacheEXT get(int i){
            return new VkValidationCacheEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkValidationCacheEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkValidationCacheEXT.Pointer> {
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

            public Array(VkValidationCacheEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkValidationCacheEXT.Pointer get(int i){
                return new VkValidationCacheEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
