package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkSampleCountFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanSampleCountFlags {
    private final VkSampleCountFlags flags;

    public VulkanSampleCountFlags(VkSampleCountFlags flags) {
        this.flags = flags;
    }

    public boolean isVkSampleCount1Bit(){
        return (flags.value & VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT) != 0;
    }

    public boolean isVkSampleCount2Bit(){
        return (flags.value & VkSampleCountFlags.VK_SAMPLE_COUNT_2_BIT) != 0;
    }

    public boolean isVkSampleCount4Bit(){
        return (flags.value & VkSampleCountFlags.VK_SAMPLE_COUNT_4_BIT) != 0;
    }

    public boolean isVkSampleCount8Bit(){
        return (flags.value & VkSampleCountFlags.VK_SAMPLE_COUNT_8_BIT) != 0;
    }

    public boolean isVkSampleCount16Bit(){
        return (flags.value & VkSampleCountFlags.VK_SAMPLE_COUNT_16_BIT) != 0;
    }

    public boolean isVkSampleCount32Bit(){
        return (flags.value & VkSampleCountFlags.VK_SAMPLE_COUNT_32_BIT) != 0;
    }

    public boolean isVkSampleCount64Bit(){
        return (flags.value & VkSampleCountFlags.VK_SAMPLE_COUNT_64_BIT) != 0;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkSampleCountFlags.class);
    }
}
