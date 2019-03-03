package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkImageLayout;


public enum VulkanImageLayout {
    UNDEFINED,
    GENERAL,
    COLOR_ATTACHMENT_OPTIMAL,
    DEPTH_STENCIL_ATTACHMENT_OPTIMAL,
    DEPTH_STENCIL_READ_ONLY_OPTIMAL,
    SHADER_READ_ONLY_OPTIMAL,
    TRANSFER_SRC_OPTIMAL,
    TRANSFER_DST_OPTIMAL,
    PREINITIALIZED,
    DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL,
    DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL,
    PRESENT_SRC,
    SHARED_PRESENT;

    public static VulkanImageLayout fromNativeEnum(VkImageLayout e){
        switch(e.value){
            case VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED: return UNDEFINED;
            case VkImageLayout.VK_IMAGE_LAYOUT_GENERAL: return GENERAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL: return COLOR_ATTACHMENT_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL: return DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL: return DEPTH_STENCIL_READ_ONLY_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL: return SHADER_READ_ONLY_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL: return TRANSFER_SRC_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL: return TRANSFER_DST_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED: return PREINITIALIZED;
            case VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL: return DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL: return DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL;
            case VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR: return PRESENT_SRC;
            case VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR: return SHARED_PRESENT;
            default: return null;
        }
    }

    public VkImageLayout toNativeEnum(){
        switch(this){
            case UNDEFINED: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED);
            case GENERAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_GENERAL);
            case COLOR_ATTACHMENT_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);
            case DEPTH_STENCIL_ATTACHMENT_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);
            case DEPTH_STENCIL_READ_ONLY_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL);
            case SHADER_READ_ONLY_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL);
            case TRANSFER_SRC_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL);
            case TRANSFER_DST_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL);
            case PREINITIALIZED: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED);
            case DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL);
            case DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL);
            case PRESENT_SRC: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);
            case SHARED_PRESENT: return new VkImageLayout(VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR);
            default: throw new RuntimeException();
        }
    }
}
