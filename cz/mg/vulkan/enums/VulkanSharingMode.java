package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkSharingMode;


public enum VulkanSharingMode {
    EXCLUSIVE,
    CONCURRENT;

    public static VulkanSharingMode fromNativeEnum(VkSharingMode e){
        switch(e.value){
            case VkSharingMode.VK_SHARING_MODE_EXCLUSIVE: return EXCLUSIVE;
            case VkSharingMode.VK_SHARING_MODE_CONCURRENT: return CONCURRENT;
            default: return null;
        }
    }

    public VkSharingMode toNativeEnum(){
        switch(this){
            case EXCLUSIVE: return new VkSharingMode(VkSharingMode.VK_SHARING_MODE_EXCLUSIVE);
            case CONCURRENT: return new VkSharingMode(VkSharingMode.VK_SHARING_MODE_CONCURRENT);
            default: throw new RuntimeException();
        }
    }
}
