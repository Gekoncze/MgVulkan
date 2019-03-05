package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkComponentSwizzle;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanComponentSwizzle {
    public static final int IDENTITY = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY;
    public static final int ZERO = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ZERO;
    public static final int ONE = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ONE;
    public static final int R = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_R;
    public static final int G = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_G;
    public static final int B = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_B;
    public static final int A = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A;

    public final VkComponentSwizzle enums;

    public VulkanComponentSwizzle() {
        this(0);
    }

    public VulkanComponentSwizzle(int value) {
        this(new VkComponentSwizzle(value));
    }

    public VulkanComponentSwizzle(VkComponentSwizzle enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkComponentSwizzle.class);
    }
}
