package cz.mg.vulkan;

public class VkComponentSwizzle extends VkEnum {
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int VK_COMPONENT_SWIZZLE_ONE = 2;
    public static final int VK_COMPONENT_SWIZZLE_R = 3;
    public static final int VK_COMPONENT_SWIZZLE_G = 4;
    public static final int VK_COMPONENT_SWIZZLE_B = 5;
    public static final int VK_COMPONENT_SWIZZLE_A = 6;

    public VkComponentSwizzle() {
    }

    public VkComponentSwizzle(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkComponentSwizzle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkComponentSwizzle(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COMPONENT_SWIZZLE_IDENTITY) return "VK_COMPONENT_SWIZZLE_IDENTITY";
        if(getValue() == VK_COMPONENT_SWIZZLE_ZERO) return "VK_COMPONENT_SWIZZLE_ZERO";
        if(getValue() == VK_COMPONENT_SWIZZLE_ONE) return "VK_COMPONENT_SWIZZLE_ONE";
        if(getValue() == VK_COMPONENT_SWIZZLE_R) return "VK_COMPONENT_SWIZZLE_R";
        if(getValue() == VK_COMPONENT_SWIZZLE_G) return "VK_COMPONENT_SWIZZLE_G";
        if(getValue() == VK_COMPONENT_SWIZZLE_B) return "VK_COMPONENT_SWIZZLE_B";
        if(getValue() == VK_COMPONENT_SWIZZLE_A) return "VK_COMPONENT_SWIZZLE_A";
        return "UNKNOWN";
    }
}
