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

    public VkInternalAllocationType toNativeEnum(){
        switch(this){
            case EXECUTABLE: return new VkInternalAllocationType(VkInternalAllocationType.VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE);
            default: throw new RuntimeException();
        }
    }
}
