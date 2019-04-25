package cz.mg.vulkan;

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
            return new VkValidationCacheEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
