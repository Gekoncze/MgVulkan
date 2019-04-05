package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCompareOp extends VulkanEnum {
    public static final int NEVER = VkCompareOp.VK_COMPARE_OP_NEVER;
    public static final int LESS = VkCompareOp.VK_COMPARE_OP_LESS;
    public static final int EQUAL = VkCompareOp.VK_COMPARE_OP_EQUAL;
    public static final int LESS_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_LESS_OR_EQUAL;
    public static final int GREATER = VkCompareOp.VK_COMPARE_OP_GREATER;
    public static final int NOT_EQUAL = VkCompareOp.VK_COMPARE_OP_NOT_EQUAL;
    public static final int GREATER_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_GREATER_OR_EQUAL;
    public static final int ALWAYS = VkCompareOp.VK_COMPARE_OP_ALWAYS;

    public VulkanCompareOp(){
        super(new VkCompareOp());
    }

    public VulkanCompareOp(VkCompareOp vk){
        super(vk);
    }

    @Override
    public VkCompareOp getVk(){
        return (VkCompareOp) super.getVk();
    }

    public VulkanCompareOp(int value){
        super(new VkCompareOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == NEVER) return "NEVER";
        if(getValue() == LESS) return "LESS";
        if(getValue() == EQUAL) return "EQUAL";
        if(getValue() == LESS_OR_EQUAL) return "LESS_OR_EQUAL";
        if(getValue() == GREATER) return "GREATER";
        if(getValue() == NOT_EQUAL) return "NOT_EQUAL";
        if(getValue() == GREATER_OR_EQUAL) return "GREATER_OR_EQUAL";
        if(getValue() == ALWAYS) return "ALWAYS";
        return "UNKNOWN";
    }
}
