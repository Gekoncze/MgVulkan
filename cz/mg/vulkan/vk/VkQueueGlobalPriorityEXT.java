package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueGlobalPriorityEXT.html">khronos documentation</a>
 **/
public class VkQueueGlobalPriorityEXT extends VkEnum {
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT = 1024;

    public VkQueueGlobalPriorityEXT() {
    }

    public VkQueueGlobalPriorityEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueueGlobalPriorityEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueueGlobalPriorityEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT";
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT";
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT";
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkQueueGlobalPriorityEXT implements cz.mg.collections.array.ReadonlyArray<VkQueueGlobalPriorityEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueueGlobalPriorityEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkQueueGlobalPriorityEXT o){
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
        public VkQueueGlobalPriorityEXT get(int i){
            return new VkQueueGlobalPriorityEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkQueueGlobalPriorityEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkQueueGlobalPriorityEXT.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkQueueGlobalPriorityEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkQueueGlobalPriorityEXT.Pointer get(int i){
                return new VkQueueGlobalPriorityEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
