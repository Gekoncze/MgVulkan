package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkComponentSwizzle.html">khronos documentation</a>
 **/
public class VulkanComponentSwizzle extends VulkanEnum {
    public static final int IDENTITY = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY;
    public static final int ZERO = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ZERO;
    public static final int ONE = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ONE;
    public static final int R = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_R;
    public static final int G = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_G;
    public static final int B = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_B;
    public static final int A = VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A;

    public VulkanComponentSwizzle(){
        super(new VkComponentSwizzle());
    }

    public VulkanComponentSwizzle(VkComponentSwizzle vk){
        super(vk);
    }

    @Override
    public VkComponentSwizzle getVk(){
        return (VkComponentSwizzle) super.getVk();
    }

    public VulkanComponentSwizzle(int value){
        super(new VkComponentSwizzle(value));
    }

    @Override
    public String toString() {
        if(getValue() == IDENTITY) return "IDENTITY";
        if(getValue() == ZERO) return "ZERO";
        if(getValue() == ONE) return "ONE";
        if(getValue() == R) return "R";
        if(getValue() == G) return "G";
        if(getValue() == B) return "B";
        if(getValue() == A) return "A";
        return "UNKNOWN";
    }
}
