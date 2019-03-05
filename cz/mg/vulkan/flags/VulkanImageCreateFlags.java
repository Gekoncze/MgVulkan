package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkImageCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanImageCreateFlags {
    public static final int SPARSE_BINDING = VkImageCreateFlags.VK_IMAGE_CREATE_SPARSE_BINDING_BIT;
    public static final int SPARSE_RESIDENCY = VkImageCreateFlags.VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT;
    public static final int SPARSE_ALIASED = VkImageCreateFlags.VK_IMAGE_CREATE_SPARSE_ALIASED_BIT;
    public static final int MUTABLE_FORMAT = VkImageCreateFlags.VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT;
    public static final int CUBE_COMPATIBLE = VkImageCreateFlags.VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT;
    public static final int ALIAS = VkImageCreateFlags.VK_IMAGE_CREATE_ALIAS_BIT;
    public static final int SPLIT_INSTANCE_BIND_REGIONS = VkImageCreateFlags.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT;
    public static final int D2_ARRAY_COMPATIBLE = VkImageCreateFlags.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT;
    public static final int BLOCK_TEXEL_VIEW_COMPATIBLE = VkImageCreateFlags.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT;
    public static final int EXTENDED_USAGE = VkImageCreateFlags.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT;
    public static final int PROTECTED = VkImageCreateFlags.VK_IMAGE_CREATE_PROTECTED_BIT;
    public static final int DISJOINT = VkImageCreateFlags.VK_IMAGE_CREATE_DISJOINT_BIT;
    public static final int SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_EXT = VkImageCreateFlags.VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT;
    public static final int SPLIT_INSTANCE_BIND_REGIONS_KHR = VkImageCreateFlags.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR;
    public static final int D2_ARRAY_COMPATIBLE_KHR = VkImageCreateFlags.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR;
    public static final int BLOCK_TEXEL_VIEW_COMPATIBLE_KHR = VkImageCreateFlags.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR;
    public static final int EXTENDED_USAGE_KHR = VkImageCreateFlags.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR;
    public static final int DISJOINT_KHR = VkImageCreateFlags.VK_IMAGE_CREATE_DISJOINT_BIT_KHR;
    public static final int ALIAS_KHR = VkImageCreateFlags.VK_IMAGE_CREATE_ALIAS_BIT_KHR;

    public final VkImageCreateFlags flags;

    public VulkanImageCreateFlags(){
        this(0);
    }

    public VulkanImageCreateFlags(int flag){
        this(new VkImageCreateFlags(flag));
    }

    public VulkanImageCreateFlags(VkImageCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkImageCreateFlags.class);
    }
}
