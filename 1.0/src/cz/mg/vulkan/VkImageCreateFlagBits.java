package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkImageCreateFlagBits extends VkFlagBits {
    public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 0x00000001;
    public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002;
    public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 0x00000004;
    public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 0x00000008;
    public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 0x00000010;
    public static final int VK_IMAGE_CREATE_BIND_SFR_BIT_KHX = 0x00000040;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = 0x00000020;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR = 0x00000080;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR = 0x00000100;
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 0x00001000;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT_KHR = 0x00000200;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 0x00000400;

    public VkImageCreateFlagBits() {
    }

    protected VkImageCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageCreateFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkImageCreateFlagBits(int value) {
        setValue(value);
    }

    public VkImageCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_IMAGE_CREATE_SPARSE_BINDING_BIT) != 0) s.addLast("VK_IMAGE_CREATE_SPARSE_BINDING_BIT");
        if((getValue() & VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT) != 0) s.addLast("VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT");
        if((getValue() & VK_IMAGE_CREATE_SPARSE_ALIASED_BIT) != 0) s.addLast("VK_IMAGE_CREATE_SPARSE_ALIASED_BIT");
        if((getValue() & VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT) != 0) s.addLast("VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT");
        if((getValue() & VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT) != 0) s.addLast("VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT");
        if((getValue() & VK_IMAGE_CREATE_BIND_SFR_BIT_KHX) != 0) s.addLast("VK_IMAGE_CREATE_BIND_SFR_BIT_KHX");
        if((getValue() & VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR) != 0) s.addLast("VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR");
        if((getValue() & VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR) != 0) s.addLast("VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR");
        if((getValue() & VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR) != 0) s.addLast("VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR");
        if((getValue() & VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT) != 0) s.addLast("VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT");
        if((getValue() & VK_IMAGE_CREATE_DISJOINT_BIT_KHR) != 0) s.addLast("VK_IMAGE_CREATE_DISJOINT_BIT_KHR");
        if((getValue() & VK_IMAGE_CREATE_ALIAS_BIT_KHR) != 0) s.addLast("VK_IMAGE_CREATE_ALIAS_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
