package cz.mg.vulkan;

public class VkInternalAllocationType extends VkEnum {
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

    public VkInternalAllocationType() {
    }

    public VkInternalAllocationType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInternalAllocationType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkInternalAllocationType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE) return "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE";
        return "UNKNOWN";
    }

    public static class Array extends VkInternalAllocationType implements cz.mg.collections.array.ReadonlyArray<VkInternalAllocationType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInternalAllocationType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInternalAllocationType o){
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
        public VkInternalAllocationType get(int i){
            return new VkInternalAllocationType(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
