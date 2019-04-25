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

    public VkPresentModeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPresentModeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPresentModeKHR(int value) {
        setValue(value);
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

        public Array(int count, VkPresentModeKHR o){
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



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPresentModeKHR get(int i){
            return new VkPresentModeKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
