package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferUsageFlagBits.html">khronos documentation</a>
 **/
public class VkBufferUsageFlagBits extends VkFlagBits {
    public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 0x00000001;
    public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 0x00000002;
    public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000004;
    public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x00000008;
    public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 0x00000010;
    public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 0x00000020;
    public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 0x00000040;
    public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 0x00000080;
    public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 0x00000100;

    public VkBufferUsageFlagBits() {
    }

    public VkBufferUsageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferUsageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferUsageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_BUFFER_USAGE_TRANSFER_SRC_BIT) s += "VK_BUFFER_USAGE_TRANSFER_SRC_BIT ";
        if(getValue() == VK_BUFFER_USAGE_TRANSFER_DST_BIT) s += "VK_BUFFER_USAGE_TRANSFER_DST_BIT ";
        if(getValue() == VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT) s += "VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT ";
        if(getValue() == VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT) s += "VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT ";
        if(getValue() == VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT) s += "VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT ";
        if(getValue() == VK_BUFFER_USAGE_STORAGE_BUFFER_BIT) s += "VK_BUFFER_USAGE_STORAGE_BUFFER_BIT ";
        if(getValue() == VK_BUFFER_USAGE_INDEX_BUFFER_BIT) s += "VK_BUFFER_USAGE_INDEX_BUFFER_BIT ";
        if(getValue() == VK_BUFFER_USAGE_VERTEX_BUFFER_BIT) s += "VK_BUFFER_USAGE_VERTEX_BUFFER_BIT ";
        if(getValue() == VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT) s += "VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkBufferUsageFlagBits implements cz.mg.collections.array.ReadonlyArray<VkBufferUsageFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferUsageFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferUsageFlagBits o){
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
        public VkBufferUsageFlagBits get(int i){
            return new VkBufferUsageFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBufferUsageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkBufferUsageFlagBits[] a) {
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
