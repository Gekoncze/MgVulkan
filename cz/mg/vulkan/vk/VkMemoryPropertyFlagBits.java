package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryPropertyFlagBits.html">khronos documentation</a>
 **/
public class VkMemoryPropertyFlagBits extends VkFlagBits {
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x00000002;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x00000004;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x00000008;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x00000010;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 0x00000020;

    public VkMemoryPropertyFlagBits() {
    }

    public VkMemoryPropertyFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryPropertyFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryPropertyFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT) s += "VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) s += "VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_HOST_COHERENT_BIT) s += "VK_MEMORY_PROPERTY_HOST_COHERENT_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_HOST_CACHED_BIT) s += "VK_MEMORY_PROPERTY_HOST_CACHED_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT) s += "VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT";
        if(getValue() == VK_MEMORY_PROPERTY_PROTECTED_BIT) s += "VK_MEMORY_PROPERTY_PROTECTED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkMemoryPropertyFlagBits implements cz.mg.collections.array.ReadonlyArray<VkMemoryPropertyFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryPropertyFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryPropertyFlagBits o){
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
        public VkMemoryPropertyFlagBits get(int i){
            return new VkMemoryPropertyFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryPropertyFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryPropertyFlagBits.Pointer> {
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

            public Array(VkMemoryPropertyFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryPropertyFlagBits.Pointer get(int i){
                return new VkMemoryPropertyFlagBits.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
