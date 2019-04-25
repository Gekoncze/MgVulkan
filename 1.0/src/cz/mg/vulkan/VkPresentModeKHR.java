package cz.mg.vulkan;

public class VkPresentModeKHR extends VkEnum {
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;
    public static final int VK_PRESENT_MODE_FIFO_KHR = 2;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;
    public static final int VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;

    public VkPresentModeKHR() {
    }

    protected VkPresentModeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPresentModeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPresentModeKHR(int value) {
        setValue(value);
    }

    public VkPresentModeKHR(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PRESENT_MODE_IMMEDIATE_KHR) return "VK_PRESENT_MODE_IMMEDIATE_KHR";
        if(getValue() == VK_PRESENT_MODE_MAILBOX_KHR) return "VK_PRESENT_MODE_MAILBOX_KHR";
        if(getValue() == VK_PRESENT_MODE_FIFO_KHR) return "VK_PRESENT_MODE_FIFO_KHR";
        if(getValue() == VK_PRESENT_MODE_FIFO_RELAXED_KHR) return "VK_PRESENT_MODE_FIFO_RELAXED_KHR";
        if(getValue() == VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR) return "VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR";
        if(getValue() == VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR) return "VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkPresentModeKHR implements cz.mg.collections.array.ReadonlyArray<VkPresentModeKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentModeKHR.sizeof()));
            this.count = count;
        }

        public Array(VkPresentModeKHR o, int count){
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
        public VkPresentModeKHR get(int i){
            return new VkPresentModeKHR(getVkMemory(), address(i));
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
