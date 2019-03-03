package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkImageTiling;


public enum VulkanImageTiling {
    OPTIMAL,
    LINEAR;

    public static VulkanImageTiling fromNativeEnum(VkImageTiling e){
        switch(e.value){
            case VkImageTiling.VK_IMAGE_TILING_OPTIMAL: return OPTIMAL;
            case VkImageTiling.VK_IMAGE_TILING_LINEAR: return LINEAR;
            default: return null;
        }
    }

    public VkImageTiling toNativeEnum(){
        switch(this){
            case OPTIMAL: return new VkImageTiling(VkImageTiling.VK_IMAGE_TILING_OPTIMAL);
            case LINEAR: return new VkImageTiling(VkImageTiling.VK_IMAGE_TILING_LINEAR);
            default: throw new RuntimeException();
        }
    }
}
