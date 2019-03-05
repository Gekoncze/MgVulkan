package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkStencilOp;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanStencilOp {
    public static final int KEEP = VkStencilOp.VK_STENCIL_OP_KEEP;
    public static final int ZERO = VkStencilOp.VK_STENCIL_OP_ZERO;
    public static final int REPLACE = VkStencilOp.VK_STENCIL_OP_REPLACE;
    public static final int INCREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_CLAMP;
    public static final int DECREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_CLAMP;
    public static final int INVERT = VkStencilOp.VK_STENCIL_OP_INVERT;
    public static final int INCREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_WRAP;
    public static final int DECREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP;

    public final VkStencilOp enums;

    public VulkanStencilOp() {
        this(0);
    }

    public VulkanStencilOp(int value) {
        this(new VkStencilOp(value));
    }

    public VulkanStencilOp(VkStencilOp enums) {
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
        return ToString.constantToString(enums.value, VkStencilOp.class);
    }
}
