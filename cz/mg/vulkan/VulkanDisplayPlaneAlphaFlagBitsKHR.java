package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayPlaneAlphaFlagBitsKHR extends VulkanFlagBits {
    public static final int OPAQUE_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR;
    public static final int GLOBAL_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR;
    public static final int PER_PIXEL_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR;
    public static final int PER_PIXEL_PREMULTIPLIED_KHR = VkDisplayPlaneAlphaFlagBitsKHR.VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR;

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
        if(getValue() == OPAQUE_KHR) s += "OPAQUE_KHR";
        if(getValue() == GLOBAL_KHR) s += "GLOBAL_KHR";
        if(getValue() == PER_PIXEL_KHR) s += "PER_PIXEL_KHR";
        if(getValue() == PER_PIXEL_PREMULTIPLIED_KHR) s += "PER_PIXEL_PREMULTIPLIED_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
