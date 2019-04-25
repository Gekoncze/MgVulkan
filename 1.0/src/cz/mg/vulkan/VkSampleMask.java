package cz.mg.vulkan;

public class VkSampleMask extends VkUInt32 {
    public VkSampleMask() {
    }

    public VkSampleMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSampleMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSampleMask(int value) {
        setValue(value);
    }

    public static class Array extends VkSampleMask implements cz.mg.collections.array.ReadonlyArray<VkSampleMask> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSampleMask.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSampleMask o){
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
        public VkSampleMask get(int i){
            return new VkSampleMask(getVkMemory(), addressAt(i));
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
