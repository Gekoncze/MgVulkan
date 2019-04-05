package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanStencilOp extends VulkanEnum {
    public static final int KEEP = VkStencilOp.VK_STENCIL_OP_KEEP;
    public static final int ZERO = VkStencilOp.VK_STENCIL_OP_ZERO;
    public static final int REPLACE = VkStencilOp.VK_STENCIL_OP_REPLACE;
    public static final int INCREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_CLAMP;
    public static final int DECREMENT_AND_CLAMP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_CLAMP;
    public static final int INVERT = VkStencilOp.VK_STENCIL_OP_INVERT;
    public static final int INCREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_WRAP;
    public static final int DECREMENT_AND_WRAP = VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP;

    public VulkanStencilOp(){
        super(new VkStencilOp());
    }

    public VulkanStencilOp(VkStencilOp vk){
        super(vk);
    }

    @Override
    public VkStencilOp getVk(){
        return (VkStencilOp) super.getVk();
    }

    public VulkanStencilOp(int value){
        super(new VkStencilOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == KEEP) return "KEEP";
        if(getValue() == ZERO) return "ZERO";
        if(getValue() == REPLACE) return "REPLACE";
        if(getValue() == INCREMENT_AND_CLAMP) return "INCREMENT_AND_CLAMP";
        if(getValue() == DECREMENT_AND_CLAMP) return "DECREMENT_AND_CLAMP";
        if(getValue() == INVERT) return "INVERT";
        if(getValue() == INCREMENT_AND_WRAP) return "INCREMENT_AND_WRAP";
        if(getValue() == DECREMENT_AND_WRAP) return "DECREMENT_AND_WRAP";
        return "UNKNOWN";
    }
}
