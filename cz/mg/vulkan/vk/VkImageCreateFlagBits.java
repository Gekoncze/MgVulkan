package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCreateFlagBits.html">khronos documentation</a>
 **/
public class VkImageCreateFlagBits extends VkFlagBits {
    public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 0x00000001;
    public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002;
    public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 0x00000004;
    public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 0x00000008;
    public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 0x00000010;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT = 0x00000400;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 0x00000040;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = 0x00000020;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 0x00000080;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT = 0x00000100;
    public static final int VK_IMAGE_CREATE_PROTECTED_BIT = 0x00000800;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT = 0x00000200;
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 0x00001000;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR = VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR = VK_IMAGE_CREATE_EXTENDED_USAGE_BIT;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT_KHR = VK_IMAGE_CREATE_DISJOINT_BIT;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = VK_IMAGE_CREATE_ALIAS_BIT;

    public VkImageCreateFlagBits() {
    }

    public VkImageCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_IMAGE_CREATE_SPARSE_BINDING_BIT) s += "VK_IMAGE_CREATE_SPARSE_BINDING_BIT ";
        if(getValue() == VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT) s += "VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT ";
        if(getValue() == VK_IMAGE_CREATE_SPARSE_ALIASED_BIT) s += "VK_IMAGE_CREATE_SPARSE_ALIASED_BIT ";
        if(getValue() == VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT) s += "VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT ";
        if(getValue() == VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT) s += "VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT ";
        if(getValue() == VK_IMAGE_CREATE_ALIAS_BIT) s += "VK_IMAGE_CREATE_ALIAS_BIT ";
        if(getValue() == VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT) s += "VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT ";
        if(getValue() == VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT) s += "VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT ";
        if(getValue() == VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT) s += "VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT ";
        if(getValue() == VK_IMAGE_CREATE_EXTENDED_USAGE_BIT) s += "VK_IMAGE_CREATE_EXTENDED_USAGE_BIT ";
        if(getValue() == VK_IMAGE_CREATE_PROTECTED_BIT) s += "VK_IMAGE_CREATE_PROTECTED_BIT ";
        if(getValue() == VK_IMAGE_CREATE_DISJOINT_BIT) s += "VK_IMAGE_CREATE_DISJOINT_BIT ";
        if(getValue() == VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT) s += "VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT ";
        if(getValue() == VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR) s += "VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR ";
        if(getValue() == VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR) s += "VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR ";
        if(getValue() == VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR) s += "VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR ";
        if(getValue() == VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR) s += "VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR ";
        if(getValue() == VK_IMAGE_CREATE_DISJOINT_BIT_KHR) s += "VK_IMAGE_CREATE_DISJOINT_BIT_KHR ";
        if(getValue() == VK_IMAGE_CREATE_ALIAS_BIT_KHR) s += "VK_IMAGE_CREATE_ALIAS_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkImageCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VkImageCreateFlagBits> {
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
        public VkImageCreateFlagBits get(int i){
            return new VkImageCreateFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkImageCreateFlagBits[] a) {
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
