package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageLayout.html">khronos documentation</a>
 **/
public class VulkanImageLayout extends VulkanEnum {
    public static final int UNDEFINED = VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED;
    public static final int GENERAL = VkImageLayout.VK_IMAGE_LAYOUT_GENERAL;
    public static final int COLOR_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    public static final int DEPTH_STENCIL_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
    public static final int DEPTH_STENCIL_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;
    public static final int SHADER_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
    public static final int TRANSFER_SRC_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    public static final int TRANSFER_DST_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    public static final int PREINITIALIZED = VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED;
    public static final int DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL;
    public static final int DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL;
    public static final int PRESENT_SRC_KHR = VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR;
    public static final int SHARED_PRESENT_KHR = VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR;
    public static final int DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR;
    public static final int DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR;

    public VulkanImageLayout(){
        super(new VkImageLayout());
    }

    public VulkanImageLayout(VkImageLayout vk){
        super(vk);
    }

    @Override
    public VkImageLayout getVk(){
        return (VkImageLayout) super.getVk();
    }

    public VulkanImageLayout(int value){
        super(new VkImageLayout(value));
    }

    @Override
    public String toString() {
        if(getValue() == UNDEFINED) return "UNDEFINED";
        if(getValue() == GENERAL) return "GENERAL";
        if(getValue() == COLOR_ATTACHMENT_OPTIMAL) return "COLOR_ATTACHMENT_OPTIMAL";
        if(getValue() == DEPTH_STENCIL_ATTACHMENT_OPTIMAL) return "DEPTH_STENCIL_ATTACHMENT_OPTIMAL";
        if(getValue() == DEPTH_STENCIL_READ_ONLY_OPTIMAL) return "DEPTH_STENCIL_READ_ONLY_OPTIMAL";
        if(getValue() == SHADER_READ_ONLY_OPTIMAL) return "SHADER_READ_ONLY_OPTIMAL";
        if(getValue() == TRANSFER_SRC_OPTIMAL) return "TRANSFER_SRC_OPTIMAL";
        if(getValue() == TRANSFER_DST_OPTIMAL) return "TRANSFER_DST_OPTIMAL";
        if(getValue() == PREINITIALIZED) return "PREINITIALIZED";
        if(getValue() == DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL) return "DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL";
        if(getValue() == DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL) return "DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL";
        if(getValue() == PRESENT_SRC_KHR) return "PRESENT_SRC_KHR";
        if(getValue() == SHARED_PRESENT_KHR) return "SHARED_PRESENT_KHR";
        if(getValue() == DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR) return "DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR";
        if(getValue() == DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR) return "DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR";
        return "UNKNOWN";
    }
}
