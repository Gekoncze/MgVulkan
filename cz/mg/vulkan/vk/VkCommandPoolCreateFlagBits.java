package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolCreateFlagBits.html">khronos documentation</a>
 **/
public class VkCommandPoolCreateFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 0x00000001;
    public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x00000002;
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 0x00000004;

    public VkCommandPoolCreateFlagBits() {
    }

    public VkCommandPoolCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COMMAND_POOL_CREATE_TRANSIENT_BIT) s += "VK_COMMAND_POOL_CREATE_TRANSIENT_BIT";
        if(getValue() == VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT) s += "VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT";
        if(getValue() == VK_COMMAND_POOL_CREATE_PROTECTED_BIT) s += "VK_COMMAND_POOL_CREATE_PROTECTED_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkCommandPoolCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolCreateFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandPoolCreateFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandPoolCreateFlagBits o){
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
        public VkCommandPoolCreateFlagBits get(int i){
            return new VkCommandPoolCreateFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandPoolCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkCommandPoolCreateFlagBits[] a) {
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
