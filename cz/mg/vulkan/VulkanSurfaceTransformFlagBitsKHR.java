package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceTransformFlagBitsKHR extends VulkanFlagBits {
    public static final int IDENTITY_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
    public static final int ROTATE_90_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR;
    public static final int ROTATE_180_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR;
    public static final int ROTATE_270_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR;
    public static final int HORIZONTAL_MIRROR_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR;
    public static final int HORIZONTAL_MIRROR_ROTATE_90_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR;
    public static final int HORIZONTAL_MIRROR_ROTATE_180_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR;
    public static final int HORIZONTAL_MIRROR_ROTATE_270_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR;
    public static final int INHERIT_KHR = VkSurfaceTransformFlagBitsKHR.VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR;

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
        if(getValue() == IDENTITY_KHR) s += "IDENTITY_KHR";
        if(getValue() == ROTATE_90_KHR) s += "ROTATE_90_KHR";
        if(getValue() == ROTATE_180_KHR) s += "ROTATE_180_KHR";
        if(getValue() == ROTATE_270_KHR) s += "ROTATE_270_KHR";
        if(getValue() == HORIZONTAL_MIRROR_KHR) s += "HORIZONTAL_MIRROR_KHR";
        if(getValue() == HORIZONTAL_MIRROR_ROTATE_90_KHR) s += "HORIZONTAL_MIRROR_ROTATE_90_KHR";
        if(getValue() == HORIZONTAL_MIRROR_ROTATE_180_KHR) s += "HORIZONTAL_MIRROR_ROTATE_180_KHR";
        if(getValue() == HORIZONTAL_MIRROR_ROTATE_270_KHR) s += "HORIZONTAL_MIRROR_ROTATE_270_KHR";
        if(getValue() == INHERIT_KHR) s += "INHERIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
