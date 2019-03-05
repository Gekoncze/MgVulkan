package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkImageAspectFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanImageAspectFlags {
    public static final int COLOR = VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT;
    public static final int DEPTH = VkImageAspectFlags.VK_IMAGE_ASPECT_DEPTH_BIT;
    public static final int STENCIL = VkImageAspectFlags.VK_IMAGE_ASPECT_STENCIL_BIT;
    public static final int METADATA = VkImageAspectFlags.VK_IMAGE_ASPECT_METADATA_BIT;
    public static final int PLANE_0 = VkImageAspectFlags.VK_IMAGE_ASPECT_PLANE_0_BIT;
    public static final int PLANE_1 = VkImageAspectFlags.VK_IMAGE_ASPECT_PLANE_1_BIT;
    public static final int PLANE_2 = VkImageAspectFlags.VK_IMAGE_ASPECT_PLANE_2_BIT;
    public static final int PLANE_0_KHR = VkImageAspectFlags.VK_IMAGE_ASPECT_PLANE_0_BIT_KHR;
    public static final int PLANE_1_KHR = VkImageAspectFlags.VK_IMAGE_ASPECT_PLANE_1_BIT_KHR;
    public static final int PLANE_2_KHR = VkImageAspectFlags.VK_IMAGE_ASPECT_PLANE_2_BIT_KHR;

    public final VkImageAspectFlags flags;

    public VulkanImageAspectFlags(){
        this(0);
    }

    public VulkanImageAspectFlags(int flag){
        this(new VkImageAspectFlags(flag));
    }

    public VulkanImageAspectFlags(VkImageAspectFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkImageAspectFlags.class);
    }
}
