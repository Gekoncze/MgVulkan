package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSystemAllocationScope.html">khronos documentation</a>
 **/
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
        public VkSystemAllocationScope get(int i){
            return new VkSystemAllocationScope(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSystemAllocationScope[] a) {
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
