package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkCompareOp
 *  @see <a href = "https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompareOp.html">khronos documentation</a>
 **/
public class VkCompareOp extends Structure {
    public static final int VK_COMPARE_OP_NEVER = 0;
    public static final int VK_COMPARE_OP_LESS = 1;
    public static final int VK_COMPARE_OP_EQUAL = 2;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;
    public static final int VK_COMPARE_OP_GREATER = 4;
    public static final int VK_COMPARE_OP_NOT_EQUAL = 5;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;
    public static final int VK_COMPARE_OP_ALWAYS = 7;

    public int value;

    public VkCompareOp() {
    }

    public VkCompareOp(int value) {
        this.value = value;
    }

    public VkCompareOp(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkCompareOp implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkCompareOp implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
