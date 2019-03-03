package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkComponentSwizzle;


public enum VulkanComponentSwizzle {
    IDENTITY,
    ZERO,
    ONE,
    R,
    G,
    B,
    A;

    public static VulkanComponentSwizzle fromNativeEnum(VkComponentSwizzle e){
        switch(e.value){
            case VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY: return IDENTITY;
            case VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ZERO: return ZERO;
            case VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ONE: return ONE;
            case VkComponentSwizzle.VK_COMPONENT_SWIZZLE_R: return R;
            case VkComponentSwizzle.VK_COMPONENT_SWIZZLE_G: return G;
            case VkComponentSwizzle.VK_COMPONENT_SWIZZLE_B: return B;
            case VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A: return A;
            default: return null;
        }
    }

    public VkComponentSwizzle toNativeEnum(){
        switch(this){
            case IDENTITY: return new VkComponentSwizzle(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
            case ZERO: return new VkComponentSwizzle(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ZERO);
            case ONE: return new VkComponentSwizzle(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ONE);
            case R: return new VkComponentSwizzle(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_R);
            case G: return new VkComponentSwizzle(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_G);
            case B: return new VkComponentSwizzle(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_B);
            case A: return new VkComponentSwizzle(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A);
            default: throw new RuntimeException();
        }
    }
}
