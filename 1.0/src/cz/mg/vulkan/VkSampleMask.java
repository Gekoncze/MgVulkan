package cz.mg.vulkan;

public class VkSampleMask extends VkUInt32 {
    public VkSampleMask() {
    }

    protected VkSampleMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSampleMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSampleMask(VkPointer pointer) {
        super(pointer);
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

        public Array(VkSampleMask o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
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

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
