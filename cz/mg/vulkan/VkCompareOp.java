package cz.mg.vulkan;

public class VkCompareOp extends VkEnum {
    public static final int VK_COMPARE_OP_NEVER = 0;
    public static final int VK_COMPARE_OP_LESS = 1;
    public static final int VK_COMPARE_OP_EQUAL = 2;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;
    public static final int VK_COMPARE_OP_GREATER = 4;
    public static final int VK_COMPARE_OP_NOT_EQUAL = 5;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;
    public static final int VK_COMPARE_OP_ALWAYS = 7;

    public VkCompareOp() {
    }

    public VkCompareOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCompareOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCompareOp(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COMPARE_OP_NEVER) return "VK_COMPARE_OP_NEVER";
        if(getValue() == VK_COMPARE_OP_LESS) return "VK_COMPARE_OP_LESS";
        if(getValue() == VK_COMPARE_OP_EQUAL) return "VK_COMPARE_OP_EQUAL";
        if(getValue() == VK_COMPARE_OP_LESS_OR_EQUAL) return "VK_COMPARE_OP_LESS_OR_EQUAL";
        if(getValue() == VK_COMPARE_OP_GREATER) return "VK_COMPARE_OP_GREATER";
        if(getValue() == VK_COMPARE_OP_NOT_EQUAL) return "VK_COMPARE_OP_NOT_EQUAL";
        if(getValue() == VK_COMPARE_OP_GREATER_OR_EQUAL) return "VK_COMPARE_OP_GREATER_OR_EQUAL";
        if(getValue() == VK_COMPARE_OP_ALWAYS) return "VK_COMPARE_OP_ALWAYS";
        return "UNKNOWN";
    }
}
