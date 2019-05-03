package cz.mg.vulkan;

public class VkImage extends VkNonDispatchableHandle {
    public VkImage() {
    }

    protected VkImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImage(VkPointer pointer) {
        super(pointer);
    }



    public VkImage(long handle) {
        setValue(handle);
    }

    public static class Array extends VkImage implements cz.mg.collections.array.ReadonlyArray<VkImage> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImage.sizeof()));
            this.count = count;
        }

        public Array(VkImage o, int count){
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



        public Array(VkImage... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i].getValue());
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkImage get(int i){
            return new VkImage(getVkMemory(), address(i));
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
