package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBlendFactor extends VulkanEnum {
    public static final int ZERO = VkBlendFactor.VK_BLEND_FACTOR_ZERO;
    public static final int ONE = VkBlendFactor.VK_BLEND_FACTOR_ONE;
    public static final int SRC_COLOR = VkBlendFactor.VK_BLEND_FACTOR_SRC_COLOR;
    public static final int ONE_MINUS_SRC_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR;
    public static final int DST_COLOR = VkBlendFactor.VK_BLEND_FACTOR_DST_COLOR;
    public static final int ONE_MINUS_DST_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR;
    public static final int SRC_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA;
    public static final int ONE_MINUS_SRC_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA;
    public static final int DST_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_DST_ALPHA;
    public static final int ONE_MINUS_DST_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA;
    public static final int CONSTANT_COLOR = VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_COLOR;
    public static final int ONE_MINUS_CONSTANT_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR;
    public static final int CONSTANT_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_ALPHA;
    public static final int ONE_MINUS_CONSTANT_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA;
    public static final int SRC_ALPHA_SATURATE = VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA_SATURATE;
    public static final int SRC1_COLOR = VkBlendFactor.VK_BLEND_FACTOR_SRC1_COLOR;
    public static final int ONE_MINUS_SRC1_COLOR = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR;
    public static final int SRC1_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_SRC1_ALPHA;
    public static final int ONE_MINUS_SRC1_ALPHA = VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA;

    public VulkanBlendFactor(){
        super(new VkBlendFactor());
    }

    public VulkanBlendFactor(VkBlendFactor vk){
        super(vk);
    }

    @Override
    public VkBlendFactor getVk(){
        return (VkBlendFactor) super.getVk();
    }

    public VulkanBlendFactor(int value){
        super(new VkBlendFactor(value));
    }

    @Override
    public String toString() {
        if(getValue() == ZERO) return "ZERO";
        if(getValue() == ONE) return "ONE";
        if(getValue() == SRC_COLOR) return "SRC_COLOR";
        if(getValue() == ONE_MINUS_SRC_COLOR) return "ONE_MINUS_SRC_COLOR";
        if(getValue() == DST_COLOR) return "DST_COLOR";
        if(getValue() == ONE_MINUS_DST_COLOR) return "ONE_MINUS_DST_COLOR";
        if(getValue() == SRC_ALPHA) return "SRC_ALPHA";
        if(getValue() == ONE_MINUS_SRC_ALPHA) return "ONE_MINUS_SRC_ALPHA";
        if(getValue() == DST_ALPHA) return "DST_ALPHA";
        if(getValue() == ONE_MINUS_DST_ALPHA) return "ONE_MINUS_DST_ALPHA";
        if(getValue() == CONSTANT_COLOR) return "CONSTANT_COLOR";
        if(getValue() == ONE_MINUS_CONSTANT_COLOR) return "ONE_MINUS_CONSTANT_COLOR";
        if(getValue() == CONSTANT_ALPHA) return "CONSTANT_ALPHA";
        if(getValue() == ONE_MINUS_CONSTANT_ALPHA) return "ONE_MINUS_CONSTANT_ALPHA";
        if(getValue() == SRC_ALPHA_SATURATE) return "SRC_ALPHA_SATURATE";
        if(getValue() == SRC1_COLOR) return "SRC1_COLOR";
        if(getValue() == ONE_MINUS_SRC1_COLOR) return "ONE_MINUS_SRC1_COLOR";
        if(getValue() == SRC1_ALPHA) return "SRC1_ALPHA";
        if(getValue() == ONE_MINUS_SRC1_ALPHA) return "ONE_MINUS_SRC1_ALPHA";
        return "UNKNOWN";
    }
}
