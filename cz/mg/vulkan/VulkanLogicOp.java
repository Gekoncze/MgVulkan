package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkLogicOp.html">khronos documentation</a>
 **/
public class VulkanLogicOp extends VulkanEnum {
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

    public VulkanLogicOp(){
        super(new VkLogicOp());
    }

    public VulkanLogicOp(VkLogicOp vk){
        super(vk);
    }

    @Override
    public VkLogicOp getVk(){
        return (VkLogicOp) super.getVk();
    }

    public VulkanLogicOp(int value){
        super(new VkLogicOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == CLEAR) return "CLEAR";
        if(getValue() == AND) return "AND";
        if(getValue() == AND_REVERSE) return "AND_REVERSE";
        if(getValue() == COPY) return "COPY";
        if(getValue() == AND_INVERTED) return "AND_INVERTED";
        if(getValue() == NO_OP) return "NO_OP";
        if(getValue() == XOR) return "XOR";
        if(getValue() == OR) return "OR";
        if(getValue() == NOR) return "NOR";
        if(getValue() == EQUIVALENT) return "EQUIVALENT";
        if(getValue() == INVERT) return "INVERT";
        if(getValue() == OR_REVERSE) return "OR_REVERSE";
        if(getValue() == COPY_INVERTED) return "COPY_INVERTED";
        if(getValue() == OR_INVERTED) return "OR_INVERTED";
        if(getValue() == NAND) return "NAND";
        if(getValue() == SET) return "SET";
        return "UNKNOWN";
    }

    public static class Array extends VulkanLogicOp implements cz.mg.collections.array.ReadonlyArray<VulkanLogicOp> {
        public Array(VkLogicOp.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkLogicOp.Array(count));
        }

        public Array(int count, VulkanLogicOp o){
            this(new VkLogicOp.Array(count, o.getVk()));
        }

        @Override
        public VkLogicOp.Array getVk(){
            return (VkLogicOp.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanLogicOp get(int i){
            return new VulkanLogicOp(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkLogicOp.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkLogicOp.Pointer());
        }

        public Pointer(long value) {
            this(new VkLogicOp.Pointer(value));
        }

        @Override
        public VkLogicOp.Pointer getVk(){
            return (VkLogicOp.Pointer) super.getVk();
        }

        public static class Array extends VulkanLogicOp.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanLogicOp.Pointer> {
            public Array(int count) {
                super(new VkLogicOp.Pointer.Array(count));
            }

            public Array(VulkanLogicOp[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkLogicOp.Pointer.Array getVk(){
                return (VkLogicOp.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanLogicOp.Pointer get(int i){
                return new VulkanLogicOp.Pointer(getVk().get(i));
            }
        }
    }
}
