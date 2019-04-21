package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkImageAspectFlagBits extends VkFlagBits {
    public static final int VK_IMAGE_ASPECT_COLOR_BIT = 0x00000001;
    public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 0x00000002;
    public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 0x00000004;
    public static final int VK_IMAGE_ASPECT_METADATA_BIT = 0x00000008;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = 0x00000010;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = 0x00000020;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = 0x00000040;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT_KHR = VK_IMAGE_ASPECT_PLANE_0_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT_KHR = VK_IMAGE_ASPECT_PLANE_1_BIT;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT_KHR = VK_IMAGE_ASPECT_PLANE_2_BIT;

    public VkImageAspectFlagBits() {
    }

    public VkImageAspectFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageAspectFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageAspectFlagBits(int value) {
        setValue(value);
    }

    public VkImageAspectFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_IMAGE_ASPECT_COLOR_BIT) != 0) s.addLast("VK_IMAGE_ASPECT_COLOR_BIT");
        if((getValue() & VK_IMAGE_ASPECT_DEPTH_BIT) != 0) s.addLast("VK_IMAGE_ASPECT_DEPTH_BIT");
        if((getValue() & VK_IMAGE_ASPECT_STENCIL_BIT) != 0) s.addLast("VK_IMAGE_ASPECT_STENCIL_BIT");
        if((getValue() & VK_IMAGE_ASPECT_METADATA_BIT) != 0) s.addLast("VK_IMAGE_ASPECT_METADATA_BIT");
        if((getValue() & VK_IMAGE_ASPECT_PLANE_0_BIT) != 0) s.addLast("VK_IMAGE_ASPECT_PLANE_0_BIT");
        if((getValue() & VK_IMAGE_ASPECT_PLANE_1_BIT) != 0) s.addLast("VK_IMAGE_ASPECT_PLANE_1_BIT");
        if((getValue() & VK_IMAGE_ASPECT_PLANE_2_BIT) != 0) s.addLast("VK_IMAGE_ASPECT_PLANE_2_BIT");
        if((getValue() & VK_IMAGE_ASPECT_PLANE_0_BIT_KHR) != 0) s.addLast("VK_IMAGE_ASPECT_PLANE_0_BIT_KHR");
        if((getValue() & VK_IMAGE_ASPECT_PLANE_1_BIT_KHR) != 0) s.addLast("VK_IMAGE_ASPECT_PLANE_1_BIT_KHR");
        if((getValue() & VK_IMAGE_ASPECT_PLANE_2_BIT_KHR) != 0) s.addLast("VK_IMAGE_ASPECT_PLANE_2_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
