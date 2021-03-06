package cz.mg.vulkan;

public class VkDevice extends VkDispatchableHandle {
    public VkDevice() {
    }

    protected VkDevice(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDevice(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDevice(VkPointer pointer) {
        super(pointer);
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

        public Array(VkDevice o, int count){
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



        public Array(VkDevice... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i].getValue());
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDevice get(int i){
            return new VkDevice(getVkMemory(), address(i));
        }

        protected long address(int i){
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
