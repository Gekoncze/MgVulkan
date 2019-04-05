package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCompositeAlphaFlagBitsKHR extends VulkanFlagBits {
    public static final int OPAQUE_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR;
    public static final int PRE_MULTIPLIED_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR;
    public static final int POST_MULTIPLIED_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR;
    public static final int INHERIT_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR;

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
        if(getValue() == OPAQUE_KHR) s += "OPAQUE_KHR";
        if(getValue() == PRE_MULTIPLIED_KHR) s += "PRE_MULTIPLIED_KHR";
        if(getValue() == POST_MULTIPLIED_KHR) s += "POST_MULTIPLIED_KHR";
        if(getValue() == INHERIT_KHR) s += "INHERIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
