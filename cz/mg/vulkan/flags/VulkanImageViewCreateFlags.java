package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkImageViewCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanImageViewCreateFlags {
    public final VkImageViewCreateFlags flags;

    public VulkanImageViewCreateFlags(){
        this(0);
    }

    public VulkanImageViewCreateFlags(int flag){
        this(new VkImageViewCreateFlags(flag));
    }

    public VulkanImageViewCreateFlags(VkImageViewCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkImageViewCreateFlags.class);
    }
}
