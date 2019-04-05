package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanColorComponentFlagBits extends VulkanFlagBits {
    public static final int R = VkColorComponentFlagBits.VK_COLOR_COMPONENT_R_BIT;
    public static final int G = VkColorComponentFlagBits.VK_COLOR_COMPONENT_G_BIT;
    public static final int B = VkColorComponentFlagBits.VK_COLOR_COMPONENT_B_BIT;
    public static final int A = VkColorComponentFlagBits.VK_COLOR_COMPONENT_A_BIT;

    public VulkanColorComponentFlagBits(){
        super(new VkColorComponentFlagBits());
    }

    public VulkanColorComponentFlagBits(VkColorComponentFlagBits vk){
        super(vk);
    }

    @Override
    public VkColorComponentFlagBits getVk(){
        return (VkColorComponentFlagBits) super.getVk();
    }

    public VulkanColorComponentFlagBits(int value){
        super(new VkColorComponentFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == R) s += "R";
        if(getValue() == G) s += "G";
        if(getValue() == B) s += "B";
        if(getValue() == A) s += "A";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
