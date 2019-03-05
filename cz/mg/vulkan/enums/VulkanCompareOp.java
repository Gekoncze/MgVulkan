package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkCompareOp;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanCompareOp {
    public static final int NEVER = VkCompareOp.VK_COMPARE_OP_NEVER;
    public static final int LESS = VkCompareOp.VK_COMPARE_OP_LESS;
    public static final int EQUAL = VkCompareOp.VK_COMPARE_OP_EQUAL;
    public static final int LESS_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_LESS_OR_EQUAL;
    public static final int GREATER = VkCompareOp.VK_COMPARE_OP_GREATER;
    public static final int NOT_EQUAL = VkCompareOp.VK_COMPARE_OP_NOT_EQUAL;
    public static final int GREATER_OR_EQUAL = VkCompareOp.VK_COMPARE_OP_GREATER_OR_EQUAL;
    public static final int ALWAYS = VkCompareOp.VK_COMPARE_OP_ALWAYS;

    public final VkCompareOp enums;

    public VulkanCompareOp() {
        this(0);
    }

    public VulkanCompareOp(int value) {
        this(new VkCompareOp(value));
    }

    public VulkanCompareOp(VkCompareOp enums) {
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
        return ToString.constantToString(enums.value, VkCompareOp.class);
    }
}
