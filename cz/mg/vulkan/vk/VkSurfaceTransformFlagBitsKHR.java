package cz.mg.vulkan.vk;

public class VkSurfaceTransformFlagBitsKHR extends VkFlagBits {
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 0x00000001;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 0x00000002;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 0x00000004;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 0x00000008;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 0x00000010;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 0x00000020;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x00000040;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x00000080;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 0x00000100;

    public VkSurfaceTransformFlagBitsKHR() {
    }

    public VkSurfaceTransformFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceTransformFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceTransformFlagBitsKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR) s += "VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR) s += "VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR) s += "VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR) s += "VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR) s += "VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR";
        if(getValue() == VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR) s += "VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
