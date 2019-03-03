package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkImageUsageFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanImageUsageFlags {
    public static final int TRANSFER_SRC = VkImageUsageFlags.VK_IMAGE_USAGE_TRANSFER_SRC_BIT;
    public static final int TRANSFER_DST = VkImageUsageFlags.VK_IMAGE_USAGE_TRANSFER_DST_BIT;
    public static final int SAMPLED = VkImageUsageFlags.VK_IMAGE_USAGE_SAMPLED_BIT;
    public static final int STORAGE = VkImageUsageFlags.VK_IMAGE_USAGE_STORAGE_BIT;
    public static final int COLOR_ATTACHMENT = VkImageUsageFlags.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
    public static final int DEPTH_STENCIL_ATTACHMENT = VkImageUsageFlags.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT;
    public static final int TRANSIENT_ATTACHMENT = VkImageUsageFlags.VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT;
    public static final int INPUT_ATTACHMENT = VkImageUsageFlags.VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT;

    public final VkImageUsageFlags flags;

    public VulkanImageUsageFlags(){
        this(0);
    }

    public VulkanImageUsageFlags(int flag){
        this(new VkImageUsageFlags(flag));
    }

    public VulkanImageUsageFlags(VkImageUsageFlags flags) {
        this.flags = flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkImageUsageFlags.class);
    }
}
