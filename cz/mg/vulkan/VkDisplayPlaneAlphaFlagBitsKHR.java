package cz.mg.vulkan;

public class VkDisplayPlaneAlphaFlagBitsKHR extends VkFlagBits {
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x00000002;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x00000004;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x00000008;

    public VkDisplayPlaneAlphaFlagBitsKHR() {
    }

    public VkDisplayPlaneAlphaFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPlaneAlphaFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayPlaneAlphaFlagBitsKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR";
        if(getValue() == VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR) s += "VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
