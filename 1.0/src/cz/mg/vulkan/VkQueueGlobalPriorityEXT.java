package cz.mg.vulkan;

public class VkQueueGlobalPriorityEXT extends VkEnum {
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT = 1024;

    public VkQueueGlobalPriorityEXT() {
    }

    protected VkQueueGlobalPriorityEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueueGlobalPriorityEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueueGlobalPriorityEXT(int value) {
        setValue(value);
    }

    public VkQueueGlobalPriorityEXT(VkPointer pointer) {
        super(pointer);
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

        public Array(VkQueueGlobalPriorityEXT o, int count){
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



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkQueueGlobalPriorityEXT get(int i){
            return new VkQueueGlobalPriorityEXT(getVkMemory(), address(i));
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
