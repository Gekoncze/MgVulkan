package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDisplayPlaneAlphaFlagBitsKHR extends VkFlagBits {
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x00000002;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x00000004;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x00000008;

    public VkDisplayPlaneAlphaFlagBitsKHR() {
    }

    protected VkDisplayPlaneAlphaFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayPlaneAlphaFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayPlaneAlphaFlagBitsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDisplayPlaneAlphaFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkDisplayPlaneAlphaFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR) != 0) s.addLast("VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR");
        if((getValue() & VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR) != 0) s.addLast("VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR");
        if((getValue() & VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR) != 0) s.addLast("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR");
        if((getValue() & VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR) != 0) s.addLast("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
