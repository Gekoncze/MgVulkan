package cz.mg.vulkan;

public class VkDebugUtilsMessengerEXT extends VkNonDispatchableHandle {
    public VkDebugUtilsMessengerEXT() {
    }

    protected VkDebugUtilsMessengerEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugUtilsMessengerEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsMessengerEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDebugUtilsMessengerEXT(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDebugUtilsMessengerEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsMessengerEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsMessengerEXT.sizeof()));
            this.count = count;
        }

        public Array(VkDebugUtilsMessengerEXT o, int count){
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
        public VkDebugUtilsMessengerEXT get(int i){
            return new VkDebugUtilsMessengerEXT(getVkMemory(), addressAt(i));
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
