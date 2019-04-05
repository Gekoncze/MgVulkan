package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSubpassDescriptionFlagBits extends VulkanFlagBits {
    public static final int PER_VIEW_ATTRIBUTES_NVX = VkSubpassDescriptionFlagBits.VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX;
    public static final int PER_VIEW_POSITION_X_ONLY_NVX = VkSubpassDescriptionFlagBits.VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX;

    public VulkanSubpassDescriptionFlagBits(){
        super(new VkSubpassDescriptionFlagBits());
    }

    public VulkanSubpassDescriptionFlagBits(VkSubpassDescriptionFlagBits vk){
        super(vk);
    }

    @Override
    public VkSubpassDescriptionFlagBits getVk(){
        return (VkSubpassDescriptionFlagBits) super.getVk();
    }

    public VulkanSubpassDescriptionFlagBits(int value){
        super(new VkSubpassDescriptionFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PER_VIEW_ATTRIBUTES_NVX) s += "PER_VIEW_ATTRIBUTES_NVX";
        if(getValue() == PER_VIEW_POSITION_X_ONLY_NVX) s += "PER_VIEW_POSITION_X_ONLY_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
