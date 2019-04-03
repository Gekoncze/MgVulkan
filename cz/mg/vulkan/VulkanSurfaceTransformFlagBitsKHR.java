package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceTransformFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanSurfaceTransformFlagBitsKHR extends VulkanFlagBits {
    public static final int SURFACE_TRANSFORM_IDENTITY_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
    public static final int SURFACE_TRANSFORM_ROTATE_90_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR;
    public static final int SURFACE_TRANSFORM_ROTATE_180_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR;
    public static final int SURFACE_TRANSFORM_ROTATE_270_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR;
    public static final int SURFACE_TRANSFORM_INHERIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR;

    public VulkanSurfaceTransformFlagBitsKHR(){
        super(new VkSurfaceTransformFlagBitsKHR());
    }

    public VulkanSurfaceTransformFlagBitsKHR(VkSurfaceTransformFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceTransformFlagBitsKHR getVk(){
        return (VkSurfaceTransformFlagBitsKHR) super.getVk();
    }

    public VulkanSurfaceTransformFlagBitsKHR(int value){
        super(new VkSurfaceTransformFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SURFACE_TRANSFORM_IDENTITY_KHR) s += "SURFACE_TRANSFORM_IDENTITY_KHR";
        if(getValue() == SURFACE_TRANSFORM_ROTATE_90_KHR) s += "SURFACE_TRANSFORM_ROTATE_90_KHR";
        if(getValue() == SURFACE_TRANSFORM_ROTATE_180_KHR) s += "SURFACE_TRANSFORM_ROTATE_180_KHR";
        if(getValue() == SURFACE_TRANSFORM_ROTATE_270_KHR) s += "SURFACE_TRANSFORM_ROTATE_270_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_KHR";
        if(getValue() == SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_KHR) s += "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_KHR";
        if(getValue() == SURFACE_TRANSFORM_INHERIT_KHR) s += "SURFACE_TRANSFORM_INHERIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
