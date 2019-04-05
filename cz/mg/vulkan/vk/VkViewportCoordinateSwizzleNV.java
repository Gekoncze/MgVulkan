package cz.mg.vulkan.vk;

public class VkViewportCoordinateSwizzleNV extends VkEnum {
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV = 0;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV = 1;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV = 2;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV = 3;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV = 4;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV = 5;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV = 6;
    public static final int VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV = 7;

    public VkViewportCoordinateSwizzleNV() {
    }

    public VkViewportCoordinateSwizzleNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkViewportCoordinateSwizzleNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkViewportCoordinateSwizzleNV(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV";
        if(getValue() == VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV) return "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV";
        return "UNKNOWN";
    }
}
