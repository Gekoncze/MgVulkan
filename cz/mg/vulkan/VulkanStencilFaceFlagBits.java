package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilFaceFlagBits.html">khronos documentation</a>
 **/
public class VulkanStencilFaceFlagBits extends VulkanFlagBits {
    public static final int FRONT = VkStencilFaceFlagBits.VK_STENCIL_FACE_FRONT_BIT;
    public static final int BACK = VkStencilFaceFlagBits.VK_STENCIL_FACE_BACK_BIT;
    public static final int STENCIL_FRONT_AND_BACK = VkStencilFaceFlagBits.VK_STENCIL_FRONT_AND_BACK;

    public VulkanStencilFaceFlagBits(){
        super(new VkStencilFaceFlagBits());
    }

    public VulkanStencilFaceFlagBits(VkStencilFaceFlagBits vk){
        super(vk);
    }

    @Override
    public VkStencilFaceFlagBits getVk(){
        return (VkStencilFaceFlagBits) super.getVk();
    }

    public VulkanStencilFaceFlagBits(int value){
        super(new VkStencilFaceFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == FRONT) s += "FRONT";
        if(getValue() == BACK) s += "BACK";
        if(getValue() == STENCIL_FRONT_AND_BACK) s += "STENCIL_FRONT_AND_BACK";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
