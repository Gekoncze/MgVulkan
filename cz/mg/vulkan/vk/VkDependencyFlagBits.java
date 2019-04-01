package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDependencyFlagBits.html">khronos documentation</a>
 **/
public class VkDependencyFlagBits extends VkFlagBits {
    public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x00000001;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 0x00000004;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 0x00000002;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR = VK_DEPENDENCY_VIEW_LOCAL_BIT;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = VK_DEPENDENCY_DEVICE_GROUP_BIT;

    public VkDependencyFlagBits() {
    }

    public VkDependencyFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDependencyFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDependencyFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DEPENDENCY_BY_REGION_BIT) s += "VK_DEPENDENCY_BY_REGION_BIT ";
        if(getValue() == VK_DEPENDENCY_DEVICE_GROUP_BIT) s += "VK_DEPENDENCY_DEVICE_GROUP_BIT ";
        if(getValue() == VK_DEPENDENCY_VIEW_LOCAL_BIT) s += "VK_DEPENDENCY_VIEW_LOCAL_BIT ";
        if(getValue() == VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR) s += "VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR ";
        if(getValue() == VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR) s += "VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkDependencyFlagBits implements cz.mg.collections.array.ReadonlyArray<VkDependencyFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDependencyFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDependencyFlagBits o){
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
        public VkDependencyFlagBits get(int i){
            return new VkDependencyFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDependencyFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDependencyFlagBits[] a) {
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
