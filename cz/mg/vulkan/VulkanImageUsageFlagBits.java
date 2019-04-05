package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageUsageFlagBits extends VulkanFlagBits {
    public static final int TRANSFER_SRC = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_SRC_BIT;
    public static final int TRANSFER_DST = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_DST_BIT;
    public static final int SAMPLED = VkImageUsageFlagBits.VK_IMAGE_USAGE_SAMPLED_BIT;
    public static final int STORAGE = VkImageUsageFlagBits.VK_IMAGE_USAGE_STORAGE_BIT;
    public static final int COLOR_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
    public static final int DEPTH_STENCIL_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT;
    public static final int TRANSIENT_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT;
    public static final int INPUT_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT;

    public VulkanImageUsageFlagBits(){
        super(new VkImageUsageFlagBits());
    }

    public VulkanImageUsageFlagBits(VkImageUsageFlagBits vk){
        super(vk);
    }

    @Override
    public VkImageUsageFlagBits getVk(){
        return (VkImageUsageFlagBits) super.getVk();
    }

    public VulkanImageUsageFlagBits(int value){
        super(new VkImageUsageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TRANSFER_SRC) s += "TRANSFER_SRC";
        if(getValue() == TRANSFER_DST) s += "TRANSFER_DST";
        if(getValue() == SAMPLED) s += "SAMPLED";
        if(getValue() == STORAGE) s += "STORAGE";
        if(getValue() == COLOR_ATTACHMENT) s += "COLOR_ATTACHMENT";
        if(getValue() == DEPTH_STENCIL_ATTACHMENT) s += "DEPTH_STENCIL_ATTACHMENT";
        if(getValue() == TRANSIENT_ATTACHMENT) s += "TRANSIENT_ATTACHMENT";
        if(getValue() == INPUT_ATTACHMENT) s += "INPUT_ATTACHMENT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
