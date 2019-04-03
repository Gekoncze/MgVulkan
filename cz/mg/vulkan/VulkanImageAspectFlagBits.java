package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageAspectFlagBits.html">khronos documentation</a>
 **/
public class VulkanImageAspectFlagBits extends VulkanFlagBits {
    public static final int COLOR = VkImageAspectFlagBits.VK_IMAGE_ASPECT_COLOR_BIT;
    public static final int DEPTH = VkImageAspectFlagBits.VK_IMAGE_ASPECT_DEPTH_BIT;
    public static final int STENCIL = VkImageAspectFlagBits.VK_IMAGE_ASPECT_STENCIL_BIT;
    public static final int METADATA = VkImageAspectFlagBits.VK_IMAGE_ASPECT_METADATA_BIT;
    public static final int PLANE_0 = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT;
    public static final int PLANE_1 = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT;
    public static final int PLANE_2 = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT;
    public static final int PLANE_0_KHR = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT_KHR;
    public static final int PLANE_1_KHR = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT_KHR;
    public static final int PLANE_2_KHR = VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT_KHR;

    public VulkanImageAspectFlagBits(){
        super(new VkImageAspectFlagBits());
    }

    public VulkanImageAspectFlagBits(VkImageAspectFlagBits vk){
        super(vk);
    }

    @Override
    public VkImageAspectFlagBits getVk(){
        return (VkImageAspectFlagBits) super.getVk();
    }

    public VulkanImageAspectFlagBits(int value){
        super(new VkImageAspectFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == COLOR) s += "COLOR";
        if(getValue() == DEPTH) s += "DEPTH";
        if(getValue() == STENCIL) s += "STENCIL";
        if(getValue() == METADATA) s += "METADATA";
        if(getValue() == PLANE_0) s += "PLANE_0";
        if(getValue() == PLANE_1) s += "PLANE_1";
        if(getValue() == PLANE_2) s += "PLANE_2";
        if(getValue() == PLANE_0_KHR) s += "PLANE_0_KHR";
        if(getValue() == PLANE_1_KHR) s += "PLANE_1_KHR";
        if(getValue() == PLANE_2_KHR) s += "PLANE_2_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
