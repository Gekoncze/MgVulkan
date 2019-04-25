package cz.mg.vulkan;

public class VkPhysicalDevice extends VkDispatchableHandle {
    public VkPhysicalDevice() {
    }

    public VkPhysicalDevice(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDevice(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPhysicalDevice(long handle) {
        setValue(handle);
    }

    public static class Array extends VkPhysicalDevice implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevice> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevice.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDevice o){
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
        public VkPhysicalDevice get(int i){
            return new VkPhysicalDevice(getVkMemory(), addressAt(i));
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
