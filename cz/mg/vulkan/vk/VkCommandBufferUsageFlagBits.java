package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferUsageFlagBits.html">khronos documentation</a>
 **/
public class VkCommandBufferUsageFlagBits extends VkFlagBits {
    public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 0x00000001;
    public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x00000002;
    public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 0x00000004;

    public VkCommandBufferUsageFlagBits() {
    }

    public VkCommandBufferUsageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferUsageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandBufferUsageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT) s += "VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT";
        if(getValue() == VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT) s += "VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT";
        if(getValue() == VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT) s += "VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkCommandBufferUsageFlagBits implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferUsageFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferUsageFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandBufferUsageFlagBits o){
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
        public VkCommandBufferUsageFlagBits get(int i){
            return new VkCommandBufferUsageFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandBufferUsageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkCommandBufferUsageFlagBits[] a) {
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
