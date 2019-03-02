package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkDeviceCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanDeviceCreateFlags {
    private final VkDeviceCreateFlags flags;

    public VulkanDeviceCreateFlags(int flag){
        this.flags = new VkDeviceCreateFlags(flag);
    }

    public VulkanDeviceCreateFlags(VkDeviceCreateFlags flags) {
        this.flags = flags;
    }

    public VkDeviceCreateFlags getFlags() {
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
        return ToString.flagsToStringNoLabels(flags.value, VkDeviceCreateFlags.class);
    }
}
