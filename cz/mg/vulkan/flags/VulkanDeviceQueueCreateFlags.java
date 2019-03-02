package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkDeviceQueueCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanDeviceQueueCreateFlags {
    public static final int PROTECTED = VkDeviceQueueCreateFlags.VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT;

    private final VkDeviceQueueCreateFlags flags;

    public VulkanDeviceQueueCreateFlags(int flag){
        this.flags = new VkDeviceQueueCreateFlags(flag);
    }

    public VulkanDeviceQueueCreateFlags(VkDeviceQueueCreateFlags flags) {
        this.flags = flags;
    }

    public VkDeviceQueueCreateFlags getFlags() {
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
        return ToString.flagsToStringNoLabels(flags.value, VkDeviceQueueCreateFlags.class);
    }
}
