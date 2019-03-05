package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkLogicOp;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanLogicOp {
    public static final int CLEAR = VkLogicOp.VK_LOGIC_OP_CLEAR;
    public static final int AND = VkLogicOp.VK_LOGIC_OP_AND;
    public static final int AND_REVERSE = VkLogicOp.VK_LOGIC_OP_AND_REVERSE;
    public static final int COPY = VkLogicOp.VK_LOGIC_OP_COPY;
    public static final int AND_INVERTED = VkLogicOp.VK_LOGIC_OP_AND_INVERTED;
    public static final int NO_OP = VkLogicOp.VK_LOGIC_OP_NO_OP;
    public static final int XOR = VkLogicOp.VK_LOGIC_OP_XOR;
    public static final int OR = VkLogicOp.VK_LOGIC_OP_OR;
    public static final int NOR = VkLogicOp.VK_LOGIC_OP_NOR;
    public static final int EQUIVALENT = VkLogicOp.VK_LOGIC_OP_EQUIVALENT;
    public static final int INVERT = VkLogicOp.VK_LOGIC_OP_INVERT;
    public static final int OR_REVERSE = VkLogicOp.VK_LOGIC_OP_OR_REVERSE;
    public static final int COPY_INVERTED = VkLogicOp.VK_LOGIC_OP_COPY_INVERTED;
    public static final int OR_INVERTED = VkLogicOp.VK_LOGIC_OP_OR_INVERTED;
    public static final int NAND = VkLogicOp.VK_LOGIC_OP_NAND;
    public static final int SET = VkLogicOp.VK_LOGIC_OP_SET;

    public final VkLogicOp enums;

    public VulkanLogicOp() {
        this(0);
    }

    public VulkanLogicOp(int value) {
        this(new VkLogicOp(value));
    }

    public VulkanLogicOp(VkLogicOp enums) {
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
        return ToString.constantToString(enums.value, VkLogicOp.class);
    }
}
