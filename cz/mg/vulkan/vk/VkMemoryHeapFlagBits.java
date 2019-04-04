package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryHeapFlagBits.html">khronos documentation</a>
 **/
public class VkMemoryHeapFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 0x00000002;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = VK_MEMORY_HEAP_MULTI_INSTANCE_BIT;

    public VkMemoryHeapFlagBits() {
    }

    public VkMemoryHeapFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryHeapFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryHeapFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_MEMORY_HEAP_DEVICE_LOCAL_BIT) s += "VK_MEMORY_HEAP_DEVICE_LOCAL_BIT";
        if(getValue() == VK_MEMORY_HEAP_MULTI_INSTANCE_BIT) s += "VK_MEMORY_HEAP_MULTI_INSTANCE_BIT";
        if(getValue() == VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR) s += "VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkMemoryHeapFlagBits implements cz.mg.collections.array.ReadonlyArray<VkMemoryHeapFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryHeapFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryHeapFlagBits o){
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
        public VkMemoryHeapFlagBits get(int i){
            return new VkMemoryHeapFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryHeapFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryHeapFlagBits.Pointer> {
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

            public Array(VkMemoryHeapFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryHeapFlagBits.Pointer get(int i){
                return new VkMemoryHeapFlagBits.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
