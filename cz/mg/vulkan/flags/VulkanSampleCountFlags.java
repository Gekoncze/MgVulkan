package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkSampleCountFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanSampleCountFlags {
    public static final int B1 = VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT;
    public static final int B2 = VkSampleCountFlags.VK_SAMPLE_COUNT_2_BIT;
    public static final int B4 = VkSampleCountFlags.VK_SAMPLE_COUNT_4_BIT;
    public static final int B8 = VkSampleCountFlags.VK_SAMPLE_COUNT_8_BIT;
    public static final int B16 = VkSampleCountFlags.VK_SAMPLE_COUNT_16_BIT;
    public static final int B32 = VkSampleCountFlags.VK_SAMPLE_COUNT_32_BIT;
    public static final int B64 = VkSampleCountFlags.VK_SAMPLE_COUNT_64_BIT;


    private final VkSampleCountFlags flags;

    public VulkanSampleCountFlags(int flag){
        this.flags = new VkSampleCountFlags(flag);
    }

    public VulkanSampleCountFlags(VkSampleCountFlags flags) {
        this.flags = flags;
    }

    public VkSampleCountFlags getFlags() {
        return flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkSampleCountFlags.class);
    }
}
