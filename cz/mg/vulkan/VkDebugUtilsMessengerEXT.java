package cz.mg.vulkan;

public class VkDebugUtilsMessengerEXT extends VkNonDispatchableHandle {
    public VkDebugUtilsMessengerEXT() {
    }

    public VkDebugUtilsMessengerEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsMessengerEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

        public Array(int count, VkDebugUtilsMessengerEXT o){
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
        public VkDebugUtilsMessengerEXT get(int i){
            return new VkDebugUtilsMessengerEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
