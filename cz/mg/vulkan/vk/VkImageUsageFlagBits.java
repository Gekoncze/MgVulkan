package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageUsageFlagBits.html">khronos documentation</a>
 **/
public class VkImageUsageFlagBits extends VkFlagBits {
    public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 0x00000001;
    public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 0x00000002;
    public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 0x00000004;
    public static final int VK_IMAGE_USAGE_STORAGE_BIT = 0x00000008;
    public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 0x00000010;
    public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000020;
    public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 0x00000040;
    public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 0x00000080;

    public VkImageUsageFlagBits() {
    }

    public VkImageUsageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageUsageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageUsageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_IMAGE_USAGE_TRANSFER_SRC_BIT) s += "VK_IMAGE_USAGE_TRANSFER_SRC_BIT ";
        if(getValue() == VK_IMAGE_USAGE_TRANSFER_DST_BIT) s += "VK_IMAGE_USAGE_TRANSFER_DST_BIT ";
        if(getValue() == VK_IMAGE_USAGE_SAMPLED_BIT) s += "VK_IMAGE_USAGE_SAMPLED_BIT ";
        if(getValue() == VK_IMAGE_USAGE_STORAGE_BIT) s += "VK_IMAGE_USAGE_STORAGE_BIT ";
        if(getValue() == VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT ";
        if(getValue() == VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT ";
        if(getValue() == VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT ";
        if(getValue() == VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT) s += "VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkImageUsageFlagBits implements cz.mg.collections.array.ReadonlyArray<VkImageUsageFlagBits> {
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
        public VkImageUsageFlagBits get(int i){
            return new VkImageUsageFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkImageUsageFlagBits[] a) {
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
