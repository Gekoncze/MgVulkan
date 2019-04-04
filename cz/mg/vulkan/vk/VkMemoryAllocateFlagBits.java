package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryAllocateFlagBits.html">khronos documentation</a>
 **/
public class VkMemoryAllocateFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 0x00000001;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT;

    public VkMemoryAllocateFlagBits() {
    }

    public VkMemoryAllocateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryAllocateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryAllocateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT) s += "VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT";
        if(getValue() == VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR) s += "VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkMemoryAllocateFlagBits implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryAllocateFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryAllocateFlagBits o){
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
        public VkMemoryAllocateFlagBits get(int i){
            return new VkMemoryAllocateFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryAllocateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryAllocateFlagBits.Pointer> {
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

            public Array(VkMemoryAllocateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryAllocateFlagBits.Pointer get(int i){
                return new VkMemoryAllocateFlagBits.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
