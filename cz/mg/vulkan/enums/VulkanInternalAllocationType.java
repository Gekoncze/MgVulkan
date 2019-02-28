package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkInternalAllocationType;


public enum VulkanInternalAllocationType {
    EXECUTABLE;

    public static VulkanInternalAllocationType fromNativeEnum(VkInternalAllocationType e){
        switch(e.value){
            case VkInternalAllocationType.VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE: return EXECUTABLE;
            default: return null;
        }
    }
}
