package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkImageViewType;


public enum VulkanImageViewType {
    D1,
    D2,
    D3,
    CUBE,
    D1_ARRAY,
    D2_ARRAY,
    CUBE_ARRAY;

    public static VulkanImageViewType fromNativeEnum(VkImageViewType e){
        switch(e.value){
            case VkImageViewType.VK_IMAGE_VIEW_TYPE_1D: return D1;
            case VkImageViewType.VK_IMAGE_VIEW_TYPE_2D: return D2;
            case VkImageViewType.VK_IMAGE_VIEW_TYPE_3D: return D3;
            case VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE: return CUBE;
            case VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY: return D1_ARRAY;
            case VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY: return D2_ARRAY;
            case VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY: return CUBE_ARRAY;
            default: return null;
        }
    }

    public VkImageViewType toNativeEnum(){
        switch(this){
            case D1: return new VkImageViewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_1D);
            case D2: return new VkImageViewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_2D);
            case D3: return new VkImageViewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_3D);
            case CUBE: return new VkImageViewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE);
            case D1_ARRAY: return new VkImageViewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY);
            case D2_ARRAY: return new VkImageViewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY);
            case CUBE_ARRAY: return new VkImageViewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY);
            default: throw new RuntimeException();
        }
    }
}
