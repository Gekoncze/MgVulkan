package cz.mg.vulkan;

public class VkDevice extends VkDispatchableHandle {
    public VkDevice() {
    }

    public VkDevice(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDevice(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDevice(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDevice implements cz.mg.collections.array.ReadonlyArray<VkDevice> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDevice.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDevice o){
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
        public VkDevice get(int i){
            return new VkDevice(getVkMemory(), addressAt(i));
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
