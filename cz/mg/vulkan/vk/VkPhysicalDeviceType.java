package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceType.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceType extends VkEnum {
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;

    public VkPhysicalDeviceType() {
    }

    public VkPhysicalDeviceType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceType(int value) {
        setValue(value);
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

        public Array(int count, VkPhysicalDeviceType o){
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
        public VkPhysicalDeviceType get(int i){
            return new VkPhysicalDeviceType(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceType.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceType.Pointer> {
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

            public Array(VkPhysicalDeviceType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceType.Pointer get(int i){
                return new VkPhysicalDeviceType.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
