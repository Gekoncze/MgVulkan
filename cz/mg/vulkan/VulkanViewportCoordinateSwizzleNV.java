package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkViewportCoordinateSwizzleNV.html">khronos documentation</a>
 **/
public class VulkanViewportCoordinateSwizzleNV extends VulkanEnum {
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV;
    public static final int VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV = VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV;

    public VulkanViewportCoordinateSwizzleNV(){
        super(new VkViewportCoordinateSwizzleNV());
    }

    public VulkanViewportCoordinateSwizzleNV(VkViewportCoordinateSwizzleNV vk){
        super(vk);
    }

    @Override
    public VkViewportCoordinateSwizzleNV getVk(){
        return (VkViewportCoordinateSwizzleNV) super.getVk();
    }

    public VulkanViewportCoordinateSwizzleNV(int value){
        super(new VkViewportCoordinateSwizzleNV(value));
    }

    @Override
    public String toString() {
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV) return "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV";
        if(getValue() == VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV) return "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV";
        return "UNKNOWN";
    }
}
