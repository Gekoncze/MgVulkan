package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPresentModeKHR.html">khronos documentation</a>
 **/
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
            super(new VkMemory(count*sizeof()));
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
        public VkPresentModeKHR get(int i){
            return new VkPresentModeKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkPresentModeKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
