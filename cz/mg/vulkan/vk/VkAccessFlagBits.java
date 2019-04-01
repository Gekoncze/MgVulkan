package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAccessFlagBits.html">khronos documentation</a>
 **/
public class VkAccessFlagBits extends VkFlagBits {
    public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 0x00000001;
    public static final int VK_ACCESS_INDEX_READ_BIT = 0x00000002;
    public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 0x00000004;
    public static final int VK_ACCESS_UNIFORM_READ_BIT = 0x00000008;
    public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 0x00000010;
    public static final int VK_ACCESS_SHADER_READ_BIT = 0x00000020;
    public static final int VK_ACCESS_SHADER_WRITE_BIT = 0x00000040;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 0x00000080;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 0x00000100;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x00000200;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x00000400;
    public static final int VK_ACCESS_TRANSFER_READ_BIT = 0x00000800;
    public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 0x00001000;
    public static final int VK_ACCESS_HOST_READ_BIT = 0x00002000;
    public static final int VK_ACCESS_HOST_WRITE_BIT = 0x00004000;
    public static final int VK_ACCESS_MEMORY_READ_BIT = 0x00008000;
    public static final int VK_ACCESS_MEMORY_WRITE_BIT = 0x00010000;
    public static final int VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX = 0x00020000;
    public static final int VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX = 0x00040000;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 0x00080000;

    public VkAccessFlagBits() {
    }

    public VkAccessFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAccessFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkAccessFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_ACCESS_INDIRECT_COMMAND_READ_BIT) s += "VK_ACCESS_INDIRECT_COMMAND_READ_BIT ";
        if(getValue() == VK_ACCESS_INDEX_READ_BIT) s += "VK_ACCESS_INDEX_READ_BIT ";
        if(getValue() == VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT) s += "VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT ";
        if(getValue() == VK_ACCESS_UNIFORM_READ_BIT) s += "VK_ACCESS_UNIFORM_READ_BIT ";
        if(getValue() == VK_ACCESS_INPUT_ATTACHMENT_READ_BIT) s += "VK_ACCESS_INPUT_ATTACHMENT_READ_BIT ";
        if(getValue() == VK_ACCESS_SHADER_READ_BIT) s += "VK_ACCESS_SHADER_READ_BIT ";
        if(getValue() == VK_ACCESS_SHADER_WRITE_BIT) s += "VK_ACCESS_SHADER_WRITE_BIT ";
        if(getValue() == VK_ACCESS_COLOR_ATTACHMENT_READ_BIT) s += "VK_ACCESS_COLOR_ATTACHMENT_READ_BIT ";
        if(getValue() == VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT) s += "VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT ";
        if(getValue() == VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT) s += "VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT ";
        if(getValue() == VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT) s += "VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ";
        if(getValue() == VK_ACCESS_TRANSFER_READ_BIT) s += "VK_ACCESS_TRANSFER_READ_BIT ";
        if(getValue() == VK_ACCESS_TRANSFER_WRITE_BIT) s += "VK_ACCESS_TRANSFER_WRITE_BIT ";
        if(getValue() == VK_ACCESS_HOST_READ_BIT) s += "VK_ACCESS_HOST_READ_BIT ";
        if(getValue() == VK_ACCESS_HOST_WRITE_BIT) s += "VK_ACCESS_HOST_WRITE_BIT ";
        if(getValue() == VK_ACCESS_MEMORY_READ_BIT) s += "VK_ACCESS_MEMORY_READ_BIT ";
        if(getValue() == VK_ACCESS_MEMORY_WRITE_BIT) s += "VK_ACCESS_MEMORY_WRITE_BIT ";
        if(getValue() == VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX) s += "VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX ";
        if(getValue() == VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX) s += "VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX ";
        if(getValue() == VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT) s += "VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkAccessFlagBits implements cz.mg.collections.array.ReadonlyArray<VkAccessFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAccessFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAccessFlagBits o){
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
        public VkAccessFlagBits get(int i){
            return new VkAccessFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkAccessFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkAccessFlagBits[] a) {
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
