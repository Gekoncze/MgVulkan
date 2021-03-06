package cz.mg.vulkan;

public class VkPhysicalDeviceType extends VkEnum {
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;

    public VkPhysicalDeviceType() {
    }

    protected VkPhysicalDeviceType(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceType(int value) {
        setValue(value);
    }

    public VkPhysicalDeviceType(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PHYSICAL_DEVICE_TYPE_OTHER) return "VK_PHYSICAL_DEVICE_TYPE_OTHER";
        if(getValue() == VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU) return "VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU";
        if(getValue() == VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU) return "VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU";
        if(getValue() == VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU) return "VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU";
        if(getValue() == VK_PHYSICAL_DEVICE_TYPE_CPU) return "VK_PHYSICAL_DEVICE_TYPE_CPU";
        return "UNKNOWN";
    }

    public static class Array extends VkPhysicalDeviceType implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceType> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceType.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceType o, int count){
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
        public VkPhysicalDeviceType get(int i){
            return new VkPhysicalDeviceType(getVkMemory(), address(i));
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
