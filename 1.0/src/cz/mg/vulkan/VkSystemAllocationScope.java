package cz.mg.vulkan;

public class VkSystemAllocationScope extends VkEnum {
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

    public VkSystemAllocationScope() {
    }

    public VkSystemAllocationScope(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSystemAllocationScope(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSystemAllocationScope(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_COMMAND) return "VK_SYSTEM_ALLOCATION_SCOPE_COMMAND";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_OBJECT) return "VK_SYSTEM_ALLOCATION_SCOPE_OBJECT";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_CACHE) return "VK_SYSTEM_ALLOCATION_SCOPE_CACHE";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_DEVICE) return "VK_SYSTEM_ALLOCATION_SCOPE_DEVICE";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE) return "VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE";
        return "UNKNOWN";
    }

    public static class Array extends VkSystemAllocationScope implements cz.mg.collections.array.ReadonlyArray<VkSystemAllocationScope> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSystemAllocationScope.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSystemAllocationScope o){
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
        public VkSystemAllocationScope get(int i){
            return new VkSystemAllocationScope(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
