package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPlaneAlphaFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayPlaneAlphaFlagBitsKHR extends VulkanFlagBits {
    public static final int DISPLAY_PLANE_ALPHA_OPAQUE_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR;
    public static final int DISPLAY_PLANE_ALPHA_GLOBAL_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR;
    public static final int DISPLAY_PLANE_ALPHA_PER_PIXEL_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR;
    public static final int DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR;

    public VulkanDisplayPlaneAlphaFlagBitsKHR(){
        super(new VkDisplayPlaneAlphaFlagBitsKHR());
    }

    public VulkanDisplayPlaneAlphaFlagBitsKHR(VkDisplayPlaneAlphaFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPlaneAlphaFlagBitsKHR getVk(){
        return (VkDisplayPlaneAlphaFlagBitsKHR) super.getVk();
    }

    public VulkanDisplayPlaneAlphaFlagBitsKHR(int value){
        super(new VkDisplayPlaneAlphaFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DISPLAY_PLANE_ALPHA_OPAQUE_KHR) s += "DISPLAY_PLANE_ALPHA_OPAQUE_KHR";
        if(getValue() == DISPLAY_PLANE_ALPHA_GLOBAL_KHR) s += "DISPLAY_PLANE_ALPHA_GLOBAL_KHR";
        if(getValue() == DISPLAY_PLANE_ALPHA_PER_PIXEL_KHR) s += "DISPLAY_PLANE_ALPHA_PER_PIXEL_KHR";
        if(getValue() == DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_KHR) s += "DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
