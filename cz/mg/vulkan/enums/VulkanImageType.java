package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkImageType;


public enum VulkanImageType {
    D1,
    D2,
    D3;

    public static VulkanImageType fromNativeEnum(VkImageType e){
        switch(e.value){
            case VkImageType.VK_IMAGE_TYPE_1D: return D1;
            case VkImageType.VK_IMAGE_TYPE_2D: return D2;
            case VkImageType.VK_IMAGE_TYPE_3D: return D3;
            default: return null;
        }
    }

    public VkImageType toNativeEnum(){
        switch(this){
            case D1: return new VkImageType(VkImageType.VK_IMAGE_TYPE_1D);
            case D2: return new VkImageType(VkImageType.VK_IMAGE_TYPE_2D);
            case D3: return new VkImageType(VkImageType.VK_IMAGE_TYPE_3D);
            default: throw new RuntimeException();
        }
    }
}
