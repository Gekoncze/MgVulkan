package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompositeAlphaFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanCompositeAlphaFlagBitsKHR extends VulkanFlagBits {
    public static final int COMPOSITE_ALPHA_OPAQUE_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR;
    public static final int COMPOSITE_ALPHA_PRE_MULTIPLIED_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR;
    public static final int COMPOSITE_ALPHA_POST_MULTIPLIED_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR;
    public static final int COMPOSITE_ALPHA_INHERIT_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR;

    public VulkanCompositeAlphaFlagBitsKHR(){
        super(new VkCompositeAlphaFlagBitsKHR());
    }

    public VulkanCompositeAlphaFlagBitsKHR(VkCompositeAlphaFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkCompositeAlphaFlagBitsKHR getVk(){
        return (VkCompositeAlphaFlagBitsKHR) super.getVk();
    }

    public VulkanCompositeAlphaFlagBitsKHR(int value){
        super(new VkCompositeAlphaFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == COMPOSITE_ALPHA_OPAQUE_KHR) s += "COMPOSITE_ALPHA_OPAQUE_KHR";
        if(getValue() == COMPOSITE_ALPHA_PRE_MULTIPLIED_KHR) s += "COMPOSITE_ALPHA_PRE_MULTIPLIED_KHR";
        if(getValue() == COMPOSITE_ALPHA_POST_MULTIPLIED_KHR) s += "COMPOSITE_ALPHA_POST_MULTIPLIED_KHR";
        if(getValue() == COMPOSITE_ALPHA_INHERIT_KHR) s += "COMPOSITE_ALPHA_INHERIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
