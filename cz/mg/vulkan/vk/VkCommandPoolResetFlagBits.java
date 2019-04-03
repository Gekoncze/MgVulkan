package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolResetFlagBits.html">khronos documentation</a>
 **/
public class VkCommandPoolResetFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x00000001;

    public VkCommandPoolResetFlagBits() {
    }

    public VkCommandPoolResetFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolResetFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolResetFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT) s += "VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkCommandPoolResetFlagBits implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolResetFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandPoolResetFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandPoolResetFlagBits o){
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
        public VkCommandPoolResetFlagBits get(int i){
            return new VkCommandPoolResetFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandPoolResetFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkCommandPoolResetFlagBits[] a) {
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
