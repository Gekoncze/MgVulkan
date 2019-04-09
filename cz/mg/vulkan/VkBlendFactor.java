package cz.mg.vulkan;

public class VkBlendFactor extends VkEnum {
    public static final int VK_BLEND_FACTOR_ZERO = 0;
    public static final int VK_BLEND_FACTOR_ONE = 1;
    public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;
    public static final int VK_BLEND_FACTOR_DST_COLOR = 4;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;
    public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;
    public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;
    public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;
    public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;
    public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;

    public VkBlendFactor() {
    }

    public VkBlendFactor(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBlendFactor(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBlendFactor(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_BLEND_FACTOR_ZERO) return "VK_BLEND_FACTOR_ZERO";
        if(getValue() == VK_BLEND_FACTOR_ONE) return "VK_BLEND_FACTOR_ONE";
        if(getValue() == VK_BLEND_FACTOR_SRC_COLOR) return "VK_BLEND_FACTOR_SRC_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR";
        if(getValue() == VK_BLEND_FACTOR_DST_COLOR) return "VK_BLEND_FACTOR_DST_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR";
        if(getValue() == VK_BLEND_FACTOR_SRC_ALPHA) return "VK_BLEND_FACTOR_SRC_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_DST_ALPHA) return "VK_BLEND_FACTOR_DST_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_CONSTANT_COLOR) return "VK_BLEND_FACTOR_CONSTANT_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR";
        if(getValue() == VK_BLEND_FACTOR_CONSTANT_ALPHA) return "VK_BLEND_FACTOR_CONSTANT_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_SRC_ALPHA_SATURATE) return "VK_BLEND_FACTOR_SRC_ALPHA_SATURATE";
        if(getValue() == VK_BLEND_FACTOR_SRC1_COLOR) return "VK_BLEND_FACTOR_SRC1_COLOR";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR) return "VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR";
        if(getValue() == VK_BLEND_FACTOR_SRC1_ALPHA) return "VK_BLEND_FACTOR_SRC1_ALPHA";
        if(getValue() == VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA) return "VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA";
        return "UNKNOWN";
    }
}
