package cz.mg.vulkan;

public class VkDeviceSize extends VkUInt64 {
    public VkDeviceSize() {
    }

    public VkDeviceSize(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceSize(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceSize(long value) {
        setValue(value);
    }

    public static class Array extends VkDeviceSize implements cz.mg.collections.array.ReadonlyArray<VkDeviceSize> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceSize.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceSize o){
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
        public VkDeviceSize get(int i){
            return new VkDeviceSize(getVkMemory(), addressAt(i));
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
