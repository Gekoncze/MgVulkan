package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkInstanceCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanInstanceCreateFlags {
    private final VkInstanceCreateFlags flags;

    public VulkanInstanceCreateFlags(int flag){
        this.flags = new VkInstanceCreateFlags(flag);
    }

    public VulkanInstanceCreateFlags(VkInstanceCreateFlags flags) {
        this.flags = flags;
    }

    public VkInstanceCreateFlags getFlags() {
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
        return ToString.flagsToStringNoLabels(flags.value, VkInstanceCreateFlags.class);
    }
}
