package cz.mg.vulkan.vk;

public class VkDebugReportCallbackEXT extends VkNonDispatchableHandle {
    public VkDebugReportCallbackEXT() {
    }

    public VkDebugReportCallbackEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugReportCallbackEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugReportCallbackEXT(long handle) {
        setValue(handle);
    }

    public static class Array extends VkDebugReportCallbackEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugReportCallbackEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugReportCallbackEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugReportCallbackEXT o){
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
        public VkDebugReportCallbackEXT get(int i){
            return new VkDebugReportCallbackEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
