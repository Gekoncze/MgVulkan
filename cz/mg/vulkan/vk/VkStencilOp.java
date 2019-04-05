package cz.mg.vulkan.vk;

public class VkStencilOp extends VkEnum {
    public static final int VK_STENCIL_OP_KEEP = 0;
    public static final int VK_STENCIL_OP_ZERO = 1;
    public static final int VK_STENCIL_OP_REPLACE = 2;
    public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;
    public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;
    public static final int VK_STENCIL_OP_INVERT = 5;
    public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;
    public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;

    public VkStencilOp() {
    }

    public VkStencilOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkStencilOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkStencilOp(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_STENCIL_OP_KEEP) return "VK_STENCIL_OP_KEEP";
        if(getValue() == VK_STENCIL_OP_ZERO) return "VK_STENCIL_OP_ZERO";
        if(getValue() == VK_STENCIL_OP_REPLACE) return "VK_STENCIL_OP_REPLACE";
        if(getValue() == VK_STENCIL_OP_INCREMENT_AND_CLAMP) return "VK_STENCIL_OP_INCREMENT_AND_CLAMP";
        if(getValue() == VK_STENCIL_OP_DECREMENT_AND_CLAMP) return "VK_STENCIL_OP_DECREMENT_AND_CLAMP";
        if(getValue() == VK_STENCIL_OP_INVERT) return "VK_STENCIL_OP_INVERT";
        if(getValue() == VK_STENCIL_OP_INCREMENT_AND_WRAP) return "VK_STENCIL_OP_INCREMENT_AND_WRAP";
        if(getValue() == VK_STENCIL_OP_DECREMENT_AND_WRAP) return "VK_STENCIL_OP_DECREMENT_AND_WRAP";
        return "UNKNOWN";
    }
}
